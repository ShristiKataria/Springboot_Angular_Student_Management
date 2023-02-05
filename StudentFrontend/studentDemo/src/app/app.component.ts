import { Component } from '@angular/core';
import { StudentService } from './services/student.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'studentDashboard';

constructor(private studentService:StudentService){}

  register(registerForm:any){
      this.studentService.registerStudent(registerForm.value).subscribe(

        (response)=>{
          console.log(response);
        },
        (error)=>{
          console.log(error);
        }
      );
  }
}

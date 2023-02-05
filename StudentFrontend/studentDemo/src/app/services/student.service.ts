import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http: HttpClient) { }

  api="http://localhost:9090/api";

  public registerStudent(studentData: any){
    return this.http.post(this.api+'/registerStudent',studentData);
  }
}

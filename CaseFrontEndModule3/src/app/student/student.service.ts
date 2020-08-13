import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Employee} from '../employee/employee';
import {Student} from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  API_URL = 'http://localhost:3000/students';
  constructor(private httpClient: HttpClient) { }
  findAll(): Observable<Student[]> {
    return this.httpClient.get<Student[]>(this.API_URL);
  }
  findById(id: number): Observable<Student>{
    return this.httpClient.get<Student>(this.API_URL + '/' + id);
  }
  create(customer: Partial<Student>): Observable<Student> {
    return this.httpClient.post<Student>(this.API_URL, customer);
  }
  deleteById(id: number): Observable<void> {
    return this.httpClient.delete<void>(this.API_URL + '/' + id);
  }
  editEmployee(student, studentId): Observable<any>{
    return this.httpClient.put(this.API_URL + '/' + studentId, student);
  }
}

import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Student} from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  API_URL = 'http://localhost:3000/studentList';
  constructor(private httpClient: HttpClient) { }
  findAll(): Observable<Student[]>{
    return this.httpClient.get<Student[]>(this.API_URL);
  }
  findById(id: number): Observable<Student> {
    return this.httpClient.get<Student>(this.API_URL + '/' + id);
  }
  create(student: Partial<Student>): Observable<Student>{
    return this.httpClient.post<Student>(this.API_URL, student);
  }
  deleteById(id: number): Observable<void> {
    return this.httpClient.delete<void>(this.API_URL + '/' + id);
  }
}

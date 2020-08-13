import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Employee} from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  API_URL = 'http://localhost:3000/employee';
  constructor(private httpClient: HttpClient) { }
  findAll(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(this.API_URL);
  }
  findById(id: number): Observable<Employee>{
    return this.httpClient.get<Employee>(this.API_URL + '/' + id);
  }
  create(customer: Partial<Employee>): Observable<Employee> {
    return this.httpClient.post<Employee>(this.API_URL, customer);
  }
  deleteById(id: number): Observable<void> {
    return this.httpClient.delete<void>(this.API_URL + '/' + id);
  }
  editEmployee(employee, employeeId): Observable<any>{
    return this.httpClient.put(this.API_URL + '/' + employeeId, employee);
  }
}

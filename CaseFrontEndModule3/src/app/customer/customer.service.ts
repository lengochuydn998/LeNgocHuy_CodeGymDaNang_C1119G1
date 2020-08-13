import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from './customer';


@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  API_URL = 'http://localhost:3000/customerList';

  constructor(private httpClient: HttpClient) { }
  findAll(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(this.API_URL);
  }
  findById(id: number): Observable<Customer>{
    return this.httpClient.get<Customer>(this.API_URL + '/' + id);
  }
  create(customer: Partial<Customer>): Observable<Customer> {
    return this.httpClient.post<Customer>(this.API_URL, customer);
  }
  deleteById(id: number): Observable<void> {
    return this.httpClient.delete<void>(this.API_URL + '/' + id);
  }
  editById(customer: Partial<Customer>): Observable<Customer>{
    return this.httpClient.patch<Customer>(this.API_URL + '/' + customer.id, customer);
  }
}



import { Component, OnInit } from '@angular/core';
import {Customer} from './customer';
import {CustomerService} from './customer.service';
declare var $: any;

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  customerList: Customer[];
  tempCustomer: Customer;
  totalRecords: number;
  page = 1;
  search;
  key = 'name';
  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
    this.customerService.findAll().subscribe(
      next => {this.customerList = next ; this.totalRecords = next.length; },
      error => {
        this.customerList = [];
        console.log(error);
      }
    );
  }
  deleteById(id: number){
    this.customerService.deleteById(id).subscribe(
      next => window.location.reload(),
      error => console.log(error)
    );
  }
  showModel(element: Customer) {
    this.tempCustomer = element;
    $('#exampleModal').modal('show');
  }
}

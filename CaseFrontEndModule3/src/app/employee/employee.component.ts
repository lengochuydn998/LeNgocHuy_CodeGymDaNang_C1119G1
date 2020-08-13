import { Component, OnInit } from '@angular/core';
import {Employee} from './employee';
import {EmployeeService} from './employee.service';
declare var $: any;
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employeeList: Employee[];
  tempEmployee: Employee = new Employee();
  totalRecords: number;
  page = 1;
  search;
  key = 'name';
  constructor(private employeeService: EmployeeService) { }
  ngOnInit(): void {
    this.employeeService.findAll().subscribe(
      next => {this.employeeList = next ; this.totalRecords = next.length; },
      error => {
        this.employeeList = [];
        console.log(error);
      }
    );
  }
  deleteById(id: number){
    this.employeeService.deleteById(id).subscribe(
      next => window.location.reload(),
      error => console.log(error)
    );
  }
  showModel(element: Employee) {
    this.tempEmployee = element;
    $('#exampleModal').modal('show');
  }
  showInfo(element: Employee){
    this.tempEmployee = element;
    $('#exampleModal2').modal('show');
  }

}

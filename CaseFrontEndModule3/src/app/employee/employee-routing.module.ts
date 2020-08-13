import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule} from '@angular/router';
import {EmployeeCreateComponent} from './employee-create/employee-create.component';
import {EmployeeComponent} from './employee.component';
import {EmployeeEditComponent} from './employee-edit/employee-edit.component';

const routers = [
  {path: 'create-employee', component: EmployeeCreateComponent},
  {path: 'list-employee', component: EmployeeComponent},
  {path: 'edit-employee/:id', component: EmployeeEditComponent},
];


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routers)
  ]
})
export class EmployeeRoutingModule { }

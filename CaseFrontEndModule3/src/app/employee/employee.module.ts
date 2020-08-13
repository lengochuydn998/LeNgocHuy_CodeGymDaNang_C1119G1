import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmployeeEditComponent } from './employee-edit/employee-edit.component';
import { EmployeeCreateComponent } from './employee-create/employee-create.component';
import { EmployeeComponent } from './employee.component';
import {EmployeeRoutingModule} from './employee-routing.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {Ng2OrderModule} from 'ng2-order-pipe';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';
import {RouterModule} from '@angular/router';
import {MatFormFieldControl, MatFormFieldModule} from '@angular/material/form-field';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import {MatInputModule} from '@angular/material/input';
import {CustomerRoutingModule} from '../customer/customer-routing.module';
import {CustomerDetailComponent} from '../customer/customer-detail/customer-detail.component';
import {CustomerComponent} from '../customer/customer.component';



@NgModule({
  declarations: [EmployeeEditComponent, EmployeeCreateComponent, EmployeeComponent],

  imports: [
    CommonModule,
    RouterModule,
    EmployeeRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    Ng2SearchPipeModule,
    Ng2OrderModule,
    NgxPaginationModule,
    MatFormFieldModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatInputModule,
  ]
})
export class EmployeeModule { }

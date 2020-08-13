import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CustomerCreateComponent } from './customer-create/customer-create.component';
import { CustomerEditComponent } from './customer-edit/customer-edit.component';
import { CustomerDetailComponent } from './customer-detail/customer-detail.component';
import { CustomerComponent } from './customer.component';
import {RouterModule} from '@angular/router';
import {CustomerRoutingModule} from './customer-routing.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {Ng2OrderModule} from 'ng2-order-pipe';
import {NgxPaginationModule} from 'ngx-pagination';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import {MatInputModule} from '@angular/material/input';



@NgModule({
  declarations: [CustomerCreateComponent, CustomerEditComponent, CustomerDetailComponent, CustomerComponent],
  exports: [
    CustomerDetailComponent,
    CustomerComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    CustomerRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    Ng2SearchPipeModule,
    Ng2OrderModule,
    NgxPaginationModule,
    MatFormFieldModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatInputModule
  ]
})
export class CustomerModule { }

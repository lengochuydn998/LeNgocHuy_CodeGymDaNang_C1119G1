import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule} from '@angular/router';
import {CustomerCreateComponent} from './customer-create/customer-create.component';
import {CustomerComponent} from './customer.component';
import {CustomerEditComponent} from './customer-edit/customer-edit.component';

const routers = [
  {path: 'create-customer', component: CustomerCreateComponent},
  {path: 'list-customer', component: CustomerComponent},
  {path: 'edit-customer/:id', component: CustomerEditComponent},
  {path: '*', component: CustomerComponent}
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routers)
  ]
})
export class CustomerRoutingModule { }

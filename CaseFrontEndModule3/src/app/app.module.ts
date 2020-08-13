import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {CustomerModule} from './customer/customer.module';
import {HttpClientModule} from '@angular/common/http';
import {RouterModule} from '@angular/router';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {Ng2OrderModule} from 'ng2-order-pipe';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatInputModule} from '@angular/material/input';
import {MAT_DATE_LOCALE, MatNativeDateModule} from '@angular/material/core';
import {MatFormFieldControl, MatFormFieldModule} from '@angular/material/form-field';
import {EmployeeModule} from './employee/employee.module';
import {StudentModule} from './student/student.module';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    CustomerModule,
    EmployeeModule,
    StudentModule,
    HttpClientModule,
    RouterModule,
    Ng2OrderModule,
    Ng2SearchPipeModule,
    BrowserAnimationsModule,
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
  ],
  providers: [{provide: MAT_DATE_LOCALE, useValue: 'en-GB'}],
  bootstrap: [AppComponent]
})
export class AppModule { }

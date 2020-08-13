import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { FontSizeComponent } from './font-size/font-size.component';
import { PetComponent } from './pet/pet.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { ColorPickerComponent } from './color-picker/color-picker.component';
import { TestComponent } from './test/test.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { PersonComponent } from './person/person.component';
import { ListPersonComponent } from './list-person/list-person.component';
import { ParentComponent } from './parent/parent.component';
import { ChillComponent } from './chill/chill.component';
import { NameCardComponent } from './name-card/name-card.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { TodoComponent } from './todo/todo.component';
import { RegisterComponent } from './register/register.component';
import { RegisterFormComponent } from './register-form/register-form.component';
import { LoginComponent } from './login/login.component';
import {RouterModule} from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { IpComponent } from './ip/ip.component';
import { StudentComponent } from './student/student.component';
import { StudentListComponent } from './student-list/student-list.component';
import { TimelinesComponent } from './timelines/timelines.component';
import {DictionaryPageModule} from './dictionary-page/dictionary-page.module';
import {DictionaryModule} from './dictionary/dictionary.module';
import {ImageGalleryModule} from './image-gallery/image-gallery.module';

@NgModule({
  declarations: [
    AppComponent,
    FontSizeComponent,
    PetComponent,
    CalculatorComponent,
    ColorPickerComponent,
    TestComponent,
    PersonComponent,
    ListPersonComponent,
    ParentComponent,
    ChillComponent,
    NameCardComponent,
    SignInComponent,
    SignUpComponent,
    TodoComponent,
    RegisterComponent,
    RegisterFormComponent,
    LoginComponent,
    IpComponent,
    StudentComponent,
    StudentListComponent,
    TimelinesComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    AppRoutingModule,
    DictionaryPageModule,
    DictionaryModule,
    ImageGalleryModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

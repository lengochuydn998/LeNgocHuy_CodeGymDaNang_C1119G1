import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
  formSignUp: FormGroup;
  // constructor() {
  //   this.formSignUp = new FormGroup({
  //     email: new FormControl(),
  //     password: new FormControl(),
  //     subject: new FormGroup({
  //       nodeJS: new FormControl(),
  //       angular: new FormControl(),
  //       reactJS: new FormControl()}),
  //   });
  // }
  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.formSignUp = this.fb.group({
      email: ['', [Validators.required, Validators.pattern('[1-9]{2}')]],
      password: '',
      subject: this.fb.group({
        nodeJS: false,
        angular: false,
        reactJS: false}),
    });
  }

  onSubmit() {
    console.log(this.formSignUp.value);
  }
}
function emailValidator(formControl: FormControl) {
  if (formControl.value.includes('@email.com')){
    return null;
  }
  return { email: true};
}

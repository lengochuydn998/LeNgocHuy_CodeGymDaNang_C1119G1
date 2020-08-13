import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  fistNumber = 1;
  secondNumber = 2;
  operator = '+';
  result: number;
  onFistChange(value){
    this.fistNumber = Number(value);
  }
  onSecondChange(value){
    this.secondNumber = Number(value);
  }
  onSelectChange(value){
    this.operator = value;
  }
  calculator(){
    switch (this.operator) {
      case '+':
        this.result = this.fistNumber + this.secondNumber;
        break;
      case '-':
        this.result = this.fistNumber - this.secondNumber;
        break;
      case '*':
        this.result = this.fistNumber * this.secondNumber;
        break;
      case '/':
        this.result = this.fistNumber / this.secondNumber;
        break;
    }
  }
  constructor() { }

  ngOnInit(): void {
  }

}

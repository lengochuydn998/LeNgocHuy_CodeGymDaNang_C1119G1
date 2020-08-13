import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  value = 0;
  constructor() { }

  ngOnInit(): void {
  }
  changValue(isAdd: boolean){
    if (isAdd){
    this.value ++;
  }else{
      this.value --;
    }
  }
}

import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-chill',
  templateUrl: './chill.component.html',
  styleUrls: ['./chill.component.css']
})
export class ChillComponent implements OnInit {
  @Output() myClick = new EventEmitter<boolean>();
  constructor() { }

  ngOnInit(): void {
  }
  addForParent(){
    this.myClick.emit(true);
  }
  subForParent(){
    this.myClick.emit(false);
  }
}

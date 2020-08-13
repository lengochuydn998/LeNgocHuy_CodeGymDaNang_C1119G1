import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit {
  @Input() name: string;
  @Input() age: number;
  @Output() myClick = new EventEmitter<string>();
  constructor() { }

  ngOnInit(): void {
  }
  deletePersonForList(){
    this.myClick.emit(this.name);
  }
}

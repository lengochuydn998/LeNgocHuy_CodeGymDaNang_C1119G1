import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-person',
  templateUrl: './list-person.component.html',
  styleUrls: ['./list-person.component.css']
})
export class ListPersonComponent implements OnInit {
  arrPeople = [
    {name : 'Ti', age: 10},
    {name : 'Huy', age: 12},
    {name : 'Hung', age: 13 },
  ];
  constructor() { }

  ngOnInit(): void {
  }
  deletePerson(name: string){
    const index = this.arrPeople.findIndex(work => work.name === name);
    this.arrPeople.splice(index, 1);
  }
}

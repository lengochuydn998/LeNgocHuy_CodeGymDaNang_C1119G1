import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {DictionaryService} from '../dictionary.service';

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {
  dictionary;
  constructor(private activatedRoute: ActivatedRoute,
              private dictionaryService: DictionaryService) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      const key = param.get('en');
      this.dictionary = this.dictionaryService.findByWord(key);
    });
  }

}

import { Component, OnInit } from '@angular/core';
import {Dictionary} from '../dictionary';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {DictionaryService} from '../dictionary.service';

@Component({
  selector: 'app-dictionary-small',
  templateUrl: './dictionary-small.component.html',
  styleUrls: ['./dictionary-small.component.css']
})
export class DictionarySmallComponent implements OnInit {
  dictionary: Dictionary;
  constructor(private activatedRoute: ActivatedRoute,
              private dictionaryService: DictionaryService) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      const result = param.get('key');
      this.dictionary = this.dictionaryService.findByKey(result);
    });
  }

}

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DictionarySmallComponent } from './dictionary-small.component';

describe('DictionarySmallComponent', () => {
  let component: DictionarySmallComponent;
  let fixture: ComponentFixture<DictionarySmallComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DictionarySmallComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DictionarySmallComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

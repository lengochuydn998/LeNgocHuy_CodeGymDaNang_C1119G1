import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChillComponent } from './chill.component';

describe('ChillComponent', () => {
  let component: ChillComponent;
  let fixture: ComponentFixture<ChillComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChillComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

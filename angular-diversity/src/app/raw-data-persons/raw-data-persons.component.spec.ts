import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RawDataPersonsComponent } from './raw-data-persons.component';

describe('RawDataPersonsComponent', () => {
  let component: RawDataPersonsComponent;
  let fixture: ComponentFixture<RawDataPersonsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RawDataPersonsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RawDataPersonsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

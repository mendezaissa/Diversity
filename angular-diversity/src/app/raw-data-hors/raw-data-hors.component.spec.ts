import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RawDataHorsComponent } from './raw-data-hors.component';

describe('RawDataHorsComponent', () => {
  let component: RawDataHorsComponent;
  let fixture: ComponentFixture<RawDataHorsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RawDataHorsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RawDataHorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RawDataGovernorsComponent } from './raw-data-governors.component';

describe('RawDataGovernorsComponent', () => {
  let component: RawDataGovernorsComponent;
  let fixture: ComponentFixture<RawDataGovernorsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RawDataGovernorsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RawDataGovernorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

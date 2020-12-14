import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HorsComponent } from './hors.component';

describe('HorsComponent', () => {
  let component: HorsComponent;
  let fixture: ComponentFixture<HorsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HorsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

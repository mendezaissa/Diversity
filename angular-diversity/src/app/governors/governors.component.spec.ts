import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GovernorsComponent } from './governors.component';

describe('GovernorsComponent', () => {
  let component: GovernorsComponent;
  let fixture: ComponentFixture<GovernorsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GovernorsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GovernorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

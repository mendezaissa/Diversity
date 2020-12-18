import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RawDataSenatorsComponent } from './raw-data-senators.component';

describe('RawDataSenatorsComponent', () => {
  let component: RawDataSenatorsComponent;
  let fixture: ComponentFixture<RawDataSenatorsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RawDataSenatorsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RawDataSenatorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RawDataMayorsComponent } from './raw-data-mayors.component';

describe('RawDataMayorsComponent', () => {
  let component: RawDataMayorsComponent;
  let fixture: ComponentFixture<RawDataMayorsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RawDataMayorsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RawDataMayorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

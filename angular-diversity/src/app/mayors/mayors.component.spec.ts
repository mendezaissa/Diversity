import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MayorsComponent } from './mayors.component';

describe('MayorsComponent', () => {
  let component: MayorsComponent;
  let fixture: ComponentFixture<MayorsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MayorsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MayorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

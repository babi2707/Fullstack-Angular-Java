import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AptFlatRegistrationComponent } from './apt-flat-registration.component';

describe('AptFlatRegistrationComponent', () => {
  let component: AptFlatRegistrationComponent;
  let fixture: ComponentFixture<AptFlatRegistrationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AptFlatRegistrationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AptFlatRegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

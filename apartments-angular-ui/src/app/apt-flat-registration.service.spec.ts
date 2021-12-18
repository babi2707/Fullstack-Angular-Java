import { TestBed } from '@angular/core/testing';

import { AptFlatRegistrationService } from './apt-flat-registration.service';

describe('AptFlatRegistrationService', () => {
  let service: AptFlatRegistrationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AptFlatRegistrationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

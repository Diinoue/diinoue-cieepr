import { TestBed } from '@angular/core/testing';

import { Animaisservice } from './animaisservice';

describe('Animaisservice', () => {
  let service: Animaisservice;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Animaisservice);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

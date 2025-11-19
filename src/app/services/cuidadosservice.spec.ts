import { TestBed } from '@angular/core/testing';

import { Cuidadosservice } from './cuidadosservice';

describe('Cuidadosservice', () => {
  let service: Cuidadosservice;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Cuidadosservice);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

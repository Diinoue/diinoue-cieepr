import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CrudCuidados } from './crud-cuidados';

describe('CrudCuidados', () => {
  let component: CrudCuidados;
  let fixture: ComponentFixture<CrudCuidados>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CrudCuidados]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CrudCuidados);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

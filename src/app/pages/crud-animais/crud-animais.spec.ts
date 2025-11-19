import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CrudAnimais } from './crud-animais';

describe('CrudAnimais', () => {
  let component: CrudAnimais;
  let fixture: ComponentFixture<CrudAnimais>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CrudAnimais]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CrudAnimais);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

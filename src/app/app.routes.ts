import { Routes } from '@angular/router';
import { CrudCuidados } from './pages/crud-cuidados/crud-cuidados';
import { CrudAnimais } from './pages/crud-animais/crud-animais';


export const routes: Routes = [
    {path: 'animais', component:CrudAnimais},
    {path: 'cuidados', component:CrudCuidados}
];

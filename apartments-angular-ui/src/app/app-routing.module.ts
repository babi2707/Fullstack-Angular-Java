import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AptFlatRegistrationComponent } from './apt-flat-registration/apt-flat-registration.component';
import { UserActionComponent } from './user-action/user-action.component';

const routes: Routes = [
  {path:"register",component:AptFlatRegistrationComponent},
  {path:"search",component:UserActionComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

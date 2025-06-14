import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { UserActionComponent } from './user-action/user-action.component';
import { AptFlatRegistrationComponent } from './apt-flat-registration/apt-flat-registration.component';

import { AptFlatRegistrationService } from './apt-flat-registration.service';

import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { FilterFlatsPipe } from './filter-flats.pipe';

@NgModule({
  declarations: [
    AppComponent,
    UserActionComponent,
    AptFlatRegistrationComponent,
    FilterFlatsPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [AptFlatRegistrationService],
  bootstrap: [AppComponent]
})
export class AppModule { }

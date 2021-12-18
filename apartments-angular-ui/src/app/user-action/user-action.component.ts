import { Component, OnInit } from '@angular/core';
import { AptFlatRegistrationService } from '../apt-flat-registration.service';

@Component({
  selector: 'app-user-action',
  templateUrl: './user-action.component.html',
  styleUrls: ['./user-action.component.css'],
})
export class UserActionComponent implements OnInit {

  flats:any;
  configuration:any;

  constructor(private service: AptFlatRegistrationService) { }

  ngOnInit(): void {
    let response = this.service.getAllFlats();
    response.subscribe((data) => this.flats=data);
  }

  public getFlatList(){
    let resp= this.service.getAllFlats();
    resp.subscribe((data)=>this.flats=data);
   }
   
   public findFlatsByConfig(){
     let resp= this.service.getFlatByConfiguration(this.configuration)
     resp.subscribe((data)=>this.flats=data);
   }

   public removeFlatRecord(id:number){
    let resp= this.service.removeFlat(id);
    resp.subscribe((data)=>this.flats=data);
   }
}

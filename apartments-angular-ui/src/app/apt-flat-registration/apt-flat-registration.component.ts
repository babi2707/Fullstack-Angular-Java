import { Component, OnInit, SystemJsNgModuleLoader } from '@angular/core';
import { AptFlatRegistrationService } from '../apt-flat-registration.service';
import { Flat } from '../flat';
@Component({
  selector: 'app-apt-flat-registration',
  templateUrl: './apt-flat-registration.component.html',
  styleUrls: ['./apt-flat-registration.component.css']
})
export class AptFlatRegistrationComponent implements OnInit {

  flat: Flat=new Flat("","","","","");
  message:any;
  flats:any;
  responsemessage:any;

  constructor(private service:AptFlatRegistrationService) { }

  ngOnInit(): void {
    let response = this.service.getAllFlats();
    response.subscribe((data) => this.flats=data);
  }

  public registerFlat(flat:any){
    let response = this.service.newFlatRegistration(this.flat);
    response.subscribe((data) => this.flats=data);
    this.responsemessage = "Flat added successfully";
    
  }

  public removeFlatRecord(id:number){
    let resp= this.service.removeFlat(id);
    resp.subscribe((data)=>this.flats=data);
    this.responsemessage = "Flat record removed successfully";
  }

  public updateFlatRecord(flat:any){
    let resp= this.service.updateFlatInfo(flat);
    resp.subscribe((data)=>this.flats=data);
    this.responsemessage = "Flat updated successfully";
   }
}

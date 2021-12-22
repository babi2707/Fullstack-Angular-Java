import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AptFlatRegistrationService {

  constructor(private http:HttpClient) { }

  public newFlatRegistration(flat:any){
    return this.http.post("http://localhost:8083/flats/add",flat, {responseType: 'json' as 'json'});
  }
  public getAllFlats(){
    return this.http.get("http://localhost:8083/flats/list",{responseType: 'json' as 'json'});
  }
  public getFlatByConfiguration(config:String){
    return this.http.get("http://localhost:8083/flats/config/"+config,{responseType: 'json' as 'json'});
  }
  public updateFlatInfo(flat:any){
    return this.http.put("http://localhost:8083/flats/update",flat,{responseType: 'string' as 'json'});
  }
  public removeFlat(id:number){
    return this.http.delete("http://localhost:8083/flats/remove/"+id,{responseType: 'json' as 'json'});
  }
}

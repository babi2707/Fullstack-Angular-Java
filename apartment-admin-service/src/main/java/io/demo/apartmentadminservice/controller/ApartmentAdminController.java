package io.demo.apartmentadminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.demo.apartmentadminservice.dal.ApartmentAdminServiceDal;
import io.demo.apartmentadminservice.model.Apartment;
import io.demo.apartmentadminservice.model.Apartment;

@RestController
@RequestMapping("/apartments")
@CrossOrigin(origins="*")
public class ApartmentAdminController {

	@Autowired
	private ApartmentAdminServiceDal apartmentAdminService;
	
	@RequestMapping("/{id}")
	public Apartment sampleApartment(Long apartmentId, String name, String city) {			
		return new Apartment(apartmentId, name, city);
	}

	@RequestMapping(value="/add", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public Iterable<Apartment> addApartment(@RequestBody Apartment apartment) {
//		Apartment newApartment = new Apartment(apartment.getId(), apartment.getApartmentid(), apartment.getUnit(),apartment.getConfiguration(), apartment.getCurrentstatus());
		apartmentAdminService.save(apartment);
		return apartmentAdminService.findAll();	
	}
	
	@RequestMapping(value="/apartments", method = RequestMethod.GET, consumes="application/json", produces = "application/json")
    public Iterable<Apartment> getApartments() {
		return apartmentAdminService.findAll();				
	}
	
	@RequestMapping(value="/apartments/{id}", method = RequestMethod.GET, consumes="application/json", produces = "application/json")
    public Apartment getApartment(@PathVariable("id") Long id) {
		return apartmentAdminService.findById(id).get();
	}
	
	@RequestMapping(value="/update", method = RequestMethod.PUT, consumes="application/json", produces = "application/json")
    public Iterable<Apartment> updateApartment(@RequestBody Apartment Apartment) {
		apartmentAdminService.save(Apartment);
		return apartmentAdminService.findAll();	
	}
	
	@RequestMapping(value="/apartment/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public Iterable<Apartment> removeApartment(@PathVariable("id") Long id) {
		apartmentAdminService.deleteById(id);
		return apartmentAdminService.findAll();	
	}
}
	
	

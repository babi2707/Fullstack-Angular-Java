package io.demo.apartmentadminservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.demo.apartmentadminservice.dal.FlatAdminServiceDal;
import io.demo.apartmentadminservice.model.Flat;

@RestController
@RequestMapping("/flats")
@CrossOrigin(origins="*")
public class FlatAdminController {

	@Autowired
	private FlatAdminServiceDal flatAdminService;
	
	@RequestMapping(value="/add", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public Iterable<Flat> addFlat(@RequestBody Flat flat) {
		flatAdminService.save(flat);
		return flatAdminService.findAll();	
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Flat> getFlats() {
		return flatAdminService.findAll();				
	}
	
	@RequestMapping(value="/config/{configuration}", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Flat> getFlatsByConfig(@PathVariable("configuration") String config) {
		return flatAdminService.findFlatByConfiguration(config);				
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET, consumes="application/text", produces = "application/json")
    public Flat getFlatById(@PathVariable("id") Long id) {
		return flatAdminService.findById(id).get();
	}
	
	@RequestMapping(value="/update", method = RequestMethod.PUT, consumes="application/json", produces = "application/json")
    public Iterable<Flat> updateFlat(@RequestBody Flat flat) throws InterruptedException {
		Optional<Flat> fl = flatAdminService.findById(flat.getId());
		Flat updatedFlat = fl.get();
		updatedFlat.setApartment(flat.getApartment());
		updatedFlat.setConfiguration(flat.getConfiguration());
		updatedFlat.setCurrentstatus(flat.getCurrentstatus());
		updatedFlat.setUnit(flat.getUnit());
		
		flatAdminService.save(updatedFlat);
		Thread.sleep(100);
		return flatAdminService.findAll();	
	}
	
	@RequestMapping(value="/remove/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public Iterable<Flat> removeFlat(@PathVariable("id") Long id) {
		flatAdminService.deleteById(id);
		return flatAdminService.findAll();	
	}
}
	
	

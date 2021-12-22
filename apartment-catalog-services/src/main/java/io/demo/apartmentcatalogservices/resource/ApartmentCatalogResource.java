package io.demo.apartmentcatalogservices.resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.demo.apartmentcatalogservices.model.Apartment;

@RestController
@RequestMapping("/apartments")
public class ApartmentCatalogResource {
	
	@RequestMapping("/{id}")
	public List<Apartment> getApartmentCatalog(@PathVariable("id") String id){
		
		return Collections.singletonList(new Apartment(1, "TheGreens"));
	}
}

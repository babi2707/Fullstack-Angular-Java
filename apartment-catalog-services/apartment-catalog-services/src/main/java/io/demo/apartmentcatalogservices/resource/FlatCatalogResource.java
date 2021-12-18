package io.demo.apartmentcatalogservices.resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.demo.apartmentcatalogservices.model.Flat;

@RestController
@RequestMapping("/flats")
public class FlatCatalogResource {
	
	@RequestMapping("/{id}")
	public List<Flat> getFlatsCatalog(@PathVariable("id") String id){
		
		return List.of(
				new Flat(1, "The Greens", "B1-211", "3-BHK", 8),
				new Flat(2, "SV GRANDUR", "B2-13", "2-BHK", 7),
				new Flat(3, "Mahendra Aarna", "A2-211", "3-BHK", 7),
				new Flat(4, "Concorde Manhattan", "B1-211", "2-BHK", 6),
				new Flat(5, "Prestige Sunrise Park", "B1-211", "2-BHK", 9),
				new Flat(6, "Ajmera Infinity", "C-05", "3-BHK", 6),
				new Flat(7, "The Coach", "D4-12", "3-BHK", 7)
				);
		
//		return Collections.singletonList(new Flat(1, "The Greens", "B1-211", "3-BHK", 6));
	}

}

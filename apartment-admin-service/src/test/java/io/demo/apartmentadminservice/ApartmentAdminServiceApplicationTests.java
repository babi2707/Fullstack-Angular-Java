package io.demo.apartmentadminservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.demo.apartmentadminservice.dal.ApartmentAdminServiceDal;
import io.demo.apartmentadminservice.dal.FlatAdminServiceDal;
import io.demo.apartmentadminservice.model.Apartment;
import io.demo.apartmentadminservice.model.Flat;

@SpringBootTest
class ApartmentAdminServiceApplicationTests {

	@Autowired
	private ApartmentAdminServiceDal apartmentAdminService;
	
	@Autowired
	private FlatAdminServiceDal flatAdminService;
	
	@Test
	void testAddApartment() {
		Apartment apartment = new Apartment();
		apartment.setId(2L);
		apartment.setName("Krishna");
		apartment.setCity("Bangalore");
		
		apartmentAdminService.save(apartment);
	}
	
	@Test
	void testAddFlat() {
		Flat flat = new Flat();
		flat.setId(1L);
		flat.setApartment("The Greens");
		flat.setUnit("B2-211");
		flat.setConfiguration("1-BHK");
		flat.setCurrentstatus("Available");
		
		flatAdminService.save(flat);
	}

}

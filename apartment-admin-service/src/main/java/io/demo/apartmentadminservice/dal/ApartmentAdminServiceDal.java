package io.demo.apartmentadminservice.dal;

import org.springframework.data.repository.CrudRepository;

import io.demo.apartmentadminservice.model.Apartment;

public interface ApartmentAdminServiceDal extends CrudRepository<Apartment, Long> {

}

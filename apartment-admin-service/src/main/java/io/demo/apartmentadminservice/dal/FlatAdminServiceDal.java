package io.demo.apartmentadminservice.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import io.demo.apartmentadminservice.model.Flat;


public interface FlatAdminServiceDal extends CrudRepository<Flat, Long> {

	public Iterable<Flat> findFlatByConfiguration(@PathVariable("configuration") String configuration);

}

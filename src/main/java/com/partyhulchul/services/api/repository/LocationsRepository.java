package com.partyhulchul.services.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.partyhulchul.services.api.model.Locations;

@Repository
public interface LocationsRepository extends CrudRepository<Locations, String>{

}

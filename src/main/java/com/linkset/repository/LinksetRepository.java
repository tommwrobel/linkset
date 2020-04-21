package com.linkset.repository;

import com.linkset.model.Linkset;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinksetRepository extends CrudRepository<Linkset, Long> {
}

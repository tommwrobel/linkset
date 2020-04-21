package com.linkset.repository;

import com.linkset.model.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {

    List<Link> findByLinksetId(Long linksetId);

}

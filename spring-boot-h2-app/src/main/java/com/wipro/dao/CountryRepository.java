package com.wipro.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.entity.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {
}

package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Bill_Details;

@Repository
public interface Bill_DetailsRepository extends CrudRepository<Bill_Details, Serializable> {

}

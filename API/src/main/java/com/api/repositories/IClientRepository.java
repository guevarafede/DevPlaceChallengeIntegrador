package com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client,Long>{

}

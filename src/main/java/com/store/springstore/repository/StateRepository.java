package com.store.springstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.springstore.entity.State;

public interface StateRepository extends JpaRepository<State, Long>{
    
}

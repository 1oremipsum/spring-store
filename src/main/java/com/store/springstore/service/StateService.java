package com.store.springstore.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.springstore.entity.State;
import com.store.springstore.repository.StateRepository;

@Service
public class StateService {
    @Autowired
    private StateRepository repository;

    public List<State> findAll(){
        return repository.findAll();
    }

    public State findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public State insert(State state){
        state.setCreationDate(new Date());
        State newState = repository.saveAndFlush(state);
        return newState;
    }

    public State update(State state){
        state.setUpdateDate(new Date());
        return repository.saveAndFlush(state);
    }

    public void delete(Long id){
        State state = repository.findById(id).get();
        repository.delete(state);
    }
}

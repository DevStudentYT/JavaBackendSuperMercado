package com.learntogether.demobackend.Repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.learntogether.demobackend.Model.User;

public class UserRepositoryImpl implements UserRepository{

    @Override
    public <S extends User> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterable<User> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<User> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(User entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<User> getUsers() {
        User usuario = new User();
        List<User> listaUsuario = new ArrayList<User>();
        listaUsuario.add(usuario);
        return listaUsuario;
    }
    
}

package com.learntogether.demobackend.Repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.learntogether.demobackend.Model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    public List<User> getUsers();
}

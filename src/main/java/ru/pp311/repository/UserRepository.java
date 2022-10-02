package ru.pp311.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.pp311.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}

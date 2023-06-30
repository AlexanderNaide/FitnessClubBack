package org.satal.fitnessclubback.repositories;

import org.satal.fitnessclubback.entities.users.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor<User> {

    Optional<User> findByName (String name);

    Optional<User> findUserByLoginAndPassword (String login, String password);
}

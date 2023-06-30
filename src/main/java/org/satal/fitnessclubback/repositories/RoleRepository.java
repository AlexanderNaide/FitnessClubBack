package org.satal.fitnessclubback.repositories;

import org.satal.fitnessclubback.entities.users.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}

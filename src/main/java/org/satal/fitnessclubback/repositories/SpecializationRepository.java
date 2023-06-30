package org.satal.fitnessclubback.repositories;

import org.satal.fitnessclubback.entities.users.Specialization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecializationRepository extends CrudRepository<Specialization, Long>, PagingAndSortingRepository<Specialization, Long> {

}

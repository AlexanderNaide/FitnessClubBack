package org.satal.fitnessclubback.repositories;


import org.satal.fitnessclubback.entities.Maintenance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRepository extends CrudRepository<Maintenance, Long> {
}

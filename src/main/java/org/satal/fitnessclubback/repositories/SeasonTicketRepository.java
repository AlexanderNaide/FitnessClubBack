package org.satal.fitnessclubback.repositories;

import org.satal.fitnessclubback.entities.users.SeasonTicket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonTicketRepository extends CrudRepository<SeasonTicket, Long> {

}

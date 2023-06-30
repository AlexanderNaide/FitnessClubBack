package org.satal.fitnessclubback.services;

import lombok.RequiredArgsConstructor;
import org.satal.fitnessclubback.entities.users.SeasonTicket;
import org.satal.fitnessclubback.repositories.SeasonTicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SeasonTicketService {
    private final SeasonTicketRepository seasonTicketRepository;

    public void save(SeasonTicket seasonTicket){
        seasonTicketRepository.save(seasonTicket);
    }

    public Optional<SeasonTicket> findById(Long id){
        return seasonTicketRepository.findById(id);
    }

    public List<SeasonTicket> findAll(){
        return (List<SeasonTicket>) seasonTicketRepository.findAll();
    }
}

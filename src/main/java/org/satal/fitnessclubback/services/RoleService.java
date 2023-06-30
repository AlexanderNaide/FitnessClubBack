package org.satal.fitnessclubback.services;

import lombok.RequiredArgsConstructor;
import org.satal.fitnessclubback.entities.users.Role;
import org.satal.fitnessclubback.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public void save(Role role){
        roleRepository.save(role);
    }

    public Optional<Role> findById(Long id){
        return roleRepository.findById(id);
    }

    public List<Role> findAll(){
        return (List<Role>) roleRepository.findAll();
    }
}

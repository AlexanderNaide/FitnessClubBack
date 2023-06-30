package org.satal.fitnessclubback.dto.users;

import lombok.Data;
import org.satal.fitnessclubback.entities.users.Role;

@Data
public class RoleDto {

    private Long id;
    private String titleRole;
    private boolean containsSpecializations;

    public RoleDto(Role role) {
        this.id = role.getId();
        this.titleRole = role.getTitleRole();
        this.containsSpecializations = role.isContainsSpecializations();
    }
}

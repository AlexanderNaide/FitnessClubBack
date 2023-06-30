package org.satal.fitnessclubback.dto.users;

import lombok.Data;
import org.satal.fitnessclubback.entities.users.Specialization;

@Data
public class SpecializationDto {

    private Long id;
    private String specializationTitle;

    private String message;

    public SpecializationDto(Specialization specialization) {
        this.id = specialization.getId();
        this.specializationTitle = specialization.getSpecializationTitle();
    }

    public SpecializationDto(Specialization specialization, String message) {
        this(specialization);
        this.message = message;
    }
}

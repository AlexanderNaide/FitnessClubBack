package org.satal.fitnessclubback.dto;

import lombok.Data;
import org.satal.fitnessclubback.entities.Maintenance;

@Data
public class MaintenanceDto {
    private Long id;
    private String title;
    private String description;
    private String ico;

    public MaintenanceDto(Maintenance maintenance) {
        this.id = maintenance.getId();
        this.title = maintenance.getTitle();
        this.description = maintenance.getDescription();
        this.ico = maintenance.getIco();
    }
}

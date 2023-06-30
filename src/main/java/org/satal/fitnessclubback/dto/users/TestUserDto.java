package org.satal.fitnessclubback.dto.users;

import lombok.Data;
import org.satal.fitnessclubback.entities.users.Role;
import org.satal.fitnessclubback.entities.users.Specialization;
import org.satal.fitnessclubback.entities.users.Ticket;
import org.satal.fitnessclubback.entities.users.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class TestUserDto {

    private Long id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private String middleName;
    private String email;
    private String phone;
    private LocalDate birthday;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<Role> roles;
    private Specialization specialization;
    private List<Ticket> ticketList;

    public TestUserDto(User user) {
        this.id = user.getId();
        this.login = user.getLogin();
        this.password = user.getPassword();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.middleName = user.getMiddleName();
    }
}

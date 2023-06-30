package org.satal.fitnessclubback.dto.users;

import lombok.Data;
import org.satal.fitnessclubback.entities.users.User;

@Data
public class SuperAdminDto implements UserDto {

    private Long id;
    private String titleRole;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String avatar;
    private String background;

    public SuperAdminDto(User user) {
        this.id = user.getId();
        this.titleRole = user.getRole().getTitleRole();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.avatar = user.getAvatar();
        this.background = user.getBackground();
    }
}

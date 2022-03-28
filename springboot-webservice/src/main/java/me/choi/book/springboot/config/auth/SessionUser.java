package me.choi.book.springboot.config.auth;

import lombok.Getter;
import me.choi.book.springboot.domain.user.User;

@Getter
public class SessionUser {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}

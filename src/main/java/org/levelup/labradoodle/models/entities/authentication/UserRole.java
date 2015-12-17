package org.levelup.labradoodle.models.entities.authentication;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Class  {@Link org.levelup.labradoodle.models.entities}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 09.12.15
 */
public enum UserRole implements GrantedAuthority{

    USER("ROLE_USER"),
    ADMIN("ROLE_ADMIN");

    private String authority;

    UserRole(String authority){
        this.authority=authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}

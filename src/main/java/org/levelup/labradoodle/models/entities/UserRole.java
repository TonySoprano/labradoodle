package org.levelup.labradoodle.models.entities;

import org.springframework.security.core.GrantedAuthority;

/**
 * Class  {@Link org.levelup.labradoodle.models.entities}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 09.12.15
 */
public enum UserRole implements GrantedAuthority{

    USER("USER_ROLE"),
    ADMIN("ADMIN_ROLE");

    private String authority;

    UserRole(String authority){
        this.authority=authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}

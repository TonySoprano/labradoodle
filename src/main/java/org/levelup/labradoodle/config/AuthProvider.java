package org.levelup.labradoodle.config;

import org.levelup.labradoodle.models.entities.authentication.User;
import org.levelup.labradoodle.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;


/**
 * Class  {@Link org.levelup.labradoodle.services}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 14.12.15
 */
@Component
public class AuthProvider implements AuthenticationProvider{

    @Autowired
    UserRepository userRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = authentication.getName();
        String password = (String)authentication.getCredentials();

        User user = userRepository.getUserByEmail(email);
        if (user == null){
            throw new BadCredentialsException("User not found");
        }
        if (!password.equals(password)){
            throw new BadCredentialsException("Pass not match");
        }
        return new UsernamePasswordAuthenticationToken(email,password,user.getUserRoles());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}

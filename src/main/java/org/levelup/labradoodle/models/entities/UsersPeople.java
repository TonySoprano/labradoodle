package org.levelup.labradoodle.models.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author Revuk Alex
 * @version 1.0
 * @since 17.08.2015
 */
@Entity
@Table(name = "userslwkerjfjas")
@NamedQueries({
        @NamedQuery(name = "getAllUsers", query = "SELECT a FROM UsersPeople a"),
        @NamedQuery(name = "getUserById", query = "SELECT a FROM UsersPeople a WHERE a.id = :id"),
        @NamedQuery(name = "deleteUserById", query = "DELETE FROM UsersPeople a WHERE a.id = :id")
})
public class UsersPeople implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String email;

    private String pass;

    public Integer getId() {
        return id;
    }

    public UsersPeople setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public UsersPeople setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UsersPeople setEmail(String email) {
        this.email = email;
        return this;
    }
}

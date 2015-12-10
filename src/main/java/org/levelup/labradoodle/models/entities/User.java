package org.levelup.labradoodle.models.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * @author Revuk Alex
 * @version 1.0
 * @since 17.08.2015
 */
@Entity
@Table(name = "users")
@NamedQueries({
        @NamedQuery(name = "getAllUsers", query = "SELECT a FROM User a"),
        @NamedQuery(name = "getUserById", query = "SELECT a FROM User a WHERE a.id = :id"),
        @NamedQuery(name = "deleteUserById", query = "DELETE FROM User a WHERE a.id = :id")
})
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String email;

    private String pass;

    @OneToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    //private List<UserRole> userRoles;

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public User setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }
/*
    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
    */
}

/*
 * Copyright (c) 2020 GREENBLOG.
 *
 * Created by IntelliJ IDEA.
 * @author: Reza Shams <rezashams86@gmail.com>
 */
package com.greenblog.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "user_gb")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "lastname")
    private String lastName;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "created_at")
    private Date createdAt;

    @NotNull
    @Column(name = "updated_at")
    private Date updatedAt;

    public User() {
    }

    @OneToMany(mappedBy = "followerUser")
    Set<Relationship>  followedUser;

    @OneToMany(mappedBy = "followedUser")
    Set<Relationship>  following;

    public User(Long id, String name, String lastName, String email, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() && Objects.equals(getName(), user.getName()) && Objects.equals(getLastName(), user.getLastName()) && Objects.equals(getEmail(), user.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLastName(), getEmail());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
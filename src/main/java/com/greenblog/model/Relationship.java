/*
 * Copyright (c) 2020 GREENBLOG.
 *
 * Created by IntelliJ IDEA.
 * @author: Reza Shams <rezashams86@gmail.com>
 */
package com.greenblog.model;

import com.greenblog.model.compositeKey.RelationshipKey;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Relationship {

    @EmbeddedId
    RelationshipKey id;

    @NotNull
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @NotNull
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @ManyToOne
    @MapsId("followedId")
    @JoinColumn(name = "followed_id")
    User followedUser;

    @ManyToOne
    @MapsId("followerId")
    @JoinColumn(name = "follower_id")
    User followerUser;

    public Relationship() {
    }

    public Relationship(RelationshipKey id, Date createdAt, Date updatedAt, User followedUser, User followerUser) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.followedUser = followedUser;
        this.followerUser = followerUser;
    }

    public RelationshipKey getId() {
        return id;
    }

    public void setId(RelationshipKey id) {
        this.id = id;
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

    public User getFollowedUser() {
        return followedUser;
    }

    public void setFollowedUser(User followedUser) {
        this.followedUser = followedUser;
    }

    public User getFollowerUser() {
        return followerUser;
    }

    public void setFollowerUser(User followerUser) {
        this.followerUser = followerUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Relationship)) return false;
        Relationship that = (Relationship) o;
        return getId().equals(that.getId()) && getCreatedAt().equals(that.getCreatedAt()) && getUpdatedAt().equals(that.getUpdatedAt()) && getFollowedUser().equals(that.getFollowedUser()) && getFollowerUser().equals(that.getFollowerUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreatedAt(), getUpdatedAt(), getFollowedUser(), getFollowerUser());
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", followedUser=" + followedUser +
                ", followerUser=" + followerUser +
                '}';
    }
}
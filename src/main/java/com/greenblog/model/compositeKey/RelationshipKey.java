/*
 * Copyright (c) 2020 GREENBLOG.
 *
 * Created by IntelliJ IDEA.
 * @author: Reza Shams <rezashams86@gmail.com>
 */
package com.greenblog.model.compositeKey;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RelationshipKey implements Serializable {

    @Column(name = "follower_id")
    private Long followerId;

    @Column(name = "followed_id")
    private Long followedId;

    public RelationshipKey() {
    }

    public RelationshipKey(Long followerId, Long followedId) {
        this.followerId = followerId;
        this.followedId = followedId;
    }

    public Long getFollowerId() {
        return followerId;
    }

    public void setFollowerId(Long followerId) {
        this.followerId = followerId;
    }

    public Long getFollowedId() {
        return followedId;
    }

    public void setFollowedId(Long followedId) {
        this.followedId = followedId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RelationshipKey)) return false;
        RelationshipKey that = (RelationshipKey) o;
        return Objects.equals(getFollowerId(), that.getFollowerId()) && Objects.equals(getFollowedId(), that.getFollowedId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFollowerId(), getFollowedId());
    }


    @Override
    public String toString() {
        return "relationshipKey{" +
                "followerId=" + followerId +
                ", followedId=" + followedId +
                '}';
    }
}
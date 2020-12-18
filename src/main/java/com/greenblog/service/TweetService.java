/*
 * Copyright (c) 2020 GREENBLOG.
 *
 * Created by IntelliJ IDEA.
 * @author: Reza Shams <rezashams86@gmail.com>
 */
package com.greenblog.service;

import com.greenblog.model.Tweet;
import com.greenblog.repository.TweetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Calendar;

@Service
public class TweetService {

    @Autowired
    private TweetRepo tweetRepo;

    public Long addTweet(Tweet tweet) {
        Date date = new Date(Calendar.getInstance().getTimeInMillis());
        tweet.setCreatedAt(date);
        tweet.setUpdatedAt(date);
        return tweetRepo.save(tweet).getId();
    }

}
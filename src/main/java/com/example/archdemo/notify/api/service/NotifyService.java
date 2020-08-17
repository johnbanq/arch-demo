package com.example.archdemo.notify.api.service;

public interface NotifyService {

    void notifyUser(long userID, String content);

    void notifyAll(String content);

}

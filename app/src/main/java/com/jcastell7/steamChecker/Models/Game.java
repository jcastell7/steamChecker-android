package com.jcastell7.steamChecker.Models;

import java.util.ArrayList;

public class Game {
    private String gameName;
    private String appId;
    private int currentPrice;
    private int expectedPrice;
    private boolean sendNotif;
    private ArrayList<User> users;

    public Game(String gameName, String appId, int currentPrice, int expectedPrice, boolean sendNotif, ArrayList<User> users) {
        this.gameName = gameName;
        this.appId = appId;
        this.currentPrice = currentPrice;
        this.expectedPrice = expectedPrice;
        this.sendNotif = sendNotif;
        this.users = users;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getExpectedPrice() {
        return expectedPrice;
    }

    public void setExpectedPrice(int expectedPrice) {
        this.expectedPrice = expectedPrice;
    }

    public boolean isSendNotif() {
        return sendNotif;
    }

    public void setSendNotif(boolean sendNotif) {
        this.sendNotif = sendNotif;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUsers(User user){
        users.add(user);
    }
}

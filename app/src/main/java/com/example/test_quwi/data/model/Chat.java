package com.example.test_quwi.data.model;

public class Chat {

    private String userId;
    private String displayName;

    public Chat(String userId, String displayName) {
        this.userId = userId;
        this.displayName = displayName;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }
}
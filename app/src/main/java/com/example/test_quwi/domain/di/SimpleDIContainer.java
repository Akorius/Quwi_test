package com.example.test_quwi.domain.di;

import com.example.test_quwi.data.LoginDataSource;
import com.example.test_quwi.data.network.NetworkClient;
import com.example.test_quwi.data.repository.ChatRepositoryImpl;
import com.example.test_quwi.data.repository.LoginRepositoryImpl;
import com.example.test_quwi.domain.repository.ChatRepository;
import com.example.test_quwi.domain.repository.LoginRepository;

public class SimpleDIContainer {

    private static volatile LoginRepository loginRepository;

    private static volatile ChatRepository chatRepository;

    private static volatile LoginDataSource dataSource;

    private static volatile NetworkClient client;

    public static LoginRepository getLoginRepository() {
        if (loginRepository == null) {
            loginRepository = new LoginRepositoryImpl(getDataSource());
        }
        return loginRepository;
    }

    public static ChatRepository getChatRepository() {
        if (chatRepository == null) {
            chatRepository = new ChatRepositoryImpl(getDataSource());
        }
        return chatRepository;
    }

    public static LoginDataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new LoginDataSource();
        }
        return dataSource;
    }

    public static NetworkClient getNetworkClient() {
        if (client == null) {
            client = new NetworkClient();
        }
        return client;
    }
}

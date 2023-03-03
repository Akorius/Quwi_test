package com.example.test_quwi.data.repository;

import com.example.test_quwi.data.LoginDataSource;
import com.example.test_quwi.common.utils.Result;
import com.example.test_quwi.data.model.User;
import com.example.test_quwi.domain.repository.LoginRepository;

public class LoginRepositoryImpl implements LoginRepository {

    private LoginDataSource dataSource;

    private User user = null;

    public LoginRepositoryImpl(LoginDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public boolean isLoggedIn() {
        return user != null;
    }

    @Override
    public void logout() {
        user = null;
        dataSource.logout();
    }

    private void setLoggedInUser(User user) {
        this.user = user;
    }

    @Override
    public Result<User> login(String username, String password) {
        Result<User> result = dataSource.login(username, password);
        if (result instanceof Result.Success) {
            setLoggedInUser(((Result.Success<User>) result).getData());
        }
        return result;
    }
}
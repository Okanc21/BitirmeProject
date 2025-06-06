package com.okancelik.bitirmeproject.dao;
import java.util.Optional;

public interface ILogin <T> {

    // Login
    Optional<T> loginUser(String username, String password);
}
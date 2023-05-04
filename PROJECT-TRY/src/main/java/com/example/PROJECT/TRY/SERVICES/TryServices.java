package com.example.PROJECT.TRY.SERVICES;

import com.example.PROJECT.TRY.ENTITY.TryEntity;

import java.util.List;

public interface TryServices {
    TryEntity createUser(TryEntity tryEntity);

    TryEntity createTryEntity(TryEntity tryEntity);

    TryEntity getTryEntityById(Long tryId);

    List< TryEntity> getAllTryEntity();

    TryEntity updateTryEntity( TryEntity tryEntity);

    void deleteTryEntity(Long userId);
}

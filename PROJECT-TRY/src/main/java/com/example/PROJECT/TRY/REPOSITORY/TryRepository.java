package com.example.PROJECT.TRY.REPOSITORY;

import com.example.PROJECT.TRY.ENTITY.TryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TryRepository extends JpaRepository<TryEntity,Long> {
}

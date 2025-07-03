package com.example.demo.repository;

import com.example.demo.model.TimesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimesRepository extends JpaRepository<TimesModel, Long> {
}

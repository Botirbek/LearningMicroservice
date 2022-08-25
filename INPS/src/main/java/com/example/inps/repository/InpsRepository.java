package com.example.inps.repository;


import com.example.inps.entitiy.InpsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InpsRepository extends JpaRepository<InpsEntity, Long> {

    Optional<InpsEntity> findByPinfl(String pinfl);


}

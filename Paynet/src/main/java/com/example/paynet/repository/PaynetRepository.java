package com.example.paynet.repository;

import com.example.paynet.entitiy.PaynetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaynetRepository extends JpaRepository<PaynetEntity, Long> {

    List<PaynetEntity> findByPhoneNumber(String phoneNumber);
}

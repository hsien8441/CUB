package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CoinSetting;

public interface CoinSettingRepository extends JpaRepository<CoinSetting, String> {

	CoinSetting findByCode(String code);

}
package com.bruno.microservices.currencyexchangeservice.repositories;

import com.bruno.microservices.currencyexchangeservice.models.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String From, String to);
}

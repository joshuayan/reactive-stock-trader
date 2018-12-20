package com.redelastic.stocktrader.portfolio.api;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Value;

@Value
@JsonDeserialize
public class BuyOrder {

    String portfolioId;

    String stockSymbol;

    int shares;
}
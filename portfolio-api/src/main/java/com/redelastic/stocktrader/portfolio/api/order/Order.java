/*
 * Copyright (c) 2019 RedElastic Inc.
 * See LICENSE file for details.
 */

package com.redelastic.stocktrader.portfolio.api.order;

import com.redelastic.stocktrader.OrderId;
import com.redelastic.stocktrader.PortfolioId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class Order {
    @NonNull OrderId orderId;
    @NonNull PortfolioId portfolioId;
    @NonNull OrderDetails details;
}

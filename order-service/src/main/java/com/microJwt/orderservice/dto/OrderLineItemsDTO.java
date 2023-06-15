package com.microJwt.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDTO {

    @Id
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}

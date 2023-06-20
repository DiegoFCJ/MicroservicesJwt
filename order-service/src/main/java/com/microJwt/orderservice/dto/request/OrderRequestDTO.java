package com.microJwt.orderservice.dto.request;

import com.microJwt.orderservice.dto.OrderLineItemsDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDTO {
    private List<OrderLineItemsDTO> orderLineItemsListDTO;
}

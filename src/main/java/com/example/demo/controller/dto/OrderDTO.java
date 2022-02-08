package com.example.demo.controller.dto;

import lombok.*;

@Getter @Setter @NoArgsConstructor @ToString @AllArgsConstructor
public class OrderDTO {

    private Long id;
    private Long userId;
    private Integer orderNumber;
    private Integer orderDayOfTheWeek;
    private Integer orderHourOfDay;
    private Double daysSincePriorOrder;
    private String orderDetail;
}

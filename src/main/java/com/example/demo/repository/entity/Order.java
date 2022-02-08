package com.example.demo.repository.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
@Getter @Setter @NoArgsConstructor @ToString
public class Order {

    @Id
    @Column(name = "ORDER_ID")
    private Long id;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "ORDER_NUMBER")
    private Integer orderNumber;
    @Column(name = "ORDER_DOW")
    private Integer orderDayOfTheWeek;
    @Column(name = "ORDER_HOUR_OF_DAY")
    private Integer orderHourOfDay;
    @Column(name = "DAYS_SINCE_PRIOR_ORDER")
    private Double daysSincePriorOrder;
    @Column(name = "ORDER_DETAIL")
    private String orderDetail;
}

package com.neomegatrion.smartaccount.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "movement")
@EqualsAndHashCode(callSuper = false)
@Data
@ToString
public class Movement extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "sign", nullable = false)
    private Boolean sign;

    @Column(name = "description", length = 200)
    private String description;

    @Column(name = "effectDate", nullable = false)
    private Date effectDate;

}

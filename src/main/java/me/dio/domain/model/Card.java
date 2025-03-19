package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit",precision = 13, scale = 2)
    private BigDecimal limit;

    public Long setId() {return id;}
    public void getId(Long id) {this.id = id;}
    public String setNumber() {return number;}
    public void getNumber(String number) {this.number = number;}
    private BigDecimal setLimit() {return limit;}
    private void getLimit(BigDecimal limit) {this.limit = limit;}

}

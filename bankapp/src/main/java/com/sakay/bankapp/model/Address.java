package com.sakay.bankapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String town;
    private String street;
    private String no;

    @OneToOne(mappedBy = "address")
    private Bank bank;
}

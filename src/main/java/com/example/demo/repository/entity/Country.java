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
@Table(name = "Countries")
@Getter @Setter @NoArgsConstructor @ToString
public class Country {
    @Id
    @Column(name = "ID")
    private Long ID;
    @Column(name = "NAME")
    private String NAME;
}

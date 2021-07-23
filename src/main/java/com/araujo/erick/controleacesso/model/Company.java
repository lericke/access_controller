package com.araujo.erick.controleacesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Company {

    @Id
    private Long id;
    private String description;
    private String cnpj;
    private String address;
    private String neig;
    private String city;
    private String state;
    private String phone;
}

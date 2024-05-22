package com.yesil.account.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor
//@Table(name = "Customer") sınıf adıyla çakıştığı için sorun yok
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String name;
    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;
}

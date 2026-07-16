package com.malee.ecommerce_pms.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name="PRODUCT_CATEGORY" )
public class ProductCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUCT_CATEGORY")
    @Column(name = "CATEGORY_ID")
    private Long id;

    @Column(name="CATEGORY_NAME", nullable = false, length = 100)
    private String categoryName;

    @Column(name= "DESCRIPTION", length=500)
    private String description;


}

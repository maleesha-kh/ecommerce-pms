package com.malee.ecommerce_pms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @CreatedDate
    @Column(name= "CREATED_DATE", updatable = false)
    private LocalDate createdDate;

    @LastModifiedDate
    @Column(name= "LAST_MODIFIED_DATE")
    private LocalDate lastModifiedDate;


}

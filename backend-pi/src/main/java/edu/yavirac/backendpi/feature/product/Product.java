package edu.yavirac.backendpi.feature.product;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("product")
public class Product {
    @Id
    @Column("product_id")
    private Long productId; 
    private String name;
    private String description;
    private String brand;
    private String model;
    private Timestamp created;
    private Timestamp updated;
    private Boolean enable;
    private String image;




}

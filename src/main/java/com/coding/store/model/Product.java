package com.coding.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer cost;
    @Id
    private String item;
    private Boolean sold;

    public Integer getCost() {
        return cost;
    }

    public String getItem() {
        return item;
    }

    public Boolean getSold() {
        return sold;
    }
}

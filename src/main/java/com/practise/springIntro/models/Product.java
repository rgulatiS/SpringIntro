package com.practise.springIntro.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    private Long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private Category category;
}

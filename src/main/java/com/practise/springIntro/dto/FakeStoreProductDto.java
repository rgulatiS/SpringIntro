package com.practise.springIntro.dto;

import com.practise.springIntro.models.Category;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}

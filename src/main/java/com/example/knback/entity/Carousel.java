package com.example.knback.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author lihongyu
 */
@Entity
@Data
public class Carousel {
    @Id
    @GeneratedValue
    private Integer carouselId;
    private String carouselUrl;

    public
    Carousel() {
    }

    public
    Carousel(Integer carouselId, String carouselUrl) {
        this.carouselId = carouselId;
        this.carouselUrl = carouselUrl;
    }
}

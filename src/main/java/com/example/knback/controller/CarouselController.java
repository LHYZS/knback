package com.example.knback.controller;

import com.example.knback.entity.Carousel;
import com.example.knback.service.CarouselService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lihongyu
 */
@RestController
@RequestMapping("/carousel")
@CrossOrigin("*")
public class CarouselController {
    @Resource
    private CarouselService carouselService;

    @GetMapping("/all")
    public List<Carousel> getAll() {
        return carouselService.getAll();
    }
}

package com.example.knback.service.impl;

import com.example.knback.dao.CarouselRepository;
import com.example.knback.entity.Carousel;
import com.example.knback.service.CarouselService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lihongyu
 */
@Service
public class CarouselServiceImpl implements CarouselService{
    @Resource
    private CarouselRepository carouselRepository;

    @Override
    public
    List<Carousel> getAll() {
        return carouselRepository.findAll();
    }
}

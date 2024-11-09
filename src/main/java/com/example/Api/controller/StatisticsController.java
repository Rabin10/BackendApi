package com.example.Api.controller;

import com.example.Api.entity.Statistics;
import com.example.Api.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sysadmin")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @GetMapping("/statistics")
    public List<Statistics> getAllStatistics() {
        return statisticsService.getAllStatistics();
    }
}

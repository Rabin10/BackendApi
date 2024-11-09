package com.example.Api.controller;

import com.example.Api.entity.Review;
import com.example.Api.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sysadmin")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/reviews")
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/services/{serviceId}/reviews")
    public List<Review> getAllReviewsForService(@PathVariable Long serviceId) {
        return reviewService.getReviewsForService(serviceId);
    }

    @DeleteMapping("/reviews/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
    }
}

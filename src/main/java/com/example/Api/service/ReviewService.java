package com.example.Api.service;

import com.example.Api.entity.Review;
import com.example.Api.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public List<Review> getReviewsForService(Long serviceId) {
        return reviewRepository.findByServiceId(serviceId);
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}

package com.dyes.backend.domain.review.service.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewRegisterRequest {
    private String userToken;
    private Long orderId;
    private List<Long> productOptionIdList;
    private String content;
    private Integer rating;
}

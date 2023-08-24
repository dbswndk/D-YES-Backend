package com.dyes.backend.domain.product.service.Response;

import com.dyes.backend.domain.product.entity.SaleStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminProductListResponseForm {
    private Long productId;
    private String productName;
    private SaleStatus productSaleStatus;
    private List<AdminProductOptionListResponse> productOptionListResponse;
}

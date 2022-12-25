package com.shoppi.app.repository.productiondetail

import com.shoppi.app.model.Product

interface ProductDetailDataSource {

    suspend fun getProductDetail(productId: String): Product
}
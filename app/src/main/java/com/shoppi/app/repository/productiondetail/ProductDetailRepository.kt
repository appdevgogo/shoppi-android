package com.shoppi.app.repository.productiondetail

import com.shoppi.app.model.Product
import com.shoppi.app.repository.categorydetail.CategoryDetailRemoteDataSource

class ProductDetailRepository(
    private val remoteDataSource: ProductDetailDataSource

) {
    suspend fun getProductDetail(productId: String): Product {
        return remoteDataSource.getProductDetail(productId)
    }

}
package com.shoppi.app.repository.productiondetail

import com.shoppi.app.model.Product
import com.shoppi.app.network.ApiClient

class ProductDetailRemoteDataSource (
    private val api: ApiClient
    ) : ProductDetailDataSource {

        override suspend fun getProductDetail(productId: String): Product {
            return api.getProductDetail(productId)
        }
    }
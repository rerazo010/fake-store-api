package com.fake_store_api.client.fallback;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.fake_store_api.client.ProductsClient;
import com.fake_store_api.dtos.ProductsDTO;

import feign.FeignException;
import feign.hystrix.FallbackFactory;

@Component
public class ProductsClientFallback implements FallbackFactory<ProductsClient> {

	private static final Logger log = LoggerFactory.getLogger(ProductsClientFallback.class);

	@Override
	public ProductsClient create(Throwable cause) {

		return new ProductsClient() {
			@Override
			public List<ProductsDTO> getAllProducts() {
				if (cause instanceof FeignException) {
					int status = ((FeignException) cause).status();
					log.error("Error getting products: status code {}", status);
				} else {
					log.error("Unexpected error when retrieving products", cause);
				}
				return Collections.emptyList();
			}

			@Override
			public ProductsDTO createProduct(ProductsDTO productDTO) {
				if (cause instanceof FeignException) {
					int status = ((FeignException) cause).status();
					log.error("Error getting products: status code {}", status);
				} else {
					log.error("Unexpected error when retrieving products", cause);
				}
				return null;
			}

			@Override
			public ProductsDTO getProduct(Long id) {
				if (cause instanceof FeignException) {
					int status = ((FeignException) cause).status();
					log.error("Error getting products: status code {}", status);
				} else {
					log.error("Unexpected error when retrieving products", cause);
				}
				return null;
			}

			@Override
			public ProductsDTO updateProduct(Long id, ProductsDTO productDTO) {
				if (cause instanceof FeignException) {
					int status = ((FeignException) cause).status();
					log.error("Error getting products: status code {}", status);
				} else {
					log.error("Unexpected error when retrieving products", cause);
				}
				return null;
			}

			@Override
			public ProductsDTO deleteProduct(Long id) {
				if (cause instanceof FeignException) {
					int status = ((FeignException) cause).status();
					log.error("Error getting products: status code {}", status);
				} else {
					log.error("Unexpected error when retrieving products", cause);
				}
				return null;
			}

		};
	}

}

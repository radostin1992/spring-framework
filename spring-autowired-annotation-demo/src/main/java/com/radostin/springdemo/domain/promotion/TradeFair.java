package com.radostin.springdemo.domain.promotion;

import org.springframework.beans.factory.annotation.Autowired;

import com.radostin.springdemo.domain.product.ConsumerProduct;
import com.radostin.springdemo.domain.product.IndustrialProduct;

public class TradeFair {
	@Autowired
	private IndustrialProduct industrialProduct;

	@Autowired
	private ConsumerProduct consumerProduct;

	// public TradeFair() {
	//
	// }
	//
	// @Autowired
	// public TradeFair(IndustrialProduct industrialProduct, ConsumerProduct
	// consumerProduct) {
	// super();
	// this.industrialProduct = industrialProduct;
	// this.consumerProduct = consumerProduct;
	// }

	public int declareIndustrialProductPrice(IndustrialProduct industrialProduct) {
		return industrialProduct.calculatePrice();
	}

	public int declareConsumerProductPrice(ConsumerProduct consumerProduct) {
		return consumerProduct.calculatePrice();
	}

	public String specialPromotionalPricing() {
		String priceInfo = "Industrial product is priced at $" + declareIndustrialProductPrice(industrialProduct)
				+ " and " + "Consumer product is priced at $" + declareConsumerProductPrice(consumerProduct);
		return priceInfo;
	}

	// @Autowired
	// public void setIndustrialProduct(IndustrialProduct industrialProduct) {
	// this.industrialProduct = industrialProduct;
	// }
	//
	// @Autowired
	// public void setConsumerProduct(ConsumerProduct consumerProduct) {
	// this.consumerProduct = consumerProduct;
	// }
}

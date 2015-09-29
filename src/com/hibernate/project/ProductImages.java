// default package
// Generated Sep 20, 2015 6:10:57 PM by Hibernate Tools 4.3.1
package com.hibernate.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProductImages generated by hbm2java
 */
@Entity
@Table(name = "product_images", catalog = "projectwebservices")
public class ProductImages implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer productImagesId;
	private Product product;
	private String productImagesUrl;

	public ProductImages() {
	}

	public ProductImages(Product product, String productImagesUrl) {
		this.product = product;
		this.productImagesUrl = productImagesUrl;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Product_Images_ID", unique = true, nullable = false)
	public Integer getProductImagesId() {
		return this.productImagesId;
	}

	public void setProductImagesId(Integer productImagesId) {
		this.productImagesId = productImagesId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Product_FK", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "Product_Images_URL", nullable = false, length = 100)
	public String getProductImagesUrl() {
		return this.productImagesUrl;
	}

	public void setProductImagesUrl(String productImagesUrl) {
		this.productImagesUrl = productImagesUrl;
	}

}

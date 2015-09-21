// default package
// Generated Sep 20, 2015 6:10:57 PM by Hibernate Tools 4.3.1
package com.hibernate.project;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "order", catalog = "projectwebservices")
public class Order implements java.io.Serializable {

	private Integer orderId;
	private Customer customer;
	private CustomerPayment customerPayment;
	private Date orderDate;
	private int orderFinalPrice;
	private String orderShippingMethod;
	private String orderEstimateDelivery;
	private String orderStatus;
	private Set<Product> products = new HashSet<Product>(0);

	public Order() {
	}

	public Order(Customer customer, CustomerPayment customerPayment, Date orderDate, int orderFinalPrice,
			String orderShippingMethod, String orderEstimateDelivery, String orderStatus) {
		this.customer = customer;
		this.customerPayment = customerPayment;
		this.orderDate = orderDate;
		this.orderFinalPrice = orderFinalPrice;
		this.orderShippingMethod = orderShippingMethod;
		this.orderEstimateDelivery = orderEstimateDelivery;
		this.orderStatus = orderStatus;
	}

	public Order(Customer customer, CustomerPayment customerPayment, Date orderDate, int orderFinalPrice,
			String orderShippingMethod, String orderEstimateDelivery, String orderStatus, Set<Product> products) {
		this.customer = customer;
		this.customerPayment = customerPayment;
		this.orderDate = orderDate;
		this.orderFinalPrice = orderFinalPrice;
		this.orderShippingMethod = orderShippingMethod;
		this.orderEstimateDelivery = orderEstimateDelivery;
		this.orderStatus = orderStatus;
		this.products = products;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Order_ID", unique = true, nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Customer_FK", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Payment_FK", nullable = false)
	public CustomerPayment getCustomerPayment() {
		return this.customerPayment;
	}

	public void setCustomerPayment(CustomerPayment customerPayment) {
		this.customerPayment = customerPayment;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Order_Date", nullable = false, length = 19)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "Order_FinalPrice", nullable = false)
	public int getOrderFinalPrice() {
		return this.orderFinalPrice;
	}

	public void setOrderFinalPrice(int orderFinalPrice) {
		this.orderFinalPrice = orderFinalPrice;
	}

	@Column(name = "Order_ShippingMethod", nullable = false, length = 45)
	public String getOrderShippingMethod() {
		return this.orderShippingMethod;
	}

	public void setOrderShippingMethod(String orderShippingMethod) {
		this.orderShippingMethod = orderShippingMethod;
	}

	@Column(name = "Order_EstimateDelivery", nullable = false, length = 45)
	public String getOrderEstimateDelivery() {
		return this.orderEstimateDelivery;
	}

	public void setOrderEstimateDelivery(String orderEstimateDelivery) {
		this.orderEstimateDelivery = orderEstimateDelivery;
	}

	@Column(name = "Order_Status", nullable = false, length = 45)
	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "order_product", catalog = "projectwebservices", joinColumns = {
			@JoinColumn(name = "Order_Order_ID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Product_Product_ID", nullable = false, updatable = false) })
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}

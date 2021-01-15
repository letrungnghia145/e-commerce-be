package com.tmdt.app.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "\"order\"")
public class Order extends AbstractModel {
	private Date purchaseDate;
	private Long duration;
	private BigDecimal total;
	@ManyToOne(fetch = FetchType.LAZY)
	private Package packageType;
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
}

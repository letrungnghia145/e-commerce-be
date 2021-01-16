package com.tmdt.app.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post extends AbstractModel {
	private String title; // tiêu đề bài đăng
	@Column(columnDefinition = "text")
	private String description; // Mô tả bài đăng
	private String address; // địa chỉ tuyển dụng
	private BigDecimal salary; // Mức lương công việc
	private Integer slot; // số lượng cần tuyển
	@Temporal(TemporalType.DATE)
	private Date post_date; // ngày đăng bài
	@Temporal(TemporalType.DATE)
	private Date postExp_date; // hạn nộp hồ sơ
	@ElementCollection
	@CollectionTable(name = "experiences", joinColumns = @JoinColumn(name = "post_id"))
	private Set<String> experiences; // yêu cầu kinh nghiệm
	@ElementCollection
	@CollectionTable(name = "knowledges", joinColumns = @JoinColumn(name = "post_id"))
	private Set<String> knowledges; // yêu cầu kiến thức (thêm nút add vv)

	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	private Domain domain;

	@ManyToOne(fetch = FetchType.LAZY)
	private Package packageType;
}

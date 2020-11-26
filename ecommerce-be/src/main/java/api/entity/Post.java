package api.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Setter;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {
	@Id
	private String post_id;
	private String post_title;
	@Temporal(TemporalType.TIMESTAMP)
	private Date post_date;
	@Temporal(TemporalType.TIMESTAMP)
	private Date post_exp;
	private String post_description;

	// mapping
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "domain_id")
	private Domain post_domain;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employer_id")
	private Employer post_employer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "package_id")
	private Package post_package;

}

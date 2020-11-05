package api.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
	private String post_description;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Domain post_domain;
}

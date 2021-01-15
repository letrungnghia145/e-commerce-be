package com.tmdt.app.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PkUserPackage implements Serializable {
	private static final long serialVersionUID = -8813923440593363718L;
	private Long userId;
	private Long packageId;
}

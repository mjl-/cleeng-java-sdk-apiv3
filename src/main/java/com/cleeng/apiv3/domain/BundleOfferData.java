package com.cleeng.apiv3.domain;

import java.io.Serializable;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class BundleOfferData implements Serializable {

	private static final long serialVersionUID = 1L;

	public Double price; // required for create
	public String title; // required for create
	public String url; // required for create
	public String description;
	public Float period;
	public Float socialCommissionRate;
	public java.util.Vector<String> offerIdList;
}

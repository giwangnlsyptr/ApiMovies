package com.example.apimovies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Images{

	@SerializedName("poster_sizes")
	private List<String> posterSizes;

	@SerializedName("secure_base_url")
	private String secureBaseUrl;

	@SerializedName("backdrop_sizes")
	private List<String> backdropSizes;

	@SerializedName("base_url")
	private String baseUrl;

	@SerializedName("logo_sizes")
	private List<String> logoSizes;

	@SerializedName("still_sizes")
	private List<String> stillSizes;

	@SerializedName("profile_sizes")
	private List<String> profileSizes;

	public void setPosterSizes(List<String> posterSizes){
		this.posterSizes = posterSizes;
	}

	public List<String> getPosterSizes(){
		return posterSizes;
	}

	public void setSecureBaseUrl(String secureBaseUrl){
		this.secureBaseUrl = secureBaseUrl;
	}

	public String getSecureBaseUrl(){
		return secureBaseUrl;
	}

	public void setBackdropSizes(List<String> backdropSizes){
		this.backdropSizes = backdropSizes;
	}

	public List<String> getBackdropSizes(){
		return backdropSizes;
	}

	public void setBaseUrl(String baseUrl){
		this.baseUrl = baseUrl;
	}

	public String getBaseUrl(){
		return baseUrl;
	}

	public void setLogoSizes(List<String> logoSizes){
		this.logoSizes = logoSizes;
	}

	public List<String> getLogoSizes(){
		return logoSizes;
	}

	public void setStillSizes(List<String> stillSizes){
		this.stillSizes = stillSizes;
	}

	public List<String> getStillSizes(){
		return stillSizes;
	}

	public void setProfileSizes(List<String> profileSizes){
		this.profileSizes = profileSizes;
	}

	public List<String> getProfileSizes(){
		return profileSizes;
	}

	@Override
 	public String toString(){
		return 
			"Images{" + 
			"poster_sizes = '" + posterSizes + '\'' + 
			",secure_base_url = '" + secureBaseUrl + '\'' + 
			",backdrop_sizes = '" + backdropSizes + '\'' + 
			",base_url = '" + baseUrl + '\'' + 
			",logo_sizes = '" + logoSizes + '\'' + 
			",still_sizes = '" + stillSizes + '\'' + 
			",profile_sizes = '" + profileSizes + '\'' + 
			"}";
		}
}
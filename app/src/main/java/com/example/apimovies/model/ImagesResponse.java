package com.example.apimovies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ImagesResponse{

	@SerializedName("images")
	private Images images;

	@SerializedName("change_keys")
	private List<String> changeKeys;

	public void setImages(Images images){
		this.images = images;
	}

	public Images getImages(){
		return images;
	}

	public void setChangeKeys(List<String> changeKeys){
		this.changeKeys = changeKeys;
	}

	public List<String> getChangeKeys(){
		return changeKeys;
	}

	@Override
 	public String toString(){
		return 
			"ImagesResponse{" + 
			"images = '" + images + '\'' + 
			",change_keys = '" + changeKeys + '\'' + 
			"}";
		}
}
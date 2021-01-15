package com.example.gsonsample.model.dog_breeds;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DogBreed{

	private List<String> message;
	private String status;

	public void setMessage(List<String> message){
		this.message = message;
	}

	public List<String> getMessage(){
		return message;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}
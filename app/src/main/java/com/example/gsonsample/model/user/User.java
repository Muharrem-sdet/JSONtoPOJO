package com.example.gsonsample.model.user;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class User{

	private List<UsersItem> users;

	public void setUsers(List<UsersItem> users){
		this.users = users;
	}

	public List<UsersItem> getUsers(){
		return users;
	}
}
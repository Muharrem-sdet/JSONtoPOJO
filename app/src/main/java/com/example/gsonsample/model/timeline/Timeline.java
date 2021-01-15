package com.example.gsonsample.model.timeline;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Timeline{

	private List<DataItem> data;
	private boolean _cacheHit;

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setCacheHit(boolean cacheHit){
		this._cacheHit = cacheHit;
	}

	public boolean isCacheHit(){
		return _cacheHit;
	}
}
package com.emmastone.rs3.scripts.esshafter.data;

public enum Shaft {

	SHAFTS(new int[] { 52 });
	
	private int[] shaftId;
	
	private Shaft(int[] shaftId){
		this.shaftId = shaftId;
	}
	
	public int[] getShaftId(){
		return shaftId;
	}

}

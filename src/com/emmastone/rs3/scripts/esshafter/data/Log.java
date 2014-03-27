package com.emmastone.rs3.scripts.esshafter.data;

public enum Log {

	LOGS(new int[] { 1511 });
	
	private int[] logId;
	
	private Log(int[] logId){
		this.logId = logId;
	}
	
	public int[] getLogId(){
		return logId;
	}

}

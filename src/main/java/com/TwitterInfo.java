package com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TwitterInfo {
	@JsonProperty("took")
	private long took;
	
	@JsonProperty("time_out")
	private boolean time_out;
	
	@JsonProperty("_shard")
	private String shard;

	@Override
	public String toString() {
		return "TwitterInfo [took=" + took + ", time_out=" + time_out
				+ ", shard=" + shard + "]";
	}

	public long getTook() {
		return took;
	}

	public void setTook(long took) {
		this.took = took;
	}

	public boolean isTime_out() {
		return time_out;
	}

	public void setTime_out(boolean time_out) {
		this.time_out = time_out;
	}

	public String getShard() {
		return shard;
	}

	public void setShard(String shard) {
		this.shard = shard;
	}
	
}

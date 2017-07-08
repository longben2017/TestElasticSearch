package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountInfo {
	@JsonProperty("took")
	private int took;
	
	@JsonProperty("timed_out")
	private boolean timeOut;
	
	@JsonProperty("_shards")
	private Shards shards;
	
	@JsonProperty("hits")
	private Hits hits;

	@Override
	public String toString() {
		return "AccountInfo [took=" + took + ", timeOut=" + timeOut
				+ ", shards=" + shards + ", hits=" + hits + "]";
	}

	public int getTook() {
		return took;
	}

	public void setTook(int took) {
		this.took = took;
	}

	public boolean isTimeOut() {
		return timeOut;
	}

	public void setTimeOut(boolean timeOut) {
		this.timeOut = timeOut;
	}

	public Shards getShards() {
		return shards;
	}

	public void setShards(Shards shards) {
		this.shards = shards;
	}

	public Hits getHits() {
		return hits;
	}

	public void setHits(Hits hits) {
		this.hits = hits;
	}
}

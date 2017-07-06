package com;



public class AccountInfo {
	private long took;
	
	private boolean time_out;
	
	private Shards _shards;
	
	private Hits hits;

	@Override
	public String toString() {
		return "AccountInfo [took=" + took + ", time_out=" + time_out
				+ ", _shards=" + _shards + ", hits=" + hits + "]";
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

	public Shards get_shards() {
		return _shards;
	}

	public void set_shards(Shards _shards) {
		this._shards = _shards;
	}

	public Hits getHits() {
		return hits;
	}

	public void setHits(Hits hits) {
		this.hits = hits;
	}
}

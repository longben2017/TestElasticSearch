package com;

import java.util.Arrays;

public class Hits {
	private long total;
	
	private long max_score;
	
	private Hits[] hits;
	
	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getMax_score() {
		return max_score;
	}

	public void setMax_score(long max_score) {
		this.max_score = max_score;
	}

	public Hits[] getHits() {
		return hits;
	}

	public void setHits(Hits[] hits) {
		this.hits = hits;
	}

	@Override
	public String toString() {
		return "Hits [total=" + total + ", max_score=" + max_score + ", hits="
				+ Arrays.toString(hits) + "]";
	}

}

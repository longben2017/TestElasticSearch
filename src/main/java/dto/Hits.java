package dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hits {
	@JsonProperty("total")
	private long total;
	
	@JsonProperty("max_score")
	private double maxScore;
	
	@JsonProperty("hits")
	private List<HitsEntity> hits;
	
	@Override
	public String toString() {
		return "Hits [total=" + total + ", maxScore=" + maxScore + ", hits="
				+ hits + "]";
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public double getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(double maxScore) {
		this.maxScore = maxScore;
	}

	public List<HitsEntity> getHits() {
		return hits;
	}

	public void setHits(List<HitsEntity> hits) {
		this.hits = hits;
	}
}

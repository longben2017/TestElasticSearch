package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shards {
	@JsonProperty("total")
	private long total;
	
	@JsonProperty("successful")
	private long successful;
	
	@JsonProperty("failed")
	private long failed;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getSuccessful() {
		return successful;
	}

	public void setSuccessful(long successful) {
		this.successful = successful;
	}

	public long getFailed() {
		return failed;
	}

	public void setFailed(long failed) {
		this.failed = failed;
	}

	@Override
	public String toString() {
		return "Shards [total=" + total + ", successful=" + successful
				+ ", failed=" + failed + "]";
	}
}

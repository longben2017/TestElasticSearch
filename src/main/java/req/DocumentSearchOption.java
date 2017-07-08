package req;

public class DocumentSearchOption {

	private String query;
	
	public DocumentSearchOption(){
	}
	
	public DocumentSearchOption(DocumentSearchOption option){
		this.query = option.getQuery();
	}
	
	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public static class Builder{
		private DocumentSearchOption option;
		
		public Builder(){
			option = new DocumentSearchOption();
		}
		
		public Builder query(String query){
			option.query = query;
			return this;
		}
		
		public DocumentSearchOption build(){
			return new DocumentSearchOption(option);
		}
		
	}
}

package options;

public class DocumentSearchOptions extends BaseRequestOptions{

	private static final long serialVersionUID = 1L;

	public DocumentSearchOptions from(int from) {
		add("from", from);
		return this;
	}

	public DocumentSearchOptions size(int size){
		add("size", size);
		return this;
	}
	
	public static class Builder{
		public static DocumentSearchOptions from(int from){
			DocumentSearchOptions options = new DocumentSearchOptions();
			return options.from(from);
		}
		
		public static DocumentSearchOptions size(int size){
			DocumentSearchOptions options = new DocumentSearchOptions();
			return options.size(size);
		}
	}
}

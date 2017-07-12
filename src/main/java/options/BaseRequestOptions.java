package options;

import java.util.LinkedHashMap;

public class BaseRequestOptions extends LinkedHashMap<String, Object> {

	private static final long serialVersionUID = 1L;

	void add(String name,Object value){
		this.putIfAbsent(name, value);
	}
}

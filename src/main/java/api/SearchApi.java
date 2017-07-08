package api;

import dto.AccountInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Path;

public interface SearchApi {
	@HEAD("/{index}")
	Call<Void> getIndexExist(@Path("index")String indexName);
	
	@GET("/{index}/_search")
	Call<AccountInfo> getDocs(@Path("index")String indexName);
}

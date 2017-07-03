package com;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HEAD;

public interface SearchApi {
	@HEAD("/bank")
	Call<Void> getIndexExist();
	
	@GET("/bank/_search")
	Call<AccountInfo> getDocs();
}

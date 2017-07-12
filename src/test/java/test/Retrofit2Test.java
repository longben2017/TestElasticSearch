package test;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import api.SearchApi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dto.AccountInfo;
import options.DocumentSearchOptions;

public class Retrofit2Test {
	SearchApi searchApi;
	Gson gson;
	
	@Before
	public void before(){
		Retrofit retrofit = new Retrofit.Builder()
		.baseUrl("http://192.168.137.128:9200/")
		.addConverterFactory(JacksonConverterFactory.create())
		.build();
		searchApi = retrofit.create(SearchApi.class);
		gson = new GsonBuilder().setPrettyPrinting().create();
	}
	
	/**
	 * 查询索引是否存在
	 */
	@Test
	public void testGetIndexExist(){
		int code = 0;
		try {
			code = searchApi.getIndexExist("bank").execute().code();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(code);
	}
	
	/**
	 * 查询文档(默认10条记录)
	 */
	@Test
	public void testGetDocs(){
		try {
			Response<AccountInfo> response = searchApi.getDocs("bank").execute();
			AccountInfo accountInfo = (AccountInfo)response.body();
			System.out.println(gson.toJson(accountInfo));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testJson(){
		DocumentSearchOptions options = DocumentSearchOptions.Builder.from(10).size(20);
		System.out.println(gson.toJson(options));
	}
}

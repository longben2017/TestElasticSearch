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
	 * ��ѯ�����Ƿ����
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
	 * ��ѯ�ĵ�(Ĭ��10����¼)
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
}

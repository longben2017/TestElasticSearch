package com;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Retrofit2Test {
	SearchApi searchApi;
	
	@Before
	public void before(){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Retrofit retrofit = new Retrofit.Builder()
		.baseUrl("http://192.168.137.128:9200/")
		.addConverterFactory(GsonConverterFactory.create())
		.build();
		searchApi = retrofit.create(SearchApi.class);
	}
	
	
	@Test
	public void getDocsTest(){
		try {
			Response<AccountInfo> response = searchApi.getDocs().execute();
			AccountInfo accountInfo = (AccountInfo)response.body();
			System.out.println(accountInfo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getIndexExistTest(){
		int code = 0;
		try {
			code = searchApi.getIndexExist().execute().code();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(code);
	}
}

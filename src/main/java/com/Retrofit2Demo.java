package com;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.HEAD;

public class Retrofit2Demo {
	public interface Search{
		@HEAD("/twitter")
		Call<Void> getIndexExist();
		
		@GET("/twitter/_search")
		Call<TwitterInfo> getDocs();
	}
	
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Retrofit retrofit = new Retrofit.Builder()
		.baseUrl("http://192.168.64.130:9200/")
		.addConverterFactory(GsonConverterFactory.create(gson))
		.build();
		Search service = retrofit.create(Search.class);
		try {
			//int code = service.getIndexExist().execute().code();
			//System.out.println(code);
			Response response = service.getDocs().execute();
			TwitterInfo twitterInfo = (TwitterInfo)response.body();
			System.out.println(twitterInfo.isTime_out());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com;

import java.net.InetAddress;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

public class JavaClientTest {
	public static void main(String[] args) throws Exception {
//			XContentBuilder builder = jsonBuilder()
//				    .startObject()
//				        .field("user", "kimchy")
//				        .field("postDate", new Date())
//				        .field("message", "trying out Elasticsearch")
//				    .endObject();
//			String jsonString = builder.string();
			
			
			TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
			.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("192.168.64.130"),9300));
			GetResponse response = client.prepareGet("twitter","tweet","1")
					.execute().actionGet();
			String a = response.getSourceAsString();
	//what?
			System.out.println(a);
			client.close();
			//nothing
		//欧克
	}
}

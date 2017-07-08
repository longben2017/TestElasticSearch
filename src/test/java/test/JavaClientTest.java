package test;

import java.net.InetAddress;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JavaClientTest {
	
	TransportClient client;
	
	@SuppressWarnings("resource")
	@Before
	public void before() throws Exception{
		client = new PreBuiltTransportClient(Settings.EMPTY)
		.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("192.168.137.128"),9300));
	}

	@After
	public void after(){
		client.close();
	}
	
	@Test
	public void testGetDocs(){
		GetResponse response = client.prepareGet("bank","account","1").execute().actionGet();
		System.out.println(response.getSourceAsString());
	}
	
}

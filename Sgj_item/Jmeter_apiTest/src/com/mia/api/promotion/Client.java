package com.mia.api.promotion;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;

import com.mia.api.promotion.untils._QueryParam;



public class Client {

	private static TSocket socket;
	private static TFramedTransport transport;
	private static TProtocol protocol;
	private static PromotionService.Client client;
	
	public static  void client(String ip, int port){		
		socket = new TSocket(ip, port);
		transport = new TFramedTransport(socket);
		try {
			transport.open();
		} catch (TTransportException e) {
			transport.close();
			throw new RuntimeException(e);
		}
		// 传输协议
		protocol = new TCompactProtocol(transport);
		// 客户端
		 client = new PromotionService.Client(protocol);	
		 System.out.println(client);
	}
	
	public static RItemPromotionLadder run(String Param_List){
		QueryParam params = _QueryParam.params(Param_List);
		RItemPromotionLadder result = null;
		System.out.println(client);
		try {
			result = client.getItemPromotionInfo(params);
			return result;
		} catch (TException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	public static void stop(){
		 transport.close();
         socket.close();
	}
	public static void main(String[] args) {
		client("172.16.96.33",9090);
		System.out.println(run("1000024,1000025"));
		stop();
		
	}
}

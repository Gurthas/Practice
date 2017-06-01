package com.mia.order.tApi.Untils;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;

import com.mia.order.tApi.TOrderApiService;
import com.mia.order.tApi.TParamsPing;
import com.mia.order.tApi.TResultPing;

public class Client {
	public static final String SERVER_IP = "172.16.104.185";
	public static final int SERVER_PORT = 82;
	public static final int TIMEOUT = 30000;

	public static void StartClient() {
		// Socket层
		TSocket socket = new TSocket(SERVER_IP, SERVER_PORT);
		// 传输层
		TFramedTransport transport = new TFramedTransport(socket);
		// 传输协议
		TProtocol protocol = new TCompactProtocol(transport);
		// 定义调用的服务
		TMultiplexedProtocol tMultiplexedProtocol = new TMultiplexedProtocol(protocol, "order_api_service_v1.0");
		// 客户端
		TOrderApiService.Client client = new TOrderApiService.Client(tMultiplexedProtocol);
		try {
			// 开启传输层
			transport.open();
			System.out.println("*************************");
			TParamsPing params = _TParamsPing.params();
			TResultPing result = client.ping(params);
			System.out.println("*************result" + result);
			// List<TCoupon> pagelist = result.getPageList();
			// System.out.println("***********" + pagelist);
		} catch (TException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			transport.close();
			socket.close();
		}

	}

	public static void main(String[] args) {
		StartClient();
	}

}

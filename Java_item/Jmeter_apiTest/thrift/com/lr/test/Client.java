package com.lr.test;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;

import com.mia.OpenOrder.CommonParams;
import com.mia.OpenOrder.TOrderUmsService;
import com.mia.OpenOrder.TParamsOpenOrderCreate;
import com.mia.OpenOrder.TResultOpenOrderCreate;

public class Client {
	private static final String SERVER_IP = "172.16.104.185";
	private static final int SERVER_PORT = 82;
	private static final int TIMEOUT = 30000;
	
	
	TOrderUmsService OrderApiService = new TOrderUmsService();
	
	public  void StartClient(TParamsOpenOrderCreate params,CommonParams CommonParams){
        //  Socket层
        TSocket socket = new TSocket(SERVER_IP, SERVER_PORT);
        // 传输层
        TFramedTransport transport = new TFramedTransport(socket);
        // 传输协议
        TProtocol protocol = new TCompactProtocol(transport);
        //定义调用的服务
        TMultiplexedProtocol tMultiplexedProtocol = new TMultiplexedProtocol(protocol, "order_api_service_v1.0");
        //客户端
        TOrderUmsService.Client client = new TOrderUmsService.Client(tMultiplexedProtocol);
        try {
            //  开启传输层
            transport.open();
            System.out.println("*************************");
            CommonParams commonParams1 = ComParams.CommonParams();
            TParamsOpenOrderCreate params1 = ParamsOpenOrderCreate.params();
    	
    		//client.cancelOrder(params1, commonParams1);
            TResultOpenOrderCreate result = client.openOrderCreate(params1,commonParams1);
    		System.out.println("*************result"  + result);
    		//List<TCoupon> pagelist = result.getPageList();
           //System.out.println("***********" + pagelist);
        } catch (TException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();   
        } finally {
            transport.close();
            socket.close();
        }
 
		
	}



}

package com.lr.test;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;

import com.mia.Coupon.CommonParams;
import com.mia.Coupon.Service;
import com.mia.Coupon.TParamsBindCouponByBatchCode;
import com.mia.Coupon.TParamsBindCouponByCode;
import com.mia.Coupon.TParamsCheckoutCommonCoupon;
import com.mia.Coupon.TParamsPreUseCoupon;
import com.mia.Coupon.TParamsQueryCouponForCheckout;
import com.mia.Coupon.TParamsQueryUserCoupon;
import com.mia.Coupon.TParamsRecoverCoupon;
import com.mia.Coupon.TParamsRollbackCoupon;
import com.mia.Coupon.TParamsUseCoupon;
import com.mia.Coupon.TResultBindCouponByBatchCode;
import com.mia.Coupon.TResultBindCouponByCode;
import com.mia.Coupon.TResultCheckoutCommonCoupon;
import com.mia.Coupon.TResultPreUseCoupon;
import com.mia.Coupon.TResultQueryCouponForCheckout;
import com.mia.Coupon.TResultQueryUserCoupon;
import com.mia.Coupon.TResultRecoverCoupon;
import com.mia.Coupon.TResultRollbackCoupon;
import com.mia.Coupon.TResultUseCoupon;

public class CouponApiService implements Service.Iface  {
	/*public static String host ="10.1.52.22";
	public static int port = 81;
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
	  interface Handler<T> {
	        public T process(Service.Client client);
	    }
	  
	  //  @SuppressWarnings("hiding")
	  //private
	  private static <T> T run(Handler<T> handler) {
	        // Socket��
	        TSocket socket = new TSocket(host, port);
	        // �����
	        TFramedTransport transport = new TFramedTransport(socket);
	        // ����Э��
	        TProtocol protocol = new TCompactProtocol(transport);
	        TMultiplexedProtocol tMultiplexedProtocol = new TMultiplexedProtocol(protocol, "coupon_api_service");
	        // �ͻ���
	        Service.Client client = new Service.Client(tMultiplexedProtocol);
	        try {
	            // ���������
	            transport.open();
	            return handler.process(client);
	        } catch (TTransportException e) {
	            System.err.println(e.getMessage());
	            e.printStackTrace();
	        } catch (TException e) {
	            System.err.println(e.getMessage());
	            e.printStackTrace();
	        } finally {
	            transport.close();
	            socket.close();
	        }
	        return null;

	    }*/

	  @Override
	    public TResultQueryUserCoupon queryUserCoupon( final TParamsQueryUserCoupon params,  final CommonParams att) throws TException {
		  return null;
	    }


	       
	  
		@Override
		public TResultQueryCouponForCheckout queryCouponForCheckout(
				TParamsQueryCouponForCheckout params, CommonParams att)
				throws TException {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public TResultCheckoutCommonCoupon checkoutCommonCoupon(
				TParamsCheckoutCommonCoupon params, CommonParams att)
				throws TException {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public TResultPreUseCoupon preUseCoupon(TParamsPreUseCoupon params,
				CommonParams att) throws TException {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public TResultRollbackCoupon rollbackCoupon(
				TParamsRollbackCoupon params, CommonParams att)
				throws TException {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public TResultUseCoupon useCoupon(TParamsUseCoupon params,
				CommonParams att) throws TException {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public TResultBindCouponByBatchCode bindCouponByBatchCode(
				TParamsBindCouponByBatchCode params, CommonParams att)
				throws TException {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public TResultBindCouponByCode bindCouponByCode(
				TParamsBindCouponByCode params, CommonParams att)
				throws TException {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public TResultRecoverCoupon recoverCoupon(TParamsRecoverCoupon params,
				CommonParams att) throws TException {
			// TODO Auto-generated method stub
			return null;
		}


}

package com.mia.api.message.Untils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.mia.api.message.AppNewsInfo;
import com.mia.api.message.QueryParam;

public class _QueryParam {
	

	public static QueryParam params(String userid,String type, String resource_type,String resource_sub_type ,String custom_title ,String custom_photo,
			String custom_url, int resource_id ,int send_from_id ,String Version, String ClientType) {

		QueryParam params = new QueryParam();
		AppNewsInfo info = new AppNewsInfo();		
		info.setContent("test AppNewsInfo 123456789 帝国大厦");
		info.setType(type);
		info.setResource_type(resource_type);
		info.setResource_sub_type(resource_sub_type);
		info.setCustom_title(custom_title);
		info.setCustom_photo(custom_photo);
		info.setCustom_url(custom_url);
		info.setResource_id(resource_id);
		info.setSend_from_id(send_from_id);
		info.setValid_time(Timestamp());
		info.setCreated(Timestamp());
		params.setVersion(Version);
		params.setClientType(ClientType);
		params.setRequestTime(requestTimestamp());
		List<Integer> uids = new ArrayList<Integer>();
		userid = userid.replace("，", ",");
		String[] maptxt = userid.split(",");
		for (int i = 0; i < maptxt.length; i++) {
			String key = maptxt[i];
			uids.add(Integer.valueOf(key));
		}
		//uids.add(uid);
		params.setUids(uids);
		params.setAddNewsInfo(info);
		return params;
	}

	public static int requestTimestamp() {
		long seconds = System.currentTimeMillis() /100;	
		return (int) seconds;
	}

	public static int id() {
		AtomicInteger counter = new AtomicInteger(0);
		long seconds = System.currentTimeMillis();
		if (counter.get() > 999999) {
			counter.set(1);
		}		
		//StringBuffer res = new StringBuffer();
		//res.append(seconds).append(counter.incrementAndGet());		 		 
		return (int) seconds;
	}
	public static String Timestamp() {
		long seconds = System.currentTimeMillis();
		StringBuffer str = new StringBuffer();
		return str.append(seconds).toString();
	}

}

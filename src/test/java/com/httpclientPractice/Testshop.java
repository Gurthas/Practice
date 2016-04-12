package com.httpclientPractice;

import java.util.HashMap;
import java.util.Map;

public class Testshop {
    public static void main(String[] args) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("area_id", "566e800738a2127e2686f9f8");
        String url = "http://dev.shark.kuaikuaiyu.com/api.shop.list?platform=android&version=0,21&did=5978ad54b1c2033d";
        String post = HttpclientUtil1.post(url, params);
        System.out.println(post);

    }
}

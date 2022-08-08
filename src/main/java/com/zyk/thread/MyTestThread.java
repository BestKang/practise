package com.zyk.thread;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.io.IOException;

public class MyTestThread implements Runnable{
    private volatile int a =0;
    @Override
    public void run() {
        while (true) {
            // 创建httpClient实例对象
            HttpClient httpClient = new HttpClient();
            // 设置httpClient连接主机服务器超时时间：15000毫秒
            httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(10000);
            // 创建post请求方法实例对象
            PostMethod postMethod = new PostMethod("http://127.0.0.1:8080/haha");
            // 设置post请求超时时间
            postMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 10000);
            postMethod.addRequestHeader("Content-Type", "application/json");

            try {
                httpClient.executeMethod(postMethod);
            } catch (Exception e) {
                e.printStackTrace();
            }

            String result = null;
            try {
                result = postMethod.getResponseBodyAsString();
                System.out.println(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
            postMethod.releaseConnection();
            //return result;
            try {
                Thread.currentThread().sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

package com.hexun.redis;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

import redis.clients.jedis.Jedis;

public class TestPub {

	public static void main(String[] args) {
		 Jedis redis = new Jedis("10.4.12.8", 3790, 400000); 
	    try {
	      Bean bean = new Bean();
	      bean.setName("test111");
	  //ʹ��ObjectOutputStream��ByteArrayOutputStream������ת�����ֽ���
	      ByteArrayOutputStream baos = new ByteArrayOutputStream();
	      ObjectOutputStream oos = new ObjectOutputStream(baos);
	      oos.writeObject(bean);
	      oos.close();
	      String msg1 = baos.toString("ISO-8859-1");//ָ���ַ������ֽ���������ַ����������ڶ���ʱ��ת���������⡣
	      // msg1 = URLEncoder.encode(msg1, "UTF-8");
	      redis.publish("foo", msg1);
	    } catch (Exception e) {

	    }
	  }
}

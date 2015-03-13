package org.jory.wishbone.common.guawa;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Map;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

public class GClient {

    public static void main(String[] args) {
	
	GClient client = new GClient();
	client.method001("Jory");;
	client.method001(null);
	/**
	String key1 = "key1";
	String key2 = "key2";
	Multimap<String, String> multimap = ArrayListMultimap.create();
	multimap.put(key1, "value1");
	multimap.put(key1, "value2");
	multimap.put(key1, "value3");
	multimap.put(key2, "velue4");
	
	Collection<String> ofKey1 = multimap.get(key1);
	System.out.println(ofKey1);
	
	Collection<String> values = multimap.values();
	System.out.println(values);
	
	//System.out.println("=========================" + MapUtils);
	
	Map<String, String> map = Maps.newHashMap();
	map.put(key1, "value1");
	map.put(key1, "value2");
	map.put(key1, "value3");
	map.put(key2, "velue4");
	
	String vOfK1 = map.get(key1);
	System.out.println(vOfK1);
	
	Collection<String> valuesOfMap = map.values();
	System.out.println(valuesOfMap);
	
	
	BigDecimal originPrice = new BigDecimal(678.21);
	BigDecimal salePrice = new BigDecimal(247.9723);
	BigDecimal numerator = originPrice.subtract(salePrice ).multiply(new BigDecimal(100));
	System.out.println("numerator : " + numerator);
	System.out.println(numerator);
	System.out.println("result : " + numerator.divide(originPrice, RoundingMode.CEILING));
	*/
	
    }
    
    
    public void method001(String name) {
	
	System.out.println("Hello, " + name);
	
    }
    
    

}

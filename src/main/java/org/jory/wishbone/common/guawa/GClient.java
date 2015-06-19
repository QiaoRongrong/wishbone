package org.jory.wishbone.common.guawa;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

public class GClient {

    public void testLists() {
	List<String> list = Lists.newArrayList("a", "b", "c", "d", "e");
	
//	System.out.println("2==" + Lists.partition(list, 2).get(0));
//	System.out.println("9==" + Lists.partition(list, 9).get(0));
	
	List<String> emptyList = Lists.newArrayList();
	list.addAll(emptyList);
	
	System.out.println(list);
//	
//	System.out.println("4==" + Lists.partition(list, 4));
//	System.out.println("5==" + Lists.partition(list, 5));
//	System.out.println("6==" + Lists.partition(list, 6));
    }
    
    public void testListRetainAll() {
	List<String> list1 = Lists.newArrayList("aa", "bb", "aa", "dd");
	List<String> list2 = Lists.newArrayList("aa", "cc", "bb", "dd");
	List<String> list3 = Lists.newArrayList("1", "2", "3", "ll");
	
	System.out.println(list1.retainAll(list2));
	listToString(list1);
	
	System.out.println(list1.retainAll(list3));
	listToString(list1);
	
    }
    
    public void listToString(List<String> list) {
	System.out.println("List content: ");
	System.out.print("	");
	for (String value : list) {
	    System.out.print(value + ", ");
	}
    }
    
    
    public static void main(String[] args) {
	new GClient().testLists();
	
//	new GClient().testListRetainAll();
	
	/**
	GClient client = new GClient();
	client.method001("Jory");;
	client.method001(null);
	*/
	
	/*
	String key1 = "key1";
	String key2 = "key2";
	Multimap<String, String> multimap = LinkedListMultimap.create();
	multimap.put(key1, "value1");
	multimap.put(key1, "value1");
	multimap.put(key1, "value2");
	//multimap.put(key1, "value3");
	multimap.put(key2, "velue4");
	
	Collection<String> ofKey1 = multimap.get(key1);
	System.out.println("size of multimap" + multimap);
	System.out.println("values of key1" + ofKey1);
	
	Set<String> keySet = multimap.keySet();
	Iterator<String> keyIt = keySet.iterator();
	while (keyIt.hasNext()) {
		String productId = keyIt.next();
		System.out.println("productId : " + productId);
	}
	
	Collection<String> values = multimap.values();
	System.out.println(values);
	*/
	//System.out.println("=========================" + MapUtils);
	/**
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

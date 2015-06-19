package org.jory.wishbone.common.guawa.ch3;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.jory.wishbone.common.guawa.ImageInfo;
import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Lists;

public class CollectionTest {

    @Test
    public void testArrayListMultimapSameKeyValue() {
	ArrayListMultimap<String, String> multiMap = ArrayListMultimap.create();
	LinkedListMultimap<String, String> linkedListMultimap = LinkedListMultimap.create();
	multiMap.put("Bar", "1");
	multiMap.put("Bar", "2");
	multiMap.put("Bar", "3");
	multiMap.put("Bar", "3");
	multiMap.put("Bar", "3");
	List<String> expected = Lists.newArrayList("1", "2", "3", "3", "3");
	assertEquals(multiMap.get("Bar"), expected);

	
	HashMultimap<String, String> hashMultimap = HashMultimap.create();
	hashMultimap.put("Bar", "1");
	hashMultimap.put("Bar", "2");
	hashMultimap.put("Bar", "3");
	hashMultimap.put("Bar", "3");
	hashMultimap.put("Bar", "3");
	expected = Lists.newArrayList("3", "2", "1");
	Set<String> setOfValues = hashMultimap.get("Bar");
	
	//assertEquals(hashMultimap.get("Bar"), expected);
	
	
	
    }

    @Test
    public void testOptionalOfInstance() {
	ImageInfo tradeAccount = new ImageInfo();
	Optional<ImageInfo> tradeAccountOptional = Optional.of(tradeAccount);
	assertTrue(tradeAccountOptional.isPresent());
    }
    
    @Test(expected = IllegalStateException.class)
    public void testOptionalNull(){
        Optional<ImageInfo> tradeAccountOptional = Optional.fromNullable(null);
        assertFalse(tradeAccountOptional.isPresent());
        tradeAccountOptional.get();
    }

}

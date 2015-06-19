package org.jory.wishbone.common.object;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import com.google.common.collect.Lists;

public class FileSpliter {
    public static void main(String[] args) throws IOException {
	File file = new File("src/main/resources/vendorItemIds_20150113.txt");
	List<String> lines = FileUtils.readLines(file);
	
	int size = 1000;
	List<List<String>> subLines = Lists.partition(lines, size);
	/**
	 * Do same operations like add "," and "]"
	 */
	List<String> lineOf = subLines.get(0);
	for(String line : lineOf) {
	    System.out.println(line);
	}
	
	File writeFile1 = new File("src/main/resources/vendorItemIds_thousand_1.txt");
	FileUtils.writeLines(writeFile1, lineOf);
    }
}

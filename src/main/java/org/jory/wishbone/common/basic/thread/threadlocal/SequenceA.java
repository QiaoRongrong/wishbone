package org.jory.wishbone.common.basic.thread.threadlocal;

public class SequenceA implements Sequence {

    private static int number = 0;
    
    @Override
    public int getNumber() {
	return number++;
    }

}

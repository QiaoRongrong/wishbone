package org.jory.wishbone.common.basic.thread.threadlocal;

public class SequenceB implements Sequence {

    private static ThreadLocal<Integer> numberContainerThreadLocal = new ThreadLocal<Integer>() {
	@Override
	protected Integer initialValue(){
	    return 0;
	}
    };
    
    @Override
    public int getNumber() {
	numberContainerThreadLocal.set(numberContainerThreadLocal.get() + 1);
	return numberContainerThreadLocal.get();
    }

}

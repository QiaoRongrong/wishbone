package org.jory.wishbone.common.basic.thread.threadlocal;

/**
 * From: http://my.oschina.net/huangyong/blog/159489
 * @author qiaorongrong jory1002@gmail.com
 *
 */
public class Client {

    public static void main(String[] args) {
        Sequence sequenceA = new SequenceA();
        call(sequenceA);
        
       
        Sequence sequenceB = new SequenceB();
        call(sequenceB);
        
    }
    
    public static void call(Sequence sequence){
	ClientThread thread1 = new ClientThread(sequence);
        ClientThread thread2 = new ClientThread(sequence);
        ClientThread thread3 = new ClientThread(sequence);
 
        thread1.start();
        thread2.start();
        thread3.start();
        
        System.out.println("=====================");
    }
}

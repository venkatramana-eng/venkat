package com.cj.lp;

public class AvoidingDeadLock {
   
	public void method1()
	{
		synchronized(String.class)
		{
			System.out.println("aquired lock on the string class");
			synchronized (Integer.class) {
				System.out.println("aquired lock on the integer class");
			}
		}
	}
	public void method2()
	{
		synchronized(Integer.class)
		{
			System.out.println("aquired on integer");
			synchronized (String.class) {
				System.out.println("acquired on string");
			}
		}
	}
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.start();
		MyThread t2=new MyThread();
		t2.start();
        for(int i=0;i<=100000;i++)
        {
        	System.out.println(i);
        }
	}
}
    class MyThread extends Thread
    {

		@Override
		public void run() {
          AvoidingDeadLock deadLock=new AvoidingDeadLock();
          deadLock.method1();
		}
		class MyThread1 extends Thread
		{
			@Override
			public void run()
			{
				AvoidingDeadLock deadLock=new AvoidingDeadLock();
				deadLock.method2();
			}
		}
   
    }
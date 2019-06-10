package Work2;

public class Test {
	public static void main(String[] args) throws InterruptedException {
/*//第一题
		MyThread T1=new MyThread();
		T1.setName("线程一");
		MyThread T2=new MyThread();
		T2.setName("线程二");
		
		T1.start();
		T2.start();*/
		/*//题目二
		
		int count=0;
		while(count<100)
		{
			count++;
			System.out.println("main");
		}
		MyRunable1 mRunable1=new MyRunable1();
		Thread t1=new Thread(mRunable1);
		t1.start();*/
		//题目三
	/*	TeacherRunnable mTeacherRunnable=new TeacherRunnable();
		Thread mTeacher1=new Thread(mTeacherRunnable);
		mTeacher1.setName("老师一");
		Thread mTeacher2=new Thread(mTeacherRunnable);
		mTeacher2.setName("老师二");
		Thread mTeacher3=new Thread(mTeacherRunnable);
		mTeacher3.setName("老师三");
		mTeacher1.start();
		mTeacher2.start();
		mTeacher3.start();*/
		//题目四
		Thread[] mThreadList=new Thread[10];
		for (int i = 0; i < 10; i++) {
			mThreadList[i]=new CountThread(i*10+1);
			mThreadList[i].start();
		}
for (int i = 0; i < 10; i++) {
		
	mThreadList[i].join();
	}
		System.out.println(CountThread.sum);
		

	}

}

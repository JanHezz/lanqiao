package Work2;

public class Test {
	public static void main(String[] args) throws InterruptedException {
/*//��һ��
		MyThread T1=new MyThread();
		T1.setName("�߳�һ");
		MyThread T2=new MyThread();
		T2.setName("�̶߳�");
		
		T1.start();
		T2.start();*/
		/*//��Ŀ��
		
		int count=0;
		while(count<100)
		{
			count++;
			System.out.println("main");
		}
		MyRunable1 mRunable1=new MyRunable1();
		Thread t1=new Thread(mRunable1);
		t1.start();*/
		//��Ŀ��
	/*	TeacherRunnable mTeacherRunnable=new TeacherRunnable();
		Thread mTeacher1=new Thread(mTeacherRunnable);
		mTeacher1.setName("��ʦһ");
		Thread mTeacher2=new Thread(mTeacherRunnable);
		mTeacher2.setName("��ʦ��");
		Thread mTeacher3=new Thread(mTeacherRunnable);
		mTeacher3.setName("��ʦ��");
		mTeacher1.start();
		mTeacher2.start();
		mTeacher3.start();*/
		//��Ŀ��
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

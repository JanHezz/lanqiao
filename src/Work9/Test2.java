package Work9;

public class Test2 {
	public static int num=1;
	/*
	 *  n �������ӵĸ���
	 *  A B C�ֱ����������� 
	 * 
	 */
	//�ѱ��Ϊn������ A ����C
	public static void F(int n,char A,char B,char C)
	{   if (n==1) {//ֻ��һ������ʱ�ƶ�
		System.out.println("��"+(num++)+"���ƶ�"+"��"+n+"��Բ��"+"��"+A+"��ȥ"+C);
	}
	else {
		//��n-1�����Ƶ�b��
		F(n-1, A, C, B);
		//�ѵ�n��������ȥC
		System.out.println("��"+(num++)+"���ƶ�"+"��"+n+"��Բ��"+"��"+A+"��ȥ"+C);
		//��n-1��������B��ȥC
		 F(n-1,B,A,C);
		
	}
	
		
	}
	public static void main(String[] args) {
		F(3,'A','B','C');
	}

}

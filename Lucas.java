class Lucas
{
	public static void main(String argv[])
	{
		long[] x = new long[101];
		long goukei;
		goukei = 0;
		for(int i=1; i<=100; i++)
		{
			if(i==1){
				x[i] = 1;}
			else if(i==2){		
				x[i] = 3;}
			else{
				x[i] = x[i-1] + x[i-2];}
		}	

		for(int b=1; b<=100; b++)
		{
			goukei = goukei + x[b];
		}	
		System.out.println(goukei);
	}
}
//long�^�̕ϐ��ŎQ�Ɖ\�Ȑ��l�́u9223372036854775807�v�ł���
//�������A����̃v���O�����ŋ��߂鐔��22���Ɣ��ɑ������ł��邽�߁Aint��long�^���ƃI�[�o�[�t���[���N�����B
//���̂��߁Along�^��葽���̐����Q�Ƃł���f�[�^�^���K�v�ł���B

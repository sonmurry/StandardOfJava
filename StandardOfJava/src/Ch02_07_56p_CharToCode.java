
public class Ch02_07_56p_CharToCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';		// char ch = 65;
		int code = (int)ch;		//ch�� ����� ���� intŸ������ ��ȯ�Ͽ� ����
		
		System.out.printf("%c = %d(%#X) %n", ch, code, code);
		
		char hch = '��';		// char hch = 0xAC00;
		System.out.printf("%c = %d(%#X) %n", hch, (int)hch, (int)hch);
		
	}

}

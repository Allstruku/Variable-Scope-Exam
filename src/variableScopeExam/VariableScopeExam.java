package variableScopeExam;

//���α׷��󿡼� ���Ǵ� �������� ��밡���� ������ ������
//�⺻������ ������ �������� ������ ���� code block�̴�

class variableScopeExam {
	int globalScope = 10;
	// ��ó�� ����� ������ scope�� �� variableScopeExam Ŭ�����̴�
		public void scopeTest(int value) {
			int localScope = 50;
			System.out.println(globalScope);
			// globalScope�� �� �޼ҵ� ��� ���� Ŭ���� ��Ͽ� �������� ������ ����� �����ϴ�
			System.out.println(localScope);
			// localScope�� �� �޼ҵ� ��� �ȿ� �������� ������ ����� �����ϴ�
			System.out.println(value);
			// value�� �Ű����� (��� �ٱ��� �������) ����� �����ϴ�. ������ method ����ο� �����ϹǷ� �������� �ش� ����̴�
			System.out.println(staticVal);
		}
		
		public void scopeTest2 (int value2) {
			int localScope2 = 100;
			System.out.println(globalScope);
			// global Scope�� �ش� �޼ҵ� ��� ���� �ش�Ǵ� Ŭ���� ��Ͽ��� �������� ������ ����� �����ϴ�
//			System.out.println(localScope);
//			System.out.println(value);
			// ���� localScope field�� value�Ű������� ����� �Ұ����� ������ �ش� field�� �Ű������� �� �޼ҵ� ����� scopeTest�� ����Ǿ��� �����̴�
			System.out.println(localScope2);
			System.out.println(value2);
			System.out.println(staticVal);
		}
		
		static int staticVal = 20;
		// static�� field�� �����Ϸ��� "static dataType variableName = value;" �ϸ� �ȴ�
		// static�� field�� static�� �޼ҵ� �Ӹ� �ƴ϶� �Ϲ� �޼ҵ忡�� ����� �����ϴ�
		
		public static void main(String[] args) {
			// static�̶�� ���� �޼ҵ尡 instanceȭ �ȵǾ�� ��밡���ϰ� �����
//			System.out.println(globalScope);
//			System.out.println(localScope);
//			System.out.println(value);
//			System.out.println(localScope2);
//			System.out.println(value2);
			// ������ static ���� �޼ҵ� ������ ������ field�� �Ű������� ����� �Ұ����ϴ�
			System.out.println(staticVal);
			
//���� �޼ҵ忡�� static���� ���� field�� ����Ϸ��� instanceȭ�� �ؾ��Ѵ�
			variableScopeExam v1 = new variableScopeExam();
			System.out.println(v1.globalScope);
			variableScopeExam v2 = new variableScopeExam();
			System.out.println(v2.globalScope);
			
//instance�� ������ �ϰ� �ȴٸ� �����ϴ� ������ ������ �����̵ȴ�
//v2�� ���� ��ü�� variableScopeExam�� ����Ų��. �� ��ü �ȿ� ������ ������ �� �����
			
			v1.globalScope = 15;
			v2.globalScope = 25;
			System.out.println(v1.globalScope);
			System.out.println(v2.globalScope);
//�׷��⿡ ������ ���� �Ǿ� ���� field�� print�ϴ��� ���� �ٸ��� ���´�
			
			v1.staticVal = 250;
			v2.staticVal = 350;
			// ������ static�� field���� �׷����� �ʴ�
			// static�� field���� instance�� �����ÿ� ��������� ����� ���� �ƴ� ���� ������ �� �ִ� ������ �ϳ��̴� - Ŭ���� ������� �Ѵ�
//			System.out.println(v1.staticVal);
//			System.out.println(v1.staticVal);
			System.out.println(variableScopeExam.staticVal);
			// �ν��Ͻ��� ������ �ʾƵ� ����� �����ϱ⿡ �Ϲ������� ���� �� �������.static�� �ʵ尡 �ƴ� Ŭ������.static�� �ʵ� ���´�
		}
}

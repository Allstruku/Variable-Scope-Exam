package variableScopeExam;

//프로그램상에서 사용되는 변수들은 사용가능한 범위를 가진다
//기본적으로 변수의 사용범위는 범수가 사용된 code block이다

class variableScopeExam {
	int globalScope = 10;
	// 위처럼 선언된 변수의 scope은 전 variableScopeExam 클래스이다
		public void scopeTest(int value) {
			int localScope = 50;
			System.out.println(globalScope);
			// globalScope는 이 메소드 블록 위의 클래스 블록에 쓰여졌기 떄문에 사용이 가능하다
			System.out.println(localScope);
			// localScope는 이 메소드 블록 안에 지여졌기 때문에 사용이 가능하다
			System.out.println(value);
			// value는 매개변수 (블록 바깥에 지여졌어도) 사용이 가능하다. 하지만 method 선언부에 존재하므로 사용범위는 해당 블록이다
			System.out.println(staticVal);
		}
		
		public void scopeTest2 (int value2) {
			int localScope2 = 100;
			System.out.println(globalScope);
			// global Scope는 해당 메소드 블록 위에 해당되는 클래스 블록에서 지여졌기 때문에 사용이 가능하다
//			System.out.println(localScope);
//			System.out.println(value);
			// 위의 localScope field와 value매개변수가 사용이 불가능한 이유는 해당 field와 매개변수는 윗 메소드 블록인 scopeTest에 선언되었기 떄문이다
			System.out.println(localScope2);
			System.out.println(value2);
			System.out.println(staticVal);
		}
		
		static int staticVal = 20;
		// static한 field를 선언하려면 "static dataType variableName = value;" 하면 된다
		// static한 field는 static한 메소드 뿐만 아니라 일반 메소드에도 사용이 가능하다
		
		public static void main(String[] args) {
			// static이라는 것은 메소드가 instance화 안되었어도 사용가능하게 만든다
//			System.out.println(globalScope);
//			System.out.println(localScope);
//			System.out.println(value);
//			System.out.println(localScope2);
//			System.out.println(value2);
			// 하지만 static 안한 메소드 내에서 생성된 field와 매개변수는 사용이 불가능하다
			System.out.println(staticVal);
			
//메인 메소드에서 static하지 않은 field를 사용하려면 instance화를 해야한다
			variableScopeExam v1 = new variableScopeExam();
			System.out.println(v1.globalScope);
			variableScopeExam v2 = new variableScopeExam();
			System.out.println(v2.globalScope);
			
//instance를 생성을 하게 된다면 저장하는 공간이 별개로 생성이된다
//v2도 같은 객체인 variableScopeExam을 가리킨다. 이 객체 안에 저장할 공간이 또 생긴다
			
			v1.globalScope = 15;
			v2.globalScope = 25;
			System.out.println(v1.globalScope);
			System.out.println(v2.globalScope);
//그렇기에 저장이 따로 되어 같은 field를 print하더라도 값이 다르게 나온다
			
			v1.staticVal = 250;
			v2.staticVal = 350;
			// 하지만 static한 field들은 그렇지가 않다
			// static한 field들은 instance를 생성시에 저장공간이 생기는 것이 아닌 값을 저장할 수 있는 공간이 하나이다 - 클래스 변수라고 한다
//			System.out.println(v1.staticVal);
//			System.out.println(v1.staticVal);
			System.out.println(variableScopeExam.staticVal);
			// 인스턴스가 생기지 않아도 사용이 가능하기에 일반적으로 쓰일 때 참조면수.static한 필드가 아닌 클래스명.static한 필드 적는다
		}
}

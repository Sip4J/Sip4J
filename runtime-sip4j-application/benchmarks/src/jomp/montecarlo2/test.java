package jomp.montecarlo2;

public class test {

	Integer a = 10;
	Integer[] array = new Integer[]{1,3,5,7,9};

	public void createObject(){
		array = new Integer[5];
		//array[0] = 10;//
	}
	public void readA(){
		System.out.println("array[2] = "+array[2]);
		System.out.println("t1.a = "+a);
	}
	
	public static void main(String[] arg){
		test obj1 = new test();
		obj1.createObject();
		obj1.readA();
	}
}


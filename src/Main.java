
public class Main {
	static int countDigits(int number){
		if(number>=1 && number<=9)
			return 1;
		else if(number>=10 && number<=99)
			return 2;
		else if(number>=100 && number<=999)
			return 3;
		else
			return -1;
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Shaq");
	}

}

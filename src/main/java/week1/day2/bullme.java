package week1.day2;

public class bullme {

	public static void main(String[] args) {
			
		String name = "naveen";
		
//		if(name.contains("a")) {
//			System.out.println("a is available");
//		}
//		else {
//			System.out.println("No");
//		}
		
		char[] charArray = name.toCharArray();
		for (char c : charArray) {
		System.out.println(c);
			if(c=='n') {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}		
		
		
	}

}

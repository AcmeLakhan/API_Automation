package API.Automation;

public class Demo {

	public static void main(String[] args) {
		
		for(int i=1; i<16; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("##");
			}
			if(i%3==0) {
				System.out.println("**");
			}
			if(i%5==0) {
				System.out.println("@@");
			}
			else {
				System.out.println(i);
			}
		}
	}
}

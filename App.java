import java.util.Scanner;

public class App {
	
	private static Scanner entrada;
	private static boolean flag;

	public static void main(String [] args) {
		flag = false;
		entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int s[] = new int [n];
		for(int i = 0; i<n;i++) { 
			s[i] =entrada.nextInt();
			
		}
		int m = entrada.nextInt();
		int q [] = new int[m];
		for(int i =0;i<m; i++) {
			q[i] =entrada.nextInt();
		
		}
		for(int i = 0; i<n;i++) {
			flag = false;
			for(int j = 0; j<m;j++) {
				
				     if(q[j] == s[i]) {
				    	 
				    	 flag = true;
				     }
			}
			if(flag == false) {
				System.out.print(" " + s[i]);
			}
		}
	}
  
}

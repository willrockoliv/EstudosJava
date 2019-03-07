import java.util.ArrayList;
import java.util.Scanner;

public class FTTAcumulador {
	
	public static void main(String[] args) {
		System.out.println("FTT Acumulador");
		
		ArrayList<String> userMessages = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		int acumulador = 0;
		
		while(sc.hasNext()){
			
			String userText = sc.nextLine();
					
			if(userText.isEmpty())
				break;
			
			try{
			
				acumulador += Integer.valueOf(userText);
				
			} catch(Exception e){
				
				userMessages.add(userText);
				System.err.println("Ops!!");
				e.printStackTrace();
				
			}
			
			System.out.println("Valor acumulado: " + acumulador);
			
		}
		
		sc.close();
		
		for(int x=0; x < userMessages.size(); x++)
			System.out.println(userMessages.get(x));
		
		
	}
}

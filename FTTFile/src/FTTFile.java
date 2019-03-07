import java.io.PrintWriter;
import java.util.Random;

public class FTTFile {

	public static void main(String[] args) {
		System.out.println("FTT File...");
		System.out.println(System.getProperty("user.dir"));
		
		Random rn = new Random();
		
		try{
			
			//PrintWrter writer = new PrintWriter("jdados.tsv","UTF-8");
			PrintWriter writer = new PrintWriter("C:\\Users\\082160033\\Desktop\\jdados.tsv","UTF-8");
			
			int contador = 0;
			
			do{
				
				writer.println(contador + ";" + rn.nextInt() + ";" + String.valueOf(rn.nextFloat()).replace('.', ','));
				contador++;
				
			}while(contador < 100);
				
			writer.println("EOF");
			
			writer.close(); //salvar
			
		}catch (Exception e) {
			System.err.println("Ops!!!");
			e.printStackTrace();
		}
	}
}

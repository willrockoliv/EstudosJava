import java.util.Scanner;

public class Aluno {
	
	int ra;
	String nome;
	
	public void LeAluno(){
		Scanner le = new Scanner(System.in);
		MostraAluno(le);
	}
	
	public void MostraAluno(Scanner lido){
		System.out.println(lido);
	}
}   
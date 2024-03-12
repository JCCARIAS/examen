import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;

public class Files2 {

	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileWriter file = null ;
		PrintWriter writer = null;
		
		try {
			file = new FileWriter("C:\\ChristoferCarias.txt");
			writer = new PrintWriter(file);
			
			writer.println("examen de progra numeral 3 ");
			
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro"+e.getMessage());
		}finally {
			file.close();
		}
		
		
		
		

	}

}

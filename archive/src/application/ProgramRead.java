package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramRead {
	
	public static void main(String[] args) {
		// MANEIRA PADRÃO
		
//		File file = new File("c:\\temp\\in.txt");
//		Scanner sc = null;
//		
//		try {
//			sc = new Scanner(file);
//			
//			while (sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
//			
//		} catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//			
//		} finally {
//			if (sc != null) {
//				sc.close();
//			}
//		}
		
		
		
		
		//PROCESSO MANUAL
		
//		String path = "c:\\temp\\in.txt";
//		
//		FileReader fr = null;
//		BufferedReader br = null;
//		
//		try {
//			fr = new FileReader(path);
//			br = new BufferedReader(fr);
//			
//			String line = br.readLine();
//			
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//			
//		} catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//					
//		} finally {
//			try {
//				if (br != null) {
//					br.close();
//				}
//				
//				if (fr != null) {
//					fr.close();
//				}
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
		
		
		
		// BLOCO TRY-WITH-RESOURCES
		
		String path = "c:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		
	}
}

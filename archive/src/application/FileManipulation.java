package application;

import java.io.File;
import java.util.Scanner;

public class FileManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the folder path: ");
		String strPath = sc.nextLine();
		System.out.println();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		System.out.println();
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}
		System.out.println();
		
		boolean success = new File(strPath + "\\subDir").mkdir();
		System.out.println("Directory created sucessfully: " + success);
		
		sc.close();
	}
}

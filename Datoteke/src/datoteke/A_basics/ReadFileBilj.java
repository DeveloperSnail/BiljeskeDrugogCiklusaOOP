package datoteke.A_basics;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Ovaj primjer također sadrži načine stvaranja path-a
 */

public class ReadFileBilj {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException {

		File f = new File("Dart.txt");
		//...Prvi način za napravit Path:
		Path p = Path.of("Dart.txt");
		//...Drugi način:
		//Path p = f.toPath();
		
		
		//Načini čitanja datoteka u Javi
		// 1) Scanner
		Scanner sc = new Scanner(f);	//...treba deklarirat exception
		List<String> Dart = new ArrayList<>(3);
		while (sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
			Dart.add(line);
		}
		System.out.println(Dart);
		
		// 2) Files.readAllLines()
		Dart = Files.readAllLines(p);
		System.out.println(Dart);
		
		// 3) Files.readString()
		String wholeDart = Files.readString(p);
		System.out.println(wholeDart);
		
	
	}

}

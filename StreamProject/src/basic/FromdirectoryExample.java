package basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromdirectoryExample {
	public static void main(String[] args) {
		Path path = Paths.get("c:/program files");
		try {
			Stream<Path> stream = Files.list(path);
			stream.forEach((e) -> System.out.println(e.getFileName()));

			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		path = Paths.get("test.txt");
		try {
			Stream<String> strStream = Files.lines(path);
			strStream.forEach(System.out::println);
			
			strStream.close();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}

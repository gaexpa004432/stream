package basic;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strAry = {"hi","yo","ah"};
		Stream<String> stream = Arrays.stream(strAry);
		stream.peek(new Consumer<String>() {  //peek 중간처리

			@Override
			public void accept(String t) {
				System.out.println(t.toString());
			}}).forEach(new Consumer<String>() { //forEach 최종처리

				@Override
				public void accept(String t) {
					System.out.println(t.toString());
				}});;
	}
}

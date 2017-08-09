import java.io.*;
import java.util.*;
public class multiple {
	public static void main (String [] args) throws IOException {
		int num = 0;
		for (int i=1; i<10; i++) {
			if (i % 3 == 0) {
				num += i;
			}
			else if (i % 5 == 0) {
				num += i;
			}
			else {
				num += 0;
			}
		}
	System.out.println(num);
	}
}

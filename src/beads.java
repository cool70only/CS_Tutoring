/*
ID: liangiv12
LANG: JAVA
TASK: test
*/
import java.io.*;
import java.util.*;

public class beads {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("beads.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    StringTokenizer st = new StringTokenizer(f.readLine());
    String r = f.readLine();
	int length = Integer.parseInt (f.readLine ()); 
    char [] necklace = f.next ().toCharArray ();  
    int currentCount = 0;
    int prevBead = 0;
    int beadCount = 0; 
    int [] count = new int [length];  
    int y = 0;
    int beadColor = 0;
    boolean x = true;
    
    for (int i = 0 ; i  < 2 * length; i ++){ 
        count [i] = 1; 
        char a = 'w';
        for (int j = i; j < 2 * length; j++) {
        	if (r.charAt(j) == 'w' /*|| a == r.charAt(j)*/) {
                beadCount++;
                currentCount++;}
            else if (r.charAt(j) == beadColor) {
                x = false;
                beadCount = 0;
                currentCount++;}
            else {
            	y = (currentCount + prevBead>y)?currentCount+prevBead:y;
            	beadColor = r.charAt(j);
            	currentCount = beadCount + 1;
            	beadCount = 0;
            }
  }
     System.out.println(y<length?y:length);
}
}
}
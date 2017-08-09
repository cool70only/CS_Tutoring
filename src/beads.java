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
	int length = Integer.parseInt (fileIn.readLine ()); 
    char [] necklace = fileIn.next ().toCharArray (); ;  
    int currentCount = 1; 
    int beadCount = 0; 
    int [] count = new int [length];  
    int currentLength = 1; 
    boolean x = true;

}

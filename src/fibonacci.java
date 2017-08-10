import java.io.*;
import java.util.*;

public class fibonacci {

    public static void main(String[] args) {

        int num = 0;
        int num2 = 1;
        int sumNum = 0;
        int x = 0;

        while (num2 < 4000000)
        {
            if (num2 % 2 == 0) {
                sumNum = sumNum + num2;
        }
            x = num + num2;
            num = num2;
            num2 = x;

        //System.out.println(sumNum);
    }
        System.out.println(sumNum);
}}

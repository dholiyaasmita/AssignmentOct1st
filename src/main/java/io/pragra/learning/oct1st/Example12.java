package io.pragra.learning.oct1st;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st[]= new String[5];
        st[0]=sc.nextLine();
        st[1]=sc.nextLine();
        st[2]=sc.nextLine();
        st[3]=sc.nextLine();
        st[4]=sc.nextLine();
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }
    }
}

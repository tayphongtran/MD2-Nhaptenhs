package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       while (true){
           String[] students = {"anh Chinh", "Long", "anh Hung", "anh Hai", "anh Binh", "chi Huong"};
           Scanner scanner = new Scanner(System.in);
           System.out.println("nhap ten hoc sinh trong lop");
           String input = scanner.nextLine();
           Boolean check = false;

           for (int i = 0; i < students.length; i++) {

               if (input.equalsIgnoreCase(students[i])){
                   System.out.println(input + "co trong danh sach");
                   check = true;
                   break;
               }

           }
           if (input.equalsIgnoreCase("Quit")){
               System.exit(0);
           }
           if (check){
               System.out.println( input + " co nhe");
           }else {
               System.out.println(input + " khong co");
           }
       }


    }
}

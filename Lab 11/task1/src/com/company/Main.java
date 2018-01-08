package com.company;

import java.io.*;
import java.util.List;




public class Main {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\13220\\Desktop\\task1\\src\\com\\company\\hello.txt"));

        String line = null;

        while((line = br.readLine()) != null){

            String[] values = line.split(",");

            for(String str : values){
                System.out.print(str);
                //br.close();
            }

                for (int i = 0; i < values.length; i++) {
                for (int j = i + 1 ; j < values.length; j++)
                { if (values[i].equals(values[j])) { // got the duplicate element }
                    System.out.println("\n new" + values[i]);



            }

        }}





    }}}

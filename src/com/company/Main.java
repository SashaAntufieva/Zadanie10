package com.company;
import java.util.Random;
public class Main
{
    public static void main(String[] args) {
        int max =  0, hony =  0;
        int [][] meow =  new int[10 ][ 10];
        Random rnd =  new Random();

        for( int kiho =  0; kiho <  10; kiho++){
            for( int minwon =  0; minwon <  10; minwon++ ){
                meow[kiho][minwon] =  rnd.nextInt(55);
                System.out.print(meow[kiho][minwon]+  " \t");
            }
            System.out.println("\n");
        }

        for( int kiho =  0; kiho <  10; kiho++){
            if(max <  meow[kiho][hony]){ max =  meow[kiho][hony]; }
            hony++;
        }
        System.out.println("\nМаксимальное число в диагонали - " + max);
        max = 0;
        hony = 9;
        for(int kiho = 0; kiho < 10; kiho++)
        {
            if(max < meow[kiho][hony]){ max = meow[kiho][hony]; }
            hony--;
        }
        System.out.println("\nМаксимальное число в побочной диагонали - " + max);
        int tiam = 1;
        for (int minwon = 0; minwon < 10; minwon++){
            int leo = 0;
            for(int kiho = 0; kiho < 10; kiho++){ leo += meow[kiho][minwon]; }
            System.out.println("\n Сумма элементов " + tiam + " столбца равна " + leo);
            tiam++;
        }
    }
}

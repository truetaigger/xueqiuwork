package com.company;

import java.util.Scanner;

public class m1 {
    private static int[] value;
   static int [] cost;
   static  int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nn = scanner.nextInt();
         value = new int[nn];
        cost = new int[nn];
        int tmp = nn;
        while(tmp>0){
            value[nn-tmp]=scanner.nextInt();
            tmp--;
        }
        tmp = nn;
        while(tmp-->0){
            cost[nn-tmp]= scanner.nextInt();
        }
        int sum = scanner.nextInt();
        int valuesum=0;
        dfs(sum,0,valuesum);
        System.out.println(max);

    }

    private static void dfs(int sum, int start,int valuesum) {
        for(int i = start;i< value.length;i++){

        }
    }
}

package ex_05_OOPs;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

    static void main() {
//        0  1  2
//       0,0 1, 2[0,1], 3[0,2]
//        [1,2]4, 5[1,1], 6 [1,2]
//        7, 8, 9   = [1,2,4,7,5,3,6,8,9]

//
//
//        1,2,3
//        4,5,6  = [1, 2, 4, 5, 3, 6]

//
        int[][]arr = {
//               0,0;0,1
                {1,2,3},
                {4,5,6}, //1,2
                {7,8,9} //2,1,2,2     // [2,0 1,1 0,2]
        };


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] arr = new int[n][m];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0][0]);
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i <= j && j!=arr.length-1)
                ans.add(arr[i][j]);

            j++;

            }

            System.out.println(ans);
        }




}

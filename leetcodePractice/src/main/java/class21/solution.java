package class21;

import java.util.Arrays;

public class solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        int[][] inputs = { {1, 3, 4, 5, 6, 8}, 
//                           {6}, 
//                           {12}, 
//                           {14, 15, 16}};
//        MergeKSortedArray soln = new MergeKSortedArray();
//        for (Integer num : soln.merge(inputs)) {
//            System.out.println(num);
//        }
//        int[] cuts = {2, 4, 7};
//        cuttingWood soln = new cuttingWood();
//        System.out.println(soln.minCost(cuts, 10));
        
//        stringReversal soln = new stringReversal();
//        System.out.println(soln.reverseWords("I love yahoo tomorrow"));
//        mergeStones soln = new mergeStones();
//        System.out.println(soln.minCost(new int[]{4, 3, 3, 4}));
        
        rainbowIISort soln = new rainbowIISort();
        int[] array = new int[]{3, 1, 5, 5, 1, 4, 2};
        soln.rainbowSortIII(array, 5);
        System.out.println(Arrays.toString(array));
    }

}

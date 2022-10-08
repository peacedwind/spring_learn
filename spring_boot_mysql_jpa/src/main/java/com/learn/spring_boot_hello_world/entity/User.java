package com.learn.spring_boot_hello_world.entity;

import lombok.Data;

import java.util.Arrays;

/**
 * @description:
 * @author: cyx
 * @date: 2022-09-29
 **/
@Data
public class User {

    private String id;

    private String name;
}

class Solution {
    public void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        boolean[] rowFlags = new boolean[rowLength];
        boolean[] colFlags = new boolean[colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                int num = matrix[i][j];
                if (num == 0){
                    rowFlags[i] = true;
                    colFlags[j] = true;
                }
            }
        }
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (rowFlags[i] || colFlags[j]){
                    matrix[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr ={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        Solution solution = new Solution();
        int[] ints = solution.missingTwo(new int[]{3});
        System.out.println(ints);

    }
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()){
            return false;
        }

        return (s1 + s1).contains(s2);
    }

    public int[] missingTwo(int[] nums) {
        int length1 = nums.length;
        int length = length1 + 2;
        int[] temp = new int[2];
        int index = 0;
        int num = 0;
        int[] res = new int[2];
        while (num < length){
            if (index >= length){
                //find 即可 
                continue;
            }
            int i = nums[index] - 1;
            if (i >= length1){
                temp[i - length1] = -1;
            }else {
                temp[i] = -1;
            }
            index = i - 1;
            num++;
        }
        int index1 = 0;
        for (int i = 0; i < length1; i++) {
            if (nums[i] != -1){
                res[index1++] = i + 1;
            }
        }

        for (int i = 0; i < 2; i++) {
            if (temp[i] != -1){
                res[index1++] = length + 1;
            }
        }
        return res;
    }


}



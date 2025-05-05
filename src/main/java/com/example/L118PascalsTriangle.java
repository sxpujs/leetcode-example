package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 */
public class L118PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> aboveRow = finalList.get(i - 1);
                    row.add(aboveRow.get(j - 1) + aboveRow.get(j));
                }
            }
            finalList.add(row);
        }
        return finalList;
    }

    public static void main(String[] args) {
        L118PascalsTriangle triangle = new L118PascalsTriangle();
        List<List<Integer>> result = triangle.generate(5);
        System.out.println(result);

    }

}

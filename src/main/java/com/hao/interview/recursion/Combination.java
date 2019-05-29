package com.hao.interview.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: haoprogrammer
 * @date: 2019/5/25 20:30
 * @version: 1.0
 */
public class Combination {

  /**
   * @description: Generates all combinations and output them
   *               select n elements from data
   * @param: [source, n]
   * @return: void
   * @auther: haoprogrammer
   * @date: 2019/5/25 20:35
   */
  public void combinations(List<Integer> selected, List<Integer> data, int n){
    //initval value for recursion
    //how to select elements
    //how to output

    if (n == 0){
        for (Integer integer : selected){
          System.out.print(integer);
          System.out.print("  ");
        }
        System.out.println();
        return;
    }

    if (data.size() == 0){
      return;
    }
    //select element 0
    selected.add(data.get(0));
    combinations(selected, data.subList(1, data.size()), n -1);

    //un-select element 0
    selected.remove(selected.size() - 1 );
    combinations(selected, data.subList(1, data.size()), n);

  }

  public static void main(String[] args) {
    Combination comb = new Combination();
    comb.combinations(new ArrayList<Integer>(), Arrays.asList(1, 2, 3, 4), 2);
    System.out.println("===========>");
    comb.combinations(new ArrayList<Integer>(), Arrays.asList(1, 2, 3, 4), 0);
    System.out.println("===========>");
    comb.combinations(new ArrayList<Integer>(), new ArrayList<Integer>(), 2);
  }
}
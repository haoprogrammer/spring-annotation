package com.hao.interview.loop;

/**
 * @author: haoprogrammer
 * @date: 2019/5/27 11:52
 * @version: 1.0
 */
public class BinarySearch {


  public int binarySearch(int[] arr, int key){
    int min = 0;
    int max = arr.length;

    while(min < max){

      //notice overflow!!
      //int m = min + (max - min) / 2;
      int m = min + ((max - min) >>> 1);
      if (key < arr[m]){
        max = m;
      }else if(key > arr[m]){
        min = m + 1;
      }else {
        return m;
      }

    }

    return -1;

  }

  public static void main(String[] args) {
    BinarySearch bs = new BinarySearch();

    System.out.println(bs.binarySearch(new int[]{1,2,3}, 2));
  }

}
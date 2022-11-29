/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;


public class Solution {

  public static void main(String[] args) {
   ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2, 4, 3, 6));
   ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 6, 4));

    int sum = getReverse(list1) + getReverse(list2);

    ArrayList<Integer> rList = new ArrayList<>();
    String temp = Integer.toString(sum);

    for (int j=0; j < temp.length(); j++) {
      rList.add(Integer.parseInt(temp.substring(j, j+1)));
    }

    System.out.println(getReverse(rList));
  }

  static int getReverse(ArrayList<Integer> pList) {
    //Collections.sort(pList, Collections.reverseOrder());
    Collections.reverse(pList);
    String val = new String();

    for (int i=0; i < pList.size(); i++) {
      val += pList.get(i).toString();
    }
    System.out.println(Integer.parseInt(val));
    return Integer.parseInt(val);
  }
}

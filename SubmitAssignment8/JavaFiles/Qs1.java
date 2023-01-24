/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.countingsort;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author jaspr000
 */
public class CountingSort {

    private static int[] count;
    private static char[] out;
    private static HashMap<Character, Integer> hm = new HashMap<>();

    public static void sort(String s) {
        hm.put('A', 0);
        hm.put('B', 1);
        hm.put('C', 2);
        hm.put('D', 3);
        hm.put('E', 4);
        hm.put('F', 5);
        count = new int[7];
        out = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            count[hm.get(s.charAt(i)) + 1]++;
        }
        for (int r = 0; r < count.length - 1; r++) {
            count[r + 1] += count[r];
        }
        for (int i = 0; i < s.length(); i++) {
            out[count[hm.get(s.charAt(i)) + 1] - 1] = s.charAt(i);
            count[hm.get(s.charAt(i)) + 1]--;
        }
        System.out.println(Arrays.toString(out));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String s = "ABDCCEDDFCABBCCEFDDAAFF";
        sort(s);
    }
}

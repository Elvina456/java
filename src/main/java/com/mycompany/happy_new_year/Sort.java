/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.happy_new_year;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author 1
 */
public class Sort {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("C", 7);
        map.put("B", 3);
        map.put("A", 5);
        map.put("H", 5);
        Map<String, Integer> sortedMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String lhs, String rhs) {
                if (map.get(lhs) < map.get(rhs)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        sortedMap.putAll(map);

        for (final Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(String.format("%s = %s", entry.getKey(), entry.getValue()));
        }
    }
}

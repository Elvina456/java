/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.happy_new_year;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author 1
 */
public class Sort {

    public static void sort(Map<String, Integer> map) throws IOException {
        Map<String, Integer> sortedMap = new TreeMap<>((String lhs, String rhs) -> {
            if (map.get(lhs) < map.get(rhs)) {
                return 1;
            } else {
                return -1;
            }
        });
        sortedMap.putAll(map);

        sortedMap.entrySet().stream().forEach((entry) -> {
            System.out.println(String.format("%s = %s", entry.getKey(), entry.getValue()));
        });
        
        Save save = new Save(); 
			save.write(sortedMap);	
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.happy_new_year;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 1
 */
public class Find {

    public void find(String folder) {
        List folderNames = new ArrayList();
        List fileNames = new ArrayList();
        ArrayList<String> files = new ArrayList<>();
        for (File file : new File(folder).listFiles()) {
            if (file.isDirectory()) {
                folderNames.add(file.getName());
            } else {
                fileNames.add(file.getName());
            }
        }
        folderNames.stream().map((folderName) -> {
            ArrayList<Object> all_direction = new ArrayList<>();
            all_direction.add(folderName);
            return all_direction;
        }).forEach((all_direction) -> {
            System.out.println("директории: " + all_direction);
            // folder = folder + folderName + "\\";
            // find(folder);
        });
        fileNames.stream().forEach((fileName) -> {
            files.add((String) fileName);
        });
        // Совпадения
        System.out.println("Все файлы: " + files);
        String[] myArray = files.toArray(new String[files.size()]);
        math(myArray);
    }

    public void math(String[] myArray) {
        Map<String, Integer> all_files = new HashMap<>();
        for (String myArray1 : myArray) {
            // поиск совпадений
            for (String myArray2 : myArray) {
                if (myArray1.equals(myArray2)) {
                    int number = 0;
                    number++;
                    all_files.put(myArray1, number);
                    break;
                } else {
                    all_files.put(myArray1, 0);
                    break;
                }
            }
        }
        Set<Map.Entry<String, Integer>> set = all_files.entrySet();
        // Отобразим набор
        set.stream().map((me) -> {
            System.out.print(me.getKey() + "- ");
            return me;
        }).forEach((me) -> {
            System.out.println(me.getValue());
        });
    }
}

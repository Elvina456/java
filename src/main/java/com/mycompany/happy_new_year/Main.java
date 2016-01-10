/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.happy_new_year;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @MaLVin
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите адрес для поиска: "); //   c:\\
        String direction = in.nextLine();
        find(direction);

    }

    private static void find(String direction) {
        Map<String, Integer> all_files = new HashMap<>();
        String list[] = new File(direction).list();
        for (int i = 0; i < list.length; i++) { // поиск совпадений
            for (int j = 0; j < list.length; j++) {
                if (list[i].equals(list[j])) {
                    int number = 0;
                    number++;
                    all_files.put(list[i], number);
                    break;
                } else {
                    all_files.put(list[i], 0);
                    break;
                }
            }
        }
        
        // СОРТИРОВКА ПО ЗНАЧЕНИЮ (ФАЙЛ СОРТ)
        
        // Получаем набор элементов
        Set<Map.Entry<String, Integer>> set = all_files.entrySet();
        // Отобразим набор
        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + "- ");
            System.out.println(me.getValue());
        }
        
        
        // ЗАПИСЬ В ФАЙЛ
       // save("f",Entry);
    }

    private static void save(String fileName, String text) {
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

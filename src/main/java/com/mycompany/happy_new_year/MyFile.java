/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.happy_new_year;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @MaLVin
 */
public class MyFile {

    static boolean flag;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите адрес для поиска: "); //   c:\\
        String direction = in.nextLine();
        find(direction);
        matches();
        save();

    }

    private static void find(String direction) {

        String list[] = new File("c:\\").list();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        // Map<String, Integer> all_files = new HashMap<>();
        //  File f = new File(direction);
        // all_files.put = f.list();     //список файлов в текущей папке помещаем в лист
//        System.out.println(f.list());
//        for (String file : list) {      //проверка на совпадение по адресу 
//            if (name.equals(file)) {
//                int i = 0;
//                i++;
//                flag = true;
//                System.out.println(name + "- " + i); //запись в новый файл!!!
//                break;
//            } else {
//                flag = false;
//                System.out.println("No ");
//                break;
//            }
//         //     String fullname = file +"\\" name; // поиск по дериктории
//         //    func(fullname, "extensions"); // рекурсивный вызов функции
//        }
    }

    private static void matches() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

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
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @MaLVin
 */
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите адрес для поиска: "); //   c:\\
        String folder = in.nextLine();
        Find f = new Find();
        f.find(folder);

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

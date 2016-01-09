/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.happy_new_year;

import java.io.File;

/**
 *
 * @author 1
 */
public class Test {

   public static void main(String args[]) {
            String list[] = new File("c:\\").list();
            for(int i = 0; i < list.length; i++)
                System.out.println(list[i]);
        }
}

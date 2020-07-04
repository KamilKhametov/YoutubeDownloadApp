package com.company;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Введите URL-адрес");
        StringBuffer url = new StringBuffer(sc.next());
        url.insert(12, "ss"); // Как решили мои попытки проверки, offset и str - не имеют никого значения(всмысле, можно добавить любое число(offset) и любую букву(str)

        Desktop desktop = Desktop.getDesktop();
        try{
            desktop.browse(URI.create(url.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package signprice;

/**
 * Author: Tengku Aqil SID: S61748 Program Name: Calculate sign Description:
 * calculate sign price Date: 15/11/2021 Modified date: None Version: 1.0
 */
import java.util.*;

public class SignPrice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String Name = input.next();
        System.out.print("Wood(O/M): ");
        String Wood = input.next();
        System.out.print("number of characters: ");
        int charnum = input.nextInt();
        System.out.print("color of characters(BW/G): ");
        String color = input.next();

        int min = 30;
        int price = 1;
        if ("O".equals(Wood) || "o".equals(Wood)) {
            price = min + 15;
        } else if ("M".equals(Wood) || "m".equals(Wood)) {
            price = min + 10;
        }
        if ("G".equals(color) || "g".equals(color)) {
            price = price + 11;
        }
        if (charnum > 6) {
            price = price + ((charnum - 6) * 3);
        }
        System.out.println("Name: " + Name);
        System.out.println("Wood: " + Wood);
        System.out.println("number of characters: " + charnum);
        System.out.println("color: " + color);
        System.out.println("Price: " + price);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab1;

import java.util.Scanner;

/**
 *
 * @author camqu
 */
public class HCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng
        System.out.print("nhap chieu dai: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("nhap chieu rong: ");
        double chieuRong = scanner.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;

        // In kết quả
        System.out.println("--------------------------------");
        System.out.printf("Chu vi hinh chu nhat: %.2f\n", chuVi);
        System.out.printf("dien tich hinh chu nhat: %.2f\n", dienTich);

        scanner.close();
    }
}
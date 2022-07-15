package com.main;

import java.util.Scanner;

import com.matrix.Matrix;

public class Main {

	public static void main(String[] args) {
		int[][] arr1, arr2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Number of columns: ");
		int columns = sc.nextInt();
		
		arr1 = new int[rows][columns];
		arr2 = new int[rows][columns];
		
		System.out.println("Matrix 1");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix 2");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		Matrix m1 = new Matrix(arr1, rows, columns);
		Matrix m2 = new Matrix(arr2, rows, columns);
		
		System.out.println("Addition of Matrix 1 and Matrix 2");
		Matrix m3 = m1.add(m2);
		m3.display();
		
		sc.close();
	}
}

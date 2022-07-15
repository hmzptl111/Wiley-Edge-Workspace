package com.matrix;

public class Matrix {
	private int rows, columns;
	private int[][] matrix;
	
	public Matrix(int[][] matrix, int rows, int columns) {
		this.matrix = matrix;
		this.rows = rows;
		this.columns = columns;
	}
	
	public Matrix add(Matrix m) {
		int[][] sum = new int[rows][columns];
		int[][] m2 = m.getMatrix();
		
		if(m.getRows() != rows || m.getColumns() != columns) {
			System.out.println("Dimensions don't match");
		}
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				sum[i][j] = matrix[i][j] + m2[i][j]; 
			}
		}
				
		Matrix m3 = new Matrix(sum, rows, columns);
		return m3;
	}
	
	public void display() {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.println();
		}
	}
	
	public int[][] getMatrix() {
		return matrix;
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
}

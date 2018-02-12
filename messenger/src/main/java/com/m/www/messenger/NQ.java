package com.m.www.messenger;

public class NQ {

//	Code for backtracking N Queen Problem, Explaination in Video
//	https://www.geeksforgeeks.org/backtracking-set-3-n-queen-problem/
	
	
	public static void main(String[] args) {
		new NQ().solve();
		
	}
	
	
	public void solve() {
		
		int board[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		
		if (solveNQ(board, 0)) {
			for (int row = 0; row < 4; row++) {
				for (int col = 0; col < 4; col++) {
					System.out.print(board[row][col] + " ");
				}
				System.out.print("\n");
			}
		}
		else
			System.out.println("No Solution");
		
		
	}


	private boolean solveNQ(int board[][], int col) {
		if (col >= 4)
            return true;
		
		for (int rowIndex = 0; rowIndex < 4; rowIndex++) {
			
			if (isQueenSafe(rowIndex, col, board)) {
				
				board[rowIndex][col] = 1;
				
				if (solveNQ(board, col+1)) {
					return true;
				}
				
				board[rowIndex][col] = 0;
				
			}
			
		}
		return false;
		
	}


	private boolean isQueenSafe(int row, int col, int[][] board) {
		
		for (int i = 0; i < col; i++) {
			if (board[row][i] == 1) {
				return false;
			}
		}
		
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		
		for (int i = row, j = col; i < 4 && j >=0 ; i++, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		
		return true;
	}
	
	
}

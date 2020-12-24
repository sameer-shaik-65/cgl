package cgl;

public class Board {
	//create conways game of life board with given values
	//return the present generation board and next generation
	
	
		public boolean[][] createBoard(int n, int l[][]) {
			if(n<=0) {
				//System.out.println("error");
				return null;
			}
			else {
			boolean[][] board=new boolean[n][n];
		        for(int i=0;i<l.length;i++){
		                int p=l[i][0];
		                int q=l[i][1];
		                board[p][q]=true;
		        }
		       // System.out.println("CurrentGenration");
		       // printBoard(board);
		       // System.out.println("NextGenration");
		       // System.out.println(board);
		        return board;
		}}
		public String printBoard(boolean board[][]) {
			    StringBuffer b = new StringBuffer();
			        for(int i=0;i<board.length;i++)
			        {
			            for(int j=0;j<board[i].length;j++)
			            {
			                        if(board[i][j])
			                            b.append("*");
			                        else
			                            b.append(".");
			                
			            } b.append("\n");
			        }
			    //  System.out.println(b.toString());
			    return b.toString();
			    }
		 
}




package cgl;
//creates a next generation boards
public class ConwaysGameOfLife extends Board {
	public String generateNextGeneration(boolean current[][]) {
        int l=current.length;
        boolean[][] board1 = new boolean[l][l];
        Cell c=new Cell(); 
        Board b=new Board();
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                int liv=c.countLiveCells(current,i,j);

                if(current[i][j]){
                    if(liv<2){ 
                        board1[i][j]=false;
                    }else if(liv<=3){
                        board1[i][j]=true;
                    } else if(liv>3){
                        board1[i][j]=false;
                }
            }
                else{
                    if(liv==3){
                        board1[i][j] = true;
                    }
                }
                          
        }
    }
return printBoard(board1);
    



}

	public static void main(String[] args) {
 		Board ba=new Board();
 		int[][] l= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
 		
 		ba.printBoard(ba.createBoard(10,l));
 		ConwaysGameOfLife cg= new ConwaysGameOfLife();
 		cg.generateNextGeneration(ba.createBoard(10, l));
 		
 		//ba.createBoard(-12, l);
 	}
}

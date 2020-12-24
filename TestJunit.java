package cgl;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TestJunit {
//testing
   @Test
   public void testOne() {
	  // ComplexNumber cn1 = new ComplexNumber(3, 4);
	  // ComplexNumber cn2 = new ComplexNumber(3, -8);
	   Board b=new Board();
	   int[][] l= {{1,2},{1,3}};
	  // b.printBoard(false);
	   
       System.out.println("======TEST ONE EXECUTED=======");
       Assertions.assertSame(null,b.createBoard(-10,l));
   }
   
   @Test
   public void testTwo() {
	 
	   Board b=new Board();
	   int[][] l= {{1,2},{1,3},{5,6}};
	  // b.printBoard(false);
	   
       System.out.println("======TEST TWO EXECUTED=======");
       Assertions.assertSame(null,b.createBoard(0,l));
   }
   @Test
   public void testThree() {
	 //  ComplexNumber cn1 = new ComplexNumber(3, 4);
	  // ComplexNumber cn2 = new ComplexNumber(4, -1);
	   Board b=new Board();
	   int[][] l= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	  // b.printBoard(false);
	   
       //System.out.println("======TEST TWO EXECUTED=======");
       Assertions.assertEquals("..........\n"
       		+ "...**.....\n"
       		+ "....*.....\n"
       		+ "..........\n"
       		+ "..........\n"
       		+ "...**.....\n"
       		+ "..**......\n"
       		+ ".....*....\n"
       		+ "....*.....\n"
       		+ "..........\n",b.printBoard(b.createBoard(10,l)));
   }
   @Test
   public void testFour() {
	 
	   Board b=new Board();
	   ConwaysGameOfLife cg= new ConwaysGameOfLife();
		
	   int[][] l= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	  // b.printBoard(false);
	   
       System.out.println("======TEST THREE EXECUTED=======");
       Assertions.assertEquals("..........\n"
       		+ "...**.....\n"
       		+ "...**.....\n"
       		+ "..........\n"
       		+ "..........\n"
       		+ "..***.....\n"
       		+ "..**......\n"
       		+ "...**.....\n"
       		+ "..........\n"
       		+ "..........\n",cg.generateNextGeneration(b.createBoard(10, l)));
   }
   


  }



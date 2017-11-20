package cell;

public class CellTest {

	public static void main(String[] args) {
		Cell c = new Cell();
         c.row = 5;
		 c.col = 5;
		PrintWall(c);
		System.out.println("ÏÂÂäºó");
		c.drop();
		PrintWall(c);
		System.out.println("×ó4Î»");
		c.moveLeft(4);
		PrintWall(c);
		Cell s = new Cell();
		s.row = 2;
		s = null;
		System.out.println(s.row);
	}
	public static void PrintWall(Cell c){
		for(int i=0; i<20; i++){
			for(int j=0; j<10; j++){
				if(c.row==i &&c.col==j){
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}

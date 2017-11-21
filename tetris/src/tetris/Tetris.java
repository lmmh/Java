package tetris;

public class Tetris {

	public static void main(String[] args) {
		T t = new T(2,3);
		PrintWall(t);
		O o = new O(4,5);
		PrintWall(o);
	}
	
	public static void PrintWall(Parent p){
		Cell[] cells = p.cells;
		for(int i=0; i<20; i++){
			for(int j=0; j<10; j++){
				boolean flag = false;
				for(int k=0; k<cells.length; k++){
					if(i==cells[k].row && j==cells[k].col){
						flag = true;
						break;
					}
				}
				if(flag){
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
	}

}

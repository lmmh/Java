package cell;

public class O {
	Cell[] cells;
	O(){
		this(0,0);
	}
	O(int row,int col){
		this.cells = new Cell[4];
		this.cells[0] = new Cell(row,col);
		this.cells[1] = new Cell(row,col+1);
		this.cells[2] = new Cell(row+1,col);
		this.cells[3] = new Cell(row+1,col+1);
	}
	void drop(){
		for(int i=0; i<this.cells.length; i++){
			this.cells[i].row++;
		}
	}
	void  moveLeft(){
		for(int i=0; i<this.cells.length; i++){
			this.cells[i].col--;
		}
	}
	void moveRight(){
		for(int i=0; i<this.cells.length; i++){
			this.cells[i].col++;
		}
	}
	void print(){
		for(int i=0; i<this.cells.length; i++){
			String str = this.cells[i].row + "," +this.cells[i].col;
			System.out.println(str);
		}
	}

}

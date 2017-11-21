package tetris;

public class O extends Parent{
    O(){
    	this(0,0);
    }
    O(int row,int col){
    	this.cells[0] = new Cell(row,col);
    	this.cells[1] = new Cell(row,col+1);
    	this.cells[2] = new Cell(row+1,col);
    	this.cells[3] = new Cell(row+1,col+1);
    }
}

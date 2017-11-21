package tetris;

public class S extends Parent{
    S(){
    	this(0,0);
    }
    S(int row,int col){
    	this.cells[0] = new Cell(row,col+1);
    	this.cells[1] = new Cell(row,col+2);
    	this.cells[2] = new Cell(row+1,col);
    	this.cells[3] = new Cell(row+1,col+1);
    }
}

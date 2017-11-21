package tetris;

public class I extends Parent{
    I(){
    	this(0,0);
    }
    I(int row,int col){
    	this.cells[0] = new Cell(row,col);
    	this.cells[1] = new Cell(row+1,col);
    	this.cells[2] = new Cell(row+2,col);
    	this.cells[3] = new Cell(row+3,col);
    }
}

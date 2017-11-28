package Cell;

public class Teris {
   Cell[] cells;
   Teris(){
	   cells = new Cell[4];
   }
   void drop(){
	   for(int i=0; i<cells.length; i++){
		   this.cells[i].row++;
	   }
   }
   void moveLeft(){
	   for(int i=0; i<cells.length; i++){
		   this.cells[i].col--;
	   }
   }
   void moveRight(){
	   for(int i=0; i<cells.length; i++){
		   this.cells[i].col++;
	   }
   }
   void print(){
	   for(int i=0; i<cells.length; i++){
		   String str = this.cells[i].row+","+this.cells[i].col;
		   System.out.println(str);
	   }
   }
}

package cell;
public class Cell {
int row;
int col;
Cell(){
	this(0,0);
}
Cell(int n){
	this(n,n);
}
Cell(int row,int col){
	this.row = row;
	this.col = col; 
}
void drop(){
	row++;
}
void moveLeft(int n){
	col-=n;
}
}

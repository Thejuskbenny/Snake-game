
public class Cell {

	int row , col;
	
	CellType cellType;
	
	public Cell(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
	
	public void setCellType(CellType cellType)
    {
        this.cellType = cellType;
    }
	
	public CellType getCellType() { return cellType; }
	
	
	public int getRow() { return row; }
	 
    public int getCol() { return col; }
    
    // is methods to set row and col needed ? no

}

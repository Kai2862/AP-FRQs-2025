public boolean clearPair(int row, int col){
    int val = puzzle[numRows][numCols];
    for(int i =0;i<puzzle.length;i++){
        for(int j = 0;j<puzzle[0].length;j++){
            int current = puzzle[i][j]
            if((i >= row)&&(row != i || col != j)&&(m == current||m + current == 10)){
                puzzle[i][j]=0;
                puzzle[row][col]=0;
                return true;
            }

        }
    }
    return false;
}

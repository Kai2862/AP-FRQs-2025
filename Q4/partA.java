public SumOfSameGames(int NumRows, int NumCol){
    puzzle = new int[numRows][numCols];
    for(int i =0;i<numRows;i++){
        for(int j = 0;j<numCol;j++){
            puzzle[row][col]= (int)(Math.random()*9)+1;
        }
    }

}

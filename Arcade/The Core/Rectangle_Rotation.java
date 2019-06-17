int rectangleRotation(int a, int b) {
    int rows=(int) (a/Math.sqrt(2));
    int columns=(int) (b/Math.sqrt(2));
    
    return ((rows+1)*(columns+1) + rows*columns)%2 == 0 ? ((rows+1)*(columns+1) + rows*columns -1) : ((rows+1)*(columns+1) + rows*columns);
}

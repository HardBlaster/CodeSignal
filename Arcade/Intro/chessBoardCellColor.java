boolean chessBoardCellColor(String cell1, String cell2) {
    if((cell1.charAt(0) - 'A' + cell1.charAt(1) - '1') % 2 == (cell2.charAt(0) - 'A' + cell2.charAt(1) - '1') % 2) return true;
    return false;
}

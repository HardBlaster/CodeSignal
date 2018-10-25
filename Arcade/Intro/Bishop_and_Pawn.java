boolean bishopAndPawn(String bishop, String pawn) {
    return Math.abs((int) bishop.charAt(0) - (int) pawn.charAt(0)) == Math.abs((int) bishop.charAt(1) - (int) pawn.charAt(1));
}

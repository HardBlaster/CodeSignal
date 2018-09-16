boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    if((yourLeft == friendsLeft & yourRight == friendsRight) || (yourLeft == friendsRight & yourRight == friendsLeft)) return true;
    else return false;
}
boolean validTime(String time) {
    return Integer.parseInt(time.substring(0,2)) >=0 && Integer.parseInt(time.substring(0,2)) <=23 && Integer.parseInt(time.substring(3,5)) >=0 && Integer.parseInt(time.substring(3,5)) <=59;
}

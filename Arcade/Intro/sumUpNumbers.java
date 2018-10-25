int sumUpNumbers(String inputString) {
    Pattern gyasz = Pattern.compile("[0-9]+");
    Matcher mukogy = gyasz.matcher(inputString);
    int sum = 0;
    for(;;)
        if(mukogy.find()) sum += Integer.parseInt(inputString.substring(mukogy.start(), mukogy.end()));
        else break;
    return sum;
}

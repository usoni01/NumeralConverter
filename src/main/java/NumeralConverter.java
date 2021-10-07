public class NumeralConverter {

    public static String convert(int input) {
        StringBuilder result = new StringBuilder();
        switch(input){
            case 1:
            case 2:
            case 3:
                for (int i = 0; i< input; i++){
                    result.append("I");
                }
                break;
            case 4:
                result.append("IV");
                break;
            case 5:
                result.append("V");
                break;
            case 6:
            case 7:
            case 8:
               result.append("V");
                for(int x = 5; x< input; x++){
                    result.append("I");
                }
                break;
            case 9:
                result.append("IX");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                result.append("X");
                for(int x =10;x< input; x++){
                    result.append("I");
                }
                break;
            default:
                return null;
        }
        return String.valueOf(result);
    }
}

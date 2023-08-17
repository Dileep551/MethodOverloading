public class Centimeters {

    public static double convertToCentimeters(int inches){
        double centimeter = 2.54 * inches;
        return  centimeter;

    }

    public static double convertToCentimeters(int feet, int inches){
        int inches_cal = feet * 12;
        int totalHeightInches = inches_cal + inches;
        double totalHightInCentimeter = convertToCentimeters(totalHeightInches);
        return totalHightInCentimeter;
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(68));
    }
}

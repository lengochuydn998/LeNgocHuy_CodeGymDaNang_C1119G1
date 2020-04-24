package CaseStudy.Commons;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;

import java.sql.SQLOutput;

public class FunValidation {
    private static String pattern = "";
    public static boolean isValidIdServices(Services service , String str){
        if (service instanceof Villa){
            pattern = "^SVVL-\\d{4}$";
        }
        else if (service instanceof House){
            pattern = "^SVHO-\\d{4}$";
        }
        else if (service instanceof Room){
            pattern = "^SVRO-\\d{4}$";
        }
        return str.matches(pattern);
    }
    public static boolean isValidNameService(String str){
        pattern = "[A-Z][a-zA-Z][^#&<>\"~;$^%{}?]{1,20}$";
        return str.matches(pattern);
    }
    public static boolean isValidFreeServices(String str){
        pattern = "^massage|karaoke|food|drink|car$";
        return str.matches(pattern);
    }
    public static String getValidIdService(Services service , String strDisplay , String errMes){
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (!isValidIdServices(service,result)){
            System.out.println(errMes);
            result = getValidIdService(service,strDisplay,errMes);
        }return result;
    }
    public static String getValidName (String strDisplay , String errMes){
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (!isValidNameService(result)){
            System.out.println(errMes);
            result = getValidName(strDisplay,errMes);
        }
        return result;
    }
    public static double getValidNumberDouble(String strDisplay ,String errMes){
        return getValidNumberDouble(strDisplay,errMes);
    }

    public static double getValidNumberDouble(String strDisplay ,String errMes,Double min){
        double result = 0.0;
        System.out.println(strDisplay);
        try{
            result = Double.parseDouble(ScannerUtils.scanner.nextLine());
            if (min != null && result <= min){
                throw new Exception(errMes);
            }
        }catch (Exception e){
            System.out.println(errMes);
            result = getValidNumberDouble(strDisplay,errMes,min);
        }
        return result;
    }
    public static Integer getValidNumberInteger(String strDisplay,String errMes,Integer min){
        return getValidNumberInteger(strDisplay,errMes,min,null);
    }
    public static Integer getValidNumberInteger(String strDisplay, String errMes ,Integer min, Integer max) {
        int result = 0;
        System.out.println(strDisplay);
        try {
            result = Integer.parseInt(ScannerUtils.scanner.nextLine());
            if (min != null && result <= min) {
                throw new Exception(errMes);
            }
            if (max != null && result >= max) {
                throw new Exception(errMes);
            }
        } catch (Exception e) {
            System.out.println(errMes);
            result = getValidNumberInteger(strDisplay, errMes, min, max);
        }return result;
    }
    public static String getValidFreeService(String strDisplay,String errMes){
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (isValidFreeServices(result)){
            System.out.println(errMes);
            result = getValidFreeService(strDisplay,errMes);
        }return result;
    }
}

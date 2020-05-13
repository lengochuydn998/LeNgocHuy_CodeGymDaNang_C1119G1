package CaseStudy.Commons;

import CaseStudy.CustomerException.*;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;
import com.sun.xml.internal.org.jvnet.staxex.NamespaceContextEx;
import sun.security.x509.NameConstraintsExtension;

import javax.naming.NameAlreadyBoundException;
import javax.naming.NameNotFoundException;
import java.sql.SQLOutput;

public class FunValidation {
    private static String pattern = "";

    public static boolean isValidIdServices(Services service, String str) {
        if (service instanceof Villa) {
            pattern = "^SVVL-\\d{4}$";
        } else if (service instanceof House) {
            pattern = "^SVHO-\\d{4}$";
        } else if (service instanceof Room) {
            pattern = "^SVRO-\\d{4}$";
        }
        return str.matches(pattern);
    }

    public static boolean isValidNameService(String str) {
        pattern = "[A-Z][a-zA-Z][^#&<>\"~;$^%{}?]{1,20}$";
        return str.matches(pattern);
    }

    public static boolean isValidFreeServices(String str) {
        pattern = "^massage|karaoke|food|drink|car$";
        return str.matches(pattern);
    }

    public static String getValidIdService(Services service, String strDisplay, String errMes) {
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (!isValidIdServices(service, result)) {
            System.out.println(errMes);
            result = getValidIdService(service, strDisplay, errMes);
        }
        return result;
    }

    public static String getValidName(String strDisplay, String errMes) {
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (!isValidNameService(result)) {
            System.out.println(errMes);
            result = getValidName(strDisplay, errMes);
        }
        return result;
    }

    public static double getValidNumberDouble(String strDisplay, String errMes) {
        return getValidNumberDouble(strDisplay, errMes);
    }

    public static double getValidNumberDouble(String strDisplay, String errMes, Double min) {
        double result = 0.0;
        System.out.println(strDisplay);
        try {
            result = Double.parseDouble(ScannerUtils.scanner.nextLine());
            if (min != null && result <= min) {
                throw new Exception(errMes);
            }
        } catch (Exception e) {
            System.out.println(errMes);
            result = getValidNumberDouble(strDisplay, errMes, min);
        }
        return result;
    }

    public static Integer getValidNumberInteger(String strDisplay, String errMes, Integer min) {
        return getValidNumberInteger(strDisplay, errMes, min, null);
    }

    public static Integer getValidNumberInteger(String strDisplay, String errMes, Integer min, Integer max) {
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
        }
        return result;
    }

    public static String getValidFreeService(String strDisplay, String errMes) {
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (isValidFreeServices(result)) {
            System.out.println(errMes);
            result = getValidFreeService(strDisplay, errMes);
        }
        return result;
    }

    public static String getValidCustomerName(String strDisplay, String errMess) {
        String result = "";
        System.out.println(strDisplay);
        try {
            result = ScannerUtils.scanner.nextLine();
            if (isValidFreeServices(result)) {
                throw new NameException(errMess);
            }
        } catch (NameException e) {
            System.out.println(errMess);
            result = getValidCustomerName(strDisplay, errMess);

        }
        return result;
    }

    public static boolean isValidEmail(String str) {
        pattern = "^[a-z0-9._-]+@[a-z0-9.-]+\\.[a-z]{2,3}";
        return str.matches(pattern);
    }

    public static String getValidEmail(String strDisplay, String errMess) {
        String result = null;
        System.out.println(strDisplay);
        try {
            result = ScannerUtils.scanner.nextLine();
            if (!isValidEmail(result)) {
                throw new EmailException(errMess);
            }
        } catch (EmailException e) {
            System.out.println(errMess);
            result = getValidCustomerName(strDisplay, errMess);

        }
        return result;
    }

    public static boolean isValidGender(String str) {
        pattern = "^(?i:Male|Female|Unknow)$";
        return str.matches(pattern);
    }

    public static String getValidGender(String strDisplay, String errMess) {
        String result = null;
        System.out.println(strDisplay);
        try {
            result = ScannerUtils.scanner.nextLine();
            if (!isValidGender(result)) {
                throw new GenderException(errMess);
            }
        } catch (GenderException e) {
            System.out.println(errMess);
            result = getValidCustomerName(strDisplay, errMess);

        }
        return result;
    }
    public static boolean isValidIdCard(String str){
        pattern = "^\\d{9}$";
        return str.matches(pattern);
    }
    public static String getValidIdCard(String strDisplay, String errMess) {
        String result = null;
        System.out.println(strDisplay);
        try {
            result = ScannerUtils.scanner.nextLine();
            if (!isValidIdCard(result)) {
                throw new IdCardException(errMess);
            }
        } catch (IdCardException e) {
            System.out.println(errMess);
            result = getValidCustomerName(strDisplay, errMess);

        }
        return result;
    }
    public static boolean isValidBirthday(String str){
        pattern = "^(19|20)\\d\\d[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$";
        return str.matches(pattern);
    }
    public static String getValidBirthday(String strDisplay, String errMess) {
        String result = null;
        System.out.println(strDisplay);
        try {
            result = ScannerUtils.scanner.nextLine();
            if (!isValidBirthday(result)) {
                throw new BirthdayException(errMess);
            }
        } catch (BirthdayException e) {
            System.out.println(errMess);
            result = getValidCustomerName(strDisplay, errMess);

        }
        return result;
    }
}

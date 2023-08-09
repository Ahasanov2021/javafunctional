package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("Normal java function");
        System.out.println(isPhoneNumberValid("994559956326"));
        System.out.println(isPhoneNumberValid("9940559956326"));

        System.out.println();
        System.out.println("Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("994559956326"));
        System.out.println(isPhoneNumberValidPredicate.test("9940559956326"));

        System.out.println();

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("994559956326")
        );

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("9940559956326")
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("994") && phoneNumber.length() == 12;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("994") && phoneNumber.length() == 12;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}

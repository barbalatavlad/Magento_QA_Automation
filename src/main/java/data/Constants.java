package data;

import com.github.javafaker.Faker;

public class Constants {
    public static final String  URL = "https://magento.softwaretestingboard.com/";
    public static final String WRONG_EMAIL = "x";
    public static final String CORRECT_EMAIL = "weldon14@gmail.com";
    public static final String RANDOM_EMAIL = generateEmail();
    public static final String PASSWORD = "Vlad123*";
    public static final String FIRST_NAME = "Vlad";
    public static final String LAST_NAME = "George";
    public static final String CREATE_ACCOUNT_THANKYOU_MESSAGE = "Thank you for registering with Main Website Store.";
    public static final String STREET_ADDRESS = "Strada Soarelui";
    public static final String CITY = "Bucharest";
    public static final String POSTAL_CODE = "123456";
    public static final String PHONE_NUMBER = "0233213213";

    public static String generateEmail(){
        Faker faker = new Faker();
        String randomName = faker.name().firstName();
        return randomName.toLowerCase() + faker.bothify("##") +  "@gmail.com";
    }
}

package model;

import java.util.regex.Pattern;

public class Customer {
    protected String firstName;
    protected String lastName;
    protected String email;

    public Customer(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        //校验邮箱格式
        String emailRegex = "^(.+)@(.+).com$";
        Pattern pattern = Pattern.compile(emailRegex);
        if(!pattern.matcher(email).matches()){
            IllegalArgumentException ex = new IllegalArgumentException();
            throw ex;
        }
    }
    @Override
    public String toString(){
        return "firstName: " + firstName + " lastName: " + lastName + " email: " + email;
    }

}
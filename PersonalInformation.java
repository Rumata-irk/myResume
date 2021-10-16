package com.rumata;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PersonalInformation {
    private final String firstName = "Сергей";
    private final String lastName = "Грозов";
    private final Calendar birthday = new GregorianCalendar(1982, Calendar.MAY, 22);
    private final String mobilePhone = "8-950-110-30-18";
    private final String email = "mоrtum@yаndex.ru";

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getEmail() {
        return email;
    }




}

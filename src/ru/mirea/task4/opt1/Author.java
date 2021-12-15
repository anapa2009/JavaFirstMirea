package ru.mirea.task4.opt1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author (String name, String email, char gender) {
        this.name = name;
        setEmail(email);
        this.setGender (gender);
    }

    public String getName () {
        return name;
    }
    public char getGender () {
        return gender;
    }

    public void setGender (char gender) {
        if (((gender!='m')&&(gender!='f')) && ((gender!='M')&&(gender!='F')))
            this.gender = 'U';
        else
            this.gender = gender;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getName() + " (" + getGender() + ") at " + getEmail();
    }
}

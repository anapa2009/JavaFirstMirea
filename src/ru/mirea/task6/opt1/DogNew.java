package ru.mirea.task6.opt1;
public class DogNew extends Dog0  { //implements Nameable {
    private String razmer; //большой/ средний/ маленький

    public DogNew (String name, int age, String razmer) {
        super (name, age);
        this.razmer = razmer;
    }

    public String getRazmer () {
        return razmer;
    }
    public void setRazmer (String razmer) {
        this.razmer = razmer;
    }

    @Override
    public String getName () {
        //String str=this.getName ();
        //return str;
        //return this.name;
        //return this.getName (); //name;
        return getNameNew (); //name;
        //return super.getName (); //name;
    }

    public void intoHumanAge () {
        System.out.println (this.getName()
                + "'s age in human years is " + this.getAge()*7 + " years");
    }

    @Override
    public String toString() {
        return "\n" + this.getName() + ", age= " + this.getAge()
                + ", razmer= " + this.razmer;
    }
}
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String name;
    private String nationality;
    private int iq;


    public Person(String name , String nationality , int iq) {
        this.name=name;
        this.nationality=nationality;
        this.iq=iq;
    }

    Set<Person> personSet = new HashSet<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }

//    @Override
//    public boolean equals(Object o){
//        if (this == o) {return true;}
//        if (this.instanceof(o)){
//
//        }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Person person)) {
            return false;
        }
        return iq == person.getIq() && name.equals(person.getName()) && nationality.equals(person.getNationality());
    }

    public int hashCode() { 
        return Objects.hash(name, nationality, iq);
    }

    public void populateSet(){
        for (int i=0; i < 5; i++){
            Person person = new Person("silvio","albania",i);
            personSet.add(person);
        }
    }

    @Override
    public String toString() {
        return name + " " + nationality + " " + iq;
    }

    public void print(){
        for (Person person : personSet){
            System.out.println(person.iq);
        }
    }
}




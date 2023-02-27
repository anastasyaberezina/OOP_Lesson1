package OOP_HomeWork1;

public class Person { //Определяю характеристики класса Персона
    public String name;
    public int age;
    public String status;

    public Person (String name, int age, String status){

        this.name = name;
        this.age = age;
        this.status=status;
    }

    public String getName(){

        return name;
    }

    public void setName(String Name){

        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }

    @Override
    public String toString() {

        return String.format("%s, %s, %s", one, second, o);
    }
}

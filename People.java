public class People implements Sortable{

    String name;
    int age;

    int zipCode;

    public People(String name, int age, int zipCode){
        this.name = name;
        this.age = age;
        this.zipCode = zipCode;
    }


    public String toString(){
        return name + " " + age + " " + zipCode;
    }


    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

}

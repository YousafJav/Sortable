public class Animals implements Sortable{

    int age;
    String name;

    public Animals(int age, String name){
        this.age = age;
        this.name = name;
    }



    public String toString(){
        return name + " " + age;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}

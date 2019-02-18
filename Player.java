public class Player {
    public String position, name;
    public float weight;
    public int age;
    public Player(String position, String name, float weight, int age){
        super();
        this.position = position;
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Player(){
        this.position = "";
        this.name = "";
        this.weight = 0;
        this.age = 0;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return position+" "+name+" "+weight+" "+age;
    }
}

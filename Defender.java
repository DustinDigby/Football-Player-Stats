public class Defender extends Player {
    public int tackles, interceptions;
    public float sacks;
    public Defender(String position,String name, float weight, int age, int tackles, float sacks, int interceptions){
        super(position,name,weight,age);
        this.tackles = tackles;
        this.sacks = sacks;
        this.interceptions = interceptions;
    }

    public Defender(String position,String name, float weight, int age){
        super(position,name,weight,age);
    }

    public int getTackles() {
        return tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    public float getSacks() {
        return sacks;
    }

    public void setSacks(float sacks) {
        this.sacks = sacks;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public String toString(){
        return position+" "+name+" "+weight+" "+age+" "+tackles+" "+sacks+" "+interceptions;
    }
}

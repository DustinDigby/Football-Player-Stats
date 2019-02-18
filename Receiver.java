public class Receiver extends Player {
    public int receptions, receptionYards, rushes, rushingYards, touchdowns, fumbles;

    public Receiver(String position, String name, float weight, int age, int receptions, int receptionYards, int rushes, int rushingYards, int touchdowns, int fumbles){
        super(position,name,weight,age);
        this.receptions = receptions;
        this.receptionYards = receptionYards;
        this.rushes = rushes;
        this.rushingYards = rushingYards;
        this.touchdowns = touchdowns;
        this.fumbles = fumbles;
    }

    public int getReceptions() {
        return receptions;
    }

    public void setReceptions(int receptions) {
        this.receptions = receptions;
    }

    public int getReceptionYards() {
        return receptionYards;
    }

    public void setReceptionYards(int receptionYards) {
        this.receptionYards = receptionYards;
    }

    public int getRushes() {
        return rushes;
    }

    public void setRushes(int rushes) {
        this.rushes = rushes;
    }

    public int getRushingYards() {
        return rushingYards;
    }

    public void setRushingYards(int rushingYards) {
        this.rushingYards = rushingYards;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    public int getFumbles() {
        return fumbles;
    }

    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }

    public String toString(){
        return position+" "+name+" "+ weight+" "+age+" "+ receptions+" "+ receptionYards+" " +rushes+" " +rushingYards+" "+ touchdowns+" " +fumbles ;
    }
}


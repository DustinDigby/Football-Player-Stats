public class Quarterback extends Player{
    int passAttempts, passCompletions, passingYards, rushingAttempts, rushingYards, touchdowns, interceptions, fumbles,sacks;

    public Quarterback(String position, String name, float weight, int age, int passAttempts, int passCompletions, int passingYards,int rushingAttempts, int rushingYards, int touchdowns, int interceptions, int fumbles, int sacks){
        super(position,name,weight,age);
        this.passAttempts = passAttempts;
        this.passCompletions = passCompletions;
        this.passingYards = passingYards;
        this.rushingAttempts = rushingAttempts;
        this.rushingYards = rushingYards;
        this.touchdowns = touchdowns;
        this.interceptions = interceptions;
        this.fumbles = fumbles;
        this.sacks = sacks;
    }

    public int getPassAttempts() {
        return passAttempts;
    }

    public void setPassAttempts(int passAttempts) {
        this.passAttempts = passAttempts;
    }

    public int getPassCompletions() {
        return passCompletions;
    }

    public void setPassCompletions(int passCompletions) {
        this.passCompletions = passCompletions;
    }

    public int getPassingYards() {
        return passingYards;
    }

    public void setPassingYards(int passingYards) {
        this.passingYards = passingYards;
    }

    public int getRushingAttempts() {
        return rushingAttempts;
    }

    public void setRushingAttempts(int rushingAttempts) {
        this.rushingAttempts = rushingAttempts;
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

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public int getFumbles() {
        return fumbles;
    }

    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }

    public int getSacks() {
        return sacks;
    }

    public void setSacks(int sacks) {
        this.sacks = sacks;
    }

    public String toString(){
        return position+" "+ name +" "+ weight+" "+age+ " "+ passAttempts+" "+ passCompletions+" " +passingYards+" "+ rushingAttempts+" "+ rushingYards+" "+ touchdowns+" "+ interceptions+" "+ fumbles+" "+sacks ;
    }
}

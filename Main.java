import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("playerinfo.txt"));
            String position, name;
            float weight;
            int age;
            ArrayList<Player> footballPlayer = new ArrayList<>();

            while ((position = reader.readLine()) != null) {
                name = reader.readLine();
                weight = Float.parseFloat(reader.readLine());
                age = Integer.parseInt(reader.readLine());

                if (position.equals("Quarterback")) {
                    int passAttempts, passCompletions, passingYards, rushingAttempts, rushingYards, touchdowns, interceptions, fumbles, sacks;
                    passAttempts = Integer.parseInt(reader.readLine());
                    passCompletions = Integer.parseInt(reader.readLine());
                    passingYards = Integer.parseInt(reader.readLine());
                    rushingAttempts = Integer.parseInt(reader.readLine());
                    rushingYards = Integer.parseInt(reader.readLine());
                    touchdowns = Integer.parseInt(reader.readLine());
                    interceptions = Integer.parseInt(reader.readLine());
                    fumbles = Integer.parseInt(reader.readLine());
                    sacks = Integer.parseInt(reader.readLine());
                    Quarterback quarterback = new Quarterback(position, name, weight, age, passAttempts, passCompletions, passingYards, rushingAttempts, rushingYards, touchdowns, interceptions, fumbles, sacks);
                    footballPlayer.add(quarterback);

                }else if(position.equals("Receiver")){
                    int receptions, receptionYards, rushes, rushingYards, touchdowns, fumbles;
                    receptions = Integer.parseInt(reader.readLine());
                    receptionYards =Integer.parseInt(reader.readLine());
                    rushes = Integer.parseInt(reader.readLine());
                    rushingYards =Integer.parseInt(reader.readLine());
                    touchdowns = Integer.parseInt(reader.readLine());
                    fumbles = Integer.parseInt(reader.readLine());
                    Receiver receiver = new Receiver(position, name, weight, age, receptions, receptionYards, rushes, rushingYards, touchdowns, fumbles);
                    footballPlayer.add(receiver);

                }else if(position.equals("Defense")){
                    int tackles, interceptions;
                    float sacks;
                    tackles = Integer.parseInt(reader.readLine());
                    sacks = Float.parseFloat(reader.readLine());
                    interceptions = Integer.parseInt(reader.readLine());
                    Defender defender = new Defender(position, name, weight, age, tackles, sacks, interceptions);
                    footballPlayer.add(defender);
                }
            }

            for(Player player: footballPlayer)
                System.out.println(player);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
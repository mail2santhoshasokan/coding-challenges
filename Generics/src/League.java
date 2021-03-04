import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

    String leagueName;

    List<T> teamList = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public void addTeam(T team){
        if (teamList.contains(team)){
            System.out.println("Team already present in the list");
        }else{
            teamList.add(team);
        }
    }

    public void printTeams(){
        Collections.sort(teamList);
        for(int i=0;i<teamList.size();i++){
            System.out.println("Team : "+teamList.get(i).getName());
        }
    }


}

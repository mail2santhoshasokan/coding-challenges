public class Main {

    public static void main(String[] args) {
        FootBallTeam footBallTeam = new FootBallTeam("football team");
        BaseBallTeam baseBall = new BaseBallTeam("baseball team");

        BoxingTeam boxingTeam = new BoxingTeam("boxing");


        League<FootBallTeam> football_league = new League<>("football league");
        football_league.addTeam(footBallTeam);

        League<BaseBallTeam> baseBallTeamLeague = new League<>("baseball league");
        baseBallTeamLeague.addTeam(baseBall);


    }

}

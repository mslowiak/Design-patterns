package State;

public class Main {
    public static void main(String[] args) {
        GameSupervisor gameSupervisor = new GameSupervisor(3, 5);
        gameSupervisor.addPlayer("1");
        gameSupervisor.addPlayer("2");
        gameSupervisor.addPlayer("3");
        gameSupervisor.removePlayer("2");
        gameSupervisor.addPlayer("4");
        gameSupervisor.addPlayer("5");
        gameSupervisor.addPlayer("6");
//        gameSupervisor.addPlayer("7");
        gameSupervisor.removePlayer("5");
        gameSupervisor.removePlayer("1");
        gameSupervisor.startGame();
        System.out.println(gameSupervisor.getPlayersNames().size());
        gameSupervisor.removePlayer("3");
        gameSupervisor.removePlayer("6");
    }
}

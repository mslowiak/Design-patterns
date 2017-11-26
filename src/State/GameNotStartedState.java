package State;

public class GameNotStartedState implements GameState {
    @Override
    public void startGame(GameSupervisor gameSupervisor) {
        int size = gameSupervisor.getPlayersNames().size();
        if(gameSupervisor.getMinPlayers() <= size && size <= gameSupervisor.getMaxPlayers()){
            gameSupervisor.setGameState(new GameStartedState());
            System.out.println("Game has been started");
        }else{
            try {
                throw new Exception("Cannot start game, not enough players");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean isStarted() {
        return false;
    }
}
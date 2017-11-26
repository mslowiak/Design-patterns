package State;

import java.util.ArrayList;
import java.util.List;

public class GameSupervisor {
    private List<String> playersNames;
    private int minPlayers;
    private int maxPlayers;
    private GameState gameState;

    public GameSupervisor(List<String> playersNames, int minPlayers, int maxPlayers) {
        this.playersNames = playersNames;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.gameState = new GameNotStartedState();
    }

    public GameSupervisor(int minPlayers, int maxPlayers) {
        playersNames = new ArrayList<>();
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.gameState = new GameNotStartedState();
    }

    public List<String> getPlayersNames() {
        return playersNames;
    }

    public void setPlayersNames(List<String> playersNames) {
        this.playersNames = playersNames;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public void addPlayer(String name){
        if(gameState instanceof GameNotStartedState){
            if(playersNames.size() < maxPlayers){
                playersNames.add(name);
            }else{
                try {
                    throw new Exception("Game cannot handle more players");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else{
            try {
                throw new Exception("Game already started");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void removePlayer(String name){
        playersNames.remove(name);
        if(gameState instanceof GameStartedState){
            if(playersNames.size() == 1){
                this.setGameState(new GameNotStartedState());
                dispose();
            }
        }
    }

    public void startGame(){
        gameState.startGame(this);
    }

    public void dispose(){
        System.out.println("Game has been ended");
    }
}

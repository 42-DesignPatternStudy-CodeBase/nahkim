package StatePattern;

public class Player {
    private PlayerLevel level;

    Player() {
        level = BeginnerLevel.getInstance();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }
    
    public void play(int time) {
        level.run();
        for(int i = 0; i < time; i++) {
            level.jump();
        }
        level.turn();
    }
}
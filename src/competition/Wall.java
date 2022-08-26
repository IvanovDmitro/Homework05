package competition;

public class Wall implements Obstacles {
    private final int heightWall;

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    @Override
    public boolean overcome(int maxJump) {
        return maxJump > heightWall;
    }

    @Override
    public String getNameObstacle() {
        return heightWall + " meters";
    }
}

package competition;

public class App {
    static Obstacles[] obstacles;
    static Participant[] participants;

    public static void main(String[] args) {
        obstacles = new Obstacles[2];
        obstacles[0] = new RunningTrack(150);
        obstacles[1] = new Wall(5);
        participants = new Participant[3];
        participants[0] = new Cat("Murzik", 200, 3);
        participants[1] = new Human("Dima", 1000, 4);
        participants[2] = new Robot("Alex", 140, 50);

        for (Participant eachParticipant : participants) {
            for (Obstacles eachObstacle : obstacles) {
                eachParticipant.checkObstacle(eachObstacle);
                if (!eachParticipant.isPass()) {
                    break;
                }
            }
        }
    }
}

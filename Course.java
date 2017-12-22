import obstacles.*;
import animals.*;

public class Course {
    private Obstacle[] obstacles = new Obstacle[3];

    public Course(float wallHeight, int trackLength, int waterLength) {
        obstacles[0] = new Wall(wallHeight);
        obstacles[1] = new Track(trackLength);
        obstacles[2] = new Water(waterLength);
    }

    public void doIt(Team team) {
        for (int i = 0; i < team.getMembersCount(); i++) {
            boolean memberSucceeded = true;
            for (int j = 0; j < obstacles.length; j++) {
                if (!obstacles[j].doIt(team.getMember(i))) {
                    memberSucceeded = false;
                    break;
                }
            }
            if (memberSucceeded) {
                team.addSucceededMember(team.getMember(i));
            }
        }
    }
}

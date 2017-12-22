import animals.*;
import obstacles.Obstacle;
import obstacles.Track;
import obstacles.Wall;
import obstacles.Water;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private Animal[] members = new Animal[4];
    private ArrayList<Animal> succededMembers = new ArrayList<>();

    Team(String teamName, Animal member1, Animal member2, Animal member3, Animal member4) {
        this.teamName = teamName;
        members[0] = member1;
        members[1] = member2;
        members[2] = member3;
        members[3] = member4;
    }

    public void showResults() {
        if (succededMembers.size() > 0) {
            System.out.println("Winners:");
            for (Animal member : succededMembers) {
                System.out.println(member.toString());
            }
        }
        else {
            System.out.println("No winners");
        }
    }

    public void showInfoOnAllMembers() {
        for (Animal member : members) {
            System.out.println(member.toString());
        }
    }

    public int getMembersCount() {
        return members.length;
    }

    public Animal getMember(int index) {
        return members[index];
    }

    public void clearSuccessList() {
        succededMembers.clear();
    }

    public void addSucceededMember(Animal newMember) {
        succededMembers.add(newMember);
    }
}

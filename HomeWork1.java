import animals.*;

public class HomeWork1 {
    public static void main(String[] args) {
        Team team = new Team("Animals", new Cat("Murzik"), new Cat("Barsik"), new Hen("Chick"), new Hippo("HiperPo"));
        team.showInfoOnAllMembers();
        Course course = new Course(2f, 20,20);
        course.doIt(team);
        team.showResults();
    }
}

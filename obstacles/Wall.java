package obstacles;
import animals.*;
/**
 * Write a description of class Wall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wall extends Obstacle {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public boolean doIt(Animal animal) {
        if (animal instanceof Jumpable)
            return ((Jumpable) animal).jump(height);
        else
            return false;
    }
}
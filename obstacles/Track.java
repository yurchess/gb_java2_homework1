package obstacles;
import animals.*;
/**
 * Write a description of class Track here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Track extends Obstacle {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean doIt(Animal animal) {
        return animal.run(length);
    } 
}
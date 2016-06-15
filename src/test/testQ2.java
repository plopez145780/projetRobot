package test;
import junit.framework.TestCase;
import projet.Robot;

/**
 * Created by richard on 15/06/2016.
 */
public class testQ2  extends TestCase {
    public void testQ2() throws Exception {
        assertEquals(0,Robot.nbRobots);
        Robot r1 = new Robot(1,1);
        assertEquals(1,Robot.nbRobots);
        Robot r2 = new Robot(0,0);
        assertEquals(2,Robot.nbRobots);
        assertEquals(1, r1.getX());
        assertEquals (0,r2.getY());

        r1.vaEn(4, 4);
        assertEquals(4, r1.getX());
        assertEquals(4, r1.getY());

        System.out.println(r1.toString());
        assertEquals('4',r1.toString().charAt(2));


    }
}
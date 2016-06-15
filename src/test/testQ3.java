package test;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import projet.Monde;
import projet.Robot;

/**
 * Created by richard on 15/06/2016.
 */
public class testQ3  extends TestCase {

    public void testQ3() throws Exception {
        Monde m = new Monde(10,10);

        Robot r1 = new Robot(1,1);
        m.addRobot(r1);
        assertEquals(m.getRobot(2, 2), null);
        assertEquals(m.getRobot(1, 1), r1);
        r1.vaEn(2, 2);
        assertEquals(m.getRobot(2, 2), r1);
        assertEquals(m.getRobot(1, 1), null);

        Robot r2 = new Robot(1,1,m);
        assertEquals(m.getRobot(1, 1), r2);

    }
}

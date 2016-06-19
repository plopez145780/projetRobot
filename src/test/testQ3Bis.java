package test;

import junit.framework.TestCase;
import projet.Monde;
import projet.Robot;

/**
 * Created by richard on 15/06/2016.
 */

/*

Gére la collision entre deux robots ....
Aucune test
Exception levé si deux robots veulent aller au même endroit

 */
public class testQ3Bis extends TestCase{

    public void test(){
        Robot.nbRobots =0;
        assertEquals(0, Robot.nbRobots);
        Robot r1 = new Robot(1,1);
        assertEquals(1,Robot.nbRobots);
        Robot r2 = new Robot(0,0);
        Monde m = new Monde(10,10);
        m.addRobot(r1);
        m.addRobot(r2);
        r1.vaEn(2, 2);

        try {
            r2.vaEn(2, 2);
            fail( " Exception non générée  .. A compléter");
        }
        catch (Exception e){
            System.out.println( " OK case deja occupé pas de mouvement -->" + e );
        }
        System.out.println(r1 + " "+ r2);
        assertEquals(2, r1.getX());
        assertEquals (0,r2.getY());

    }
}

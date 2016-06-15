package test;
import projet.Monde;
import junit.framework.TestCase;
/**
 * Created by richard on 15/06/2016.
 */

//TEst pour la question 1
public class testQ1 extends TestCase {
    public void testCalculer() throws Exception {
        assertEquals(2,2);
    }


    public void testQ1() throws Exception{
        Monde md = new Monde(10,10);
        assertEquals(true, md.estLibre(1, 1));

        md.occupe(1, 1, 1);
        assertEquals(false, md.estLibre(1, 1));


        md.occupe(0, 0, 1);

        System.out.println(md.toString());
        assertEquals(md.toString().charAt(0), '0');
        assertEquals(md.toString().charAt(1), '+');

        try {
            md.occupe(15,15,1);
            fail("Une exception de type IllegalStateException aurait du etre levee");

        } catch (Exception ise) {
            System.out.println(" OK Exception leve "+ ise);
        }


    }


}

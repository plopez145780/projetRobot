package projet;

/**
 * Created by pierr on 15/06/2016.
 */
public class Robot {
    //ATTRIBUTS STATIC
    public static int nbRobots = 0;

    //ATTRIBUTS
    private int x;
    private int y;
    private int numero;
    private Monde monde;

    //CONSTRUCTEUR
    public Robot(){
        /*this.x = 1;
        this.y = 1;
        this.numero = 1;
        this.monde = new Monde();*/
    }

    public Robot(int x, int y){
        this.nbRobots++;
        this.numero = this.nbRobots;
        this.x = x;
        this.y = y;
        //this.monde = monde;

    }

    public Robot(int x, int y, Monde monde){
        this.nbRobots++;
        this.numero = this.nbRobots;
        this.x = x;
        this.y = y;
        this.monde = monde;
    }

    public Robot(int x, int y, int numero, Monde monde){
        this.numero = numero;
        this.x = x;
        this.y = y;
        this.monde = monde;
    }

    //GETTER et SETTER
    public int getX(){
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    public void setMonde(Monde monde){
        this.monde = monde;
    }

    //METHODES
    /**
     * Déplace le robot (si la case est libre)
     * @param x
     * @param y
     */
    public void vaEn(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Crée une chaine contenant "numéro X Y"
     * @return infoRobot
     */
    public String toString(){
        String infoRobot = Integer.toString(this.numero) + " " + Integer.toString(this.x) + " " + Integer.toString(this.y);
        return infoRobot;
    }
}

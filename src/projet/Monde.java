package projet;

import java.util.ArrayList;

/**
 * Created by Pierre Lopez on 15/06/2016.
 */
public class Monde {
    //ATTRIBUTS
    private int largueur;
    private int longueur;
    private int tabDesCases[][];
    private Robot tabDesRobots[][];

    //CONSTRUCTEURS
    public Monde(){
        this.largueur = 20;
        this.longueur = 30;
        this.tabDesCases = new int[largueur][longueur];
        this.tabDesRobots = new Robot[largueur][longueur];
        initialisationCase();
    }

    public Monde(int largueur, int longueur){
        this.largueur = largueur;
        this.longueur = longueur;
        this.tabDesCases = new int[this.largueur][this.longueur];
        this.tabDesRobots = new Robot[this.largueur][this.longueur];
        initialisationCase();
    }

    //METHODES
    private void initialisationCase(){
        for (int i = 0; i < largueur; i++){
            for (int j = 0; j < longueur; j++){
                this.tabDesCases[i][j]=-1;
            }
        }
    }

    public boolean estLibre(int x, int y){
        boolean libre = false;
        if (this.tabDesCases[x][y] == -1){
            libre = true;
        }
        return libre;
    }

    public void libere(int x, int y){
        this.tabDesCases[x][y] = -1;
    }

    public void occupe(int x, int y, int num){
        this.tabDesCases[x][y] = num;
    }
    public void addRobot(Robot bot){
        int xBot = bot.getX();
        int yBot = bot.getY();
        tabDesRobots[xBot][yBot] = bot;
        bot.setMonde(this);
    }

    public String toString(){
        String str = "";
        for (int i = 0; i < largueur; i++){
            for (int j = 0; j < longueur; j++){
                if (this.tabDesCases[i][j] == -1){
                    str += "+";
                }
                else {
                    str += "0";
                }
            }
            str += "\n";
        }
        return str;
    }

    public Robot getRobot(int x, int y) {
        return tabDesRobots[x][y];
    }
}
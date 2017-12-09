/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Paket {
    private ArrayList<GemiList> arr;
    private String nick;
    private Integer koordx;
    private Integer koordy;
    private Integer score;

    /**
     * @return the arr
     */
    public ArrayList<GemiList> getArr() {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(ArrayList<GemiList> arr) {
        this.arr = arr;
    }

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * @return the koordx
     */
    public Integer getKoordx() {
        return koordx;
    }

    /**
     * @param koordx the koordx to set
     */
    public void setKoordx(Integer koordx) {
        this.koordx = koordx;
    }

    /**
     * @return the koordy
     */
    public Integer getKoordy() {
        return koordy;
    }

    /**
     * @param koordy the koordy to set
     */
    public void setKoordy(Integer koordy) {
        this.koordy = koordy;
    }

    /**
     * @return the score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(Integer score) {
        this.score = score;
    }
    
}

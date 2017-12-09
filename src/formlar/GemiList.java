/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

/**
 *
 * @author asus
 */
public class GemiList {
  public   int id;
  public   int a;
  public   int b;
}

class SeninLabel extends JPanel {
    private static final int N = 10;
    public int  idx;
     public int  idy;
        public SeninLabel(int x, int y) {
            this.setOpaque(true);
           
           idx=x;
           idy=y;
           Color color = UIManager.getColor("Table.gridColor");
           MatteBorder border = new MatteBorder(1, 1, 0, 0, color);
          this.setBackground(Color.GREEN);
          this.setBorder(border);
        }


    /**
     * @return the idx
     */
    public int getIdx() {
        return idx;
    }

    /**
     * @param idx the idx to set
     */
    public void setIdx(int idx) {
        this.idx = idx;
    }

    /**
     * @return the idy
     */
    public int getIdy() {
        return idy;
    }

    /**
     * @param idy the idy to set
     */
    public void setIdy(int idy) {
        this.idy = idy;
    }

    
}
class SecimButton extends JButton {
    private static final int N = 10;
    public int  idx;
     public int  idy;
        public SecimButton(int x, int y) {
            this.setOpaque(true);
            this.setBorderPainted(true);
           idx=x;
           idy=y;
          this.setBackground(Color.cyan);
        }


    /**
     * @return the idx
     */
    public int getIdx() {
        return idx;
    }

    /**
     * @param idx the idx to set
     */
    public void setIdx(int idx) {
        this.idx = idx;
    }

    /**
     * @return the idy
     */
    public int getIdy() {
        return idy;
    }

    /**
     * @param idy the idy to set
     */
    public void setIdy(int idy) {
        this.idy = idy;
    }



}
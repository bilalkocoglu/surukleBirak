
package json;


public class Ayar {
    private int xKonum;
    private int yKonum;
    private int en;
    private int boy;
    private String resimAdi;
    
    public Ayar(){
        xKonum=0;
        yKonum=0;
        en=150;
        boy =100;
        resimAdi="/resim/araba.png";
    } 

    /**
     * @return the xKonum
     */
    public int getxKonum() {
        return xKonum;
    }

    /**
     * @param xKonum the xKonum to set
     */
    public void setxKonum(int xKonum) {
        this.xKonum = xKonum;
    }

    /**
     * @return the yKonum
     */
    public int getyKonum() {
        return yKonum;
    }

    /**
     * @param yKonum the yKonum to set
     */
    public void setyKonum(int yKonum) {
        this.yKonum = yKonum;
    }

    /**
     * @return the en
     */
    public int getEn() {
        return en;
    }

    /**
     * @param en the en to set
     */
    public void setEn(int en) {
        this.en = en;
    }

    /**
     * @return the boy
     */
    public int getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(int boy) {
        this.boy = boy;
    }

    /**
     * @return the resimAdi
     */
    public String getResimAdi() {
        return resimAdi;
    }

    /**
     * @param resimAdi the resimAdi to set
     */
    public void setResimAdi(String resimAdi) {
        this.resimAdi = resimAdi;
    }
    
}

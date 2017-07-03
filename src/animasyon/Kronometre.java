
package animasyon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.Timer;


public class Kronometre {
    private final SaatDinleyici saat = new SaatDinleyici();
    private Timer zamanlayici = null;
    private  JComponent bilesen;
    private Date baslangic;
    private final SimpleDateFormat tarihFormat = new SimpleDateFormat("HH:mm:ss");
    private  JLabel saatLabel;
    
    public Kronometre(int sure, JComponent bilesen, JLabel saaJLabel){
        this.bilesen=bilesen;
        this.saatLabel=saaJLabel;
        zamanlayici = new Timer(sure, this.saat);
        zamanlayici.setInitialDelay(0);
        tarihFormat.setTimeZone(TimeZone.getTimeZone("UTC+2"));
    }
    
    public void baslat(){
        baslangic = new Date();
        zamanlayici.start();
    }
    
    public void durdur(){
        zamanlayici.stop();
    }
    
    private void guncelle(){
        Date simdi = new Date();
        if(bilesen.getLocation().getX()>=bilesen.getParent().getSize().width){
            bilesen.setLocation(0, bilesen.getLocation().y);
        }
        bilesen.setLocation(bilesen.getLocation().x +1,bilesen.getLocation().y);
        saatLabel.setText(tarihFormat.format(new Date(simdi.getTime()-baslangic.getTime())));
    }
    
    private class SaatDinleyici implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            guncelle();
        }
        
    }
}

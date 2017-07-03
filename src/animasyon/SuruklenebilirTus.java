/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animasyon;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author pC2
 */
public class SuruklenebilirTus extends JButton{
    private Point dokunulanYer;
    private final Cursor suruklemeFareKursoru = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
    
    public SuruklenebilirTus(int x, int y, int genislik, int yukseklik){
        setSize(genislik,yukseklik);
        setLocation(x,y);
        setIcon(new ImageIcon(SuruklenebilirTus.class.getResource("/resim/araba.png")));
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
        suruklemeOlaylariniEkle();
    }
    
    private void suruklemeOlaylariniEkle(){
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {      //fare hareket ettiğinde neler yapılacak
                dokunulanYer=e.getPoint();  //dokunulan yer
                setCursor(suruklemeFareKursoru);
                
            }

            @Override
            public void mouseDragged(MouseEvent e) {        //fare sürünklendiğinde neler yapılacak
                Point ekrandakiYer = getParent().getLocationOnScreen();
                Point fareninEkrandakiYeri = e.getLocationOnScreen();
                Point yeniYer= new Point(fareninEkrandakiYeri.x-ekrandakiYer.x-dokunulanYer.x,
                        fareninEkrandakiYeri.y-ekrandakiYer.y-dokunulanYer.y);
                
                setLocation(yeniYer);
                
            }
            
        
        });
        
    }
       
}

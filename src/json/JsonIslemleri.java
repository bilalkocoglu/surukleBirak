
package json;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JsonIslemleri {
    private FileWriter dosya;
    private Gson gson= new Gson();
    private String dosyaAdi = null;
    private BufferedReader okuyucu = null;
    private Ayar ayar = null;
    
            
            
    public JsonIslemleri(String dosyaAdi){
        this.dosyaAdi=dosyaAdi;
        
    }
    
    public boolean jsonOlustur(Ayar ayar){
        try {
            dosya = new FileWriter(System.getProperty("user.dir")+"/"+dosyaAdi);
            String json = gson.toJson(ayar);
            dosya.write(json);
            dosya.flush();
            dosya.close();
        } catch (IOException ex) {
            Logger.getLogger(JsonIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return true;
    }
    public Ayar jsonOku() throws FileNotFoundException{
        String dosyaYolu = System.getProperty("user.dir")+"\\"+dosyaAdi;
      
        if(new File(dosyaYolu).exists()){
            okuyucu = new BufferedReader(new FileReader(dosyaYolu));
            ayar=gson.fromJson(okuyucu, Ayar.class);
        }
        else{
            ayar= new Ayar();
            
        }
        return ayar;
    }
}

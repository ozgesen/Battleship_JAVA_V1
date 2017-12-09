/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Locale;

/**
 *
 * @author asus
 */
public class client {

    Socket socket = null;
    PrintWriter out = null;
     PrintWriter out2=null;
    BufferedReader in = null;
    String deger;
    Paket veri;
    String ip;
    public void clientcons() {
        socket = null;
        out = null;
        in = null;
            //* server 'a localhost ve 7755 portu üzerinden başlantı sağlanıyor *//
        try{
            socket = new Socket(ip, 7770);} 
        catch (UnknownHostException e) {
            System.err.println("Sunucu Bulunamadı");
        } catch (IOException e) {
            System.err.println("Sunucuya bağlanılamadı");
        }
   


    }

    public void clientgonder(Paket veri) {
        try {
            //* Server'a veri gönderimi için kullandığımız PrintWriter nesnesi oluşturduk *//
            out = new PrintWriter(socket.getOutputStream(), true);     
         String ss ;
        ss =veri.getKoordx()+"-"+veri.getKoordy();
        out.println(ss);
        } catch (UnknownHostException e) {
            System.err.println("Sunucu Bulunamadı");
        } catch (IOException e) {
            System.err.println("Sunucuya bağlanılamadı");
        }
    }
    public void veriopen(Paket veri) {
      String ss ;
            try {
           

           out2 = new PrintWriter(socket.getOutputStream(), true);    
        } catch (Exception e) {
            System.out.println("Port Hatası!");
        }
       ss = veri.getNick()+"-";
 
                Iterator<GemiList> iter = veri.getArr().iterator();
   
        while (iter.hasNext()) {

            GemiList currentgemi = iter.next();
            
        ss+=currentgemi.a+"-"+currentgemi.b+"-";

        }
        
               out2.println(ss);
        
       }

public String clientgelen() {
    String ss="";

        try {
       in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while ((ss = in.readLine()) != null) 
                return ss;
            
        }catch (UnknownHostException e) {
            System.err.println("Sunucu Bulunamadı");
        }  catch (IOException e) {
            System.err.println("Sunucuya bağlanılamadı");
        }
    
   return ss;
}


public void clientkapa() {

        try {
           out.close();
            in.close();
 
        }catch (UnknownHostException e) {
            System.err.println("Sunucu Bulunamadı");
        }  catch (IOException e) {
            System.err.println("Sunucuya bağlanılamadı");
        }

}

public boolean sunucuyabagliMiyiz() {

return socket.isConnected();
}




public void setip(String ip2) {

 this.ip=ip2;

}

}
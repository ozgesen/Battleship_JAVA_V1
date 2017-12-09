/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import java.io.*;
import java.net.*;
import java.util.Iterator;

/**
 *
 * @author asus
 */
public class sunucu {

    ServerSocket serverSocket;
    Socket clientSocket;
    DataInputStream input;
    PrintStream os;
    String clientGelen;
    int sayi;
    PrintWriter out;
    BufferedReader in;

    public void sunucuac() {

        serverSocket = null;
        clientSocket = null;

        try {
            //*Server 7755 portundan Client'ı dinliyor *//
            serverSocket = new ServerSocket(7770);

        } catch (IOException e) {
            System.out.println("olmadı");

        }

    }

    public String verial() {
        try {

            //* Client'dan gelen verileri tutan BufferedReader nesnesi oluşturulur *//
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            while ((clientGelen = in.readLine()) != null) {
                return clientGelen;
            }
        } catch (IOException e) {
            System.out.println(e);

        }
        return clientGelen;
    }

    public void verigonder(Paket veri) {
        String ss;
        try {
            clientSocket = serverSocket.accept();
            //* Client'a veri gönderimi için kullandığımız PrintWriter nesnesi oluşturulur *//
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            ss = veri.getKoordx() + "-" + veri.getKoordy();
            out.println(ss);
        } catch (IOException e) {
            System.out.println(e);

        }

    }

    public void veriopen(Paket veri) {

        try {

            clientSocket = serverSocket.accept();
            //* Client'a veri gönderimi için kullandığımız PrintWriter nesnesi oluşturulur *//
            out = new PrintWriter(clientSocket.getOutputStream(), true);

        } catch (Exception e) {
            System.out.println("Port Hatası!");
        }

        String ss;

        ss = veri.getNick() + "-";

        Iterator<GemiList> iter = veri.getArr().iterator();

        while (iter.hasNext()) {

            GemiList currentgemi = iter.next();

            ss += currentgemi.a + "-" + currentgemi.b + "-";

        }

        out.println(ss);

    }

    public void sunucuyuKapa() {

        try {
            out.close();
            in.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public boolean bagliMiyiz() {

        return clientSocket.isConnected();

    }
}

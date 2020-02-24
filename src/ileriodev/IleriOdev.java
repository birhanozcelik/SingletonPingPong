/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileriodev;

import drawshape.DrawShape;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import javax.swing.JFrame;

/**
 *
 * @author pc
 */
public class IleriOdev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(100));
        } catch (Exception e) {
            System.out.println("acik");
            System.exit(1);
        }
        JFrame frame = new JFrame();
        DrawShape Ds = DrawShape.getInstance();
        frame.setBounds(10, 10, 700, 600);
        frame.setTitle("ileri programlama odev");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(Ds);
        
        
    }
    
}

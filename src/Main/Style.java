/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author zero
 */
public class Style {
     private static void customizeUIManager() {
        try {
            // Menyesuaikan warna latar belakang dan teks untuk JOptionPane
            UIManager.put("OptionPane.background", Color.BLUE);
            UIManager.put("OptionPane.messageForeground", Color.WHITE);

            // Menyesuaikan font untuk teks pada JOptionPane
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));

            // Menyesuaikan warna tombol di JOptionPane
            UIManager.put("Button.background", Color.DARK_GRAY);
            UIManager.put("Button.foreground", Color.WHITE);

            // Menyesuaikan warna judul di JOptionPane
            UIManager.put("OptionPane.titleText", Color.YELLOW);

            // Menyesuaikan ikon pada JOptionPane (gunakan ikon kustom jika diperlukan)
            UIManager.put("OptionPane.informationIcon", new ImageIcon("path/to/custom_icon.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}

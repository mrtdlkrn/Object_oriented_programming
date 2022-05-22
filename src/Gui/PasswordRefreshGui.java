package Gui;

import java.awt.*;
import javax.swing.*;
import Logic.Actions;

public class PasswordRefreshGui {

    JFrame jf = null;
    JPanel jp1 = null;
    JPanel jp2 = null;
    JPanel jp3 = null;
    JLabel Icon = null;
    JLabel AnaIcon = null;
    JLabel Baslik = null;
    JLabel Tc = null;
    JLabel Sifre = null;
    JLabel YeniSifre = null;
    JLabel YeniSifreTekrar = null;
    JButton LinkRandevu= null;
    JButton Exit = null;
    JButton Update = null;
    JTextField TcAlani = null;
    JPasswordField SifreAlani = null;
    JPasswordField YeniSifreAlani = null;
    JPasswordField YeniSifreTekrarAlani = null;
    Actions a;

    public PasswordRefreshGui(Actions a) {
        this.a = a;
        getJp1().add(getJp2());
        getJp2().add(getJp3());
        getJp1().add(getIcon());
        getJp1().add(getBaslik());
        getJp1().add(getExit());
        getJp2().add(getAnaIcon());
        getJp2().add(getTc());
        getJp2().add(getSifre());
        getJp2().add(getYeniSifre());
        getJp2().add(getYeniSifreTekrar());
        getJp2().add(getTcAlani());
        getJp2().add(getSifreAlani());
        getJp2().add(getYeniSifreAlani());
        getJp2().add(getYeniSifreTekrarAlani());
        getJp2().add(getUpdate());
        getJp3().add(getLinkRandevu());
        getJf().setVisible(false);
    }

    public JFrame getJf() {
        if (jf == null) {
            jf = new JFrame();
            jf.setSize(490, 640);
            jf.setLocationRelativeTo(null);
            jf.setUndecorated(true);
            jf.setContentPane(getJp1());
        }
        return jf;
    }

    public void setJf(JFrame jf) {
        this.jf = jf;
    }

    public JPanel getJp1() {
        if (jp1 == null) {
            jp1 = new JPanel();
            jp1.setBounds(0, 0, 490, 640);
            jp1.setBackground(Color.getHSBColor(.5f, 0.9f, 0.6f).darker());
            jp1.setLayout(null);
        }
        return jp1;
    }

    public void setJp1(JPanel jp1) {
        this.jp1 = jp1;
    }

    public JPanel getJp2() {
        if (jp2 == null) {
            jp2 = new JPanel();
            jp2.setBounds(0, 80, 490, 560);
            jp2.setBackground(Color.getHSBColor(.5f, 1f, 10f).darker());
            jp2.setLayout(null);
        }
        return jp2;
    }

    public void setJp2(JPanel jp2) {
        this.jp2 = jp2;
    }

    public JPanel getJp3() {
        if (jp3 == null) {
            jp3 = new JPanel();
            jp3.setBounds(0, 480, 490, 80);
            jp3.setBackground(Color.getHSBColor(.5f, 0.9f, 0.6f).darker());
            jp3.setLayout(null);
        }
        return jp3;
    }

    public void setJp3(JPanel jp3) {
        this.jp3 = jp3;
    }

    public JLabel getIcon() {
        if (Icon == null) {
            Icon = new JLabel();
            Icon icon = new ImageIcon(getClass().getResource("icon.png"));
            Icon.setBounds(20, 10, 60, 60);
            Icon.setIcon(icon);
        }
        return Icon;
    }

    public void setIcon(JLabel icon) {
        this.Icon = icon;
    }

    public JLabel getAnaIcon() {
        if (AnaIcon == null) {
            AnaIcon = new JLabel();
            Icon icon = new ImageIcon(getClass().getResource("refresh_icon.png"));
            AnaIcon.setBounds(155, 5, 200, 190);
            AnaIcon.setIcon(icon);
        }
        return AnaIcon;
    }

    public void setAnaIcon(JLabel ana_icon) {
        this.AnaIcon = ana_icon;
    }

    public JLabel getBaslik() {
        if (Baslik == null) {
            Baslik = new JLabel("Şifre Yenileme Ekranı");
            Baslik.setBounds(90, 20, 300, 40);
            Baslik.setFont(new Font("Georgia", Font.PLAIN, 30));
        }
        return Baslik;
    }

    public void setBaslik(JLabel baslik) {
        this.Baslik = baslik;
    }

    public JLabel getTc() {
        if (Tc == null) {
            Tc = new JLabel("TC Kimlik No :");
            Tc.setBounds(60, 200, 150, 20);
            Tc.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Tc;
    }

    public void setTc(JLabel tc) {
        this.Tc = tc;
    }

    public JLabel getSifre() {
        if (Sifre == null) {
            Sifre = new JLabel("Şifre :");
            Sifre.setBounds(60, 250, 150, 20);
            Sifre.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Sifre;
    }

    public void setSifre(JLabel sifre) {
        this.Sifre = sifre;
    }

    public JLabel getYeniSifre() {
        if (YeniSifre == null) {
            YeniSifre = new JLabel("Yeni Şifre :");
            YeniSifre.setBounds(60, 300, 150, 20);
            YeniSifre.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return YeniSifre;
    }

    public void setYeniSifre(JLabel yeni_sifre) {
        this.YeniSifre = yeni_sifre;
    }

    public JLabel getYeniSifreTekrar() {
        if (YeniSifreTekrar == null) {
            YeniSifreTekrar = new JLabel("Yeni Şifre Tekrar :");
            YeniSifreTekrar.setBounds(60, 350, 150, 20);
            YeniSifreTekrar.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return YeniSifreTekrar;
    }

    public void setYeniSifreTekrar(JLabel yeni_sifre_tekrar) {
        this.YeniSifreTekrar = yeni_sifre_tekrar;
    }

    public JButton getLinkRandevu() {
        if (LinkRandevu == null) {
            LinkRandevu = new JButton("Randevu Bilgileri");
            LinkRandevu.setBounds(25, 25, 160, 30);
            LinkRandevu.setVisible(true);
            LinkRandevu.setCursor(new Cursor(Cursor.HAND_CURSOR));
            LinkRandevu.setFont(new Font("Georgia", Font.PLAIN, 18));
            LinkRandevu.setForeground(Color.getHSBColor(.5f, 1f, 10f).darker());
            LinkRandevu.setBackground(Color.getHSBColor(.5f, 0.9f, 0.6f).darker());
            LinkRandevu.setBorder(null);
            LinkRandevu.addActionListener(a);
        }
        return LinkRandevu;
    }

    public void setLinkRandevu(JButton link_update) {
        this.LinkRandevu = link_update;
    }

    public JButton getExit() {
        if (Exit == null) {
            Exit = new JButton();
            Icon ExitButton = new ImageIcon(getClass().getResource("close.png"));
            Exit.setBackground(null);
            Exit.setBorder(null);
            Exit.setBounds(418, 10, 60, 60);
            Exit.setVisible(true);
            Exit.setIcon(ExitButton);
            Exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Exit.addActionListener(a);
        }
        return Exit;
    }

    public void setExit(JButton exit) {
        this.Exit = exit;
    }

    public JButton getUpdate() {
        if (Update == null) {
            Update = new JButton("Güncelle");
            Update.setBounds(310, 400, 110, 35);
            Update.setVisible(true);
            Update.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Update.setFont(new Font("Georgia", Font.PLAIN, 18));
            Update.addActionListener(a);
        }
        return Update;
    }

    public void setUpdate(JButton update) {
        this.Update = update;
    }

    public JTextField getTcAlani() {
        if (TcAlani == null) {
            TcAlani = new JTextField();
            TcAlani.setBounds(220, 200, 200, 25);
            TcAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return TcAlani;
    }

    public void setTcAlani(JTextField tc_alani) {
        this.TcAlani = tc_alani;
    }

    public JPasswordField getSifreAlani() {
        if (SifreAlani == null) {
            SifreAlani = new JPasswordField();
            SifreAlani.setBounds(220, 250, 200, 25);
            SifreAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return SifreAlani;
    }

    public void setSifreAlani(JPasswordField sifre_alani) {
        this.SifreAlani = sifre_alani;
    }

    public JPasswordField getYeniSifreAlani() {
        if (YeniSifreAlani == null) {
            YeniSifreAlani = new JPasswordField();
            YeniSifreAlani.setBounds(220, 300, 200, 25);
            YeniSifreAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return YeniSifreAlani;
    }

    public void setYeniSifreAlani(JPasswordField yeni_sifre_alani) {
        this.YeniSifreAlani = yeni_sifre_alani;
    }

    public JPasswordField getYeniSifreTekrarAlani() {
        if (YeniSifreTekrarAlani == null) {
            YeniSifreTekrarAlani = new JPasswordField();
            YeniSifreTekrarAlani.setBounds(220, 350, 200, 25);
            YeniSifreTekrarAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return YeniSifreTekrarAlani;
    }

    public void setYeniSifreTekrarAlani(JPasswordField yeni_sifre_tekrar_alani) {
        this.YeniSifreTekrarAlani = yeni_sifre_tekrar_alani;
    }
}

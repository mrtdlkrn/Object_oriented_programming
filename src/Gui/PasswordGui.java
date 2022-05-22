package Gui;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import Logic.Actions;

public class PasswordGui {

    JFrame jf = null;
    JPanel jp1 = null;
    JPanel jp2 = null;
    JPanel jp3 = null;
    JLabel Icon = null;
    JLabel AnaIcon = null;
    JLabel Baslik = null;
    JLabel KullaniciAdi = null;
    JLabel Tc = null;
    JLabel E_Posta = null;
    JLabel Random = null;
    JButton LinkHome = null;
    JButton Exit = null;
    JButton Send = null;
    JTextField KullaniciAlani = null;
    JTextField TcAlani = null;
    JTextField E_PostaAlani = null;
    JLabel RandomGoster = null;
    JTextField RandomAlani = null;
    Actions a;

    public PasswordGui(Actions a) {
        this.a = a;
        getJp1().add(getJp2());
        getJp2().add(getJp3());
        getJp1().add(getIcon());
        getJp1().add(getBaslik());
        getJp1().add(getExit());
        getJp2().add(getAnaIcon());
        getJp2().add(getKullaniciAdi());
        getJp2().add(getTc());
        getJp2().add(getE_Posta());
        getJp2().add(getKullaniciAlani());
        getJp2().add(getTcAlani());
        getJp2().add(getE_PostaAlani());
        getJp2().add(getRandom());
        getJp2().add(getRandomGoster());
        getJp2().add(getRandomAlani());
        getJp2().add(getSend());
        getJp3().add(getLinkHome());
        getJf().setVisible(false);
    }

    public JFrame getJf() {
        if (jf == null) {
            jf = new JFrame();
            jf.setSize(490, 700);
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
            jp1.setBounds(0, 0, 490, 80);
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
            jp2.setBounds(0, 80, 490, 600);
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
            jp3.setBounds(0, 540, 490, 80);
            jp3.setBackground(Color.getHSBColor(.5f, 0.9f, 0.6f).darker());
            jp3.setLayout(null);
        }
        return jp3;
    }

    public void setJp3(JPanel jp3) {
        this.jp3 = jp3;
    }

    public JLabel getAnaIcon() {
        if (AnaIcon == null) {
            AnaIcon = new JLabel();
            Icon icons = new ImageIcon(getClass().getResource("password_icon.png"));
            AnaIcon.setBounds(190, 10, 200, 190);
            AnaIcon.setIcon(icons);
        }
        return AnaIcon;
    }

    public void setAnaIcon(JLabel ana_icon) {
        this.AnaIcon = ana_icon;
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

    public JLabel getBaslik() {
        if (Baslik == null) {
            Baslik = new JLabel("Şifremi Unuttum..");
            Baslik.setBounds(120, 20, 300, 40);
            Baslik.setFont(new Font("Georgia", Font.PLAIN, 30));
        }
        return Baslik;
    }

    public void setBaslik(JLabel baslik) {
        this.Baslik = baslik;
    }

    public JLabel getKullaniciAdi() {
        if (KullaniciAdi == null) {
            KullaniciAdi = new JLabel("Kullanıcı Adı :");
            KullaniciAdi.setBounds(65, 210, 150, 20);
            KullaniciAdi.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return KullaniciAdi;
    }

    public void setKullaniciAdi(JLabel kullanici_adi) {
        this.KullaniciAdi = kullanici_adi;
    }

    public JLabel getTc() {
        if (Tc == null) {
            Tc = new JLabel("TC Kimlik No :");
            Tc.setBounds(65, 260, 150, 20);
            Tc.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Tc;
    }

    public void setTc(JLabel tc) {
        this.Tc = tc;
    }

    public JLabel getE_Posta() {
        if (E_Posta == null) {
            E_Posta = new JLabel("E-Posta :");
            E_Posta.setBounds(65, 310, 150, 20);
            E_Posta.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return E_Posta;
    }

    public void setE_Posta(JLabel e_posta) {
        this.E_Posta = e_posta;
    }

    public JButton getLinkHome() {
        if (LinkHome == null) {
            LinkHome = new JButton("Hasta Giriş Ekranı");
            LinkHome.setBounds(25, 25, 160, 30);
            LinkHome.setFont(new Font("Georgia", Font.PLAIN, 16));
            LinkHome.setBackground(Color.getHSBColor(.5f, 0.9f, 0.6f).darker());
            LinkHome.setForeground(Color.getHSBColor(.5f, 1f, 10f).darker());
            LinkHome.setBorder(null);
            LinkHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
            LinkHome.addActionListener(a);
        }
        return LinkHome;
    }

    public void setLinkHome(JButton link_home) {
        this.LinkHome = link_home;
    }

    public JLabel getRandom() {
        if (Random == null) {
            Random = new JLabel("Sayıyı Giriniz :");
            Random.setBounds(65, 370, 150, 20);
            Random.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Random;
    }

    public void setRandom(JLabel random) {
        this.Random = random;
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

    public JButton getSend() {
        if (Send == null) {
            Send = new JButton("Gönder");
            Send.setBounds(315, 470, 100, 35);
            Send.setVisible(true);
            Send.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Send.setFont(new Font("Georgia", Font.PLAIN, 18));
            Send.addActionListener(a);
        }
        return Send;
    }

    public void setSend(JButton Send) {
        this.Send = Send;
    }

    public JTextField getKullaniciAlani() {
        if (KullaniciAlani == null) {
            KullaniciAlani = new JTextField();
            KullaniciAlani.setBounds(215, 210, 200, 25);
            KullaniciAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return KullaniciAlani;
    }

    public void setKullaniciAlani(JTextField kullanici_alani) {
        this.KullaniciAlani = kullanici_alani;
    }

    public JTextField getTcAlani() {
        if (TcAlani == null) {
            TcAlani = new JTextField();
            TcAlani.setBounds(215, 260, 200, 25);
            TcAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return TcAlani;
    }

    public void setTcAlani(JTextField tc_alani) {
        this.TcAlani = tc_alani;
    }

    public JTextField getE_PostaAlani() {
        if (E_PostaAlani == null) {
            E_PostaAlani = new JTextField();
            E_PostaAlani.setBounds(215, 310, 200, 25);
            E_PostaAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return E_PostaAlani;
    }

    public void setE_PostaAlani(JTextField e_posta_alani) {
        this.E_PostaAlani = e_posta_alani;
    }

    public JLabel getRandomGoster() {
        if (RandomGoster == null) {
            Random sayi = new Random();
            int randomSayi = sayi.nextInt(999999);
            RandomGoster = new JLabel();
            RandomGoster.setText(Integer.toString(randomSayi));
            RandomGoster.setBounds(265, 360, 100, 40);
            RandomGoster.setFont(new Font("Georgia", Font.PLAIN, 20));
            RandomGoster.setHorizontalAlignment(SwingConstants.CENTER);
            RandomGoster.setOpaque(true);
            RandomGoster.setBackground(Color.WHITE);
        }
        return RandomGoster;
    }

    public void setRandomGoster(JLabel random_goster) {
        this.RandomGoster = random_goster;
    }

    public JTextField getRandomAlani() {
        if (RandomAlani == null) {
            RandomAlani = new JTextField();
            RandomAlani.setBounds(215, 420, 200, 25);
            RandomAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return RandomAlani;
    }

    public void setRandomAlani(JTextField random_alani) {
        this.RandomAlani = random_alani;
    }

}

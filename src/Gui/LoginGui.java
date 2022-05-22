package Gui;

import java.awt.*;
import javax.swing.*;
import Logic.Actions;

public class LoginGui {

    JFrame jf = null;
    JPanel jp1 = null;
    JPanel jp2 = null;
    JPanel jp3 = null;
    JLabel Icon = null;
    JLabel Baslik = null;
    JLabel ErkekIcon = null;
    JLabel KadinIcon = null;
    JLabel KullaniciAdi = null;
    JLabel Sifre = null;
    JButton LinkRegister = null;
    JButton LinkPassword = null;
    JButton Exit = null;
    JButton Login = null;
    JTextField KullaniciAlani = null;
    JPasswordField SifreAlani = null;
    Actions a = new Actions(this);
    
    public LoginGui() 
    {
        getJp1().add(getJp2());
        getJp2().add(getJp3());
        getJp1().add(getIcon());
        getJp1().add(getBaslik());
        getJp1().add(getExit());
        getJp2().add(getErkekIcon());
        getJp2().add(getKadinIcon());
        getJp2().add(getKullaniciAdi());
        getJp2().add(getSifre());
        getJp2().add(getKullaniciAlani());
        getJp2().add(getSifreAlani());
        getJp2().add(getLogin());
        getJp3().add(getLinkRegister());
        getJp3().add(getLinkPassword());
        getJf().setVisible(true);
    }

    public JFrame getJf() 
    {
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

    public JButton getExit() {
        if (Exit == null) {
            Exit = new JButton();
            Icon ExitButton = new ImageIcon(getClass().getResource("close.png"));
            Exit.setBackground(null);
            Exit.setBorder(null);
            Exit.setBounds(418, 10, 60, 60);
            Exit.setVisible(true);
            Exit.setBorderPainted(false);
            Exit.setIcon(ExitButton);
            Exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Exit.addActionListener(a);

        }
        return Exit;
    }

    public void setExit(JButton exit) {
        this.Exit = exit;
    }

    public JButton getLogin() {
        if (Login == null) {
            Login = new JButton("Giriş");
            Login.setBounds(310, 375, 90, 40);
            Login.setVisible(true);
            Login.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Login.setFont(new Font("Georgia", Font.PLAIN, 18));
            Login.addActionListener(a);
        }
        return Login;
    }

    public void setLogin(JButton Login) {
        this.Login = Login;
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
            Baslik = new JLabel("Hasta Giriş Ekranı");
            Baslik.setBounds(115, 20, 254, 40);
            Baslik.setFont(new Font("Georgia", Font.PLAIN, 30));
        }
        return Baslik;
    }

    public void setBaslik(JLabel baslik) {
        this.Baslik = baslik;
    }

    public JLabel getErkekIcon() {
        if (ErkekIcon == null) {
            ErkekIcon = new JLabel();
            Icon icons = new ImageIcon(getClass().getResource("erkek_icon.png"));
            ErkekIcon.setBounds(115, 25, 135, 190);
            ErkekIcon.setIcon(icons);
        }
        return ErkekIcon;
    }

    public void setErkekIcon(JLabel erkek_icon) {
        this.ErkekIcon = erkek_icon;
    }

    public JLabel getKadinIcon() {
        if (KadinIcon == null) {
            KadinIcon = new JLabel();
            Icon icons = new ImageIcon(getClass().getResource("kadin_icon.png"));
            KadinIcon.setBounds(250, 25, 135, 190);
            KadinIcon.setIcon(icons);
        }
        return KadinIcon;
    }

    public void setKadinIcon(JLabel kadin_icon) {
        this.KadinIcon = kadin_icon;
    }

    public JLabel getKullaniciAdi() {
        if (KullaniciAdi == null) {
            KullaniciAdi = new JLabel("Kullanıcı Adı :");
            KullaniciAdi.setBounds(90, 230, 135, 20);
            KullaniciAdi.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return KullaniciAdi;
    }

    public void setKullaniciAdi(JLabel kullanici_adi) {
        this.KullaniciAdi = kullanici_adi;
    }

    public JLabel getSifre() {
        if (Sifre == null) {
            Sifre = new JLabel("Şifre :");
            Sifre.setBounds(90, 300, 135, 20);
            Sifre.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Sifre;
    }

    public void setSifre(JLabel Sifre) {
        this.Sifre = Sifre;
    }

    public JButton getLinkRegister() {
        if (LinkRegister == null) {
            LinkRegister = new JButton("Yeni Hesap Oluştur");
            LinkRegister.setBounds(25, 25, 160, 30);
            LinkRegister.setFont(new Font("Georgia", Font.PLAIN, 16));
            LinkRegister.setBackground(Color.getHSBColor(.5f, 0.9f, 0.6f).darker());
            LinkRegister.setForeground(Color.getHSBColor(.5f, 1f, 10f).darker());
            LinkRegister.setBorder(null);
            LinkRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
            LinkRegister.addActionListener(a);
        }
        return LinkRegister;
    }

    public void setLinkRegister(JButton link_register) {
        this.LinkRegister = link_register;
    }

    public JButton getLinkPassword() {
        if (LinkPassword == null) {
            LinkPassword = new JButton("Şifremi Unuttum");
            LinkPassword.setBounds(305, 25, 160, 30);
            LinkPassword.setFont(new Font("Georgia", Font.PLAIN, 16));
            LinkPassword.setBackground(Color.getHSBColor(.5f, 0.9f, 0.6f).darker());
            LinkPassword.setForeground(Color.getHSBColor(.5f, 1f, 10f).darker());
            LinkPassword.setBorder(null);
            LinkPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
            LinkPassword.addActionListener(a);
        }
        return LinkPassword;
    }

    public void setLinkPassword(JButton link_password) {
        this.LinkPassword = link_password;
    }

    public Actions getClose() {
        return a;
    }

    public void setClose(Actions close) {
        this.a = close;
    }

    public JTextField getKullaniciAlani() {
        if (KullaniciAlani == null) {
            KullaniciAlani = new JTextField();
            KullaniciAlani.setBounds(90, 255, 310, 25);
            KullaniciAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return KullaniciAlani;
    }

    public void setKullaniciAlani(JTextField kullanici_alani) {
        this.KullaniciAlani = kullanici_alani;
    }

    public JPasswordField getSifreAlani() {
        if (SifreAlani == null) {
            SifreAlani = new JPasswordField();
            SifreAlani.setBounds(90, 325, 310, 25);
            SifreAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return SifreAlani;
    }

    public void setSifreAlani(JPasswordField sifre_alani) {
        this.SifreAlani = sifre_alani;
    }
}

package Gui;

import Logic.Actions;
import java.awt.*;
import javax.swing.*;

public class RegisterGui {

    JFrame jf = null;
    JPanel jp1 = null;
    JPanel jp2 = null;
    JPanel jp3 = null;
    JLabel Icon = null;
    JLabel Baslik = null;
    JLabel Tc = null;
    JLabel Ad = null;
    JLabel Soyad = null;
    JLabel Cinsiyet = null;
    JLabel KullaniciAdi = null;
    JLabel Sifre = null;
    JLabel SifreTekrar = null;
    JLabel E_Posta = null;
    JLabel Tel = null;
    JLabel Sehir = null;
    JButton LinkHome = null;
    JTextField TcAlani = null;
    JTextField AdAlani = null;
    JTextField SoyadAlani = null;
    JRadioButton Erkek = null;
    JRadioButton Kadin = null;
    ButtonGroup Bg = new ButtonGroup();
    JTextField KullaniciAdiAlani = null;
    JPasswordField SifreAlani = null;
    JPasswordField SifreTekrarAlani = null;
    JTextField E_PostaAlani = null;
    JTextField TelAlani = null;
    JComboBox SehirAlani = null;
    JButton Exit = null;
    JButton Temizle = null;
    JButton Iptal = null;
    JButton Kaydet = null;
    Actions a;

    public RegisterGui(Actions a) {
        this.a = a;
        getJp1().add(getJp2());
        getJp2().add(getJp3());
        getJp1().add(getIcon());
        getJp1().add(getBaslik());
        getJp1().add(getExit());
        getJp2().add(getTc());
        getJp2().add(getAd());
        getJp2().add(getSoyad());
        getJp2().add(getCinsiyet());
        getJp2().add(getKullaniciAdi());
        getJp2().add(getSifre());
        getJp2().add(getSifreTekrar());
        getJp2().add(getE_Posta());
        getJp2().add(getTel());
        getJp2().add(getSehir());
        getJp2().add(getTcAlani());
        getJp2().add(getAdAlani());
        getJp2().add(getSoyadAlani());
        getJp2().add(getErkek());
        getJp2().add(getKadin());
        Bg.add(Erkek);
        Bg.add(Kadin);
        getJp2().add(getKullaniciAdiAlani());
        getJp2().add(getSifreAlani());
        getJp2().add(getSifreTekrarAlani());
        getJp2().add(getE_PostaAlani());
        getJp2().add(getTelAlani());
        getJp2().add(getSehirAlani());
        getJp2().add(getTemizle());
        getJp2().add(getIptal());
        getJp2().add(getKaydet());
        getJp3().add(getLinkHome());
        getJf().setVisible(false);
    }

    public JFrame getJf() {
        if (jf == null) {
            jf = new JFrame();
            jf.setSize(490, 750);
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
            jp1.setBounds(0, 0, 490, 735);
            jp1.setBackground(Color.getHSBColor(0.5f, 0.9f, 0.6f).darker());
            jp1.setLayout(null);
        }
        return jp1;
    }

    public void setJp1(JPanel jp) {
        this.jp1 = jp;
    }

    public JPanel getJp2() {
        if (jp2 == null) {
            jp2 = new JPanel();
            jp2.setBounds(0, 80, 490, 735);
            jp2.setBackground(Color.getHSBColor(0.5f, 1f, 10f).darker());
            jp2.setLayout(null);
        }
        return jp2;
    }

    public void setJp2(JPanel jp) {
        this.jp1 = jp;
    }

    public JPanel getJp3() {
        if (jp3 == null) {
            jp3 = new JPanel();
            jp3.setBounds(0, 590, 490, 80);
            jp3.setBackground(Color.getHSBColor(0.5f, 0.9f, 0.6f).darker());
            jp3.setLayout(null);
        }
        return jp3;
    }

    public void setJp3(JPanel jp) {
        this.jp1 = jp;
    }

    public JButton getExit() {
        if (Exit == null) {
            Exit = new JButton();
            Exit.setBackground(Color.getHSBColor(0.5f, 0.9f, 0.6f).darker());
            Exit.setBorder(null);
            Icon exitbutton = new ImageIcon(getClass().getResource("close.png"));
            Exit.setIcon(exitbutton);
            Exit.setBounds(418, 10, 60, 60);
            Exit.setVisible(true);
            Exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Exit.addActionListener(getA());
        }
        return Exit;
    }

    public void setExit(JButton exit) {
        this.Exit = exit;
    }

    public JButton getTemizle() {
        if (Temizle == null) {
            Temizle = new JButton("Temizle");
            Icon Delete = new ImageIcon(getClass().getResource("Eraser.png"));
            Temizle.setBounds(50, 520, 135, 40);
            Temizle.setVisible(true);
            Temizle.setIcon(Delete);
            Temizle.setHorizontalAlignment(SwingConstants.LEFT);
            Temizle.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Temizle.setFont(new Font("Georgia", Font.PLAIN, 18));
            Temizle.addActionListener(a);
        }
        return Temizle;
    }

    public void setTemizle(JButton temizle) {
        this.Temizle = temizle;
    }

    public JButton getIptal() {
        if (Iptal == null) {
            Iptal = new JButton("İptal");
            Icon cancel = new ImageIcon(getClass().getResource("x.png"));
            Iptal.setBounds(190, 520, 100, 40);
            Iptal.setVisible(true);
            Iptal.setIcon(cancel);
            Iptal.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Iptal.setFont(new Font("Georgia", Font.PLAIN, 18));
            Iptal.addActionListener(getA());
        }
        return Iptal;
    }

    public void setIptal(JButton iptal) {
        this.Iptal = iptal;
    }

    public JButton getKaydet() {
        if (Kaydet == null) {
            Kaydet = new JButton("Kaydet");
            Icon save = new ImageIcon(getClass().getResource("tick.png"));
            Kaydet.setBounds(295, 520, 120, 40);
            Kaydet.setVisible(true);
            Kaydet.setIcon(save);
            Kaydet.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Kaydet.setFont(new Font("Georgia", Font.PLAIN, 18));
            Kaydet.addActionListener(a);
        }
        return Kaydet;
    }

    public void setKaydet(JButton kaydet) {
        this.Kaydet = kaydet;
    }

    public JLabel getIcon() {
        if (Icon == null) {
            Icon = new JLabel();
            Icon icons = new ImageIcon(getClass().getResource("icon.png"));
            Icon.setBounds(20, 10, 60, 60);
            Icon.setIcon(icons);
        }
        return Icon;
    }

    public void setIcon(JLabel icon) {
        this.Icon = icon;
    }

    public JLabel getBaslik() {
        if (Baslik == null) {
            Baslik = new JLabel("Kullanıcı Bilgileri");
            Baslik.setBounds(120, 20, 254, 40);
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
            Tc.setBounds(50, 20, 120, 25);
            Tc.setBorder(null);
            Tc.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Tc;
    }

    public void setTc(JLabel tc) {
        this.Tc = tc;
    }

    public JLabel getAd() {
        if (Ad == null) {
            Ad = new JLabel("Adı :");
            Ad.setBounds(50, 70, 120, 25);
            Ad.setBorder(null);
            Ad.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Ad;
    }

    public void setAd(JLabel ad) {
        this.Ad = ad;
    }

    public JLabel getSoyad() {
        if (Soyad == null) {
            Soyad = new JLabel("Soyadı :");
            Soyad.setBounds(50, 120, 120, 25);
            Soyad.setBorder(null);
            Soyad.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Soyad;
    }

    public void setSoyad(JLabel soyad) {
        this.Soyad = soyad;
    }

    public JLabel getCinsiyet() {
        if (Cinsiyet == null) {
            Cinsiyet = new JLabel("Cinsiyet :");
            Cinsiyet.setBounds(50, 170, 120, 25);
            Cinsiyet.setBorder(null);
            Cinsiyet.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Cinsiyet;
    }

    public void setCinsiyet(JLabel cinsiyet) {
        this.Cinsiyet = cinsiyet;
    }

    public JLabel getKullaniciAdi() {
        if (KullaniciAdi == null) {
            KullaniciAdi = new JLabel("Kullanıcı Adı :");
            KullaniciAdi.setBounds(50, 220, 120, 25);
            KullaniciAdi.setBorder(null);
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
            Sifre.setBounds(50, 270, 120, 25);
            Sifre.setBorder(null);
            Sifre.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Sifre;
    }

    public void setSifre(JLabel sifre) {
        this.Sifre = sifre;
    }

    public JLabel getSifreTekrar() {
        if (SifreTekrar == null) {
            SifreTekrar = new JLabel("Şifre Tekrar :");
            SifreTekrar.setBounds(50, 320, 120, 25);
            SifreTekrar.setBorder(null);
            SifreTekrar.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return SifreTekrar;
    }

    public void setSifreTekrar(JLabel sifre_tekrar) {
        this.SifreTekrar = sifre_tekrar;
    }

    public JLabel getE_Posta() {
        if (E_Posta == null) {
            E_Posta = new JLabel("E-Posta :");
            E_Posta.setBounds(50, 370, 120, 25);
            E_Posta.setBorder(null);
            E_Posta.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return E_Posta;
    }

    public void setE_Posta(JLabel e_posta) {
        this.E_Posta = e_posta;
    }

    public JLabel getTel() {
        if (Tel == null) {
            Tel = new JLabel("Telefon :");
            Tel.setBounds(50, 420, 120, 25);
            Tel.setBorder(null);
            Tel.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Tel;
    }

    public void setTel(JLabel tel) {
        this.Tel = tel;
    }

    public JLabel getSehir() {
        if (Sehir == null) {
            Sehir = new JLabel("Şehir :");
            Sehir.setBounds(50, 470, 120, 25);
            Sehir.setBorder(null);
            Sehir.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Sehir;
    }

    public void setSehir(JLabel sehir) {
        this.Sehir = sehir;
    }

    public JButton getLinkHome() {
        if (LinkHome == null) {
            LinkHome = new JButton("Hasta Giriş Ekranı");
            LinkHome.setBounds(25, 25, 160, 30);
            LinkHome.setFont(new Font("Georgia", Font.PLAIN, 16));
            LinkHome.setForeground(Color.getHSBColor(.5f, 1f, 10f).darker());
            LinkHome.setBackground(Color.getHSBColor(.5f, 0.9f, 0.6f).darker());
            LinkHome.setBorder(null);
            LinkHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
            LinkHome.addActionListener(getA());
        }
        return LinkHome;
    }

    public void setLinkHome(JButton link_home) {
        this.LinkHome = link_home;
    }

    public JTextField getTcAlani() {
        if (TcAlani == null) {
            TcAlani = new JTextField();
            TcAlani.setBounds(210, 20, 205, 25);
            TcAlani.setBorder(null);
            TcAlani.setColumns(11);
            TcAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return TcAlani;
    }

    public void setTcAlani(JTextField tc_alani) {
        this.TcAlani = tc_alani;
    }

    public JTextField getAdAlani() {
        if (AdAlani == null) {
            AdAlani = new JTextField();
            AdAlani.setBounds(210, 70, 205, 25);
            AdAlani.setBorder(null);
            AdAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return AdAlani;
    }

    public void setAdAlani(JTextField ad_alani) {
        this.AdAlani = ad_alani;
    }

    public JTextField getSoyadAlani() {
        if (SoyadAlani == null) {
            SoyadAlani = new JTextField();
            SoyadAlani.setBounds(210, 120, 205, 25);
            SoyadAlani.setBorder(null);
            SoyadAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return SoyadAlani;
    }

    public void setSoyadAlani(JTextField soyad_alani) {
        this.SoyadAlani = soyad_alani;
    }

    public JTextField getKullaniciAdiAlani() {
        if (KullaniciAdiAlani == null) {
            KullaniciAdiAlani = new JTextField();
            KullaniciAdiAlani.setBounds(210, 220, 205, 25);
            KullaniciAdiAlani.setBorder(null);
            KullaniciAdiAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return KullaniciAdiAlani;
    }

    public void setKullaniciAdiAlani(JTextField kullanici_adi_alani) {
        this.KullaniciAdiAlani = kullanici_adi_alani;
    }

    public JPasswordField getSifreAlani() {
        if (SifreAlani == null) {
            SifreAlani = new JPasswordField();
            SifreAlani.setBounds(210, 270, 205, 25);
            SifreAlani.setBorder(null);
            SifreAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return SifreAlani;
    }

    public void setSifreAlani(JPasswordField sifre_alani) {
        this.SifreAlani = sifre_alani;
    }

    public JPasswordField getSifreTekrarAlani() {
        if (SifreTekrarAlani == null) {
            SifreTekrarAlani = new JPasswordField();
            SifreTekrarAlani.setBounds(210, 320, 205, 25);
            SifreTekrarAlani.setBorder(null);
            SifreTekrarAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return SifreTekrarAlani;
    }

    public void setSifreTekrarAlani(JPasswordField sifre_tekrar_alani) {
        this.SifreTekrarAlani = sifre_tekrar_alani;
    }

    public JTextField getE_PostaAlani() {
        if (E_PostaAlani == null) {
            E_PostaAlani = new JTextField();
            E_PostaAlani.setBounds(210, 370, 205, 25);
            E_PostaAlani.setBorder(null);
            E_PostaAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return E_PostaAlani;
    }

    public void setE_PostaAlani(JTextField eposta_alani) {
        this.E_PostaAlani = eposta_alani;
    }

    public JTextField getTelAlani() {
        if (TelAlani == null) {
            TelAlani = new JTextField();
            TelAlani.setBounds(210, 420, 205, 25);
            TelAlani.setBorder(null);
            TelAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return TelAlani;
    }

    public void setTelAlani(JTextField tel_alani) {
        this.TelAlani = tel_alani;
    }

    public JComboBox getSehirAlani() {
        if (SehirAlani == null) {
            SehirAlani = new JComboBox();
            SehirAlani.setBorder(null);
            SehirAlani.setBounds(210, 470, 205, 25);
            SehirAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return SehirAlani;
    }

    public void setSehirAlani(JComboBox sehir_alani) {
        this.SehirAlani = sehir_alani;
    }

    public JRadioButton getErkek() {
        if (Erkek == null) {
            Erkek = new JRadioButton("Erkek");
            Erkek.setFont(new Font("Georgia", Font.PLAIN, 17));
            Erkek.setBounds(210, 170, 70, 25);
            Erkek.setBackground(Color.getHSBColor(0.5f, 1f, 10f).darker());
            Erkek.setBorder(null);
            Erkek.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        return Erkek;
    }

    public void setErkek(JRadioButton erkek) {
        this.Erkek = erkek;
    }

    public JRadioButton getKadin() {
        if (Kadin == null) {
            Kadin = new JRadioButton("Kadın");
            Kadin.setBounds(350, 170, 70, 25);
            Kadin.setFont(new Font("Georgia", Font.PLAIN, 17));
            Kadin.setBackground(Color.getHSBColor(0.5f, 1f, 10f).darker());
            Kadin.setBorder(null);
            Kadin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        return Kadin;
    }

    public void setKadin(JRadioButton kadin) {
        this.Kadin = kadin;
    }

    public Actions getA() {
        return a;
    }

    public ButtonGroup getBg() {
        return Bg;
    }

    public void setBg(ButtonGroup bg) {
        this.Bg = bg;
    }
    
}

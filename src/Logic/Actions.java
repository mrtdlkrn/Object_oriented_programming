package Logic;

import Gui.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;

public class Actions implements ActionListener {

    int randomSayi, randomSifre, sayac = 0, sayac2 = 0, sayac3 = 0, doktor, doktor2, doktor3;
    boolean hata = false;
    int durum = 1, durum2 = 1, durum3 = 1, durum4 = 1, durum5 = 1, durum6 = 1, durum7 = 1, durum8 = 1, durum9 = 1, durum10 = 1;
    JButton Secilen;
    String SecilenSaat;
    Random sayi = new Random();
    Random sifre = new Random();
    LoginGui cl = null;
    RegisterGui rg = null;
    PasswordGui pg = null;
    AppointmentGui ag = null;
    PasswordRefreshGui prg = null;

    public Actions(LoginGui cl) {
        setCl(cl);
    }

    public RegisterGui getRg() {
        if (rg == null) {
            rg = new RegisterGui(this);

        }
        return rg;
    }

    public void setRg(RegisterGui rg) {
        this.rg = rg;
    }

    public LoginGui getCl() {
        return cl;
    }

    public void setCl(LoginGui cl) {
        this.cl = cl;
    }

    public PasswordGui getPg() {
        if (pg == null) {
            pg = new PasswordGui(this);

        }
        return pg;
    }

    public void setPg(PasswordGui pg) {
        this.pg = pg;
    }

    public AppointmentGui getAg() {
        if (ag == null) {
            ag = new AppointmentGui(this);

        }
        return ag;
    }

    public void setAg(AppointmentGui ag) {
        this.ag = ag;
    }

    public PasswordRefreshGui getPrg() {
        if (prg == null) {
            prg = new PasswordRefreshGui(this);
        }
        return prg;
    }

    public void getPrg(PasswordRefreshGui prg) {
        this.prg = prg;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == getCl().getExit()) {
            System.exit(0);
        }
        if (ae.getSource() == getRg().getExit()) {
            System.exit(0);
        }
        if (ae.getSource() == getPg().getExit()) {
            System.exit(0);
        }
        if (ae.getSource() == getAg().getExit()) {
            System.exit(0);
        }
        if (ae.getSource() == getRg().getIptal()) {
            System.exit(0);
        }
        if (ae.getSource() == getRg().getTemizle()) {
            getRg().getTcAlani().setText("");
            getRg().getAdAlani().setText("");
            getRg().getSoyadAlani().setText("");
            getRg().getBg().clearSelection();
            getRg().getKullaniciAdiAlani().setText("");
            getRg().getSifreAlani().setText("");
            getRg().getSifreTekrarAlani().setText("");
            getRg().getE_PostaAlani().setText("");
            getRg().getTelAlani().setText("");
            getRg().getSehirAlani().setSelectedIndex(0);
        }
        if (ae.getSource() == getAg().getCancel()) {
            System.exit(0);
        }
        if (ae.getSource() == getPrg().getExit()) {
            System.exit(0);
        }
        if (ae.getSource() == getCl().getLinkRegister()) {
            getCl().getJf().setVisible(false);
            getRg().getJf().setVisible(true);
            String sql_sorgu = "Select SehirAdi From sehir";
            ResultSet rs = Baglanti.yap();
            rs = Baglanti.sorgula(sql_sorgu);
            try {
                while (rs.next()) {
                    getRg().getSehirAlani().addItem(rs.getString("SehirAdi"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
            }
            getRg().getKaydet().setEnabled(true);
            getRg().getTcAlani().setText("");
            getRg().getAdAlani().setText("");
            getRg().getSoyadAlani().setText("");
            getRg().getBg().clearSelection();
            getRg().getKullaniciAdiAlani().setText("");
            getRg().getSifreAlani().setText("");
            getRg().getSifreTekrarAlani().setText("");
            getRg().getE_PostaAlani().setText("");
            getRg().getTelAlani().setText("");
            getRg().getSehirAlani().setSelectedIndex(0);
        }
        if (ae.getSource() == getRg().getKaydet()) {
            int cinsiyet = 2;
            if (getRg().getErkek().isSelected() == false && getRg().getKadin().isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Lütfen Cinsiyetinizi Belirtiniz!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                if (getRg().getErkek().isSelected() == true) {
                    cinsiyet = 1;
                } else if (getRg().getKadin().isSelected() == true) {
                    cinsiyet = 0;
                }
                if (getRg().getSifreAlani().getText().equals(getRg().getSifreTekrarAlani().getText())) {
                    int sehirId = getRg().getSehirAlani().getSelectedIndex();
                    sehirId = sehirId + 1;
                    String sql_sorgu = "Select Count(SehirAdi) As bul From sehir Where SehirId=" + sehirId + "";
                    ResultSet rs = Baglanti.yap();
                    rs = Baglanti.sorgula(sql_sorgu);
                    try {
                        rs.next();

                        if (rs.getInt("bul") == 1) {
                            sql_sorgu = "INSERT INTO kullanici VALUES (Null,"
                                    + getRg().getTcAlani().getText() + ",'" + getRg().getAdAlani().getText() + "','"
                                    + getRg().getSoyadAlani().getText() + "','" + cinsiyet + "','" + getRg().getKullaniciAdiAlani().getText() + "','"
                                    + getRg().getSifreAlani().getText() + "','"
                                    + getRg().getE_PostaAlani().getText() + "'," + getRg().getTelAlani().getText() + ",'"
                                    + getRg().getSehirAlani().getSelectedItem() + "')";
                            Baglanti.ekle(sql_sorgu);

                            JOptionPane.showMessageDialog(null, "Bilgileriniz Sisteme Kaydedilmiştir.\nKullanıcı Girişi Sayfasından Giriş Yapabilirsiniz.", "Warning", JOptionPane.WARNING_MESSAGE);
                            getRg().getKaydet().setEnabled(false);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Şifre Alanları Uyuşmamaktadır.\nLütfen Kontrol Edip Tekrar Deneyiniz!", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        if (ae.getSource() == getRg().getLinkHome()) {
            getRg().getJf().setVisible(false);
            getCl().getJf().setVisible(true);
        }

        if (ae.getSource() == getCl().getLinkPassword()) {
            getCl().getJf().setVisible(false);
            getPg().getJf().setVisible(true);
        }

        if (ae.getSource() == getPg().getLinkHome()) {
            getCl().getJf().setVisible(true);
            getPg().getJf().setVisible(false);
            randomSayi = sayi.nextInt(999999);
            getPg().getRandomGoster().setText(Integer.toString(randomSayi));
        }

        if (ae.getSource() == getPg().getSend()) {
            String sql_sorgu = "Select Count(TCNo) As durum From kullanici Where KullaniciAdi='" + getPg().getKullaniciAlani().getText() + "' And TCNo='"
                    + getPg().getTcAlani().getText() + "' And EPosta='" + getPg().getE_PostaAlani().getText() + "'";
            ResultSet rs = Baglanti.yap();
            rs = Baglanti.sorgula(sql_sorgu);
            try {
                rs.next();

                if (rs.getInt("durum") == 1) {
                    if (getPg().getRandomAlani().getText().equals(getPg().getRandomGoster().getText())) {
                        randomSifre = sifre.nextInt(999999);
                        sql_sorgu = "Update kullanici Set Sifre='" + randomSifre + "' Where TCNo='" + getPg().getTcAlani().getText() + "'";
                        Baglanti.guncelle(sql_sorgu);
                        Properties pro = new Properties();
                        pro.put("mail.smtp.host", "smtp.gmail.com");
                        pro.put("mail.smtp.starttls.enable", "true");
                        pro.put("mail.smtp.auth", "true");
                        pro.put("mail.smtp.socketFactory.port", "465");
                        pro.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                        pro.put("mail.smtp.port", "465");

                        Session session = Session.getInstance(pro, new Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication("HastaneOtomasyonuIT@gmail.com", "ydmwldllpcijuqsg");
                            }
                        });
                        try {
                            Message mesaj = new MimeMessage(session);
                            mesaj.setFrom(new InternetAddress("HastaneOtomasyonuIT@gmail.com"));
                            mesaj.setRecipients(Message.RecipientType.TO, InternetAddress.parse(getPg().getE_PostaAlani().getText()));
                            mesaj.setSubject("Hesap Kurtarma Şifresi");
                            mesaj.setText("Size Gelen Geçici Şifre ile Sisteme Giriş Yapabilir ve Kendi Şifrenizi Oluşturabilirsiniz.\n\nGeçici Şifre: " + randomSifre);
                            Transport.send(mesaj);
                            JOptionPane.showMessageDialog(null, "Mail Adresinizi Kontrol Ediniz.\nGeçici Şifre Gönderildi.", "Warning", JOptionPane.WARNING_MESSAGE);
                        } catch (MessagingException mex) {
                            JOptionPane.showMessageDialog(null, "Geçici Şifre Gönderilemedi! Hata:\n" + mex.toString(), "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Girdiğiniz Bilgileri Kontrol Ediniz.\nGörseldeki Rakamlar Uyuşmamaktadır!", "Warning", JOptionPane.WARNING_MESSAGE);

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Girdiğiniz Bilgileri Kontrol Ediniz.\nSistemdeki Bilgiler ile Uyuşmamaktadır!", "Warning", JOptionPane.WARNING_MESSAGE);

                }
            } catch (SQLException ex) {
                Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (ae.getSource() == getCl().getLogin()) {
            if (getCl().getKullaniciAlani().getText().equals("") && getCl().getSifreAlani().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı ve Şifre Alanları Boş Geçilemez!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (getCl().getKullaniciAlani().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı Alanı Boş Geçilemez!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (getCl().getSifreAlani().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Sifre Alanı Boş Geçilemez!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                String sql_sorgu = "Select Count(KullaniciId) As giris From kullanici Where KullaniciAdi='" + getCl().getKullaniciAlani().getText()
                        + "' And Sifre='" + getCl().getSifreAlani().getText() + "'";
                ResultSet rs = Baglanti.yap();
                rs = Baglanti.sorgula(sql_sorgu);

                try {
                    while (rs.next()) {
                        if (rs.getInt("giris") == 1) {
                            getCl().getJf().setVisible(false);
                            getAg().getJf().setVisible(true);
                            sql_sorgu = "Select Ad,Soyad From kullanici Where KullaniciAdi='" + getCl().getKullaniciAlani().getText()
                                    + "' And Sifre='" + getCl().getSifreAlani().getText() + "'";
                            rs = Baglanti.sorgula(sql_sorgu);
                            rs.next();
                            getAg().getHastaAdiAlani().setText(rs.getString("Ad"));
                            getAg().getHastaSoyadiAlani().setText(rs.getString("Soyad"));
                            sql_sorgu = "Select SehirAdi From sehir";
                            rs = Baglanti.sorgula(sql_sorgu);
                            while (rs.next()) {
                                getAg().getSehirAlani().addItem(rs.getString("SehirAdi"));
                                sayac++;
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Şifre Yanlış!", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (ae.getSource() == getAg().getSehirAlani() && sayac > 80) {

            String secilen = String.valueOf(getAg().getSehirAlani().getSelectedItem());
            String sql_sorgu = "Select SehirId from sehir where SehirAdi='" + secilen + "'";
            try {
                ResultSet rs = Baglanti.yap();
                rs = Baglanti.sorgula(sql_sorgu);
                getAg().getHastaneAlani().removeAllItems();
                while (rs.next()) {
                    sql_sorgu = "Select HastaneAdi from hastane where SehirId='" + rs.getInt("SehirId") + "'";
                    rs = Baglanti.sorgula(sql_sorgu);
                    while (rs.next()) {
                        getAg().getHastaneAlani().addItem(rs.getString("HastaneAdi"));
                        sayac2++;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
            }

            while (sayac2 == 5) {
                sayac2++;
            }

        }

        if (ae.getSource() == getAg().getHastaneAlani() && sayac2 > 4) {
            String sql_sorgu = "Select KlinikAdi From klinik";
            ResultSet rs = Baglanti.yap();
            rs = Baglanti.sorgula(sql_sorgu);
            getAg().getKlinikAlani().removeAllItems();
            try {
                while (rs.next()) {
                    getAg().getKlinikAlani().addItem(rs.getString("KlinikAdi"));
                    sayac3++;
                }

            } catch (SQLException ex) {
                Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        while (sayac3 == 75) {
            sayac3++;
        }

        if (ae.getSource() == getAg().getKlinikAlani() && sayac3 > 74) {
            doktor = sayi.nextInt(7);
            if (doktor == 0) {
                doktor = sayi.nextInt(7);
            }
            doktor2 = sayi.nextInt(14);
            if (doktor2 == 0) {
                doktor2 = sayi.nextInt(14);
            }
            doktor3 = sayi.nextInt(20);
            if (doktor3 == 0) {
                doktor3 = sayi.nextInt(20);
            }
            String sql_sorgu = "Select DoktorAdi From doktor where DoktorId='" + doktor + "'" + " or " + "DoktorId='" + doktor2 + "'" + " or " + "DoktorId='"
                    + doktor3 + "'";
            ResultSet rs = Baglanti.yap();
            rs = Baglanti.sorgula(sql_sorgu);
            getAg().getDoktorAlani().removeAllItems();
            try {
                while (rs.next()) {
                    getAg().getDoktorAlani().addItem(rs.getString("DoktorAdi"));
                }
                getAg().getSearch().setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (ae.getSource() == getPrg().getLinkRandevu()) {
            getPrg().getJf().setVisible(false);
            getAg().getJf().setVisible(true);
            getAg().getJf().setSize(490, 600);
            getAg().getJp1().setBounds(0, 0, 490, 640);
            getAg().getJp2().setBounds(0, 80, 490, 640);
            getAg().getJp3().setBounds(0, 440, 490, 80);
            getAg().getJf().setLocationRelativeTo(null);
            getAg().getRandevuSaat().setVisible(false);
            getAg().getSave().setVisible(false);
            getAg().getDelete2().setVisible(false);
            getAg().getCancel().setVisible(false);
            getAg().getSaat().setVisible(false);
            getAg().getSaat1().setVisible(false);
            getAg().getSaat2().setVisible(false);
            getAg().getSaat3().setVisible(false);
            getAg().getSaat4().setVisible(false);
            getAg().getSaat5().setVisible(false);
            getAg().getSaat6().setVisible(false);
            getAg().getSaat7().setVisible(false);
            getAg().getSaat8().setVisible(false);
            getAg().getSaat9().setVisible(false);
            getAg().getSaat10().setVisible(false);
            getAg().getSaat11().setVisible(false);
            getAg().getSaat12().setVisible(false);
            getAg().getSaat13().setVisible(false);
            getAg().getSaat14().setVisible(false);
            getAg().getSaat15().setVisible(false);
            getAg().getSehirAlani().setSelectedIndex(0);
            getAg().getHastaneAlani().removeAllItems();
            getAg().getKlinikAlani().removeAllItems();
            getAg().getDoktorAlani().removeAllItems();
            getAg().getSearch().setEnabled(false);
            sayac2 = 0;
            sayac3 = 0;
        }

        if (ae.getSource() == getAg().getDelete()) {
            getAg().getSehirAlani().setSelectedIndex(0);
            getAg().getHastaneAlani().removeAllItems();
            getAg().getKlinikAlani().removeAllItems();
            getAg().getDoktorAlani().removeAllItems();
            getAg().getSearch().setEnabled(false);
            sayac2 = 0;
            sayac3 = 0;
            getAg().getJf().setSize(490, 600);
            getAg().getJp1().setBounds(0, 0, 490, 640);
            getAg().getJp2().setBounds(0, 80, 490, 640);
            getAg().getJp3().setBounds(0, 440, 490, 80);
            getAg().getJf().setLocationRelativeTo(null);
            getAg().getRandevuSaat().setVisible(false);
            getAg().getSave().setVisible(false);
            getAg().getDelete2().setVisible(false);
            getAg().getCancel().setVisible(false);
            getAg().getSaat().setVisible(false);
            getAg().getSaat1().setVisible(false);
            getAg().getSaat2().setVisible(false);
            getAg().getSaat3().setVisible(false);
            getAg().getSaat4().setVisible(false);
            getAg().getSaat5().setVisible(false);
            getAg().getSaat6().setVisible(false);
            getAg().getSaat7().setVisible(false);
            getAg().getSaat8().setVisible(false);
            getAg().getSaat9().setVisible(false);
            getAg().getSaat10().setVisible(false);
            getAg().getSaat11().setVisible(false);
            getAg().getSaat12().setVisible(false);
            getAg().getSaat13().setVisible(false);
            getAg().getSaat14().setVisible(false);
            getAg().getSaat15().setVisible(false);

        }
        if (ae.getSource() == getAg().getLinkPasswordRefresh()) {
            getAg().getJf().setVisible(false);
            getPrg().getJf().setVisible(true);
        }

        if (ae.getSource() == getAg().getSave()) {
            if (durum == 2) {
                getAg().getSaat1().setBackground(Color.getHSBColor(114, 1, 60));
                getAg().getSaat1().setEnabled(false);
                durum = 3;
                Secilen = getAg().getSaat1();
                SecilenSaat = Secilen.getText();
            } else if (durum2 == 2) {
                getAg().getSaat2().setEnabled(false);
                getAg().getSaat2().setBackground(Color.getHSBColor(114, 1, 60));
                durum2 = 3;
                Secilen = getAg().getSaat2();
                SecilenSaat = Secilen.getText();
            } else if (durum3 == 2) {
                getAg().getSaat3().setEnabled(false);
                getAg().getSaat3().setBackground(Color.getHSBColor(114, 1, 60));
                durum3 = 3;
                Secilen = getAg().getSaat3();
                SecilenSaat = Secilen.getText();
            } else if (durum4 == 2) {
                getAg().getSaat6().setEnabled(false);
                getAg().getSaat6().setBackground(Color.getHSBColor(114, 1, 60));
                durum4 = 3;
                Secilen = getAg().getSaat6();
                SecilenSaat = Secilen.getText();
            } else if (durum5 == 2) {
                getAg().getSaat7().setEnabled(false);
                getAg().getSaat7().setBackground(Color.getHSBColor(114, 1, 60));
                durum5 = 3;
                Secilen = getAg().getSaat7();
                SecilenSaat = Secilen.getText();
            } else if (durum6 == 2) {
                getAg().getSaat8().setEnabled(false);
                getAg().getSaat8().setBackground(Color.getHSBColor(114, 1, 60));
                durum6 = 3;
                Secilen = getAg().getSaat8();
                SecilenSaat = Secilen.getText();
            } else if (durum7 == 2) {
                getAg().getSaat9().setEnabled(false);
                getAg().getSaat9().setBackground(Color.getHSBColor(114, 1, 60));
                durum7 = 3;
                Secilen = getAg().getSaat9();
                SecilenSaat = Secilen.getText();
            } else if (durum8 == 2) {
                getAg().getSaat10().setEnabled(false);
                getAg().getSaat10().setBackground(Color.getHSBColor(114, 1, 60));
                durum8 = 3;
                Secilen = getAg().getSaat10();
                SecilenSaat = Secilen.getText();
            } else if (durum9 == 2) {
                getAg().getSaat12().setEnabled(false);
                getAg().getSaat12().setBackground(Color.getHSBColor(114, 1, 60));
                durum9 = 3;
                Secilen = getAg().getSaat12();
                SecilenSaat = Secilen.getText();
            } else if (durum10 == 2) {
                getAg().getSaat13().setEnabled(false);
                getAg().getSaat13().setBackground(Color.getHSBColor(114, 1, 60));
                durum10 = 3;
                Secilen = getAg().getSaat13();
                SecilenSaat = Secilen.getText();
            }
            String sql_sorgu = "Select EPosta From kullanici Where Ad='" + getAg().getHastaAdiAlani().getText() + "' And Soyad='" + getAg().getHastaSoyadiAlani().getText() + "'";
            ResultSet rs = Baglanti.yap();
            rs = Baglanti.sorgula(sql_sorgu);
            Properties pro = new Properties();
            pro.put("mail.smtp.host", "smtp.gmail.com");
            pro.put("mail.smtp.starttls.enable", "true");
            pro.put("mail.smtp.auth", "true");
            pro.put("mail.smtp.socketFactory.port", "465");
            pro.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            pro.put("mail.smtp.port", "465");

            try {
                rs.next();
                Session session = Session.getInstance(pro, new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("HastaneOtomasyonuIT@gmail.com", "ydmwldllpcijuqsg");
                    }
                });
                try {
                    if (SecilenSaat != null) {
                        Message mesaj = new MimeMessage(session);
                        mesaj.setFrom(new InternetAddress("HastaneOtomasyonuIT@gmail.com"));
                        mesaj.setRecipients(Message.RecipientType.TO, InternetAddress.parse(rs.getString("EPosta")));
                        mesaj.setSubject("Randevu Bilgileri");
                        mesaj.setText("Sayın, " + getAg().getHastaAdiAlani().getText() + " " + getAg().getHastaSoyadiAlani().getText() + " " + getAg().getHastaneAlani().getSelectedItem() + " "
                                + getAg().getKlinikAlani().getSelectedItem() + " Kliniğimizden " + getAg().getDoktorAlani().getSelectedItem() + " Adlı Doktorumuzdan " + SecilenSaat + " Saatine Almış Olduğunuz Randevunuz için Hastanemize 15 Dakika Erken Gelmenizi Öneririz.");
                        Transport.send(mesaj);
                        JOptionPane.showMessageDialog(null, "Randevu Bilgileriniz Mail Adresinize Gönderilmiştir.\nKontrol Edebilirsiniz.", "Warning", JOptionPane.WARNING_MESSAGE);
                        getAg().getSave().setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Randevu Saati Seçmeden Randevu Alamazsınız!", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                } catch (MessagingException mex) {
                    JOptionPane.showMessageDialog(null, "Randevu Alma İşleminiz Sırasında\n Beklenmedik Bir Hata Oluştu! \nÖneri: İnternet Bağlantınızı Kontrol Ediniz!", "Warning", JOptionPane.WARNING_MESSAGE);
                    Secilen.setBackground(Color.green.darker());
                    Secilen.setEnabled(true);
                    durum = 1;
                    durum2 = 1;
                    durum3 = 1;
                    durum4 = 1;
                    durum5 = 1;
                    durum6 = 1;
                    durum7 = 1;
                    durum8 = 1;
                    durum9 = 1;
                    durum10 = 1;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (ae.getSource() == getPrg().getUpdate()) {
            String sql_sorgu = "Select Count(TCNo) As kontrol From kullanici Where TCNo='" + getPrg().getTcAlani().getText() + "' And Sifre='" + getPrg().getSifreAlani().getText() + "'";
            ResultSet rs = Baglanti.yap();
            rs = Baglanti.sorgula(sql_sorgu);

            try {
                rs.next();

                if (rs.getInt("kontrol") == 1) {
                    if (getPrg().getSifreAlani().getText().equals(getPrg().getYeniSifreAlani().getText()) && getPrg().getYeniSifreAlani().getText().equals(getPrg().getYeniSifreTekrarAlani().getText())) {
                        JOptionPane.showMessageDialog(null, "Yeni Şifreniz Varsayılan Şifrenizden Farklı Olmalıdır!", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (getPrg().getYeniSifreAlani().getText().equals(getPrg().getYeniSifreTekrarAlani().getText())) {
                        sql_sorgu = "Update kullanici Set Sifre='" + getPrg().getYeniSifreAlani().getText() + "' Where TCNo='" + getPrg().getTcAlani().getText() + "'";
                        Baglanti.guncelle(sql_sorgu);
                        JOptionPane.showMessageDialog(null, "Şifreniz Başarıyla Güncellenmistir.", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Yeni Şifre Alanları Uyuşmamaktadır!\nLütfen Kontrol Edip Tekrar Şifre oluşturunuz.", "Warning", JOptionPane.WARNING_MESSAGE);

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tc Kimlik No veya Şifre Yanlış!", "Warning", JOptionPane.WARNING_MESSAGE);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (ae.getSource() == getAg().getSearch()) {
            getAg().getJf().setSize(490, 880);
            getAg().getJp1().setBounds(0, 0, 490, 900);
            getAg().getJp2().setBounds(0, 80, 490, 900);
            getAg().getJp3().setBounds(0, 720, 490, 80);
            getAg().getJf().setLocationRelativeTo(null);
            getAg().getRandevuSaat().setVisible(true);
            getAg().getSave().setVisible(true);
            getAg().getDelete2().setVisible(true);
            getAg().getCancel().setVisible(true);
            getAg().getSaat().setBounds(50, 440, 85, 30);
            getAg().getSaat().setVisible(true);
            getAg().getSaat1().setBounds(150, 440, 85, 30);
            getAg().getSaat1().setVisible(true);
            getAg().getSaat2().setBounds(250, 440, 85, 30);
            getAg().getSaat2().setVisible(true);
            getAg().getSaat3().setBounds(350, 440, 85, 30);
            getAg().getSaat3().setVisible(true);
            getAg().getSaat4().setBounds(50, 490, 85, 30);
            getAg().getSaat4().setVisible(true);
            getAg().getSaat5().setBounds(150, 490, 85, 30);
            getAg().getSaat5().setVisible(true);
            getAg().getSaat6().setBounds(250, 490, 85, 30);
            getAg().getSaat6().setVisible(true);
            getAg().getSaat7().setBounds(350, 490, 85, 30);
            getAg().getSaat7().setVisible(true);
            getAg().getSaat8().setBounds(50, 540, 85, 30);
            getAg().getSaat8().setVisible(true);
            getAg().getSaat9().setBounds(150, 540, 85, 30);
            getAg().getSaat9().setVisible(true);
            getAg().getSaat10().setBounds(250, 540, 85, 30);
            getAg().getSaat10().setVisible(true);
            getAg().getSaat11().setBounds(350, 540, 85, 30);
            getAg().getSaat11().setVisible(true);
            getAg().getSaat12().setBounds(50, 590, 85, 30);
            getAg().getSaat12().setVisible(true);
            getAg().getSaat13().setBounds(150, 590, 85, 30);
            getAg().getSaat13().setVisible(true);
            getAg().getSaat14().setBounds(250, 590, 85, 30);
            getAg().getSaat14().setVisible(true);
            getAg().getSaat15().setBounds(350, 590, 85, 30);
            getAg().getSaat15().setVisible(true);
        }
        if (ae.getSource() == getAg().getSaat1()) {
            getAg().getSaat1().setBackground(Color.LIGHT_GRAY);
            getAg().getSaat1().setEnabled(false);
            if (durum2 == 2) {
                getAg().getSaat2().setBackground(Color.green.darker());
                getAg().getSaat2().setEnabled(true);
                durum2 = 1;
            } else if (durum3 == 2) {
                getAg().getSaat3().setBackground(Color.green.darker());
                getAg().getSaat3().setEnabled(true);
                durum3 = 1;
            } else if (durum4 == 2) {
                getAg().getSaat6().setBackground(Color.green.darker());
                getAg().getSaat6().setEnabled(true);
                durum4 = 1;
            } else if (durum5 == 2) {
                getAg().getSaat7().setBackground(Color.green.darker());
                getAg().getSaat7().setEnabled(true);
                durum5 = 1;
            } else if (durum6 == 2) {
                getAg().getSaat8().setBackground(Color.green.darker());
                getAg().getSaat8().setEnabled(true);
                durum6 = 1;
            } else if (durum7 == 2) {
                getAg().getSaat9().setBackground(Color.green.darker());
                getAg().getSaat9().setEnabled(true);
                durum7 = 1;
            } else if (durum8 == 2) {
                getAg().getSaat10().setBackground(Color.green.darker());
                getAg().getSaat10().setEnabled(true);
                durum8 = 1;
            } else if (durum9 == 2) {
                getAg().getSaat12().setBackground(Color.green.darker());
                getAg().getSaat12().setEnabled(true);
                durum9 = 1;
            } else if (durum10 == 2) {
                getAg().getSaat13().setBackground(Color.green.darker());
                getAg().getSaat13().setEnabled(true);
                durum10 = 1;
            }
            durum = 2;
        }
        if (ae.getSource() == getAg().getSaat2()) {
            getAg().getSaat2().setBackground(Color.LIGHT_GRAY);
            getAg().getSaat2().setEnabled(false);
            if (durum == 2) {
                getAg().getSaat1().setBackground(Color.green.darker());
                getAg().getSaat1().setEnabled(true);
                durum = 1;
            } else if (durum3 == 2) {
                getAg().getSaat3().setBackground(Color.green.darker());
                getAg().getSaat3().setEnabled(true);
                durum3 = 1;
            } else if (durum4 == 2) {
                getAg().getSaat6().setBackground(Color.green.darker());
                getAg().getSaat6().setEnabled(true);
                durum4 = 1;
            } else if (durum5 == 2) {
                getAg().getSaat7().setBackground(Color.green.darker());
                getAg().getSaat7().setEnabled(true);
                durum5 = 1;
            } else if (durum6 == 2) {
                getAg().getSaat8().setBackground(Color.green.darker());
                getAg().getSaat8().setEnabled(true);
                durum6 = 1;
            } else if (durum7 == 2) {
                getAg().getSaat9().setBackground(Color.green.darker());
                getAg().getSaat9().setEnabled(true);
                durum7 = 1;
            } else if (durum8 == 2) {
                getAg().getSaat10().setBackground(Color.green.darker());
                getAg().getSaat10().setEnabled(true);
                durum8 = 1;
            } else if (durum9 == 2) {
                getAg().getSaat12().setBackground(Color.green.darker());
                getAg().getSaat12().setEnabled(true);
                durum9 = 1;
            } else if (durum10 == 2) {
                getAg().getSaat13().setBackground(Color.green.darker());
                getAg().getSaat13().setEnabled(true);
                durum10 = 1;
            }
            durum2 = 2;
        }
        if (ae.getSource() == getAg().getSaat3()) {
            getAg().getSaat3().setBackground(Color.LIGHT_GRAY);
            getAg().getSaat3().setEnabled(false);
            if (durum == 2) {
                getAg().getSaat1().setBackground(Color.green.darker());
                getAg().getSaat1().setEnabled(true);
                durum = 1;
            } else if (durum2 == 2) {
                getAg().getSaat2().setBackground(Color.green.darker());
                getAg().getSaat2().setEnabled(true);
                durum2 = 1;
            } else if (durum4 == 2) {
                getAg().getSaat6().setBackground(Color.green.darker());
                getAg().getSaat6().setEnabled(true);
                durum4 = 1;
            } else if (durum5 == 2) {
                getAg().getSaat7().setBackground(Color.green.darker());
                getAg().getSaat7().setEnabled(true);
                durum5 = 1;
            } else if (durum6 == 2) {
                getAg().getSaat8().setBackground(Color.green.darker());
                getAg().getSaat8().setEnabled(true);
                durum6 = 1;
            } else if (durum7 == 2) {
                getAg().getSaat9().setBackground(Color.green.darker());
                getAg().getSaat9().setEnabled(true);
                durum7 = 1;
            } else if (durum8 == 2) {
                getAg().getSaat10().setBackground(Color.green.darker());
                getAg().getSaat10().setEnabled(true);
                durum8 = 1;
            } else if (durum9 == 2) {
                getAg().getSaat12().setBackground(Color.green.darker());
                getAg().getSaat12().setEnabled(true);
                durum9 = 1;
            } else if (durum10 == 2) {
                getAg().getSaat13().setBackground(Color.green.darker());
                getAg().getSaat13().setEnabled(true);
                durum10 = 1;
            }
            durum3 = 2;
        }
        if (ae.getSource() == getAg().getSaat6()) {
            getAg().getSaat6().setBackground(Color.LIGHT_GRAY);
            getAg().getSaat6().setEnabled(false);
            if (durum == 2) {
                getAg().getSaat1().setBackground(Color.green.darker());
                getAg().getSaat1().setEnabled(true);
                durum = 1;
            } else if (durum2 == 2) {
                getAg().getSaat2().setBackground(Color.green.darker());
                getAg().getSaat2().setEnabled(true);
                durum2 = 1;
            } else if (durum3 == 2) {
                getAg().getSaat3().setBackground(Color.green.darker());
                getAg().getSaat3().setEnabled(true);
                durum3 = 1;
            } else if (durum5 == 2) {
                getAg().getSaat7().setBackground(Color.green.darker());
                getAg().getSaat7().setEnabled(true);
                durum5 = 1;
            } else if (durum6 == 2) {
                getAg().getSaat8().setBackground(Color.green.darker());
                getAg().getSaat8().setEnabled(true);
                durum6 = 1;
            } else if (durum7 == 2) {
                getAg().getSaat9().setBackground(Color.green.darker());
                getAg().getSaat9().setEnabled(true);
                durum7 = 1;
            } else if (durum8 == 2) {
                getAg().getSaat10().setBackground(Color.green.darker());
                getAg().getSaat10().setEnabled(true);
                durum8 = 1;
            } else if (durum9 == 2) {
                getAg().getSaat12().setBackground(Color.green.darker());
                getAg().getSaat12().setEnabled(true);
                durum9 = 1;
            } else if (durum10 == 2) {
                getAg().getSaat13().setBackground(Color.green.darker());
                getAg().getSaat13().setEnabled(true);
                durum10 = 1;
            }
            durum4 = 2;
        }
        if (ae.getSource() == getAg().getSaat7()) {
            getAg().getSaat7().setBackground(Color.LIGHT_GRAY);
            getAg().getSaat7().setEnabled(false);
            if (durum == 2) {
                getAg().getSaat1().setBackground(Color.green.darker());
                getAg().getSaat1().setEnabled(true);
                durum = 1;
            } else if (durum2 == 2) {
                getAg().getSaat2().setBackground(Color.green.darker());
                getAg().getSaat2().setEnabled(true);
                durum2 = 1;
            } else if (durum3 == 2) {
                getAg().getSaat3().setBackground(Color.green.darker());
                getAg().getSaat3().setEnabled(true);
                durum3 = 1;
            } else if (durum4 == 2) {
                getAg().getSaat6().setBackground(Color.green.darker());
                getAg().getSaat6().setEnabled(true);
                durum4 = 1;
            } else if (durum6 == 2) {
                getAg().getSaat8().setBackground(Color.green.darker());
                getAg().getSaat8().setEnabled(true);
                durum6 = 1;
            } else if (durum7 == 2) {
                getAg().getSaat9().setBackground(Color.green.darker());
                getAg().getSaat9().setEnabled(true);
                durum7 = 1;
            } else if (durum8 == 2) {
                getAg().getSaat10().setBackground(Color.green.darker());
                getAg().getSaat10().setEnabled(true);
                durum8 = 1;
            } else if (durum9 == 2) {
                getAg().getSaat12().setBackground(Color.green.darker());
                getAg().getSaat12().setEnabled(true);
                durum9 = 1;
            } else if (durum10 == 2) {
                getAg().getSaat13().setBackground(Color.green.darker());
                getAg().getSaat13().setEnabled(true);
                durum10 = 1;
            }
            durum5 = 2;
        }
        if (ae.getSource() == getAg().getSaat8()) {
            getAg().getSaat8().setBackground(Color.LIGHT_GRAY);
            getAg().getSaat8().setEnabled(false);
            if (durum == 2) {
                getAg().getSaat1().setBackground(Color.green.darker());
                getAg().getSaat1().setEnabled(true);
                durum = 1;
            } else if (durum2 == 2) {
                getAg().getSaat2().setBackground(Color.green.darker());
                getAg().getSaat2().setEnabled(true);
                durum2 = 1;
            } else if (durum3 == 2) {
                getAg().getSaat3().setBackground(Color.green.darker());
                getAg().getSaat3().setEnabled(true);
                durum3 = 1;
            } else if (durum4 == 2) {
                getAg().getSaat6().setBackground(Color.green.darker());
                getAg().getSaat6().setEnabled(true);
                durum4 = 1;
            } else if (durum5 == 2) {
                getAg().getSaat7().setBackground(Color.green.darker());
                getAg().getSaat7().setEnabled(true);
                durum5 = 1;
            } else if (durum7 == 2) {
                getAg().getSaat9().setBackground(Color.green.darker());
                getAg().getSaat9().setEnabled(true);
                durum7 = 1;
            } else if (durum8 == 2) {
                getAg().getSaat10().setBackground(Color.green.darker());
                getAg().getSaat10().setEnabled(true);
                durum8 = 1;
            } else if (durum9 == 2) {
                getAg().getSaat12().setBackground(Color.green.darker());
                getAg().getSaat12().setEnabled(true);
                durum9 = 1;
            } else if (durum10 == 2) {
                getAg().getSaat13().setBackground(Color.green.darker());
                getAg().getSaat13().setEnabled(true);
                durum10 = 1;
            }
            durum6 = 2;
        }
        if (ae.getSource() == getAg().getSaat9()) {
            getAg().getSaat9().setBackground(Color.LIGHT_GRAY);
            getAg().getSaat9().setEnabled(false);
            if (durum == 2) {
                getAg().getSaat1().setBackground(Color.green.darker());
                getAg().getSaat1().setEnabled(true);
                durum = 1;
            } else if (durum2 == 2) {
                getAg().getSaat2().setBackground(Color.green.darker());
                getAg().getSaat2().setEnabled(true);
                durum2 = 1;
            } else if (durum3 == 2) {
                getAg().getSaat3().setBackground(Color.green.darker());
                getAg().getSaat3().setEnabled(true);
                durum3 = 1;
            } else if (durum4 == 2) {
                getAg().getSaat6().setBackground(Color.green.darker());
                getAg().getSaat6().setEnabled(true);
                durum4 = 1;
            } else if (durum5 == 2) {
                getAg().getSaat7().setBackground(Color.green.darker());
                getAg().getSaat7().setEnabled(true);
                durum5 = 1;
            } else if (durum6 == 2) {
                getAg().getSaat8().setBackground(Color.green.darker());
                getAg().getSaat8().setEnabled(true);
                durum6 = 1;
            } else if (durum8 == 2) {
                getAg().getSaat10().setBackground(Color.green.darker());
                getAg().getSaat10().setEnabled(true);
                durum8 = 1;
            } else if (durum9 == 2) {
                getAg().getSaat12().setBackground(Color.green.darker());
                getAg().getSaat12().setEnabled(true);
                durum9 = 1;
            } else if (durum10 == 2) {
                getAg().getSaat13().setBackground(Color.green.darker());
                getAg().getSaat13().setEnabled(true);
                durum10 = 1;
            }
            durum7 = 2;
        }
        if (ae.getSource() == getAg().getSaat10()) {
            getAg().getSaat10().setBackground(Color.LIGHT_GRAY);
            getAg().getSaat10().setEnabled(false);
            if (durum == 2) {
                getAg().getSaat1().setBackground(Color.green.darker());
                getAg().getSaat1().setEnabled(true);
                durum = 1;
            } else if (durum2 == 2) {
                getAg().getSaat2().setBackground(Color.green.darker());
                getAg().getSaat2().setEnabled(true);
                durum2 = 1;
            } else if (durum3 == 2) {
                getAg().getSaat3().setBackground(Color.green.darker());
                getAg().getSaat3().setEnabled(true);
                durum3 = 1;
            } else if (durum4 == 2) {
                getAg().getSaat6().setBackground(Color.green.darker());
                getAg().getSaat6().setEnabled(true);
                durum4 = 1;
            } else if (durum5 == 2) {
                getAg().getSaat7().setBackground(Color.green.darker());
                getAg().getSaat7().setEnabled(true);
                durum5 = 1;
            } else if (durum6 == 2) {
                getAg().getSaat8().setBackground(Color.green.darker());
                getAg().getSaat8().setEnabled(true);
                durum6 = 1;
            } else if (durum7 == 2) {
                getAg().getSaat9().setBackground(Color.green.darker());
                getAg().getSaat9().setEnabled(true);
                durum7 = 1;
            } else if (durum9 == 2) {
                getAg().getSaat12().setBackground(Color.green.darker());
                getAg().getSaat12().setEnabled(true);
                durum9 = 1;
            } else if (durum10 == 2) {
                getAg().getSaat13().setBackground(Color.green.darker());
                getAg().getSaat13().setEnabled(true);
                durum10 = 1;
            }
            durum8 = 2;
        }
        if (ae.getSource() == getAg().getSaat12()) {
            getAg().getSaat12().setBackground(Color.LIGHT_GRAY);
            getAg().getSaat12().setEnabled(false);
            if (durum == 2) {
                getAg().getSaat1().setBackground(Color.green.darker());
                getAg().getSaat1().setEnabled(true);
                durum = 1;
            } else if (durum2 == 2) {
                getAg().getSaat2().setBackground(Color.green.darker());
                getAg().getSaat2().setEnabled(true);
                durum2 = 1;
            } else if (durum3 == 2) {
                getAg().getSaat3().setBackground(Color.green.darker());
                getAg().getSaat3().setEnabled(true);
                durum3 = 1;
            } else if (durum4 == 2) {
                getAg().getSaat6().setBackground(Color.green.darker());
                getAg().getSaat6().setEnabled(true);
                durum4 = 1;
            } else if (durum5 == 2) {
                getAg().getSaat7().setBackground(Color.green.darker());
                getAg().getSaat7().setEnabled(true);
                durum5 = 1;
            } else if (durum6 == 2) {
                getAg().getSaat8().setBackground(Color.green.darker());
                getAg().getSaat8().setEnabled(true);
                durum6 = 1;
            } else if (durum7 == 2) {
                getAg().getSaat9().setBackground(Color.green.darker());
                getAg().getSaat9().setEnabled(true);
                durum7 = 1;
            } else if (durum8 == 2) {
                getAg().getSaat10().setBackground(Color.green.darker());
                getAg().getSaat10().setEnabled(true);
                durum8 = 1;
            } else if (durum10 == 2) {
                getAg().getSaat13().setBackground(Color.green.darker());
                getAg().getSaat13().setEnabled(true);
                durum10 = 1;
            }
            durum9 = 2;
        }
        if (ae.getSource() == getAg().getSaat13()) {
            getAg().getSaat13().setBackground(Color.LIGHT_GRAY);
            getAg().getSaat13().setEnabled(false);
            if (durum == 2) {
                getAg().getSaat1().setBackground(Color.green.darker());
                getAg().getSaat1().setEnabled(true);
                durum = 1;
            } else if (durum2 == 2) {
                getAg().getSaat2().setBackground(Color.green.darker());
                getAg().getSaat2().setEnabled(true);
                durum2 = 1;
            } else if (durum3 == 2) {
                getAg().getSaat3().setBackground(Color.green.darker());
                getAg().getSaat3().setEnabled(true);
                durum3 = 1;
            } else if (durum4 == 2) {
                getAg().getSaat6().setBackground(Color.green.darker());
                getAg().getSaat6().setEnabled(true);
                durum4 = 1;
            } else if (durum5 == 2) {
                getAg().getSaat7().setBackground(Color.green.darker());
                getAg().getSaat7().setEnabled(true);
                durum5 = 1;
            } else if (durum6 == 2) {
                getAg().getSaat8().setBackground(Color.green.darker());
                getAg().getSaat8().setEnabled(true);
                durum6 = 1;
            } else if (durum7 == 2) {
                getAg().getSaat9().setBackground(Color.green.darker());
                getAg().getSaat9().setEnabled(true);
                durum7 = 1;
            } else if (durum8 == 2) {
                getAg().getSaat10().setBackground(Color.green.darker());
                getAg().getSaat10().setEnabled(true);
                durum8 = 1;
            } else if (durum9 == 2) {
                getAg().getSaat12().setBackground(Color.green.darker());
                getAg().getSaat12().setEnabled(true);
                durum9 = 1;
            }
            durum10 = 2;
        }

        if (ae.getSource() == getAg().getDelete2()) {
            if (durum == 2) {
                getAg().getSaat1().setBackground(Color.green.darker());
                getAg().getSaat1().setEnabled(true);
                durum = 1;
            } else if (durum2 == 2) {
                getAg().getSaat2().setBackground(Color.green.darker());
                getAg().getSaat2().setEnabled(true);
                durum2 = 1;
            } else if (durum3 == 2) {
                getAg().getSaat3().setBackground(Color.green.darker());
                getAg().getSaat3().setEnabled(true);
                durum3 = 1;
            } else if (durum4 == 2) {
                getAg().getSaat6().setBackground(Color.green.darker());
                getAg().getSaat6().setEnabled(true);
                durum4 = 1;
            } else if (durum5 == 2) {
                getAg().getSaat7().setBackground(Color.green.darker());
                getAg().getSaat7().setEnabled(true);
                durum5 = 1;
            } else if (durum6 == 2) {
                getAg().getSaat8().setBackground(Color.green.darker());
                getAg().getSaat8().setEnabled(true);
                durum6 = 1;
            } else if (durum7 == 2) {
                getAg().getSaat9().setBackground(Color.green.darker());
                getAg().getSaat9().setEnabled(true);
                durum7 = 1;
            } else if (durum8 == 2) {
                getAg().getSaat10().setBackground(Color.green.darker());
                getAg().getSaat10().setEnabled(true);
                durum8 = 1;
            } else if (durum9 == 2) {
                getAg().getSaat12().setBackground(Color.green.darker());
                getAg().getSaat12().setEnabled(true);
                durum9 = 1;
            } else if (durum10 == 2) {
                getAg().getSaat13().setBackground(Color.green.darker());
                getAg().getSaat13().setEnabled(true);
                durum10 = 1;
            }
        }
    }
}

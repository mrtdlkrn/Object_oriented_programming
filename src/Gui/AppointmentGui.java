package Gui;

import java.awt.*;
import javax.swing.*;
import Logic.Actions;

public class AppointmentGui {

    JFrame jf = null;
    JPanel jp1 = null;
    JPanel jp2 = null;
    JPanel jp3 = null;
    JLabel Icon = null;
    JLabel Baslik = null;
    JLabel HastaAdi = null;
    JLabel HastaSoyadi = null;
    JLabel Sehir = null;
    JLabel Hastane = null;
    JLabel Klinik = null;
    JLabel Doktor = null;
    JLabel RandevuSaat = null;
    JButton Saat = null;
    JButton Saat1 = null;
    JButton Saat2 = null;
    JButton Saat3 = null;
    JButton Saat4 = null;
    JButton Saat5 = null;
    JButton Saat6 = null;
    JButton Saat7 = null;
    JButton Saat8 = null;
    JButton Saat9 = null;
    JButton Saat10 = null;
    JButton Saat11 = null;
    JButton Saat12 = null;
    JButton Saat13 = null;
    JButton Saat14 = null;
    JButton Saat15 = null;
    JTextField HastaAdiAlani = null;
    JTextField HastaSoyadiAlani = null;
    JComboBox SehirAlani = null;
    JComboBox HastaneAlani = null;
    JComboBox KlinikAlani = null;
    JComboBox DoktorAlani = null;
    JButton Exit = null;
    JButton Delete = null;
    JButton Search = null;
    JButton Save = null;
    JButton Delete2 = null;
    JButton Cancel = null;
    JButton LinkPasswordRefresh = null;
    Actions a;

    public AppointmentGui(Actions a) {
        this.a = a;
        getJp1().add(getJp2());
        getJp2().add(getJp3());
        getJp1().add(getIcon());
        getJp1().add(getBaslik());
        getJp1().add(getExit());
        getJp2().add(getHastaAdi());
        getJp2().add(getHastaSoyadi());
        getJp2().add(getSehir());
        getJp2().add(getHastane());
        getJp2().add(getKlinik());
        getJp2().add(getDoktor());
        getJp2().add(getRandevuSaat());
        getJp2().add(getHastaAdiAlani());
        getJp2().add(getHastaSoyadiAlani());
        getJp2().add(getSehirAlani());
        getJp2().add(getHastaneAlani());
        getJp2().add(getKlinikAlani());
        getJp2().add(getDoktorAlani());
        getJp2().add(getDelete());
        getJp2().add(getSearch());
        getJp2().add(getSaat());
        getJp2().add(getSaat1());
        getJp2().add(getSaat2());
        getJp2().add(getSaat3());
        getJp2().add(getSaat4());
        getJp2().add(getSaat5());
        getJp2().add(getSaat6());
        getJp2().add(getSaat7());
        getJp2().add(getSaat8());
        getJp2().add(getSaat9());
        getJp2().add(getSaat10());
        getJp2().add(getSaat11());
        getJp2().add(getSaat12());
        getJp2().add(getSaat13());
        getJp2().add(getSaat14());
        getJp2().add(getSaat15());
        getJp2().add(getSave());
        getJp2().add(getDelete2());
        getJp2().add(getCancel());
        getJp3().add(getLinkPasswordRefresh());
        getJf().setVisible(false);
    }

    public JFrame getJf() {
        if (jf == null) {
            jf = new JFrame();
            jf.setSize(490, 600);
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
            jp3.setBounds(0, 440, 490, 80);
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

    public JLabel getBaslik() {
        if (Baslik == null) {
            Baslik = new JLabel("Randevu Bilgileri");
            Baslik.setBounds(120, 20, 300, 40);
            Baslik.setFont(new Font("Georgia", Font.PLAIN, 30));
        }
        return Baslik;
    }

    public void setBaslik(JLabel baslik) {
        this.Baslik = baslik;
    }

    public JLabel getHastaAdi() {
        if (HastaAdi == null) {
            HastaAdi = new JLabel("Hasta Adı :");
            HastaAdi.setBounds(50, 40, 150, 20);
            HastaAdi.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return HastaAdi;
    }

    public void setHastaAdi(JLabel hasta_adi) {
        this.HastaAdi = hasta_adi;
    }

    public JLabel getHastaSoyadi() {
        if (HastaSoyadi == null) {
            HastaSoyadi = new JLabel("Hasta Soyadı :");
            HastaSoyadi.setBounds(50, 90, 150, 20);
            HastaSoyadi.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return HastaSoyadi;
    }

    public void setHastaSoyadi(JLabel hasta_soyadi) {
        this.HastaSoyadi = hasta_soyadi;
    }

    public JLabel getSehir() {
        if (Sehir == null) {
            Sehir = new JLabel("Şehir :");
            Sehir.setBounds(50, 140, 150, 20);
            Sehir.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Sehir;
    }

    public void setSehir(JLabel sehir) {
        this.Sehir = sehir;
    }

    public JLabel getHastane() {
        if (Hastane == null) {
            Hastane = new JLabel("Hastane :");
            Hastane.setBounds(50, 190, 150, 20);
            Hastane.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Hastane;
    }

    public void setHastane(JLabel hastane) {
        this.Hastane = hastane;
    }

    public JLabel getKlinik() {
        if (Klinik == null) {
            Klinik = new JLabel("Klinik :");
            Klinik.setBounds(50, 240, 150, 20);
            Klinik.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Klinik;
    }

    public void setKlinik(JLabel klinik) {
        this.Klinik = klinik;
    }

    public JLabel getDoktor() {
        if (Doktor == null) {
            Doktor = new JLabel("Doktor :");
            Doktor.setBounds(50, 290, 150, 20);
            Doktor.setFont(new Font("Georgia", Font.PLAIN, 18));
        }
        return Doktor;
    }

    public void setDoktor(JLabel doktor) {
        this.Doktor = doktor;
    }

    public JLabel getRandevuSaat() {
        if (RandevuSaat == null) {
            RandevuSaat = new JLabel("Randevu Saatleri");
            RandevuSaat.setBounds(165, 400, 160, 20);
            RandevuSaat.setVisible(false);
            RandevuSaat.setFont(new Font("Georgia", Font.PLAIN, 20));
        }
        return RandevuSaat;
    }

    public void setRandevuSaat(JLabel randevu_saat) {
        this.RandevuSaat = randevu_saat;
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

    public JButton getDelete() {
        if (Delete == null) {
            Delete = new JButton("Temizle");
            Icon DeleteButton = new ImageIcon(getClass().getResource("Eraser.png"));
            Delete.setBounds(50, 340, 140, 40);
            Delete.setVisible(true);
            Delete.setIcon(DeleteButton);
            Delete.setHorizontalAlignment(SwingConstants.LEFT);
            Delete.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Delete.setFont(new Font("Georgia", Font.PLAIN, 18));
            Delete.addActionListener(a);
        }
        return Delete;
    }

    public void setDelete(JButton delete) {
        this.Delete = delete;
    }

    public JButton getSearch() {
        if (Search == null) {
            Search = new JButton("Randevu Ara");
            Icon SearchButton = new ImageIcon(getClass().getResource("Look.png"));
            Search.setBounds(255, 340, 180, 40);
            Search.setVisible(true);
            Search.setEnabled(false);
            Search.setIcon(SearchButton);
            Search.setHorizontalAlignment(SwingConstants.LEFT);
            Search.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Search.setFont(new Font("Georgia", Font.PLAIN, 18));
            Search.addActionListener(a);
        }
        return Search;
    }

    public void setSearch(JButton search) {
        this.Search = search;
    }

    public JButton getLinkPasswordRefresh() {
        if (LinkPasswordRefresh == null) {
            LinkPasswordRefresh = new JButton("Şifre Yenile");
            LinkPasswordRefresh.setBounds(25, 25, 120, 30);
            LinkPasswordRefresh.setVisible(true);
            LinkPasswordRefresh.setCursor(new Cursor(Cursor.HAND_CURSOR));
            LinkPasswordRefresh.setFont(new Font("Georgia", Font.PLAIN, 18));
            LinkPasswordRefresh.setForeground(Color.getHSBColor(.5f, 1f, 10f).darker());
            LinkPasswordRefresh.setBackground(Color.getHSBColor(.5f, 0.9f, 0.6f).darker());
            LinkPasswordRefresh.setBorder(null);
            LinkPasswordRefresh.addActionListener(a);
        }
        return LinkPasswordRefresh;
    }

    public void setLinkPasswordRefresh(JButton link_password_refresh) {
        this.LinkPasswordRefresh = link_password_refresh;
    }

    public JTextField getHastaAdiAlani() {
        if (HastaAdiAlani == null) {
            HastaAdiAlani = new JTextField();
            HastaAdiAlani.setBounds(185, 40, 250, 25);
            HastaAdiAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return HastaAdiAlani;
    }

    public void setHastaAdiAlani(JTextField hasta_adi_alani) {
        this.HastaAdiAlani = hasta_adi_alani;
    }

    public JTextField getHastaSoyadiAlani() {
        if (HastaSoyadiAlani == null) {
            HastaSoyadiAlani = new JTextField();
            HastaSoyadiAlani.setBounds(185, 90, 250, 25);
            HastaSoyadiAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
        }
        return HastaSoyadiAlani;
    }

    public void setHastaSoyadiAlani(JTextField hasta_soyadi_alani) {
        this.HastaSoyadiAlani = hasta_soyadi_alani;
    }

    public JComboBox getSehirAlani() {
        if (SehirAlani == null) {
            SehirAlani = new JComboBox();
            SehirAlani.setBounds(185, 140, 250, 25);
            SehirAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
            SehirAlani.addActionListener(a);
        }
        return SehirAlani;
    }

    public void setSehirAlani(JComboBox sehir_alani) {
        this.SehirAlani = sehir_alani;
    }

    public JComboBox getHastaneAlani() {
        if (HastaneAlani == null) {
            HastaneAlani = new JComboBox();
            HastaneAlani.setBounds(185, 190, 250, 25);
            HastaneAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
            HastaneAlani.addActionListener(a);
        }
        return HastaneAlani;
    }

    public void setHastaneAlani(JComboBox hastane_alani) {
        this.HastaneAlani = hastane_alani;
    }

    public JComboBox getKlinikAlani() {
        if (KlinikAlani == null) {
            KlinikAlani = new JComboBox();
            KlinikAlani.setBounds(185, 240, 250, 25);
            KlinikAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
            KlinikAlani.addActionListener(a);
        }
        return KlinikAlani;
    }

    public void setKlinikAlani(JComboBox klinik_alani) {
        this.KlinikAlani = klinik_alani;
    }

    public JComboBox getDoktorAlani() {
        if (DoktorAlani == null) {
            DoktorAlani = new JComboBox();
            DoktorAlani.setBounds(185, 290, 250, 25);
            DoktorAlani.setFont(new Font("Georgia", Font.PLAIN, 16));
            DoktorAlani.addActionListener(a);
        }
        return DoktorAlani;
    }

    public void setDoktorAlani(JComboBox doktor_alani) {
        this.DoktorAlani = doktor_alani;
    }

    public JButton getSave() {
        if (Save == null) {
            Save = new JButton("Kaydet");
            Icon SaveButton = new ImageIcon(getClass().getResource("tick.png"));
            Save.setBounds(330, 640, 120, 40);
            Save.setVisible(false);
            Save.setIcon(SaveButton);
            Save.setHorizontalAlignment(SwingConstants.LEFT);
            Save.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Save.setFont(new Font("Georgia", Font.PLAIN, 18));
            Save.addActionListener(a);
        }
        return Save;
    }

    public void setSave(JButton save) {
        this.Save = save;
    }

    public JButton getDelete2() {
        if (Delete2 == null) {
            Delete2 = new JButton("Temizle");
            Icon Delete2Button = new ImageIcon(getClass().getResource("Eraser.png"));
            Delete2.setBounds(40, 640, 140, 40);
            Delete2.setVisible(false);
            Delete2.setIcon(Delete2Button);
            Delete2.setHorizontalAlignment(SwingConstants.LEFT);
            Delete2.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Delete2.setFont(new Font("Georgia", Font.PLAIN, 18));
            Delete2.addActionListener(a);
        }
        return Delete2;
    }

    public void setDelete2(JButton delete2) {
        this.Delete2 = delete2;
    }

    public JButton getCancel() {
        if (Cancel == null) {
            Cancel = new JButton("İptal");
            Icon CancelButton = new ImageIcon(getClass().getResource("x.png"));
            Cancel.setBounds(200, 640, 110, 40);
            Cancel.setVisible(false);
            Cancel.setIcon(CancelButton);
            Cancel.setHorizontalAlignment(SwingConstants.LEFT);
            Cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Cancel.setFont(new Font("Georgia", Font.PLAIN, 18));
            Cancel.addActionListener(a);
        }
        return Cancel;
    }

    public void setCancel(JButton cancel) {
        this.Cancel = cancel;
    }

    public JButton getSaat() {
        if (Saat == null) {
            Saat = new JButton("09:00");
            Saat.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat.setVisible(false);
            Saat.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat.setBackground(Color.getHSBColor(114, 1, 60));
            Saat.setEnabled(false);
        }
        return Saat;
    }

    public void setSaat(JButton saat) {
        this.Saat = saat;
    }

    public JButton getSaat1() {
        if (Saat1 == null) {
            Saat1 = new JButton("09:30");
            Saat1.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat1.setVisible(false);
            Saat1.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat1.setBackground(Color.green.darker());
            Saat1.addActionListener(a);
        }
        return Saat1;
    }

    public void setSaat1(JButton saat1) {
        this.Saat1 = saat1;
    }

    public JButton getSaat2() {
        if (Saat2 == null) {
            Saat2 = new JButton("10:00");
            Saat2.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat2.setVisible(false);
            Saat2.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat2.setBackground(Color.green.darker());
            Saat2.addActionListener(a);
        }
        return Saat2;
    }

    public void setSaat2(JButton saat2) {
        this.Saat2 = saat2;
    }

    public JButton getSaat3() {
        if (Saat3 == null) {
            Saat3 = new JButton("10:30");
            Saat3.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat3.setVisible(false);
            Saat3.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat3.setBackground(Color.green.darker());
            Saat3.addActionListener(a);
        }
        return Saat3;
    }

    public void setSaat3(JButton saat3) {
        this.Saat3 = saat3;
    }

    public JButton getSaat4() {
        if (Saat4 == null) {
            Saat4 = new JButton("11:00");
            Saat4.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat4.setVisible(false);
            Saat4.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat4.setBackground(Color.getHSBColor(114, 1, 60));
            Saat4.setEnabled(false);
        }
        return Saat4;
    }

    public void setSaat4(JButton saat4) {
        this.Saat4 = saat4;
    }

    public JButton getSaat5() {
        if (Saat5 == null) {
            Saat5 = new JButton("11:30");
            Saat5.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat5.setVisible(false);
            Saat5.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat5.setBackground(Color.getHSBColor(114, 1, 60));
            Saat5.setEnabled(false);
        }
        return Saat5;
    }

    public void setSaat5(JButton saat5) {
        this.Saat5 = saat5;
    }

    public JButton getSaat6() {
        if (Saat6 == null) {
            Saat6 = new JButton("12:00");
            Saat6.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat6.setVisible(false);
            Saat6.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat6.setBackground(Color.green.darker());
            Saat6.addActionListener(a);
        }
        return Saat6;
    }

    public void setSaat6(JButton saat6) {
        this.Saat6 = saat6;
    }

    public JButton getSaat7() {
        if (Saat7 == null) {
            Saat7 = new JButton("13:00");
            Saat7.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat7.setVisible(false);
            Saat7.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat7.setBackground(Color.green.darker());
            Saat7.addActionListener(a);
        }
        return Saat7;
    }

    public void setSaat7(JButton saat7) {
        this.Saat7 = saat7;
    }

    public JButton getSaat8() {
        if (Saat8 == null) {
            Saat8 = new JButton("13:30");
            Saat8.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat8.setVisible(false);
            Saat8.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat8.setBackground(Color.green.darker());
            Saat8.addActionListener(a);
        }
        return Saat8;
    }

    public void setSaat8(JButton saat8) {
        this.Saat8 = saat8;
    }

    public JButton getSaat9() {
        if (Saat9 == null) {
            Saat9 = new JButton("14:00");
            Saat9.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat9.setVisible(false);
            Saat9.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat9.setBackground(Color.green.darker());
            Saat9.addActionListener(a);
        }
        return Saat9;
    }

    public void setSaat9(JButton saat9) {
        this.Saat9 = saat9;
    }

    public JButton getSaat10() {
        if (Saat10 == null) {
            Saat10 = new JButton("14:30");
            Saat10.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat10.setVisible(false);
            Saat10.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat10.setBackground(Color.green.darker());
            Saat10.addActionListener(a);
        }
        return Saat10;
    }

    public void setSaat10(JButton saat10) {
        this.Saat10 = saat10;
    }

    public JButton getSaat11() {
        if (Saat11 == null) {
            Saat11 = new JButton("15:00");
            Saat11.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat11.setVisible(false);
            Saat11.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat11.setBackground(Color.getHSBColor(114, 1, 60));
            Saat11.setEnabled(false);
        }
        return Saat11;
    }

    public void setSaat11(JButton saat11) {
        this.Saat11 = saat11;
    }

    public JButton getSaat12() {
        if (Saat12 == null) {
            Saat12 = new JButton("15:30");
            Saat12.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat12.setVisible(false);
            Saat12.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat12.setBackground(Color.green.darker());
            Saat12.addActionListener(a);
        }
        return Saat12;
    }

    public void setSaat12(JButton saat12) {
        this.Saat12 = saat12;
    }

    public JButton getSaat13() {
        if (Saat13 == null) {
            Saat13 = new JButton("16:00");
            Saat13.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat13.setVisible(false);
            Saat13.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat13.setBackground(Color.green.darker());
            Saat13.addActionListener(a);
        }
        return Saat13;
    }

    public void setSaat13(JButton saat13) {
        this.Saat13 = saat13;
    }

    public JButton getSaat14() {
        if (Saat14 == null) {
            Saat14 = new JButton("16:30");
            Saat14.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat14.setVisible(false);
            Saat14.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat14.setBackground(Color.getHSBColor(114, 1, 60));
            Saat14.setEnabled(false);
        }
        return Saat14;
    }

    public void setSaat14(JButton saat14) {
        this.Saat14 = saat14;
    }

    public JButton getSaat15() {
        if (Saat15 == null) {
            Saat15 = new JButton("17:00");
            Saat15.setFont(new Font("Georgia", Font.PLAIN, 18));
            Saat15.setVisible(false);
            Saat15.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Saat15.setBackground(Color.getHSBColor(114, 1, 60));
            Saat15.setEnabled(false);
        }
        return Saat15;
    }

    public void setSaat15(JButton saat15) {
        this.Saat15 = saat15;
    }
}

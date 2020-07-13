package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Main extends JFrame {
    Main() {
        this.setSize(width, height);
        this.setTitle("Milionerzy");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("ja.jpg"));
    }



    public void initComponents() {
        panel.setLayout(new GridLayout(2, 2));
        panel.add(odpA);
        panel.add(odpB);
        panel.add(odpC);
        panel.add(odpD);

        panel2.add(pytania);
        kontener2.add(panel2, BorderLayout.PAGE_START);
        kontener.add(panel);
        kontener.setSize(width / 2, height / 2);

        pytania.setFont(new Font("SansSerif", Font.PLAIN, 15));
        pytania.setText("Czy chcą mnie Państwo lepiej poznać?");
        odpA.setText("TAK!");
        odpB.setText("Oczywiście!");
        odpC.setText("Pewnie!");
        odpD.setText("Może trochę");
        odpA.addActionListener(new Button());
        odpB.addActionListener(new Button());
        odpC.addActionListener(new Button());
        odpD.addActionListener(new Button());

    }

    private Container kontener = getContentPane();
    private Container kontener2 = getContentPane();
    private JPanel panel = new JPanel();
    private JLabel pytania = new JLabel();
    private JButton odpA = new JButton();
    private JButton odpB = new JButton();
    private JButton odpC = new JButton();
    private JButton odpD = new JButton();
    private JPanel panel2 = new JPanel();
    private int i = 0;
    private int height = 200;
    private int width = 800;

    private class Button extends JButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            i++;
            if (i < 12) {
                new Pytania(i);
            } else if (i == 12) {
                pytania.setText("<html><p>Mój numer telefonu to:<br/> 607 611 615<br/>byłym bardzo wdzięczny za kontakt :)</p></html>");
                odpA.setText("Zadzwonimy :)");
                odpB.setText("Kiedyś się odezwiemy");
                odpC.setText("Do zobaczenia!");
                odpD.setText("Witaj w zespole :)");
            } else {
                System.exit(0);
            }

        }

    }

    private class Pytania {
        Pytania(int i) {
            String[] pyt = new String[12];
            pyt[1] = "Czy zainteresowała Was moja aplikacja?";
            pyt[2] = "<html><p>Czy mimo tego, że jest ona prymitywna,<br/> pokazuje chociaż odrobinę mojego potencjału?</p></html>";
            pyt[3] = "<html><p>Czy w Waszej firmie jest miejsce dla jednego stażysty, <br/> który z chęcią się nauczy wielu nowych rzeczy?</p></html>";
            pyt[4] = "Jestem osobą, która:";
            pyt[5] = "Studiuję:";
            pyt[6] = "Uczę się Javy, ponieważ: ";
            pyt[7] = "Moim hobby, poza programowaniem jest:";
            pyt[8] = "Mam 5 z:";
            pyt[9] = "Dlaczego nadaję się do tej pracy jak nikt inny:";
            pyt[10] = "Moje oczekiwania finansowe:";
            pyt[11] = "Super! Dotarliście Państwo do końca, czy checie poznać najważniejszą rzecz w tej pracy?";

            new Odpowiedzi(i);
            pytania.setText(pyt[i]);
        }
    }

    private class Odpowiedzi {
        Odpowiedzi(int i) {
            if (i == 1) {
                odpA.setText("Oczywiście!");
                odpB.setText("Damy Ci szansę :)");
                odpC.setText("Odrobinę");
                odpD.setText("TAK!");
            }
            if (i == 2) {
                odpA.setText("Pokazuje całkiem sporo");
                odpB.setText("Trzeba Cię jeszcze sprawdzić");
                odpC.setText("Myślimy, że coś wykrzesamy");
                odpD.setText("Zobaczymy :)");
            }
            if (i == 3) {
                odpA.setText("Musimy sprawdzić");
                odpB.setText("Dla Ciebie coś się może znajdzie");
                odpC.setText("Jest, miedzy biurkami :P");
                odpD.setText("Może, może...");
            }
            if (i == 4) {
                odpA.setText("jest pogodna i łatwo się uczy");
                odpB.setText("dużo się uśmiecha i nie ma problemów z nauką nowych rzeczy");
                odpC.setText("łatwo się uczy i jest pogodna");
                odpD.setText("nie ma problemów z nauką nowych rzeczy i dużo się uśmiecha");
            }
            if (i == 5) {
                odpA.setText("Automatykę");
                odpB.setText("na Pwr");
                odpC.setText("na Wydziale Elektrycznym");
                odpD.setText("na pierwszym roku (chociaż już prawie drugim)");
            }
            if (i == 6) {
                odpA.setText("lubię");
                odpB.setText("jest moim hobby");
                odpC.setText("programowanie mnie \"kręci\"");
                odpD.setText("wolę to niż grać na komputerze");
            }
            if (i == 7) {
                odpA.setText("gra w warcaby");
                odpB.setText("gra na fortepianie");
                odpC.setText("gra w tenisa stołowego");
                odpD.setText("gra we Frisbee");
            }
            if (i == 8) {
                odpA.setText("Analizy matematycznej 1 i 2");
                odpB.setText("Fizyki 1 i 2");
                odpC.setText("Sieci komputerowych");
                odpD.setText("Obwodów elektrycznych");
            }
            if (i == 9) {
                odpA.setText("Programowanie to moja pasja");
                odpB.setText("Nie wymagam wiele, głównym celem jest nauka");
                odpC.setText("Zawsze wprowadzam wesołą atmosferę w zespole");
                odpD.setText("Potrafię szybko myśleć i znajdywać rozwiązania problemów");
            }
            if (i == 10) {
                odpA.setText("Niewielkie");
                odpB.setText("Za darmo prawie");
                odpC.setText("Żeby na obiadki starczyło");
                odpD.setText("Nawet bezpłatnie bym się skusił");
            }
            if (i == 11) {
                odpA.setText("Najważniejsza jest pasja, ale zobaczymy :)");
                odpB.setText("Z przyjemnością");
                odpC.setText("Jak najbardziej");
                odpD.setText("Zaryzykujemy ");
            }


        }
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}

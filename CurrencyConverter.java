

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter extends JFrame {
    CurrencyConverter() {
        welcomescreen();
        setTitle("CURRENCY CONVERTER");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 50, 800, 500);

        ImageIcon icon = new ImageIcon("welcome.png");
        setIconImage(icon.getImage());
        
        Container c = getContentPane();
        Color bg=new Color(230,240,129);
        c.setBackground(bg);

        c.setLayout(null);
        setResizable(false);

        JLabel l1, l2, l3;
        l1 = new JLabel("CURRENCY CONVERTER");
        l1.setBounds(200, 50, 300, 50);
        l1.setFont(new Font("Tahoma", Font.BOLD, 24));
        c.add(l1);
        l2 = new JLabel();
        l3 = new JLabel();
        l2.setBounds(100, 100, 250, 35);
        l2.setFont(new Font("Tahoma", 1, 18));
        l2.setText("From currency Of");
        l3.setBounds(400, 100, 250, 35);
        l3.setFont(new Font("Tahoma", 1, 18));
        l3.setText("To currency Of");
        c.add(l2);
        c.add(l3);

        JComboBox<String> c1 = new JComboBox<>(new String[] { "Choose One...", "USA", "Nigeria", "Brazil", "Canada", "Kenyan",
                "Indonesia", "India", "Philippine", "Pakistan" });
        c1.setBounds(100, 150, 200, 30);
        c.add(c1);

        JComboBox<String> c2 = new JComboBox<>(new String[] { "Choose One...", "USA", "Nigeria", "Brazil", "Canada", "Kenyan",
                "Indonesia", "India", "Philippine", "Pakistan" });
        c2.setBounds(400, 150, 200, 30);
        c.add(c2);

        JTextField t1 = new JTextField();
        t1.setBounds(100, 220, 200, 40);
        Font f1 = new FontUIResource("Tahoma", Font.PLAIN, 18);
        t1.setFont(f1);
        
        c.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(400, 220, 200, 40);
        t2.setFont(f1);
        c.add(t2);

        JLabel l4, l5;
        l4 = new JLabel("units");
        l5 = new JLabel("units");
        l4.setBounds(100, 255, 100, 25);
        l5.setBounds(400, 255, 100, 25);
        c.add(l4);
        c.add(l5);

        double US_Dollar = 1.31;
        double Nigerian_Naira = 538.08;
        double Brazilian_Real = 7.41;
        double Canadian_Dollar = 1.68;
        double Kenyan_Shilling = 147.53;
        double Indonesian_Rupiah = 19029.06;
        double Indian_Rupee = 98.57;
        double Philippine_Peso = 66.10;
        double Pakistani_Rupee = 231.41;

        String[] currencyUnits = {
                "Units",
                "US Dollar",
                "Nigerian Naira",
                "Brazilian Real",
                "Canadian Dollar",
                "Kenyan Shilling",
                "Indonesian Rupiah",
                "Indian Rupee",
                "Philippine Peso",
                "Pakistani rupee",
        };
        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                l4.setText(currencyUnits[c1.getSelectedIndex()]);
            }
        });

        c2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                l5.setText(currencyUnits[c2.getSelectedIndex()]);
            }
        });

        JButton b1 = new JButton("CONVERT");
        b1.setBounds(200, 350, 150, 50);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        c.add(b1);
        b1.setFont(new java.awt.Font("Tahoma", 1, 18));

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            
                     double amountToChange = Double.parseDouble(t1.getText());
                
                
                
                 double amountChanged = 0.0;
                 double amountInPounds = 0.0;

                switch (c1.getSelectedItem().toString()) {
                    case "USA":
                        amountInPounds = amountToChange / US_Dollar;
                        break;
                    case "Nigeria":
                        amountInPounds = amountToChange / Nigerian_Naira;
                        break;
                    case "Brazil":
                        amountInPounds = amountToChange / Brazilian_Real;
                        break;
                    case "Canada":
                        amountInPounds = amountToChange / Canadian_Dollar;
                        break;
                    case "Kenyan":
                        amountInPounds = amountToChange / Kenyan_Shilling;
                        break;
                    case "Indonesia":
                        amountInPounds = amountToChange / Indonesian_Rupiah;
                        break;
                    case "India":
                        amountInPounds = amountToChange / Indian_Rupee;
                        break;
                    case "Philippine":
                        amountInPounds = amountToChange / Philippine_Peso;
                        break;
                    case "Pakistan":
                        amountInPounds = amountToChange / Pakistani_Rupee;
                        break;
                    default:
                        amountInPounds = 0.0;
                }
        
                switch (c2.getSelectedItem().toString()) {
                    case "USA":
                        amountChanged = amountInPounds * US_Dollar;
                        break;
                    case "Nigeria":
                        amountChanged = amountInPounds * Nigerian_Naira;
                        break;
                    case "Brazil":
                        amountChanged = amountInPounds * Brazilian_Real;
                        break;
                    case "Canada":
                        amountChanged = amountInPounds * Canadian_Dollar;
                        break;
                    case "Kenyan":
                        amountChanged = amountInPounds * Kenyan_Shilling;
                        break;
                    case "Indonesia":
                        amountChanged = amountInPounds * Indonesian_Rupiah;
                        break;
                    case "India":
                        amountChanged = amountInPounds * Indian_Rupee;
                        break;
                    case "Philippine":
                        amountChanged = amountInPounds * Philippine_Peso;
                        break;
                    case "Pakistan":
                        amountChanged = amountInPounds * Pakistani_Rupee;
                        break;
                    default:
                        amountChanged = amountInPounds * 0.0;
                }
                String value = String.format("%.2f", amountChanged);
                t2.setText(value);
            }
        }
        );
        JButton b2 = new JButton();
        b2.setBounds(380, 350, 150, 50);
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        c.add(b2);
        b2.setFont(new Font("Tahoma", 1, 18));
        b2.setText("RESET");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                c1.setSelectedIndex(0);
                c2.setSelectedIndex(0);
                t1.setText("");
                t2.setText("");
                String message;
                message = "Data has been cleared";

                JDialog cleardialog = new JDialog();
                cleardialog.setBounds(500, 400, 200, 200);

                Label clearmessage = new Label(message);
                clearmessage.setBounds(10, 0, 190, 100);

                cleardialog.add(clearmessage);
                Button ok = new Button("Ok");
                ok.setBounds(75, 100, 50, 20);
                cleardialog.add(ok);
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cleardialog.setVisible(false);
                    }
                });

                cleardialog.setLayout(null);
                cleardialog.setVisible(true);
            }
        });
        setLayout(null);
    }
    public static void main(String[] args) {
        new CurrencyConverter();

    }
   
    private void welcomescreen() {
        final JWindow w = new JWindow(this);
        w.setBounds(100, 50, 800, 500);
        w.setVisible(true);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        w.add(p);
        ImageIcon i = new ImageIcon("welcome.png");
        JLabel label = new JLabel(i);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        p.add(label);
        JLabel label1 = new JLabel("WELCOME TO CURRENCY CONVERTER");
        label1.setFont(new Font("Tahoma", Font.BOLD, 30));
        label1.setBounds(200, 350, 400, 30);
        p.add(label1);
        p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JProgressBar progress = new JProgressBar(0, 100);
        progress.setForeground(Color.GREEN);
        w.add(BorderLayout.PAGE_END, progress);
        w.revalidate();
        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x = progress.getValue();
                if (x == 100) {
                    w.dispose();
                    CurrencyConverter.this.setVisible(true);
                    timer.stop();
                } else {
                    progress.setValue(x + 2);
                }
            }
        });
        timer.start();
    }
    Timer timer;
}

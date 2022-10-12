package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame f = new JFrame("PC BUILDER");
        f.setBackground(Color.white);
        ImageIcon im22 = new ImageIcon("src/com/company/images/img22.png");
        JLabel l300 = new JLabel(im22);
        l300.setBounds(320,50,530,200);
        JLabel l301 = new JLabel("Start Building Your Own Custom PC");
        l301.setBounds(480,160,300,300);
        JButton b0 = new JButton("Start");
        b0.setBounds(1050,620,100,50);
        b0.setBackground(Color.lightGray);
        b0.setForeground(Color.black);
        JTextField t1 = new JTextField();
        t1.setBounds(280,445,200,30);
        JLabel l302 = new JLabel("E-mail Adress :");
        l302.setBounds(150,420,120,80);

        JPanel p0 = new JPanel();
        p0.add(l300);
        p0.add(l301);
        p0.add(b0);
        p0.add(t1);
        p0.add(l302);
        p0.setLayout(null);
        p0.setBackground(Color.orange);
        f.add(p0);
        p0.setVisible(true);
        // start of CPU
        JLabel l1 = new JLabel("               Image");
        JLabel l2 = new JLabel("Product");
        JLabel l3 = new JLabel("Core");
        JLabel l4 = new JLabel("Clock");
        JLabel l5 = new JLabel("Price ($)");
        JLabel l6 = new JLabel("Select");
        // I7 12700K
        ImageIcon im1 = new ImageIcon("src/com/company/images/img1.png");
        JLabel l7 = new JLabel(im1);
        JLabel l8 = new JLabel("Intel i7 12700K");
        JLabel l9 = new JLabel("12 Core");
        JLabel l10 = new JLabel("3.6 GHz");
        JLabel l11 = new JLabel("415");
        JRadioButton r1 = new JRadioButton();
        r1.setActionCommand("415");
        //AMD 5 5600G
        ImageIcon im2 = new ImageIcon("src/com/company/images/img2.png");
        JLabel l12 = new JLabel(im2);
        JLabel l13 = new JLabel("AMD RYZEN 5 5600 G");
        JLabel l14 = new JLabel("6 Core");
        JLabel l15 = new JLabel("3.9 GHz");
        JLabel l16 = new JLabel("260");
        JRadioButton r2 = new JRadioButton();
        r2.setActionCommand("260");
        // AMD 9 5900X
        ImageIcon im3 = new ImageIcon("src/com/company/images/img3.png");
        JLabel l17 = new JLabel(im3);
        JLabel l18 = new JLabel("AMD RYZEN 9 5900X");
        JLabel l19 = new JLabel("12 Core");
        JLabel l20 = new JLabel("3.7 GHz");
        JLabel l21 = new JLabel("500");
        JRadioButton r3 = new JRadioButton();
        r3.setActionCommand("500");
        // I9 11900
        ImageIcon im4 = new ImageIcon("src/com/company/images/img4.png");
        JLabel l22 = new JLabel(im4);
        JLabel l23 = new JLabel("Intel Core i9 11900");
        JLabel l24 = new JLabel("8 Core");
        JLabel l25 = new JLabel("2.5 GHz");
        JLabel l26 = new JLabel("450");
        JRadioButton r4 = new JRadioButton();
        r4.setActionCommand("450");
        // bos
        JLabel l27 = new JLabel("");
        JLabel l28 = new JLabel("");
        JLabel l29 = new JLabel("");
        JLabel l30 = new JLabel("");
        JLabel l31 = new JLabel("");
        JButton b1 = new JButton("Next");
        JPanel p = new JPanel();
        // f.add(p);
        //p.setVisible(true);
        p.setBackground(Color.ORANGE);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        bg1.add(r3);
        bg1.add(r4);

        //p.setSize(1000,600);

        p.setLayout(new GridLayout(6,6));
        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        p.add(l5);
        p.add(l6);
        p.add(l7);
        p.add(l8);
        p.add(l9);
        p.add(l10);
        p.add(l11);
        p.add(r1);
        p.add(l12);
        p.add(l13);
        p.add(l14);
        p.add(l15);
        p.add(l16);
        p.add(r2);
        p.add(l17);
        p.add(l18);
        p.add(l19);
        p.add(l20);
        p.add(l21);
        p.add(r3);
        p.add(l22);
        p.add(l23);
        p.add(l24);
        p.add(l25);
        p.add(l26);
        p.add(r4);
        p.add(l27);
        p.add(l28);
        p.add(l29);
        p.add(l30);
        p.add(l31);
        p.add(b1);


        p.setBackground(Color.white);
        r1.setBackground(Color.white);
        r2.setBackground(Color.white);
        r3.setBackground(Color.white);
        r4.setBackground(Color.white);
        b1.setSize(150,50);



        // start of memory
        JLabel l32 = new JLabel("              Image");
        JLabel l33 = new JLabel("Product");
        JLabel l34 = new JLabel("Speed");
        JLabel l35 = new JLabel("Color");
        JLabel l36 = new JLabel("Price ($)");
        JLabel l37 = new JLabel("Select");

        // corsair 32gb
        ImageIcon im5 = new ImageIcon("src/com/company/images/img5.png");
        JLabel l38 = new JLabel(im5);
        JLabel l39 = new JLabel("CORSAIR 32 GB (2 X 16GB)");
        JLabel l40 = new JLabel("DDR4 3600");
        JLabel l41 = new JLabel("RGB");
        JLabel l42 = new JLabel("200");
        JRadioButton r5 = new JRadioButton();
        r5.setActionCommand("200");

        // corsair 16gb
        ImageIcon im6 = new ImageIcon("src/com/company/images/img6.png");
        JLabel l43 = new JLabel(im6);
        JLabel l44 = new JLabel("CORSAIR 16 GB (2 x 8GB)");
        JLabel l45 = new JLabel("DDR4 4000");
        JLabel l46 = new JLabel("RED");
        JLabel l47 = new JLabel("120");
        JRadioButton r6 = new JRadioButton();
        r6.setActionCommand("120");
        // g skill 16gb
        ImageIcon im7 = new ImageIcon("src/com/company/images/img7.png");
        JLabel l48 = new JLabel(im7);
        JLabel l49 = new JLabel("G SKİLL 16 GB (2 x 8GB)");
        JLabel l50 = new JLabel("DDR4 3200");
        JLabel l51 = new JLabel("BLACK");
        JLabel l52 = new JLabel("80");
        JRadioButton r7 = new JRadioButton();
        r7.setActionCommand("80");
        // kingston 16gb
        ImageIcon im8 = new ImageIcon("src/com/company/images/img8.png");
        JLabel l53 = new JLabel(im8);
        JLabel l54 = new JLabel("Kingston 16 GB");
        JLabel l55 = new JLabel("DDR5 4800");
        JLabel l56 = new JLabel("BLACK");
        JLabel l57 = new JLabel("400");
        JRadioButton r8 = new JRadioButton();
        r8.setActionCommand("400");
        // bos
        JButton B2 = new JButton("Back");
        JLabel l59 = new JLabel("");
        JLabel l60 = new JLabel("");
        JLabel l61 = new JLabel("");
        JLabel l62 = new JLabel("");
        JButton b2 = new JButton("Next");

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(r5);
        bg2.add(r6);
        bg2.add(r7);
        bg2.add(r8);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(6,6));
        p2.add(l32);
        p2.add(l33);
        p2.add(l34);
        p2.add(l35);
        p2.add(l36);
        p2.add(l37);
        p2.add(l38);
        p2.add(l39);
        p2.add(l40);
        p2.add(l41);
        p2.add(l42);
        p2.add(r5);
        p2.add(l43);
        p2.add(l44);
        p2.add(l45);
        p2.add(l46);
        p2.add(l47);
        p2.add(r6);
        p2.add(l48);
        p2.add(l49);
        p2.add(l50);
        p2.add(l51);
        p2.add(l52);
        p2.add(r7);
        p2.add(l53);
        p2.add(l54);
        p2.add(l55);
        p2.add(l56);
        p2.add(l57);
        p2.add(r8);
        p2.add(B2);
        p2.add(l59);
        p2.add(l60);
        p2.add(l61);
        p2.add(l62);
        p2.add(b2);
        p2.setBackground(Color.white);
        r5.setBackground(Color.white);
        r6.setBackground(Color.white);
        r7.setBackground(Color.white);
        r8.setBackground(Color.white);


        // start of video cards
        JLabel l64 = new JLabel("             Image");
        JLabel l65 = new JLabel("Product");
        JLabel l66 = new JLabel("Memory");
        JLabel l67 = new JLabel("Boost Clock");
        JLabel l68 = new JLabel("Price ($)");
        JLabel l69 = new JLabel("Select");

        // asus rtx3060
        ImageIcon im9 = new ImageIcon("src/com/company/images/img9.png");
        JLabel l70 = new JLabel(im9);
        JLabel l71 = new JLabel("Asus GEFORCE RTX 3060");
        JLabel l72 = new JLabel("12 GB");
        JLabel l73 = new JLabel("1807 MHz");
        JLabel l74 = new JLabel("500");
        JRadioButton r9 = new JRadioButton();
        r9.setActionCommand("500");

        // sapphire rx6600
        ImageIcon im10 = new ImageIcon("src/com/company/images/img10.png");
        JLabel l75 = new JLabel(im10);
        JLabel l76 = new JLabel("Sapphire Radeon RX 6600");
        JLabel l77 = new JLabel("8 GB");
        JLabel l78 = new JLabel("2622 MHz");
        JLabel l79 = new JLabel("750");
        JRadioButton r10 = new JRadioButton();
        r10.setActionCommand("750");

        // zotac rtx 3070
        ImageIcon im11 = new ImageIcon("src/com/company/images/img11.png");
        JLabel l80 = new JLabel(im11);
        JLabel l81 = new JLabel("Zotac GEFORCE RTX 3070");
        JLabel l82 = new JLabel("8 GB");
        JLabel l83 = new JLabel("1755 MHz");
        JLabel l84 = new JLabel("1000");
        JRadioButton r11 = new JRadioButton();
        r11.setActionCommand("1000");

        // msı rtx3060 ti
        ImageIcon im12 = new ImageIcon("src/com/company/images/img12.png");
        JLabel l85 = new JLabel(im12);
        JLabel l86 = new JLabel("MSI GEFORCE RTX 3060 TI");
        JLabel l87 = new JLabel("8 GB");
        JLabel l88 = new JLabel("1770 MHz");
        JLabel l89 = new JLabel("900");
        JRadioButton r12 = new JRadioButton();
        r12.setActionCommand("900");

        // nvidia 1080 ti
        ImageIcon im13 = new ImageIcon("src/com/company/images/img13.png");
        JLabel l90 = new JLabel(im13);
        JLabel l91 = new JLabel("GIGABYTE GEFORCE RTX 2060");
        JLabel l92 = new JLabel("6 GB");
        JLabel l93 = new JLabel("1400 MHz");
        JLabel l94 = new JLabel("600");
        JRadioButton r13 = new JRadioButton();
        r13.setActionCommand("900");

        // bos
        JButton B3 = new JButton("Back");
        JLabel l95 = new JLabel("");
        JLabel l96 = new JLabel("");
        JLabel l97 = new JLabel("");
        JLabel l98 = new JLabel("");
        JButton b3 = new JButton("Next");

        ButtonGroup bg3 = new ButtonGroup();
        bg3.add(r9);
        bg3.add(r10);
        bg3.add(r11);
        bg3.add(r12);
        bg3.add(r13);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(7,6));

        p3.add(l64);
        p3.add(l65);
        p3.add(l66);
        p3.add(l67);
        p3.add(l68);
        p3.add(l69);
        p3.add(l70);
        p3.add(l71);
        p3.add(l72);
        p3.add(l73);
        p3.add(l74);
        p3.add(r9);
        p3.add(l75);
        p3.add(l76);
        p3.add(l77);
        p3.add(l78);
        p3.add(l79);
        p3.add(r10);
        p3.add(l80);
        p3.add(l81);
        p3.add(l82);
        p3.add(l83);
        p3.add(l84);
        p3.add(r11);
        p3.add(l85);
        p3.add(l86);
        p3.add(l87);
        p3.add(l88);
        p3.add(l89);
        p3.add(r12);
        p3.add(l90);
        p3.add(l91);
        p3.add(l92);
        p3.add(l93);
        p3.add(l94);
        p3.add(r13);
        p3.add(B3);
        p3.add(l95);
        p3.add(l96);
        p3.add(l97);
        p3.add(l98);
        p3.add(b3);
        p3.setBackground(Color.white);
        r9.setBackground(Color.white);
        r10.setBackground(Color.white);
        r11.setBackground(Color.white);
        r12.setBackground(Color.white);
        r13.setBackground(Color.white);


        // start of motherboard
        JLabel l110 = new JLabel("             Image");
        JLabel l111 = new JLabel("Product");
        JLabel l112 = new JLabel("Form Factor");
        JLabel l113 = new JLabel("Memory Max");
        JLabel l114 = new JLabel("Price ($)");
        JLabel l115 = new JLabel("Select");

        // msi b550 amd
        ImageIcon im14 = new ImageIcon("src/com/company/images/img14.png");
        JLabel l116 = new JLabel(im14);
        JLabel l117 = new JLabel("MSI MAG B550 AMD");
        JLabel l118 = new JLabel("AM4");
        JLabel l119 = new JLabel("128 GB");
        JLabel l120 = new JLabel("150");
        JRadioButton r14 = new JRadioButton();
        r14.setActionCommand("150");

        // asus b550 amd
        ImageIcon im15 = new ImageIcon("src/com/company/images/img15.png");
        JLabel l121 = new JLabel(im15);
        JLabel l122 = new JLabel("ASUS GAMİNG B550 AMD");
        JLabel l123 = new JLabel("AM4");
        JLabel l124 = new JLabel("128 GB");
        JLabel l125 = new JLabel("220");
        JRadioButton r15 = new JRadioButton();
        r15.setActionCommand("220");

        // msi z590 intel
        ImageIcon im16 = new ImageIcon("src/com/company/images/img16.png");
        JLabel l126 = new JLabel(im16);
        JLabel l127 = new JLabel("MSI Z590 ATX INTEL");
        JLabel l128 = new JLabel("ATX");
        JLabel l129 = new JLabel("128 GB");
        JLabel l130 = new JLabel("200");
        JRadioButton r16 = new JRadioButton();
        r16.setActionCommand("200");

        // gigabyte z690 intel
        ImageIcon im17 = new ImageIcon("src/com/company/images/img17.png");
        JLabel l131 = new JLabel(im17);
        JLabel l132 = new JLabel("GIGABYTE Z690 INTEL");
        JLabel l133 = new JLabel("ATX");
        JLabel l134 = new JLabel("128 GB");
        JLabel l135 = new JLabel("380");
        JRadioButton r17 = new JRadioButton();
        r17.setActionCommand("380");

        // bos
        JButton B4 = new JButton("Back");
        JLabel l136 = new JLabel("");
        JLabel l137 = new JLabel("");
        JLabel l138 = new JLabel("");
        JLabel l139 = new JLabel("");
        JButton b4 = new JButton("Next");

        ButtonGroup bg4 = new ButtonGroup();
        bg4.add(r14);
        bg4.add(r15);
        bg4.add(r16);
        bg4.add(r17);

        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(6,3));

        p4.add(l110);
        p4.add(l111);
        p4.add(l112);
        p4.add(l113);
        p4.add(l114);
        p4.add(l115);
        p4.add(l115);
        p4.add(l116);
        p4.add(l117);
        p4.add(l118);
        p4.add(l119);
        p4.add(l120);
        p4.add(r14);
        p4.add(l121);
        p4.add(l122);
        p4.add(l123);
        p4.add(l124);
        p4.add(l125);
        p4.add(r15);
        p4.add(l126);
        p4.add(l127);
        p4.add(l128);
        p4.add(l129);
        p4.add(l130);
        p4.add(r16);
        p4.add(l131);
        p4.add(l132);
        p4.add(l133);
        p4.add(l134);
        p4.add(l135);
        p4.add(r17);
        p4.add(B4);
        p4.add(l136);
        p4.add(l137);
        p4.add(l138);
        p4.add(l139);
        p4.add(b4);
        p4.setBackground(Color.white);
        r14.setBackground(Color.white);
        r15.setBackground(Color.white);
        r16.setBackground(Color.white);
        r17.setBackground(Color.white);
        JPanel p5 = new JPanel();



        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter your e-mail address.");
                }
                else {
                    p0.setVisible(false);
                    f.add(p);
                }

            }
        });



        // first next button
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(bg1.getSelection()==null){
                    JOptionPane.showMessageDialog(null,"Please select a CPU");
                }
                else{
                    p.setVisible(false);
                    f.add(p2);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(bg2.getSelection()==null){
                    JOptionPane.showMessageDialog(null,"Please select a Memory");
                }
                else {
                    p2.setVisible(false);
                    f.add(p3);
                }

            }
        });

        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.remove(p2);
                p.setVisible(true);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(bg3.getSelection()==null){
                    JOptionPane.showMessageDialog(null,"Please select a Video Card");
                }
                else {
                    p3.setVisible(false);
                    f.add(p4);
                }

            }
        });


        B3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // p3.setVisible(false);
                f.remove(p3);
                p2.setVisible(true);
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bg4.getSelection() == null) {
                    JOptionPane.showMessageDialog(null, "Please select a MotherBoard");
                }

                else {
                    if (bg1.getSelection().getActionCommand() == r1.getActionCommand() & (bg4.getSelection().getActionCommand() == r14.getActionCommand() | bg4.getSelection().getActionCommand() == r15.getActionCommand())) {
                        JOptionPane.showMessageDialog(null, "Choose MotherBoard for Intel CPU ");
                    }
                    else if (bg1.getSelection().getActionCommand() == r2.getActionCommand() & (bg4.getSelection().getActionCommand() == r16.getActionCommand() | bg4.getSelection().getActionCommand() == r17.getActionCommand())){
                        JOptionPane.showMessageDialog(null, "Choose MotherBoard for AMD CPU ");
                    }
                    else if (bg1.getSelection().getActionCommand() == r3.getActionCommand() & (bg4.getSelection().getActionCommand() == r16.getActionCommand() | bg4.getSelection().getActionCommand() == r17.getActionCommand())){
                        JOptionPane.showMessageDialog(null, "Choose MotherBoard for AMD CPU ");
                    }
                    else if (bg1.getSelection().getActionCommand() == r4.getActionCommand() & (bg4.getSelection().getActionCommand() == r14.getActionCommand() | bg4.getSelection().getActionCommand() == r15.getActionCommand())) {
                        JOptionPane.showMessageDialog(null, "Choose MotherBoard for Intel CPU ");
                    }
                    else {
                        p4.setVisible(false);
                        f.add(p5);

                        int a = Integer.parseInt(bg1.getSelection().getActionCommand());
                        float b = Integer.parseInt(bg2.getSelection().getActionCommand());
                        int c = Integer.parseInt(bg3.getSelection().getActionCommand());
                        int d = Integer.parseInt(bg4.getSelection().getActionCommand());
                        float totalprice = a + b + c + d;
                        JLabel l99 = new JLabel(String.valueOf(totalprice) + " $");

                        // for cpu
                        JLabel l100 = new JLabel();
                        if (bg1.getSelection().getActionCommand() == r1.getActionCommand()) {
                            l100.setText(l8.getText());
                        } else if (bg1.getSelection().getActionCommand() == r2.getActionCommand()) {
                            l100.setText(l13.getText());
                        } else if (bg1.getSelection().getActionCommand() == r3.getActionCommand()) {
                            l100.setText(l18.getText());
                        } else if (bg1.getSelection().getActionCommand() == r4.getActionCommand()) {
                            l100.setText(l23.getText());
                        }

                        // for memory
                        JLabel l101 = new JLabel();
                        if (bg2.getSelection().getActionCommand() == r5.getActionCommand()) {
                            l101.setText(l39.getText());
                        } else if (bg2.getSelection().getActionCommand() == r6.getActionCommand()) {
                            l101.setText(l44.getText());
                        } else if (bg2.getSelection().getActionCommand() == r7.getActionCommand()) {
                            l101.setText(l49.getText());
                        } else if (bg2.getSelection().getActionCommand() == r8.getActionCommand()) {
                            l101.setText(l54.getText());
                        }

                        // for video cards
                        JLabel l102 = new JLabel();
                        if (bg3.getSelection().getActionCommand() == r9.getActionCommand()) {
                            l102.setText(l71.getText());
                        } else if (bg3.getSelection().getActionCommand() == r10.getActionCommand()) {
                            l102.setText(l76.getText());
                        } else if (bg3.getSelection().getActionCommand() == r11.getActionCommand()) {
                            l102.setText(l81.getText());
                        } else if (bg3.getSelection().getActionCommand() == r12.getActionCommand()) {
                            l102.setText(l86.getText());
                        } else if (bg3.getSelection().getActionCommand() == r13.getActionCommand()) {
                            l102.setText(l91.getText());
                        }


                        // for motherboard
                        JLabel l103 = new JLabel();
                        if (bg4.getSelection().getActionCommand() == r14.getActionCommand()) {
                            l103.setText(l117.getText());
                        } else if (bg4.getSelection().getActionCommand() == r15.getActionCommand()) {
                            l103.setText(l122.getText());
                        } else if (bg4.getSelection().getActionCommand() == r16.getActionCommand()) {
                            l103.setText(l127.getText());
                        } else if (bg4.getSelection().getActionCommand() == r17.getActionCommand()) {
                            l103.setText(l132.getText());
                        }

                        p5.setLayout(new GridLayout(6, 3));
                        ImageIcon im18 = new ImageIcon("src/com/company/images/img18.png");
                        JLabel l200 = new JLabel(im18);
                        ImageIcon im19 = new ImageIcon("src/com/company/images/img19.png");
                        JLabel l201 = new JLabel(im19);
                        ImageIcon im20 = new ImageIcon("src/com/company/images/img20.png");
                        JLabel l202 = new JLabel(im20);
                        ImageIcon im21 = new ImageIcon("src/com/company/images/img21.png");
                        JLabel l203 = new JLabel(im21);

                        JLabel l204 = new JLabel("");
                        JLabel l205 = new JLabel("Selected Product");
                        JLabel l206 = new JLabel("Price");

                        JLabel l207 = new JLabel(bg1.getSelection().getActionCommand());
                        JLabel l208 = new JLabel(bg2.getSelection().getActionCommand());
                        JLabel l209 = new JLabel(bg3.getSelection().getActionCommand());
                        JLabel l210 = new JLabel(bg4.getSelection().getActionCommand());

                        JLabel l211 = new JLabel("");
                        JLabel l212 = new JLabel("Total Price :");

                        p5.add(l204);
                        p5.add(l205);
                        p5.add(l206);
                        p5.add(l200);
                        p5.add(l100);
                        p5.add(l207);
                        p5.add(l201);
                        p5.add(l101);
                        p5.add(l208);
                        p5.add(l202);
                        p5.add(l102);
                        p5.add(l209);
                        p5.add(l203);
                        p5.add(l103);
                        p5.add(l210);
                        p5.add(l211);
                        p5.add(l212);
                        p5.add(l99);

                        p5.setBackground(Color.WHITE);
                        f.add(p5);
                        JOptionPane.showMessageDialog(null,"The computer has been successfully created. Please check your e-mail(" + t1.getText() + ").");
                    }
                }
            }
        });


        B4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.remove(p4);
                p3.setVisible(true);
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1200,750);
        f.setVisible(true);


    }

}

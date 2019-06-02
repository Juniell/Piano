import java.awt.*;
import java.awt.event.*;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Jun 02 03:04:48 MSK 2019
 */

public class Piano extends JFrame {
    public Piano() {
        setTitle("Фортепиано");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(60, 80);
        Thread.sleep(400);
        channels[6].noteOff(60);
    }

    private void button3MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(62, 80);
        Thread.sleep(400);
        channels[6].noteOff(62);
    }

    private void button4MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(64, 80);
        Thread.sleep(400);
        channels[6].noteOff(64);
    }

    private void button5MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(65, 80);
        Thread.sleep(400);
        channels[6].noteOff(65);
    }

    private void button7MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(67, 80);
        Thread.sleep(400);
        channels[6].noteOff(67);
    }

    private void button8MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(69, 80);
        Thread.sleep(400);
        channels[6].noteOff(69);
    }

    private void button9MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(71, 80);
        Thread.sleep(400);
        channels[6].noteOff(71);
    }

    private void button10MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(72, 80);
        Thread.sleep(400);
        channels[6].noteOff(72);
    }

    private void button14MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(61, 80);
        Thread.sleep(400);
        channels[6].noteOff(61);
    }

    private void button6MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(63, 80);
        Thread.sleep(400);
        channels[6].noteOff(63);
    }

    private void button11MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(66, 80);
        Thread.sleep(400);
        channels[6].noteOff(6);
    }

    private void button12MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(68, 80);
        Thread.sleep(400);
        channels[6].noteOff(68);
    }

    private void button13MouseClicked(MouseEvent e) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[6].noteOn(70, 80);
        Thread.sleep(400);
        channels[6].noteOff(70);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - tea
        button14 = new JButton();
        button6 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button1 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();

        //======== this ========
        setTitle("\u0424\u043e\u0440\u0442\u0435\u043f\u0438\u0430\u043d\u043e");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button14 ----
        button14.setBackground(Color.black);
        button14.setIcon(null);
        button14.setFont(new Font("Dialog", Font.BOLD, 15));
        button14.setVerticalAlignment(SwingConstants.BOTTOM);
        button14.setForeground(Color.white);
        button14.setText("C#");
        button14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button14MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button14);
        button14.setBounds(50, 20, 55, 150);

        //---- button6 ----
        button6.setBackground(Color.black);
        button6.setFont(new Font("Dialog", Font.BOLD, 15));
        button6.setVerticalAlignment(SwingConstants.BOTTOM);
        button6.setForeground(Color.white);
        button6.setText("D#");
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button6MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button6);
        button6.setBounds(120, 20, 55, 150);

        //---- button11 ----
        button11.setBackground(Color.black);
        button11.setFont(new Font("Dialog", Font.BOLD, 15));
        button11.setVerticalAlignment(SwingConstants.BOTTOM);
        button11.setForeground(Color.white);
        button11.setText("F#");
        button11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button11MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button11);
        button11.setBounds(260, 20, 55, 150);

        //---- button12 ----
        button12.setBackground(Color.black);
        button12.setFont(new Font("Dialog", Font.BOLD, 15));
        button12.setVerticalAlignment(SwingConstants.BOTTOM);
        button12.setForeground(Color.white);
        button12.setText("G#");
        button12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button12MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button12);
        button12.setBounds(330, 20, 55, 150);

        //---- button13 ----
        button13.setBackground(Color.black);
        button13.setFont(new Font("Dialog", Font.BOLD, 15));
        button13.setVerticalAlignment(SwingConstants.BOTTOM);
        button13.setForeground(Color.white);
        button13.setText("A#");
        button13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button13MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button13);
        button13.setBounds(400, 20, 55, 150);

        //---- button1 ----
        button1.setForeground(Color.black);
        button1.setBackground(Color.white);
        button1.setText("C");
        button1.setFont(new Font("Dialog", Font.BOLD, 30));
        button1.setVerticalAlignment(SwingConstants.BOTTOM);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button1MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button1);
        button1.setBounds(5, 180, 73, 265);

        //---- button3 ----
        button3.setForeground(Color.black);
        button3.setBackground(Color.white);
        button3.setFont(new Font("Dialog", Font.BOLD, 30));
        button3.setText("D");
        button3.setVerticalAlignment(SwingConstants.BOTTOM);
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button3MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button3);
        button3.setBounds(75, 180, 73, 265);

        //---- button4 ----
        button4.setBackground(Color.white);
        button4.setForeground(Color.black);
        button4.setFont(new Font("Dialog", Font.BOLD, 30));
        button4.setText("E");
        button4.setVerticalAlignment(SwingConstants.BOTTOM);
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button4MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button4);
        button4.setBounds(145, 180, 73, 265);

        //---- button5 ----
        button5.setBackground(Color.white);
        button5.setForeground(Color.black);
        button5.setFont(new Font("Dialog", Font.BOLD, 30));
        button5.setText("F");
        button5.setVerticalAlignment(SwingConstants.BOTTOM);
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button5MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button5);
        button5.setBounds(215, 180, 73, 265);

        //---- button7 ----
        button7.setBackground(Color.white);
        button7.setForeground(Color.black);
        button7.setFont(new Font("Dialog", Font.BOLD, 30));
        button7.setText("G");
        button7.setVerticalAlignment(SwingConstants.BOTTOM);
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button7MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button7);
        button7.setBounds(285, 180, 73, 265);

        //---- button8 ----
        button8.setBackground(Color.white);
        button8.setForeground(Color.black);
        button8.setFont(new Font("Dialog", Font.BOLD, 30));
        button8.setText("A");
        button8.setVerticalAlignment(SwingConstants.BOTTOM);
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button8MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button8);
        button8.setBounds(355, 180, 73, 265);

        //---- button9 ----
        button9.setBackground(Color.white);
        button9.setForeground(Color.black);
        button9.setFont(new Font("Dialog", Font.BOLD, 30));
        button9.setText("B");
        button9.setVerticalAlignment(SwingConstants.BOTTOM);
        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button9MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button9);
        button9.setBounds(425, 180, 73, 265);

        //---- button10 ----
        button10.setBackground(Color.white);
        button10.setForeground(Color.black);
        button10.setFont(new Font("Dialog", Font.BOLD, 30));
        button10.setText("C1");
        button10.setVerticalAlignment(SwingConstants.BOTTOM);
        button10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button10MouseClicked(e);
                } catch (MidiUnavailableException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(button10);
        button10.setBounds(495, 180, 73, 265);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - tea
    private JButton button14;
    private JButton button6;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button1;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.pack();
        piano.setVisible(true);
    }
}

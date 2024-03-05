import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {

    private JLabel text = new JLabel("0");


    UI() {
        setSize(750, 750);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        JButton button1 = new JButton("7");
        button1.setBounds(50, 150, 100, 100);
        button1.setBackground(new Color(47, 212, 162));
        add(button1);
        JButton button2 = new JButton("8");
        button2.setBounds(200, 150, 100, 100);
        button2.setBackground(new Color(47, 212, 162));
        add(button2);
        JButton button3 = new JButton("9");
        button3.setBounds(350, 150, 100, 100);
        button3.setBackground(new Color(47, 212, 162));
        add(button3);
        JButton button4 = new JButton("4");
        button4.setBounds(50, 300, 100, 100);
        button4.setBackground(new Color(47, 212, 162));
        add(button4);
        JButton button5 = new JButton("5");
        button5.setBounds(200, 300, 100, 100);
        button5.setBackground(new Color(47, 212, 162));
        add(button5);
        JButton button6 = new JButton("6");
        button6.setBounds(350, 300, 100, 100);
        button6.setBackground(new Color(47, 212, 162));
        add(button6);
        JButton button7 = new JButton("1");
        button7.setBounds(50, 450, 100, 100);
        button7.setBackground(new Color(47, 212, 162));
        add(button7);
        JButton button8 = new JButton("2");
        button8.setBounds(200, 450, 100, 100);
        button8.setBackground(new Color(47, 212, 162));
        add(button8);
        JButton button9 = new JButton("3");
        button9.setBounds(350, 450, 100, 100);
        button9.setBackground(new Color(47, 212, 162));
        add(button9);
        JButton button0 = new JButton("0");
        button0.setBounds(200, 590, 100, 100);
        button0.setBackground(new Color(47, 212, 162));
        add(button0);
        JButton button10 = new JButton("/");
        button10.setBackground(new Color(47, 141, 212));
        button10.setBounds(500, 150, 100, 100);
        add(button10);
        JButton button11 = new JButton("*");
        button11.setBackground(new Color(47, 141, 212));
        button11.setBounds(500, 300, 100, 100);
        add(button11);
        JButton button12 = new JButton("-");
        button12.setBackground(new Color(47, 141, 212));
        button12.setBounds(500, 450, 100, 100);
        add(button12);
        JButton button13 = new JButton("+");
        button13.setBounds(500, 590, 100, 100);
        button13.setBackground(new Color(47, 141, 212));
        add(button13);
        JButton button14 = new JButton("=");
        button14.setBounds(350, 590, 100, 100);
        button14.setBackground(new Color(47, 141, 212));
        add(button14);
        JButton button15 = new JButton("C");
        button15.setBounds(50, 590, 100, 100);
        button15.setBackground(new Color(84, 82, 92));
        add(button15);
        text.setBounds(50, 25, 100, 100);
        add(text);


        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

        String num1;
        String sign;
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if(text.getText().equals("0"))
                text.setText("");

            switch (b.getText()){
                case "1":
                    text.setText(text.getText()+"1");
                    break;
                case "2":
                    text.setText(text.getText()+"2");
                    break;
                case "3":
                    text.setText(text.getText()+"3");
                    break;
                case "4":
                    text.setText(text.getText()+"4");
                    break;
                case "5":
                    text.setText(text.getText()+"5");
                    break;
                case "6":
                    text.setText(text.getText()+"6");
                    break;
                case "7":
                    text.setText(text.getText()+"7");
                    break;
                case "8":
                    text.setText(text.getText()+"8");
                    break;
                case "9":
                    text.setText(text.getText()+"9");
                    break;
                case "0":
                    text.setText(text.getText()+"0");
                    break;
                case "+":
                    num1= text.getText();
                    sign = "+";
                    text.setText("");
                    break;
                case "-":
                    num1= text.getText();
                    sign = "-";
                    text.setText("");
                    break;
                case "*":
                    num1= text.getText();
                    sign = "*";
                    text.setText("");
                    break;
                case "/":
                    num1= text.getText();
                    sign = "/";
                    text.setText("");
                    break;
                case "C":
                    num1= text.getText();
                    sign = "C";
                    text.setText("");
                    break;
                case "=":
                    String num2 = text.getText();
                    int result = 0;
                    switch (sign) {
                        case "+":
                            result = Integer.valueOf(num1)+Integer.valueOf(num2);
                            break;
                        case "/":
                            result = Integer.valueOf(num1)/Integer.valueOf(num2);
                            break;
                        case "-":
                            result = Integer.valueOf(num1)-Integer.valueOf(num2);
                            break;
                        case "*":
                            result = Integer.valueOf(num1)*Integer.valueOf(num2);
                            break;
                        case "C":
                            result = 0;
                            break;
                    }

                    text.setText(String.valueOf(result));
                    break;
            }

        }
    }




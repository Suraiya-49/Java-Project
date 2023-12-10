

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class TempCal extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JTextField resultField;
	
	double result;
	double number;
	double result1;
	
	private JTextField textField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TempCal frame = new TempCal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TempCal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Iconic Galaxy\\Downloads\\Tamcalicon.jpeg"));
		setTitle("Temperature Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 150, 406, 591);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(112, 128, 144));
		contentPane.setForeground(new Color(112, 128, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		resultField = new JTextField();
		resultField.setFont(new Font("Tahoma", Font.BOLD, 24));
		resultField.setColumns(10);
		resultField.setBounds(12, 201, 365, 71);
		contentPane.add(resultField);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+button_0.getText();
				textField.setText(number);
			}
		});
		button_0.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_0.setBounds(145, 493, 97, 39);
		contentPane.add(button_0);
		
		JButton button_p = new JButton(".");
		button_p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_p.getText();
				textField.setText(number);
			}
		});
		button_p.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_p.setBounds(12, 493, 97, 39);
		contentPane.add(button_p);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_1.getText();
				textField.setText(number);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(12, 441, 97, 39);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_2.getText();
				textField.setText(number);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_2.setBounds(145, 441, 97, 39);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_3.getText();
				textField.setText(number);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_3.setBounds(280, 441, 97, 39);
		contentPane.add(button_3);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_6.getText();
				textField.setText(number);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_6.setBounds(280, 389, 97, 39);
		contentPane.add(button_6);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_5.getText();
				textField.setText(number);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_5.setBounds(145, 389, 97, 39);
		contentPane.add(button_5);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_4.getText();
				textField.setText(number);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_4.setBounds(12, 389, 97, 39);
		contentPane.add(button_4);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_7.getText();
				textField.setText(number);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_7.setBounds(12, 337, 97, 39);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_8.getText();
				textField.setText(number);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_8.setBounds(145, 337, 97, 39);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_9.getText();
				textField.setText(number);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_9.setBounds(280, 337, 97, 39);
		contentPane.add(button_9);
		
		JButton btnDel = new JButton("Del");
		btnDel.setBackground(new Color(153, 51, 51));
		btnDel.setForeground(new Color(255, 255, 255));
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDel.setBounds(280, 285, 97, 39);
		contentPane.add(btnDel);
		
		JButton button_ac = new JButton("AC");
		button_ac.setForeground(new Color(255, 255, 255));
		button_ac.setBackground(new Color(0, 51, 51));
		button_ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				resultField.setText(null);
			}
		});
		button_ac.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_ac.setBounds(145, 285, 97, 39);
		contentPane.add(button_ac);
		
		JButton button_equal = new JButton("=");
		button_equal.setForeground(new Color(255, 255, 255));
		button_equal.setBackground(new Color(0, 0, 0));
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double number = Double.parseDouble(textField.getText());
				String input = (String) comboBox1.getSelectedItem();
	            String output = (String) comboBox2.getSelectedItem();
	            
	            double finalResult;
	            
	            if(input == "Celcius")
	            {
	            	if(output == "Celcius")
	            	{
	            		finalResult =  number;
	            		resultField.setText(String.valueOf(finalResult));
	            	}
	            }
	            if(input == "Celcius")
	            {
	            	if(output == "Fahrenheit")
	            	{
	            		finalResult =  ((number*(9.0/5.0))+32);
	            		resultField.setText(String.valueOf(finalResult));
	            	}
	            }
	            if(input == "Celcius")
	            {
	            	if(output == "Kelvin")
	            	{
	            		finalResult =  number + 273.15;
	            		resultField.setText(String.valueOf(finalResult));
	            	}
	            }
	            if(input == "Fahrenheit")
	            {
	            	if(output == "Celcius")
	            	{
	            		finalResult =  ((number-32)*(5.0/9.0));
	            		resultField.setText(String.valueOf(finalResult));
	            	}
	            }
	            if(input == "Fahrenheit")
	            {
	            	if(output == "Fahrenheit")
	            	{
	            		finalResult =  number;
	            		resultField.setText(String.valueOf(finalResult));
	            	}
	            }
	            if(input == "Fahrenheit")
	            {
	            	if(output == "Kelvin")
	            	{
	            		finalResult =  ((number-32)*(5.0/9.0))+273.15;
	            		resultField.setText(String.valueOf(finalResult));
	            	}
	            }
	            if(input == "Kelvin")
	            {
	            	if(output == "Celcius")
	            	{
	            		finalResult =  number-273.15;
	            		resultField.setText(String.valueOf(finalResult));
	            	}
	            }
	            if(input == "Kelvin")
	            {
	            	if(output == "Fahrenheit")
	            	{
	            		finalResult =  ((number-273.15)*(9.0/5.0)+32);
	            		resultField.setText(String.valueOf(finalResult));
	            	}
	            }
	            if(input == "Kelvin")
	            {
	            	if(output == "Kelvin")
	            	{
	            		finalResult =  number;
	            		resultField.setText(String.valueOf(finalResult));
	            	}
	            }
			}
		});
		button_equal.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_equal.setBounds(280, 493, 97, 39);
		contentPane.add(button_equal);
			
		comboBox1 = new JComboBox();
		comboBox1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox1.setBounds(163, 13, 214, 39);
		contentPane.add(comboBox1);
		
		comboBox1.addItem("Celcius");
		comboBox1.addItem("Fahrenheit");
		comboBox1.addItem("Kelvin");
		
		comboBox2 = new JComboBox();
		comboBox2.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox2.setBounds(163, 149, 214, 39);
		contentPane.add(comboBox2);
		
		comboBox2.addItem("Celcius");
		comboBox2.addItem("Fahrenheit");
		comboBox2.addItem("Kelvin");
		
		JLabel lblMakeYourChoice = new JLabel("Make your choice:");
		lblMakeYourChoice.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMakeYourChoice.setForeground(Color.WHITE);
		lblMakeYourChoice.setBounds(12, 23, 166, 16);
		contentPane.add(lblMakeYourChoice);
		
		JLabel label = new JLabel("Make your choice:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(12, 159, 166, 16);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField.setColumns(10);
		textField.setBounds(12, 65, 365, 71);
		contentPane.add(textField);
		
		
	}
}

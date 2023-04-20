package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Inventar extends JFrame {

	private JPanel contentPane;
	private JFrame inventar;
	private String waffe1 = "Daedrischer Zweihänder";
	private String waffe2 = "Zwergischer Dolch";
	private String waffe3 = "Jagdbogen";
	private String inventarGeoeffnet;
	private JButton btnWaffe3;
	private JButton btnWaffe2;
	private JButton btnWaffe1;
	private JButton btnX1;
	private JButton btnX2;
	private JButton btnX3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventar frame = new Inventar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inventar() {
		setBackground(Color.BLACK);
		setForeground(new Color(64, 0, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 359);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWaffen = new JLabel("Waffen");
		lblWaffen.setForeground(Color.WHITE);
		lblWaffen.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWaffen.setBounds(21, 35, 67, 26);
		contentPane.add(lblWaffen);
		
		JLabel lblRuestung = new JLabel("Rüstung");
		lblRuestung.setForeground(Color.WHITE);
		lblRuestung.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRuestung.setBounds(207, 35, 67, 26);
		contentPane.add(lblRuestung);
		
		JLabel lblSonstiges = new JLabel("Sonstiges");
		lblSonstiges.setForeground(Color.WHITE);
		lblSonstiges.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSonstiges.setBounds(364, 35, 67, 26);
		contentPane.add(lblSonstiges);
		
		btnWaffe3 = new JButton("Jagdbogen");
		btnWaffe3.addActionListener(new Waffen3Listener());
		btnWaffe3.setBounds(21, 149, 119, 21);
		contentPane.add(btnWaffe3);
		
		btnWaffe2 = new JButton("Zwerg Dolch");
		btnWaffe3.addActionListener(new Waffen2Listener());
		btnWaffe2.setBounds(21, 118, 119, 21);
		contentPane.add(btnWaffe2);
		
		btnWaffe1 = new JButton("Daedr. Zweihänder");
		btnWaffe3.addActionListener(new Waffen1Listener());
		btnWaffe1.setBounds(21, 87, 119, 21);
		contentPane.add(btnWaffe1);
		
		btnX1 = new JButton("X");
		btnX1.setBounds(149, 87, 43, 21);
		contentPane.add(btnX1);
		
		btnX2 = new JButton("X");
		btnX2.setBounds(150, 118, 42, 21);
		contentPane.add(btnX2);
		
		btnX3 = new JButton("X");
		btnX3.setBounds(150, 149, 42, 21);
		contentPane.add(btnX3);
	}
	
	class Waffen3Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
			Spieler s1 = new Spieler();
			s1.setWaffe3("Jagdbogen");
			System.out.println("Waffe 3 gewählt");
			
		}
		
		
		
	}
	
	class Waffen2Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
			Spieler s1 = new Spieler();
			s1.setWaffe2("Zwergischer Dolch");
			System.out.println("Waffe 2 gewählt");
			
		}
		
		
		
	}
	
	class Waffen1Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
			Spieler s1 = new Spieler();
			s1.setWaffe1("Daedrischer Zweihänder");
			System.out.println("Waffe 1 gewählt");
			
		}
		
		
		
	}
	

	public JFrame getInventar() {
		return inventar;
	}

	public void setInventar(JFrame inventar) {
		this.inventar = inventar;
	}

	public String getWaffe1() {
		return waffe1;
	}

	public void setWaffe1(String waffe1) {
		this.waffe1 = waffe1;
	}

	public String getWaffe3() {
		return waffe3;
	}

	public void setWaffe3(String waffe3) {
		this.waffe3 = waffe3;
	}

	public String getWaffe2() {
		return waffe2;
	}

	public void setWaffe2(String waffe2) {
		this.waffe2 = waffe2;
	}

	public String getInventarGeoeffnet() {
		return inventarGeoeffnet;
	}

	public void setInventarGeoeffnet(String inventarGeoeffnet) {
		this.inventarGeoeffnet = inventarGeoeffnet;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

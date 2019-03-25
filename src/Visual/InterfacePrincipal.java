package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;

public class InterfacePrincipal extends JFrame {

	private JPanel contentPane;
	private JButton Led1;
	private JButton Led2;
	private JButton Led3;
	private JButton Led4;
	private JButton Led5;
	private JButton Led6;
	private JButton Led9;
	private JButton Led10;
	private JButton Led7;
	private JButton Led8;
	private JButton Led11;
	private JButton Led12;
	private JButton Led13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfacePrincipal frame = new InterfacePrincipal();
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
	public InterfacePrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\arman\\Downloads\\Box-13-Blue-icon-512_icon-icons.com_52585 (1).png"));
		setTitle("__Cube__3D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(10, 11, 246, 512);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\arman\\Downloads\\Box-13-Blue-icon-512_icon-icons.com_52585 (1).png"));
		lblNewLabel.setBounds(59, 27, 128, 138);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Simular ");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\arman\\Downloads\\camcorder_256_icon-icons.com_76838.png"));
		btnNewButton.setBounds(23, 192, 193, 53);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cargar Animaci\u00F3n");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\arman\\Downloads\\component_video_256_icon-icons.com_76833 (1).png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(23, 272, 193, 53);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Encender Leds");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\arman\\Downloads\\bulb_idea_6103.png"));
		btnNewButton_2.setBounds(23, 352, 193, 53);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Apagar Leds");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\arman\\Downloads\\exit_closethesession_close_6317 (1).png"));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(23, 432, 193, 53);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(266, 374, 597, 149);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Capa Seleccionada:  ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(41, 38, 111, 19);
		panel_2.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Capa 1", "Capa 2", "Capa 3", "Capa 4", "Capa 5", "Capa 6", "Capa 7", "Capa 8"}));
		comboBox.setBounds(159, 37, 101, 20);
		panel_2.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Orden en la Animaci\u00F3n:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(311, 40, 141, 17);
		panel_2.add(lblNewLabel_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setFocusable(false);
		spinner.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		spinner.setBounds(454, 37, 45, 20);
		panel_2.add(spinner);
		
		Led1 = new JButton("1");
		Led1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led1.setBackground(Color.GRAY);
		Led1.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led1.setBounds(359, 319, 54, 44);
		panel.add(Led1);
		
		Led2 = new JButton("2");
		Led2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led2.setBackground(Color.GRAY);
		Led2.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led2.setBounds(413, 319, 54, 44);
		panel.add(Led2);
		
		Led3 = new JButton("3");
		Led3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led3.setBackground(Color.GRAY);
		Led3.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led3.setBounds(467, 319, 54, 44);
		panel.add(Led3);
		
		Led4 = new JButton("4");
		Led4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led4.setBackground(Color.GRAY);
		Led4.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led4.setBounds(521, 319, 54, 44);
		panel.add(Led4);
		
		Led5 = new JButton("5");
		Led5.setBackground(Color.GRAY);
		Led5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Led5.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led5.setBounds(575, 319, 54, 44);
		panel.add(Led5);
		
		Led6 = new JButton("6");
		Led6.setBackground(Color.GRAY);
		Led6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led6.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led6.setBounds(629, 319, 54, 44);
		panel.add(Led6);
		
		Led9 = new JButton("9");
		Led9.setBackground(Color.GRAY);
		Led9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led9.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led9.setBounds(359, 275, 54, 44);
		panel.add(Led9);
		
		Led10 = new JButton("10");
		Led10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led10.setBackground(Color.GRAY);
		Led10.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led10.setBounds(413, 275, 54, 44);
		panel.add(Led10);
		
		Led7 = new JButton("7");
		Led7.setBackground(Color.GRAY);
		Led7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led7.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led7.setBounds(683, 319, 54, 44);
		panel.add(Led7);
		
		Led8 = new JButton("8");
		Led8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led8.setBackground(Color.GRAY);
		Led8.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led8.setBounds(737, 319, 54, 44);
		panel.add(Led8);
		
		Led11 = new JButton("11");
		Led11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led11.setBackground(Color.GRAY);
		Led11.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led11.setBounds(467, 275, 54, 44);
		panel.add(Led11);
		
		Led12 = new JButton("12");
		Led12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led12.setBackground(Color.GRAY);
		Led12.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led12.setBounds(521, 275, 54, 44);
		panel.add(Led12);
		
		Led13 = new JButton("13");
		Led13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led13.setBackground(Color.GRAY);
		Led13.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led13.setBounds(575, 275, 54, 44);
		panel.add(Led13);
		
		JButton Led14 = new JButton("14");
		Led14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led14.setBackground(Color.GRAY);
		Led14.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led14.setBounds(629, 275, 54, 44);
		panel.add(Led14);
		
		JButton Led15 = new JButton("15");
		Led15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led15.setBackground(Color.GRAY);
		Led15.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led15.setBounds(683, 275, 54, 44);
		panel.add(Led15);
		
		JButton Led16 = new JButton("16");
		Led16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led16.setBackground(Color.GRAY);
		Led16.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led16.setBounds(737, 275, 54, 44);
		panel.add(Led16);
		
		JButton Led17 = new JButton("17");
		Led17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led17.setBackground(Color.GRAY);
		Led17.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led17.setBounds(359, 231, 54, 44);
		panel.add(Led17);
		
		JButton Led18 = new JButton("18");
		Led18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led18.setBackground(Color.GRAY);
		Led18.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led18.setBounds(413, 231, 54, 44);
		panel.add(Led18);
		
		JButton Led19 = new JButton("19");
		Led19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led19.setBackground(Color.GRAY);
		Led19.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led19.setBounds(467, 231, 54, 44);
		panel.add(Led19);
		
		JButton Led20 = new JButton("20");
		Led20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led20.setBackground(Color.GRAY);
		Led20.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led20.setBounds(521, 231, 54, 44);
		panel.add(Led20);
		
		JButton Led21 = new JButton("21");
		Led21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led21.setBackground(Color.GRAY);
		Led21.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led21.setBounds(575, 231, 54, 44);
		panel.add(Led21);
		
		JButton Led22 = new JButton("22");
		Led22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led22.setBackground(Color.GRAY);
		Led22.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led22.setBounds(629, 231, 54, 44);
		panel.add(Led22);
		
		JButton Led25 = new JButton("25");
		Led25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led25.setBackground(Color.GRAY);
		Led25.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led25.setBounds(359, 187, 54, 44);
		panel.add(Led25);
		
		JButton Led26 = new JButton("26");
		Led26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led26.setBackground(Color.GRAY);
		Led26.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led26.setBounds(413, 187, 54, 44);
		panel.add(Led26);
		
		JButton Led23 = new JButton("23");
		Led23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led23.setBackground(Color.GRAY);
		Led23.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led23.setBounds(683, 231, 54, 44);
		panel.add(Led23);
		
		JButton Led24 = new JButton("24");
		Led24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led24.setBackground(Color.GRAY);
		Led24.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led24.setBounds(737, 231, 54, 44);
		panel.add(Led24);
		
		JButton Led27 = new JButton("27");
		Led27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led27.setBackground(Color.GRAY);
		Led27.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led27.setBounds(467, 187, 54, 44);
		panel.add(Led27);
		
		JButton Led28 = new JButton("28");
		Led28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led28.setBackground(Color.GRAY);
		Led28.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led28.setBounds(521, 187, 54, 44);
		panel.add(Led28);
		
		JButton Led29 = new JButton("29");
		Led29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led29.setBackground(Color.GRAY);
		Led29.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led29.setBounds(575, 187, 54, 44);
		panel.add(Led29);
		
		JButton Led30 = new JButton("30");
		Led30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led30.setBackground(Color.GRAY);
		Led30.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led30.setBounds(629, 187, 54, 44);
		panel.add(Led30);
		
		JButton Led31 = new JButton("31");
		Led31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led31.setBackground(Color.GRAY);
		Led31.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led31.setBounds(683, 187, 54, 44);
		panel.add(Led31);
		
		JButton Led32 = new JButton("32");
		Led32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led32.setBackground(Color.GRAY);
		Led32.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led32.setBounds(737, 187, 54, 44);
		panel.add(Led32);
		
		JButton Led33 = new JButton("33");
		Led33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led33.setBackground(Color.GRAY);
		Led33.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led33.setBounds(359, 143, 54, 44);
		panel.add(Led33);
		
		JButton Led34 = new JButton("34");
		Led34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led34.setBackground(Color.GRAY);
		Led34.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led34.setBounds(413, 143, 54, 44);
		panel.add(Led34);
		
		JButton Led35 = new JButton("35");
		Led35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led35.setBackground(Color.GRAY);
		Led35.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led35.setBounds(467, 143, 54, 44);
		panel.add(Led35);
		
		JButton Led36 = new JButton("36");
		Led36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led36.setBackground(Color.GRAY);
		Led36.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led36.setBounds(521, 143, 54, 44);
		panel.add(Led36);
		
		JButton Led37 = new JButton("37");
		Led37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led37.setBackground(Color.GRAY);
		Led37.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led37.setBounds(575, 143, 54, 44);
		panel.add(Led37);
		
		JButton Led38 = new JButton("38");
		Led38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led38.setBackground(Color.GRAY);
		Led38.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led38.setBounds(629, 143, 54, 44);
		panel.add(Led38);
		
		JButton Led41 = new JButton("41");
		Led41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led41.setBackground(Color.GRAY);
		Led41.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led41.setBounds(359, 99, 54, 44);
		panel.add(Led41);
		
		JButton Led42 = new JButton("42");
		Led42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led42.setBackground(Color.GRAY);
		Led42.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led42.setBounds(413, 99, 54, 44);
		panel.add(Led42);
		
		JButton Led39 = new JButton("39");
		Led39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led39.setBackground(Color.GRAY);
		Led39.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led39.setBounds(683, 143, 54, 44);
		panel.add(Led39);
		
		JButton Led40 = new JButton("40");
		Led40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led40.setBackground(Color.GRAY);
		Led40.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led40.setBounds(737, 143, 54, 44);
		panel.add(Led40);
		
		JButton Led43 = new JButton("43");
		Led43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led43.setBackground(Color.GRAY);
		Led43.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led43.setBounds(467, 99, 54, 44);
		panel.add(Led43);
		
		JButton Led44 = new JButton("44");
		Led44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led44.setBackground(Color.GRAY);
		Led44.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led44.setBounds(521, 99, 54, 44);
		panel.add(Led44);
		
		JButton Led45 = new JButton("45");
		Led45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led45.setBackground(Color.GRAY);
		Led45.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led45.setBounds(575, 99, 54, 44);
		panel.add(Led45);
		
		JButton Led46 = new JButton("46");
		Led46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led46.setBackground(Color.GRAY);
		Led46.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led46.setBounds(629, 99, 54, 44);
		panel.add(Led46);
		
		JButton Led47 = new JButton("47");
		Led47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led47.setBackground(Color.GRAY);
		Led47.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led47.setBounds(683, 99, 54, 44);
		panel.add(Led47);
		
		JButton Led48 = new JButton("48");
		Led48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led48.setBackground(Color.GRAY);
		Led48.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led48.setBounds(737, 99, 54, 44);
		panel.add(Led48);
		
		JButton Led49 = new JButton("49");
		Led49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led49.setBackground(Color.GRAY);
		Led49.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led49.setBounds(359, 55, 54, 44);
		panel.add(Led49);
		
		JButton Led50 = new JButton("50");
		Led50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led50.setBackground(Color.GRAY);
		Led50.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led50.setBounds(413, 55, 54, 44);
		panel.add(Led50);
		
		JButton Led51 = new JButton("51");
		Led51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led51.setBackground(Color.GRAY);
		Led51.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led51.setBounds(467, 55, 54, 44);
		panel.add(Led51);
		
		JButton Led52 = new JButton("52");
		Led52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led52.setBackground(Color.GRAY);
		Led52.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led52.setBounds(521, 55, 54, 44);
		panel.add(Led52);
		
		JButton Led53 = new JButton("53");
		Led53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led53.setBackground(Color.GRAY);
		Led53.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led53.setBounds(575, 55, 54, 44);
		panel.add(Led53);
		
		JButton Led54 = new JButton("54");
		Led54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led54.setBackground(Color.GRAY);
		Led54.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led54.setBounds(629, 55, 54, 44);
		panel.add(Led54);
		
		JButton Led57 = new JButton("57");
		Led57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led57.setBackground(Color.GRAY);
		Led57.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led57.setBounds(359, 11, 54, 44);
		panel.add(Led57);
		
		JButton Led58 = new JButton("58");
		Led58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led58.setBackground(Color.GRAY);
		Led58.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led58.setBounds(413, 11, 54, 44);
		panel.add(Led58);
		
		JButton Led55 = new JButton("55");
		Led55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led55.setBackground(Color.GRAY);
		Led55.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led55.setBounds(683, 55, 54, 44);
		panel.add(Led55);
		
		JButton Led56 = new JButton("56");
		Led56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led56.setBackground(Color.GRAY);
		Led56.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led56.setBounds(737, 55, 54, 44);
		panel.add(Led56);
		
		JButton Led59 = new JButton("59");
		Led59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led59.setBackground(Color.GRAY);
		Led59.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led59.setBounds(467, 11, 54, 44);
		panel.add(Led59);
		
		JButton Led60 = new JButton("60");
		Led60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led60.setBackground(Color.GRAY);
		Led60.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led60.setBounds(521, 11, 54, 44);
		panel.add(Led60);
		
		JButton Led61 = new JButton("61");
		Led61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led61.setBackground(Color.GRAY);
		Led61.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led61.setBounds(575, 11, 54, 44);
		panel.add(Led61);
		
		JButton Led62 = new JButton("62");
		Led62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led62.setBackground(Color.GRAY);
		Led62.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led62.setBounds(629, 11, 54, 44);
		panel.add(Led62);
		
		JButton Led63 = new JButton("63");
		Led63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led63.setBackground(Color.GRAY);
		Led63.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led63.setBounds(683, 11, 54, 44);
		panel.add(Led63);
		
		JButton Led64 = new JButton("64");
		Led64.setBackground(Color.GRAY);
		Led64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Led64.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led64.setBounds(737, 11, 54, 44);
		panel.add(Led64);
	}
}

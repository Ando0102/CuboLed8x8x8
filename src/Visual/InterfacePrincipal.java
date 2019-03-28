package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logic.Animacion;
import Logic.Capa;
import Logic.Cubo;

import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.UIManager;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class InterfacePrincipal extends JFrame {
	
	private static Cubo miCubo;
	private Capa[] miCapa;
	private Animacion animacion;
	private JButton[] leds;
	
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
	private JComboBox<String> comboBox;
	private JButton Led14;
	private JButton Led15;
	private JButton Led16;
	private JButton Led17;
	private JButton Led18;
	private JButton Led19;
	private JButton Led20;
	private JButton Led21;
	private JButton Led22;
	private JButton Led25;
	private JButton Led26;
	private JButton Led23;
	private JButton Led24;
	private JButton Led27;
	private JButton Led28;
	private JButton Led29;
	private JButton Led30;
	private JButton Led31;
	private JButton Led32;
	private JButton Led33;
	private JButton Led34;
	private JButton Led35;
	private JButton Led36;
	private JButton Led37;
	private JButton Led38;
	private JButton Led41;
	private JButton Led42;
	private JButton Led39;
	private JButton Led40;
	private JButton Led43;
	private JButton Led44;
	private JButton Led45;
	private JButton Led46;
	private JButton Led47;
	private JButton Led48;
	private JButton Led49;
	private JButton Led50;
	private JButton Led51;
	private JButton Led52;
	private JButton Led53;
	private JButton Led54;
	private JButton Led57;
	private JButton Led58;
	private JButton Led55;
	private JButton Led56;
	private JButton Led59;
	private JButton Led60;
	private JButton Led61;
	private JButton Led62;
	private JButton Led63;
	private JButton Led64;
	private JLabel lblNewLabel_2;
	private static JComboBox<String> comboBoxAnimaciones;
	private static JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel;
	private JMenu mnSeleccin;
	private JMenuItem mntmNewMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cubo elCubo = new Cubo();
					InterfacePrincipal frame = new InterfacePrincipal(elCubo);
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
	public InterfacePrincipal(Cubo elCubo) {
		setResizable(false);
		this.miCubo = elCubo;
		/////////////////////////////////////CAPA////////////////////////////////////
		 miCapa = new Capa[8];
		 
		for(int i = 0; i<8; i++) {
			Capa aux = new Capa();
			
			miCapa[i] = aux;
			for(int j = 0; j<64 ;j++) {
				miCapa[i].getMisLed()[j] = false;
			}
		}
			
		/////////////////////////////////////////////////////////////////////////////
		setIconImage(Toolkit.getDefaultToolkit().getImage(InterfacePrincipal.class.getResource("/Imagenes/cubo grande.png")));
		setTitle("__Cube__3D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 583);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAnimacion = new JMenu("Animaci\u00F3n");
		menuBar.add(mnAnimacion);
		
		JMenuItem mnNuevaAnimacin = new JMenuItem("Nueva Animaci\u00F3n");
		mnNuevaAnimacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearNuevaAnimacion aux = new CrearNuevaAnimacion(miCubo);
				aux.setVisible(true);
			}
		});
		mnAnimacion.add(mnNuevaAnimacin);
		
		mnSeleccin = new JMenu("Selecci\u00F3n");
		menuBar.add(mnSeleccin);
		
		mntmNewMenuItem = new JMenuItem("Realizar Selecci\u00F3n");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrepararSeleccion aux = new PrepararSeleccion(miCubo);
				aux.setVisible(true);
			}
		});
		mnSeleccin.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(10, 11, 246, 496);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(InterfacePrincipal.class.getResource("/Imagenes/cubo grande.png")));
		lblNewLabel.setBounds(58, 27, 128, 138);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Simular ");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Simulacion aux = new Simulacion(miCubo);
				aux.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(InterfacePrincipal.class.getResource("/Imagenes/camara.png")));
		btnNewButton.setBounds(23, 192, 193, 53);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cargar Animaciones");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setIcon(new ImageIcon(InterfacePrincipal.class.getResource("/Imagenes/cables.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(23, 272, 193, 53);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Encender Leds");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setIcon(new ImageIcon(InterfacePrincipal.class.getResource("/Imagenes/bombillo.png")));
		btnNewButton_2.setBounds(23, 352, 193, 53);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Apagar Leds");
		btnNewButton_3.setIcon(new ImageIcon(InterfacePrincipal.class.getResource("/Imagenes/apagado.png")));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(23, 432, 193, 53);
		panel_1.add(btnNewButton_3);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(266, 390, 632, 117);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Capa Seleccionada:  ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(22, 71, 111, 19);
		panel_2.add(lblNewLabel_1);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Capa 1", "Capa 2", "Capa 3", "Capa 4", "Capa 5", "Capa 6", "Capa 7", "Capa 8"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(143, 70, 101, 20);
		panel_2.add(comboBox);
		
		JButton btnAgregarAnimacion = new JButton("Agregar a la Animaci\u00F3n");
		btnAgregarAnimacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Nombre_de_animacion = "";
				Animacion aux = null;
				
				if(!comboBoxAnimaciones.getSelectedItem().toString().equalsIgnoreCase("No Existe Ninguna Animacion")) {
					Nombre_de_animacion = comboBoxAnimaciones.getSelectedItem().toString();
					
					for(int i = 0; i<miCubo.getMisAnimaciones().size(); i++) {
						if(miCubo.getMisAnimaciones().get(i).getNombre().equalsIgnoreCase(Nombre_de_animacion)) {
							aux = miCubo.getMisAnimaciones().get(i);
						}
					}
					aux.setCapas(miCapa);
					
					miCubo.getMisAnimaciones().add(aux);
					JOptionPane.showMessageDialog(null, " Animación Agregada ", "Infomación", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, " Por Favor, Selecione una Animacion ", "Advertencia", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnAgregarAnimacion.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAgregarAnimacion.setBounds(448, 59, 174, 31);
		panel_2.add(btnAgregarAnimacion);
		
		lblNewLabel_2 = new JLabel("Animaci\u00F3n : ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(22, 22, 111, 25);
		panel_2.add(lblNewLabel_2);
		
		/////////////////////////////////COMBOBOX DINAMICO//////////////////////////////// 
		comboBoxAnimaciones = new JComboBox<String>();
		CargarComboBox();
		comboBoxAnimaciones.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBoxAnimaciones.setBounds(103, 22, 200, 20);
		panel_2.add(comboBoxAnimaciones);

		///////////////////////////////////////////////////////////////////////////////

		comboBoxAnimaciones.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBoxAnimaciones.setBounds(103, 22, 200, 20);
		panel_2.add(comboBoxAnimaciones);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.setBounds(286, 62, 57, 28);
		panel_2.add(btnActualizar);
		btnActualizar.setBackground(UIManager.getColor("Button.background"));
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\arman\\Downloads\\refresh_arrow_1546.png"));
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EstadoDeLeds();
				
			}

		});
	
		
		Led1 = new JButton("1");
		Led1.setBackground(Color.GRAY);
		Led1.setForeground(Color.WHITE);
		Led1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led1.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led1.setBackground(Color.WHITE);
					Led1.setForeground(Color.BLACK);
				}else {
					Led1.setBackground(Color.GRAY);
					Led1.setForeground(Color.WHITE);
				}
				
			}
		});
		Led1.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led1.setBounds(362, 319, 54, 44);
		panel.add(Led1);
		
		Led2 = new JButton("2");
		Led2.setForeground(Color.WHITE);
		Led2.setBackground(Color.GRAY);
		Led2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led2.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led2.setBackground(Color.WHITE);
					Led2.setForeground(Color.BLACK);
				}else {
					Led2.setBackground(Color.GRAY);
					Led2.setForeground(Color.WHITE);
				}
				
			
				
			}
		});
		Led2.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led2.setBounds(416, 319, 54, 44);
		panel.add(Led2);
		
		Led3 = new JButton("3");
		Led3.setForeground(Color.WHITE);
		Led3.setBackground(Color.GRAY);
		Led3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led3.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led3.setBackground(Color.WHITE);
					Led3.setForeground(Color.BLACK);
				}else {
					Led3.setBackground(Color.GRAY);
					Led3.setForeground(Color.WHITE);
				}
				
			}
		});
		Led3.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led3.setBounds(470, 319, 54, 44);
		panel.add(Led3);
		
		Led4 = new JButton("4");
		Led4.setForeground(Color.WHITE);
		Led4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led4.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led4.setBackground(Color.WHITE);
					Led4.setForeground(Color.BLACK);
				}else {
					Led4.setBackground(Color.GRAY);
					Led4.setForeground(Color.WHITE);
				}

			}
		});
		Led4.setBackground(Color.GRAY);
		Led4.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led4.setBounds(524, 319, 54, 44);
		panel.add(Led4);
		
		Led5 = new JButton("5");
		Led5.setForeground(Color.WHITE);
		Led5.setBackground(Color.GRAY);
		Led5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led5.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led5.setBackground(Color.WHITE);
					Led5.setForeground(Color.BLACK);
				}else {
					Led5.setBackground(Color.GRAY);
					Led5.setForeground(Color.WHITE);
				}

			}
		});
		Led5.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led5.setBounds(578, 319, 54, 44);
		panel.add(Led5);
		
		Led6 = new JButton("6");
		Led6.setForeground(Color.WHITE);
		Led6.setBackground(Color.GRAY);
		Led6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led6.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led6.setBackground(Color.WHITE);
					Led6.setForeground(Color.BLACK);
				}else {
					Led6.setBackground(Color.GRAY);
					Led6.setForeground(Color.WHITE);
				}

			}
		});
		Led6.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led6.setBounds(632, 319, 54, 44);
		panel.add(Led6);
		
		Led9 = new JButton("9");
		Led9.setForeground(Color.WHITE);
		Led9.setBackground(Color.GRAY);
		Led9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led9.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led9.setBackground(Color.WHITE);
					Led9.setForeground(Color.BLACK);
				}else {
					Led9.setBackground(Color.GRAY);
					Led9.setForeground(Color.WHITE);
				}

			}
		});
		Led9.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led9.setBounds(362, 275, 54, 44);
		panel.add(Led9);
		
		Led10 = new JButton("10");
		Led10.setForeground(Color.WHITE);
		Led10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led10.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led10.setBackground(Color.WHITE);
					Led10.setForeground(Color.BLACK);
				}else {
					Led10.setBackground(Color.GRAY);
					Led10.setForeground(Color.WHITE);
				}

			}
		});
		Led10.setBackground(Color.GRAY);
		Led10.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led10.setBounds(416, 275, 54, 44);
		panel.add(Led10);
		
		Led7 = new JButton("7");
		Led7.setForeground(Color.WHITE);
		Led7.setBackground(Color.GRAY);
		Led7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led7.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led7.setBackground(Color.WHITE);
					Led7.setForeground(Color.BLACK);
				}else {
					Led7.setBackground(Color.GRAY);
					Led7.setForeground(Color.WHITE);
				}

			}
		});
		Led7.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led7.setBounds(686, 319, 54, 44);
		panel.add(Led7);
		
		Led8 = new JButton("8");
		Led8.setForeground(Color.WHITE);
		Led8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led8.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led8.setBackground(Color.WHITE);
					Led8.setForeground(Color.BLACK);
				}else {
					Led8.setBackground(Color.GRAY);
					Led8.setForeground(Color.WHITE);
				}

			}
		});
		Led8.setBackground(Color.GRAY);
		Led8.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led8.setBounds(740, 319, 54, 44);
		panel.add(Led8);
		
		Led11 = new JButton("11");
		Led11.setForeground(Color.WHITE);
		Led11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led11.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led11.setBackground(Color.WHITE);
					Led11.setForeground(Color.BLACK);
				}else {
					Led11.setBackground(Color.GRAY);
					Led11.setForeground(Color.WHITE);
				}

			}
		});
		Led11.setBackground(Color.GRAY);
		Led11.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led11.setBounds(470, 275, 54, 44);
		panel.add(Led11);
		
		Led12 = new JButton("12");
		Led12.setForeground(Color.WHITE);
		Led12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led12.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led12.setBackground(Color.WHITE);
					Led12.setForeground(Color.BLACK);
				}else {
					Led12.setBackground(Color.GRAY);
					Led12.setForeground(Color.WHITE);
				}

			}
		});
		Led12.setBackground(Color.GRAY);
		Led12.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led12.setBounds(524, 275, 54, 44);
		panel.add(Led12);
		
		Led13 = new JButton("13");
		Led13.setForeground(Color.WHITE);
		Led13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led13.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led13.setBackground(Color.WHITE);
					Led13.setForeground(Color.BLACK);
				}else {
					Led13.setBackground(Color.GRAY);
					Led13.setForeground(Color.WHITE);
				}

			}
		});
		Led13.setBackground(Color.GRAY);
		Led13.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led13.setBounds(578, 275, 54, 44);
		panel.add(Led13);
		
		Led14 = new JButton("14");
		Led14.setForeground(Color.WHITE);
		Led14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led14.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led14.setBackground(Color.WHITE);
					Led14.setForeground(Color.BLACK);
				}else {
					Led14.setBackground(Color.GRAY);
					Led14.setForeground(Color.WHITE);
				}

			}
		});
		Led14.setBackground(Color.GRAY);
		Led14.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led14.setBounds(632, 275, 54, 44);
		panel.add(Led14);
		
		Led15 = new JButton("15");
		Led15.setForeground(Color.WHITE);
		Led15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led15.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led15.setBackground(Color.WHITE);
					Led15.setForeground(Color.BLACK);
				}else {
					Led15.setBackground(Color.GRAY);
					Led15.setForeground(Color.WHITE);
				}

			}
		});
		Led15.setBackground(Color.GRAY);
		Led15.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led15.setBounds(686, 275, 54, 44);
		panel.add(Led15);
		
		Led16 = new JButton("16");
		Led16.setForeground(Color.WHITE);
		Led16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led16.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led16.setBackground(Color.WHITE);
					Led16.setForeground(Color.BLACK);
				}else {
					Led16.setBackground(Color.GRAY);
					Led16.setForeground(Color.WHITE);
				}

			}
		});
		Led16.setBackground(Color.GRAY);
		Led16.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led16.setBounds(740, 275, 54, 44);
		panel.add(Led16);
		
		Led17 = new JButton("17");
		Led17.setForeground(Color.WHITE);
		Led17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led17.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led17.setBackground(Color.WHITE);
					Led17.setForeground(Color.BLACK);
				}else {
					Led17.setBackground(Color.GRAY);
					Led17.setForeground(Color.WHITE);
				}

			}
		});
		Led17.setBackground(Color.GRAY);
		Led17.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led17.setBounds(362, 231, 54, 44);
		panel.add(Led17);
		
		Led18 = new JButton("18");
		Led18.setForeground(Color.WHITE);
		Led18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led1.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led18.setBackground(Color.WHITE);
					Led18.setForeground(Color.BLACK);
				}else {
					Led18.setBackground(Color.GRAY);
					Led18.setForeground(Color.WHITE);
				}

			}
		});
		Led18.setBackground(Color.GRAY);
		Led18.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led18.setBounds(416, 231, 54, 44);
		panel.add(Led18);
		
		Led19 = new JButton("19");
		Led19.setForeground(Color.WHITE);
		Led19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led19.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led19.setBackground(Color.WHITE);
					Led19.setForeground(Color.BLACK);
				}else {
					Led19.setBackground(Color.GRAY);
					Led19.setForeground(Color.WHITE);
				}

			}
		});
		Led19.setBackground(Color.GRAY);
		Led19.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led19.setBounds(470, 231, 54, 44);
		panel.add(Led19);
		
		Led20 = new JButton("20");
		Led20.setForeground(Color.WHITE);
		Led20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led20.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led20.setBackground(Color.WHITE);
					Led20.setForeground(Color.BLACK);
				}else {
					Led20.setBackground(Color.GRAY);
					Led20.setForeground(Color.WHITE);
				}

			}
		});
		Led20.setBackground(Color.GRAY);
		Led20.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led20.setBounds(524, 231, 54, 44);
		panel.add(Led20);
		
		Led21 = new JButton("21");
		Led21.setForeground(Color.WHITE);
		Led21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led21.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led21.setBackground(Color.WHITE);
					Led21.setForeground(Color.BLACK);
				}else {
					Led21.setBackground(Color.GRAY);
					Led21.setForeground(Color.WHITE);
				}

			}
		});
		Led21.setBackground(Color.GRAY);
		Led21.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led21.setBounds(578, 231, 54, 44);
		panel.add(Led21);
		
		Led22 = new JButton("22");
		Led22.setForeground(Color.WHITE);
		Led22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led22.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led22.setBackground(Color.WHITE);
					Led22.setForeground(Color.BLACK);
				}else {
					Led22.setBackground(Color.GRAY);
					Led22.setForeground(Color.WHITE);
				}

			}
		});
		Led22.setBackground(Color.GRAY);
		Led22.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led22.setBounds(632, 231, 54, 44);
		panel.add(Led22);
		
		Led25 = new JButton("25");
		Led25.setForeground(Color.WHITE);
		Led25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led25.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led25.setBackground(Color.WHITE);
					Led25.setForeground(Color.BLACK);
				}else {
					Led25.setBackground(Color.GRAY);
					Led25.setForeground(Color.WHITE);
				}

			}
		});
		Led25.setBackground(Color.GRAY);
		Led25.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led25.setBounds(362, 187, 54, 44);
		panel.add(Led25);
		
		Led26 = new JButton("26");
		Led26.setForeground(Color.WHITE);
		Led26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led26.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led26.setBackground(Color.WHITE);
					Led26.setForeground(Color.BLACK);
				}else {
					Led26.setBackground(Color.GRAY);
					Led26.setForeground(Color.WHITE);
				}

			}
		});
		Led26.setBackground(Color.GRAY);
		Led26.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led26.setBounds(416, 187, 54, 44);
		panel.add(Led26);
		
		Led23 = new JButton("23");
		Led23.setForeground(Color.WHITE);
		Led23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led23.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led23.setBackground(Color.WHITE);
					Led23.setForeground(Color.BLACK);
				}else {
					Led23.setBackground(Color.GRAY);
					Led23.setForeground(Color.WHITE);
				}

			}
		});
		Led23.setBackground(Color.GRAY);
		Led23.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led23.setBounds(686, 231, 54, 44);
		panel.add(Led23);
		
		Led24 = new JButton("24");
		Led24.setForeground(Color.WHITE);
		Led24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led24.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led24.setBackground(Color.WHITE);
					Led24.setForeground(Color.BLACK);
				}else {
					Led24.setBackground(Color.GRAY);
					Led24.setForeground(Color.WHITE);
				}

			}
		});
		Led24.setBackground(Color.GRAY);
		Led24.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led24.setBounds(740, 231, 54, 44);
		panel.add(Led24);
		
		Led27 = new JButton("27");
		Led27.setForeground(Color.WHITE);
		Led27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led27.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led27.setBackground(Color.WHITE);
					Led27.setForeground(Color.BLACK);
				}else {
					Led27.setBackground(Color.GRAY);
					Led27.setForeground(Color.WHITE);
				}

			}
		});
		Led27.setBackground(Color.GRAY);
		Led27.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led27.setBounds(470, 187, 54, 44);
		panel.add(Led27);
		
		Led28 = new JButton("28");
		Led28.setForeground(Color.WHITE);
		Led28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led28.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led28.setBackground(Color.WHITE);
					Led28.setForeground(Color.BLACK);
				}else {
					Led28.setBackground(Color.GRAY);
					Led28.setForeground(Color.WHITE);
				}

			}
		});
		Led28.setBackground(Color.GRAY);
		Led28.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led28.setBounds(524, 187, 54, 44);
		panel.add(Led28);
		
		Led29 = new JButton("29");
		Led29.setForeground(Color.WHITE);
		Led29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led29.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led29.setBackground(Color.WHITE);
					Led29.setForeground(Color.BLACK);
				}else {
					Led29.setBackground(Color.GRAY);
					Led29.setForeground(Color.WHITE);
				}

			}
		});
		Led29.setBackground(Color.GRAY);
		Led29.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led29.setBounds(578, 187, 54, 44);
		panel.add(Led29);
		
		Led30 = new JButton("30");
		Led30.setForeground(Color.WHITE);
		Led30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led30.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led30.setBackground(Color.WHITE);
					Led30.setForeground(Color.BLACK);
				}else {
					Led30.setBackground(Color.GRAY);
					Led30.setForeground(Color.WHITE);
				}

			}
		});
		Led30.setBackground(Color.GRAY);
		Led30.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led30.setBounds(632, 187, 54, 44);
		panel.add(Led30);
		
		Led31 = new JButton("31");
		Led31.setForeground(Color.WHITE);
		Led31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led31.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led31.setBackground(Color.WHITE);
					Led31.setForeground(Color.BLACK);
				}else {
					Led31.setBackground(Color.GRAY);
					Led31.setForeground(Color.WHITE);
				}

			}
		});
		Led31.setBackground(Color.GRAY);
		Led31.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led31.setBounds(686, 187, 54, 44);
		panel.add(Led31);
		
		Led32 = new JButton("32");
		Led32.setForeground(Color.WHITE);
		Led32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led32.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led32.setBackground(Color.WHITE);
					Led32.setForeground(Color.BLACK);
				}else {
					Led32.setBackground(Color.GRAY);
					Led32.setForeground(Color.WHITE);
				}

			}
		});
		Led32.setBackground(Color.GRAY);
		Led32.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led32.setBounds(740, 187, 54, 44);
		panel.add(Led32);
		
		Led33 = new JButton("33");
		Led33.setForeground(Color.WHITE);
		Led33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led33.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led33.setBackground(Color.WHITE);
					Led33.setForeground(Color.BLACK);
				}else {
					Led33.setBackground(Color.GRAY);
					Led33.setForeground(Color.WHITE);
				}

			}
		});
		Led33.setBackground(Color.GRAY);
		Led33.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led33.setBounds(362, 143, 54, 44);
		panel.add(Led33);
		
		Led34 = new JButton("34");
		Led34.setForeground(Color.WHITE);
		Led34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led34.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led34.setBackground(Color.WHITE);
					Led34.setForeground(Color.BLACK);
				}else {
					Led34.setBackground(Color.GRAY);
					Led34.setForeground(Color.WHITE);
				}

			}
		});
		Led34.setBackground(Color.GRAY);
		Led34.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led34.setBounds(416, 143, 54, 44);
		panel.add(Led34);
		
		Led35 = new JButton("35");
		Led35.setForeground(Color.WHITE);
		Led35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led35.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led35.setBackground(Color.WHITE);
					Led35.setForeground(Color.BLACK);
				}else {
					Led35.setBackground(Color.GRAY);
					Led35.setForeground(Color.WHITE);
				}

			}
		});
		Led35.setBackground(Color.GRAY);
		Led35.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led35.setBounds(470, 143, 54, 44);
		panel.add(Led35);
		
		Led36 = new JButton("36");
		Led36.setForeground(Color.WHITE);
		Led36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led36.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led36.setBackground(Color.WHITE);
					Led36.setForeground(Color.BLACK);
				}else {
					Led36.setBackground(Color.GRAY);
					Led36.setForeground(Color.WHITE);
				}

			}
		});
		Led36.setBackground(Color.GRAY);
		Led36.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led36.setBounds(524, 143, 54, 44);
		panel.add(Led36);
		
		Led37 = new JButton("37");
		Led37.setForeground(Color.WHITE);
		Led37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led37.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led37.setBackground(Color.WHITE);
					Led37.setForeground(Color.BLACK);
				}else {
					Led37.setBackground(Color.GRAY);
					Led37.setForeground(Color.WHITE);
				}

			}
		});
		Led37.setBackground(Color.GRAY);
		Led37.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led37.setBounds(578, 143, 54, 44);
		panel.add(Led37);
		
		Led38 = new JButton("38");
		Led38.setForeground(Color.WHITE);
		Led38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led38.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led38.setBackground(Color.WHITE);
					Led38.setForeground(Color.BLACK);
				}else {
					Led38.setBackground(Color.GRAY);
					Led38.setForeground(Color.WHITE);
				}

			}
		});
		Led38.setBackground(Color.GRAY);
		Led38.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led38.setBounds(632, 143, 54, 44);
		panel.add(Led38);
		
		Led41 = new JButton("41");
		Led41.setForeground(Color.WHITE);
		Led41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led41.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led41.setBackground(Color.WHITE);
					Led41.setForeground(Color.BLACK);
				}else {
					Led41.setBackground(Color.GRAY);
					Led41.setForeground(Color.WHITE);
				}

			}
		});
		Led41.setBackground(Color.GRAY);
		Led41.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led41.setBounds(362, 99, 54, 44);
		panel.add(Led41);
		
		Led42 = new JButton("42");
		Led42.setForeground(Color.WHITE);
		Led42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led42.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led42.setBackground(Color.WHITE);
					Led42.setForeground(Color.BLACK);
				}else {
					Led42.setBackground(Color.GRAY);
					Led42.setForeground(Color.WHITE);
				}

			}
		});
		Led42.setBackground(Color.GRAY);
		Led42.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led42.setBounds(416, 99, 54, 44);
		panel.add(Led42);
		
		Led39 = new JButton("39");
		Led39.setForeground(Color.WHITE);
		Led39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led39.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led39.setBackground(Color.WHITE);
					Led39.setForeground(Color.BLACK);
				}else {
					Led39.setBackground(Color.GRAY);
					Led39.setForeground(Color.WHITE);
				}

			}
		});
		Led39.setBackground(Color.GRAY);
		Led39.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led39.setBounds(686, 143, 54, 44);
		panel.add(Led39);
		
		Led40 = new JButton("40");
		Led40.setForeground(Color.WHITE);
		Led40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led40.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led40.setBackground(Color.WHITE);
					Led40.setForeground(Color.BLACK);
				}else {
					Led40.setBackground(Color.GRAY);
					Led40.setForeground(Color.WHITE);
				}

			}
		});
		Led40.setBackground(Color.GRAY);
		Led40.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led40.setBounds(740, 143, 54, 44);
		panel.add(Led40);
		
		Led43 = new JButton("43");
		Led43.setForeground(Color.WHITE);
		Led43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led43.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led43.setBackground(Color.WHITE);
					Led43.setForeground(Color.BLACK);
				}else {
					Led43.setBackground(Color.GRAY);
					Led43.setForeground(Color.WHITE);
				}

			}
		});
		Led43.setBackground(Color.GRAY);
		Led43.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led43.setBounds(470, 99, 54, 44);
		panel.add(Led43);
		
		Led44 = new JButton("44");
		Led44.setForeground(Color.WHITE);
		Led44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led44.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led44.setBackground(Color.WHITE);
					Led44.setForeground(Color.BLACK);
				}else {
					Led44.setBackground(Color.GRAY);
					Led44.setForeground(Color.WHITE);
				}

			}
		});
		Led44.setBackground(Color.GRAY);
		Led44.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led44.setBounds(524, 99, 54, 44);
		panel.add(Led44);
		
		Led45 = new JButton("45");
		Led45.setForeground(Color.WHITE);
		Led45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led45.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led45.setBackground(Color.WHITE);
					Led45.setForeground(Color.BLACK);
				}else {
					Led45.setBackground(Color.GRAY);
					Led45.setForeground(Color.WHITE);
				}

			}
		});
		Led45.setBackground(Color.GRAY);
		Led45.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led45.setBounds(578, 99, 54, 44);
		panel.add(Led45);
		
		Led46 = new JButton("46");
		Led46.setForeground(Color.WHITE);
		Led46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led46.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led46.setBackground(Color.WHITE);
					Led46.setForeground(Color.BLACK);
				}else {
					Led46.setBackground(Color.GRAY);
					Led46.setForeground(Color.WHITE);
				}

			}
		});
		Led46.setBackground(Color.GRAY);
		Led46.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led46.setBounds(632, 99, 54, 44);
		panel.add(Led46);
		
		Led47 = new JButton("47");
		Led47.setForeground(Color.WHITE);
		Led47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led47.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led47.setBackground(Color.WHITE);
					Led47.setForeground(Color.BLACK);
				}else {
					Led47.setBackground(Color.GRAY);
					Led47.setForeground(Color.WHITE);
				}

			}
		});
		Led47.setBackground(Color.GRAY);
		Led47.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led47.setBounds(686, 99, 54, 44);
		panel.add(Led47);
		
		Led48 = new JButton("48");
		Led48.setForeground(Color.WHITE);
		Led48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led48.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led48.setBackground(Color.WHITE);
					Led48.setForeground(Color.BLACK);
				}else {
					Led48.setBackground(Color.GRAY);
					Led48.setForeground(Color.WHITE);
				}

			}
		});
		Led48.setBackground(Color.GRAY);
		Led48.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led48.setBounds(740, 99, 54, 44);
		panel.add(Led48);
		
		Led49 = new JButton("49");
		Led49.setForeground(Color.WHITE);
		Led49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led49.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led49.setBackground(Color.WHITE);
					Led49.setForeground(Color.BLACK);
				}else {
					Led49.setBackground(Color.GRAY);
					Led49.setForeground(Color.WHITE);
				}

			}
		});
		Led49.setBackground(Color.GRAY);
		Led49.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led49.setBounds(362, 55, 54, 44);
		panel.add(Led49);
		
		Led50 = new JButton("50");
		Led50.setForeground(Color.WHITE);
		Led50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led50.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led50.setBackground(Color.WHITE);
					Led50.setForeground(Color.BLACK);
				}else {
					Led50.setBackground(Color.GRAY);
					Led50.setForeground(Color.WHITE);
				}

			}
		});
		Led50.setBackground(Color.GRAY);
		Led50.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led50.setBounds(416, 55, 54, 44);
		panel.add(Led50);
		
		Led51 = new JButton("51");
		Led51.setForeground(Color.WHITE);
		Led51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led51.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led51.setBackground(Color.WHITE);
					Led51.setForeground(Color.BLACK);
				}else {
					Led51.setBackground(Color.GRAY);
					Led51.setForeground(Color.WHITE);
				}

			}
		});
		Led51.setBackground(Color.GRAY);
		Led51.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led51.setBounds(470, 55, 54, 44);
		panel.add(Led51);
		
		Led52 = new JButton("52");
		Led52.setForeground(Color.WHITE);
		Led52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led52.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led52.setBackground(Color.WHITE);
					Led52.setForeground(Color.BLACK);
				}else {
					Led52.setBackground(Color.GRAY);
					Led52.setForeground(Color.WHITE);
				}

			}
		});
		Led52.setBackground(Color.GRAY);
		Led52.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led52.setBounds(524, 55, 54, 44);
		panel.add(Led52);
		
		Led53 = new JButton("53");
		Led53.setForeground(Color.WHITE);
		Led53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led53.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led53.setBackground(Color.WHITE);
					Led53.setForeground(Color.BLACK);
				}else {
					Led53.setBackground(Color.GRAY);
					Led53.setForeground(Color.WHITE);
				}

			}
		});
		Led53.setBackground(Color.GRAY);
		Led53.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led53.setBounds(578, 55, 54, 44);
		panel.add(Led53);
		
		Led54 = new JButton("54");
		Led54.setForeground(Color.WHITE);
		Led54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led54.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led54.setBackground(Color.WHITE);
					Led54.setForeground(Color.BLACK);
				}else {
					Led54.setBackground(Color.GRAY);
					Led54.setForeground(Color.WHITE);
				}

			}
		});
		Led54.setBackground(Color.GRAY);
		Led54.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led54.setBounds(632, 55, 54, 44);
		panel.add(Led54);
		
		Led57 = new JButton("57");
		Led57.setForeground(Color.WHITE);
		Led57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led57.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led57.setBackground(Color.WHITE);
					Led57.setForeground(Color.BLACK);
				}else {
					Led57.setBackground(Color.GRAY);
					Led57.setForeground(Color.WHITE);
				}

			}
		});
		Led57.setBackground(Color.GRAY);
		Led57.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led57.setBounds(362, 11, 54, 44);
		panel.add(Led57);
		
		Led58 = new JButton("58");
		Led58.setForeground(Color.WHITE);
		Led58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led58.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led58.setBackground(Color.WHITE);
					Led58.setForeground(Color.BLACK);
				}else {
					Led58.setBackground(Color.GRAY);
					Led58.setForeground(Color.WHITE);
				}

			}
		});
		Led58.setBackground(Color.GRAY);
		Led58.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led58.setBounds(416, 11, 54, 44);
		panel.add(Led58);
		
		Led55 = new JButton("55");
		Led55.setForeground(Color.WHITE);
		Led55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led55.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led55.setBackground(Color.WHITE);
					Led55.setForeground(Color.BLACK);
				}else {
					Led55.setBackground(Color.GRAY);
					Led55.setForeground(Color.WHITE);
				}

			}
		});
		Led55.setBackground(Color.GRAY);
		Led55.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led55.setBounds(686, 55, 54, 44);
		panel.add(Led55);
		
		Led56 = new JButton("56");
		Led56.setForeground(Color.WHITE);
		Led56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led56.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led56.setBackground(Color.WHITE);
					Led56.setForeground(Color.BLACK);
				}else {
					Led56.setBackground(Color.GRAY);
					Led56.setForeground(Color.WHITE);
				}

			}
		});
		Led56.setBackground(Color.GRAY);
		Led56.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led56.setBounds(740, 55, 54, 44);
		panel.add(Led56);
		
		Led59 = new JButton("59");
		Led59.setForeground(Color.WHITE);
		Led59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led59.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led59.setBackground(Color.WHITE);
					Led59.setForeground(Color.BLACK);
				}else {
					Led59.setBackground(Color.GRAY);
					Led59.setForeground(Color.WHITE);
				}

			}
		});
		Led59.setBackground(Color.GRAY);
		Led59.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led59.setBounds(470, 11, 54, 44);
		panel.add(Led59);
		
		Led60 = new JButton("60");
		Led60.setForeground(Color.WHITE);
		Led60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led60.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led60.setBackground(Color.WHITE);
					Led60.setForeground(Color.BLACK);
				}else {
					Led60.setBackground(Color.GRAY);
					Led60.setForeground(Color.WHITE);
				}

			}
		});
		Led60.setBackground(Color.GRAY);
		Led60.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led60.setBounds(524, 11, 54, 44);
		panel.add(Led60);
		
		Led61 = new JButton("61");
		Led61.setForeground(Color.WHITE);
		Led61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led61.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led61.setBackground(Color.WHITE);
					Led61.setForeground(Color.BLACK);
				}else {
					Led61.setBackground(Color.GRAY);
					Led61.setForeground(Color.WHITE);
				}

			}
		});
		Led61.setBackground(Color.GRAY);
		Led61.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led61.setBounds(578, 11, 54, 44);
		panel.add(Led61);
		
		Led62 = new JButton("62");
		Led62.setForeground(Color.WHITE);
		Led62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led62.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led62.setBackground(Color.WHITE);
					Led62.setForeground(Color.BLACK);
				}else {
					Led62.setBackground(Color.GRAY);
					Led62.setForeground(Color.WHITE);
				}

			}
		});
		Led62.setBackground(Color.GRAY);
		Led62.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led62.setBounds(632, 11, 54, 44);
		panel.add(Led62);
		
		Led63 = new JButton("63");
		Led63.setForeground(Color.WHITE);
		Led63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led63.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led63.setBackground(Color.WHITE);
					Led63.setForeground(Color.BLACK);
				}else {
					Led63.setBackground(Color.GRAY);
					Led63.setForeground(Color.WHITE);
				}

			}
		});
		Led63.setBackground(Color.GRAY);
		Led63.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led63.setBounds(686, 11, 54, 44);
		panel.add(Led63);
		
		Led64 = new JButton("64");
		Led64.setForeground(Color.WHITE);
		Led64.setBackground(Color.GRAY);
		Led64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ledelegido = 0;
				

				ledelegido = (Integer.parseInt(Led64.getText())) - 1;
				
				if(ControladordeLeds(ledelegido)) {
					Led64.setBackground(Color.WHITE);
					Led64.setForeground(Color.BLACK);
				}else {
					Led64.setBackground(Color.GRAY);
					Led64.setForeground(Color.WHITE);
				}

			}
		});
		Led64.setFont(new Font("Tahoma", Font.BOLD, 8));
		Led64.setBounds(740, 11, 54, 44);
		panel.add(Led64);
		
		
	}
	

	private void EstadoDeLeds() {
		
		///LED1
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[0]) {
			Led1.setBackground(Color.WHITE);
			Led1.setForeground(Color.BLACK);
		}else {
			Led1.setForeground(Color.WHITE);
			Led1.setBackground(Color.GRAY);
		}
		///LED2
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[1]) {
			Led2.setBackground(Color.WHITE);
			Led2.setForeground(Color.BLACK);
		}else {
			Led2.setForeground(Color.WHITE);
			Led2.setBackground(Color.GRAY);
		}
		///LED3
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[2]) {
			Led3.setBackground(Color.WHITE);
			Led3.setForeground(Color.BLACK);
		}else {
			Led3.setForeground(Color.WHITE);
			Led3.setBackground(Color.GRAY);
		}
		///LED4
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[3]) {
			Led4.setBackground(Color.WHITE);
			Led4.setForeground(Color.BLACK);
		}else {
			Led4.setForeground(Color.WHITE);
			Led4.setBackground(Color.GRAY);
		}
		///LED5
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[4]) {
			Led5.setBackground(Color.WHITE);
			Led5.setForeground(Color.BLACK);
		}else {
			Led5.setForeground(Color.WHITE);
			Led5.setBackground(Color.GRAY);
		}
		///LED6
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[5]) {
			Led6.setBackground(Color.WHITE);
			Led6.setForeground(Color.BLACK);
		}else {
			Led6.setForeground(Color.WHITE);
			Led6.setBackground(Color.GRAY);
		}
		///LED7
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[6]) {
			Led7.setBackground(Color.WHITE);
			Led7.setForeground(Color.BLACK);
		}else {
			Led7.setForeground(Color.WHITE);
			Led7.setBackground(Color.GRAY);
		}
		///LED8
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[7]) {
			Led8.setBackground(Color.WHITE);
			Led8.setForeground(Color.BLACK);
		}else {
			Led8.setForeground(Color.WHITE);
			Led8.setBackground(Color.GRAY);
		}
		///LED9
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[8]) {
			Led9.setBackground(Color.WHITE);
			Led9.setForeground(Color.BLACK);
		}else {
			Led9.setForeground(Color.WHITE);
			Led9.setBackground(Color.GRAY);
		}
		///LED10
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[9]) {
			Led10.setBackground(Color.WHITE);
			Led10.setForeground(Color.BLACK);
		}else {
			Led10.setForeground(Color.WHITE);
			Led10.setBackground(Color.GRAY);
		}
		///LED11
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[10]) {
			Led11.setBackground(Color.WHITE);
			Led11.setForeground(Color.BLACK);
		}else {
			Led11.setForeground(Color.WHITE);
			Led11.setBackground(Color.GRAY);
		}
		///LED12
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[11]) {
			Led12.setBackground(Color.WHITE);
			Led12.setForeground(Color.BLACK);
		}else {
			Led12.setForeground(Color.WHITE);
			Led12.setBackground(Color.GRAY);
		}
		///LED13
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[12]) {
			Led13.setBackground(Color.WHITE);
			Led13.setForeground(Color.BLACK);
		}else {
			Led13.setForeground(Color.WHITE);
			Led13.setBackground(Color.GRAY);
		}
		///LED14
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[13]) {
			Led14.setBackground(Color.WHITE);
			Led14.setForeground(Color.BLACK);
		}else {
			Led14.setForeground(Color.WHITE);
			Led14.setBackground(Color.GRAY);
		}
		///LED15
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[14]) {
			Led15.setBackground(Color.WHITE);
			Led15.setForeground(Color.BLACK);
		}else {
			Led15.setForeground(Color.WHITE);
			Led15.setBackground(Color.GRAY);
		}
		///LED16
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[15]) {
			Led16.setBackground(Color.WHITE);
			Led16.setForeground(Color.BLACK);
		}else {
			Led16.setForeground(Color.WHITE);
			Led16.setBackground(Color.GRAY);
		}
		///LED17
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[16]) {
			Led17.setBackground(Color.WHITE);
			Led17.setForeground(Color.BLACK);
		}else {
			Led17.setForeground(Color.WHITE);
			Led17.setBackground(Color.GRAY);
		}
		///LED18
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[17]) {
			Led18.setBackground(Color.WHITE);
			Led18.setForeground(Color.BLACK);
		}else {
			Led18.setForeground(Color.WHITE);
			Led18.setBackground(Color.GRAY);
		}
		///LED19
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[18]) {
			Led19.setBackground(Color.WHITE);
			Led19.setForeground(Color.BLACK);
		}else {
			Led19.setForeground(Color.WHITE);
			Led19.setBackground(Color.GRAY);
		}
		///LED20
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[19]) {
			Led20.setBackground(Color.WHITE);
			Led20.setForeground(Color.BLACK);
		}else {
			Led20.setForeground(Color.WHITE);
			Led20.setBackground(Color.GRAY);
		}
		///LED21
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[20]) {
			Led21.setBackground(Color.WHITE);
			Led21.setForeground(Color.BLACK);
		}else {
			Led21.setForeground(Color.WHITE);
			Led21.setBackground(Color.GRAY);
		}
		///LED22
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[21]) {
			Led22.setBackground(Color.WHITE);
			Led22.setForeground(Color.BLACK);
		}else {
			Led22.setForeground(Color.WHITE);
			Led22.setBackground(Color.GRAY);
		}
		///LED23
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[22]) {
			Led23.setBackground(Color.WHITE);
			Led23.setForeground(Color.BLACK);
		}else {
			Led23.setForeground(Color.WHITE);
			Led23.setBackground(Color.GRAY);
		}
		///LED24
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[23]) {
			Led24.setBackground(Color.WHITE);
			Led24.setForeground(Color.BLACK);
		}else {
			Led24.setForeground(Color.WHITE);
			Led24.setBackground(Color.GRAY);
		}
		///LED25
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[24]) {
			Led25.setBackground(Color.WHITE);
			Led25.setForeground(Color.BLACK);
		}else {
			Led25.setForeground(Color.WHITE);
			Led25.setBackground(Color.GRAY);
		}
		///LED26
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[25]) {
			Led26.setBackground(Color.WHITE);
			Led26.setForeground(Color.BLACK);
		}else {
			Led26.setForeground(Color.WHITE);
			Led26.setBackground(Color.GRAY);
		}
		///LED27
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[26]) {
			Led27.setBackground(Color.WHITE);
			Led27.setForeground(Color.BLACK);
		}else {
			Led27.setForeground(Color.WHITE);
			Led27.setBackground(Color.GRAY);
		}
		///LED28
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[27]) {
			Led28.setBackground(Color.WHITE);
			Led28.setForeground(Color.BLACK);
		}else {
			Led28.setForeground(Color.WHITE);
			Led28.setBackground(Color.GRAY);
		}
		///LED29
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[28]) {
			Led29.setBackground(Color.WHITE);
			Led29.setForeground(Color.BLACK);
		}else {
			Led29.setForeground(Color.WHITE);
			Led29.setBackground(Color.GRAY);
		}
		///LED30
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[29]) {
			Led30.setBackground(Color.WHITE);
			Led30.setForeground(Color.BLACK);
		}else {
			Led30.setForeground(Color.WHITE);
			Led30.setBackground(Color.GRAY);
		}
		///LED31
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[30]) {
			Led31.setBackground(Color.WHITE);
			Led31.setForeground(Color.BLACK);
		}else {
			Led31.setForeground(Color.WHITE);
			Led31.setBackground(Color.GRAY);
		}
		///LED32
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[31]) {
			Led32.setBackground(Color.WHITE);
			Led32.setForeground(Color.BLACK);
		}else {
			Led32.setForeground(Color.WHITE);
			Led32.setBackground(Color.GRAY);
		}
		///LED33
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[32]) {
			Led33.setBackground(Color.WHITE);
			Led33.setForeground(Color.BLACK);
		}else {
			Led33.setForeground(Color.WHITE);
			Led33.setBackground(Color.GRAY);
		}
		///LED34
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[33]) {
			Led34.setBackground(Color.WHITE);
			Led34.setForeground(Color.BLACK);
		}else {
			Led34.setForeground(Color.WHITE);
			Led34.setBackground(Color.GRAY);
		}
		///LED35
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[34]) {
			Led35.setBackground(Color.WHITE);
			Led35.setForeground(Color.BLACK);
		}else {
			Led35.setForeground(Color.WHITE);
			Led35.setBackground(Color.GRAY);
		}
		///LED36
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[35]) {
			Led36.setBackground(Color.WHITE);
			Led36.setForeground(Color.BLACK);
		}else {
			Led36.setForeground(Color.WHITE);
			Led36.setBackground(Color.GRAY);
		}
		///LED37
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[36]) {
			Led37.setBackground(Color.WHITE);
			Led37.setForeground(Color.BLACK);
		}else {
			Led37.setForeground(Color.WHITE);
			Led37.setBackground(Color.GRAY);
		}
		///LED38
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[37]) {
			Led38.setBackground(Color.WHITE);
			Led38.setForeground(Color.BLACK);
		}else {
			Led38.setForeground(Color.WHITE);
			Led38.setBackground(Color.GRAY);
		}
		///LED39
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[38]) {
			Led39.setBackground(Color.WHITE);
			Led39.setForeground(Color.BLACK);
		}else {
			Led39.setForeground(Color.WHITE);
			Led39.setBackground(Color.GRAY);
		}
		///LED40
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[39]) {
			Led40.setBackground(Color.WHITE);
			Led40.setForeground(Color.BLACK);
		}else {
			Led40.setForeground(Color.WHITE);
			Led40.setBackground(Color.GRAY);
		}
		///LED41
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[40]) {
			Led41.setBackground(Color.WHITE);
			Led41.setForeground(Color.BLACK);
		}else {
			Led41.setForeground(Color.WHITE);
			Led41.setBackground(Color.GRAY);
		}
		///LED42
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[41]) {
			Led42.setBackground(Color.WHITE);
			Led42.setForeground(Color.BLACK);
		}else {
			Led42.setForeground(Color.WHITE);
			Led42.setBackground(Color.GRAY);
		}
		///LED43
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[42]) {
			Led43.setBackground(Color.WHITE);
			Led43.setForeground(Color.BLACK);
		}else {
			Led43.setForeground(Color.WHITE);
			Led43.setBackground(Color.GRAY);
		}
		///LED44
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[43]) {
			Led44.setBackground(Color.WHITE);
			Led44.setForeground(Color.BLACK);
		}else {
			Led44.setForeground(Color.WHITE);
			Led44.setBackground(Color.GRAY);
		}		
		///LED45
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[44]) {
			Led45.setBackground(Color.WHITE);
			Led45.setForeground(Color.BLACK);
		}else {
			Led45.setForeground(Color.WHITE);
			Led45.setBackground(Color.GRAY);
		}
		///LED46
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[45]) {
			Led46.setBackground(Color.WHITE);
			Led46.setForeground(Color.BLACK);
		}else {
			Led46.setForeground(Color.WHITE);
			Led46.setBackground(Color.GRAY);
		}	
		///LED47
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[46]) {
			Led47.setBackground(Color.WHITE);
			Led47.setForeground(Color.BLACK);
		}else {
			Led47.setForeground(Color.WHITE);
			Led47.setBackground(Color.GRAY);
		}
		///LED48
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[47]) {
			Led48.setBackground(Color.WHITE);
			Led48.setForeground(Color.BLACK);
		}else {
			Led48.setForeground(Color.WHITE);
			Led48.setBackground(Color.GRAY);
		}	
		///LED49
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[48]) {
			Led49.setBackground(Color.WHITE);
			Led49.setForeground(Color.BLACK);
		}else {
			Led49.setForeground(Color.WHITE);
			Led49.setBackground(Color.GRAY);
		}	
		///LED50
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[49]) {
			Led50.setBackground(Color.WHITE);
			Led50.setForeground(Color.BLACK);
		}else {
			Led50.setForeground(Color.WHITE);
			Led50.setBackground(Color.GRAY);
		}
		///LED51
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[50]) {
			Led51.setBackground(Color.WHITE);
			Led51.setForeground(Color.BLACK);
		}else {
			Led51.setForeground(Color.WHITE);
			Led51.setBackground(Color.GRAY);
		}
		///LED52
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[51]) {
			Led52.setBackground(Color.WHITE);
			Led52.setForeground(Color.BLACK);
		}else {
			Led52.setForeground(Color.WHITE);
			Led52.setBackground(Color.GRAY);
		}
		///LED53
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[52]) {
			Led53.setBackground(Color.WHITE);
			Led53.setForeground(Color.BLACK);
		}else {
			Led53.setForeground(Color.WHITE);
			Led53.setBackground(Color.GRAY);
		}
		///LED54
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[53]) {
			Led54.setBackground(Color.WHITE);
			Led54.setForeground(Color.BLACK);
		}else {
			Led54.setForeground(Color.WHITE);
			Led54.setBackground(Color.GRAY);
		}
		///LED55
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[54]) {
			Led55.setBackground(Color.WHITE);
			Led55.setForeground(Color.BLACK);
		}else {
			Led55.setForeground(Color.WHITE);
			Led55.setBackground(Color.GRAY);
		}
		///LED56
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[55]) {
			Led56.setBackground(Color.WHITE);
			Led56.setForeground(Color.BLACK);
		}else {
			Led56.setForeground(Color.WHITE);
			Led56.setBackground(Color.GRAY);
		}
		///LED57
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[56]) {
			Led57.setBackground(Color.WHITE);
			Led57.setForeground(Color.BLACK);
		}else {
			Led57.setForeground(Color.WHITE);
			Led57.setBackground(Color.GRAY);
		}
		///LED58
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[57]) {
			Led58.setBackground(Color.WHITE);
			Led58.setForeground(Color.BLACK);
		}else {
			Led58.setForeground(Color.WHITE);
			Led58.setBackground(Color.GRAY);
		}
		///LED59
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[58]) {
			Led59.setBackground(Color.WHITE);
			Led59.setForeground(Color.BLACK);
		}else {
			Led59.setForeground(Color.WHITE);
			Led59.setBackground(Color.GRAY);
		}
		///LED60
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[59]) {
			Led60.setBackground(Color.WHITE);
			Led60.setForeground(Color.BLACK);
		}else {
			Led60.setForeground(Color.WHITE);
			Led60.setBackground(Color.GRAY);
		}
		///LED61
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[60]) {
			Led61.setBackground(Color.WHITE);
			Led61.setForeground(Color.BLACK);
		}else {
			Led61.setForeground(Color.WHITE);
			Led61.setBackground(Color.GRAY);
		}
		///LED62
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[61]) {
			Led62.setBackground(Color.WHITE);
			Led62.setForeground(Color.BLACK);
		}else {
			Led62.setForeground(Color.WHITE);
			Led62.setBackground(Color.GRAY);
		}
		///LED63
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[62]) {
			Led63.setBackground(Color.WHITE);
			Led63.setForeground(Color.BLACK);
		}else {
			Led63.setForeground(Color.WHITE);
			Led63.setBackground(Color.GRAY);
		}
		///LED64
		if(miCapa[comboBox.getSelectedIndex()].getMisLed()[63]) {
			Led64.setBackground(Color.WHITE);
			Led64.setForeground(Color.BLACK);
		}else {
			Led64.setForeground(Color.WHITE);
			Led64.setBackground(Color.GRAY);
		}


	}

public static void CargarComboBox() {
			
		if(miCubo.getMisAnimaciones().isEmpty()) {
		comboBoxAnimaciones.addItem(" No Existe Ninguna Animacion");
		}
		else {
			comboBoxAnimaciones.removeAllItems();
			
			for(int i = 0; i<miCubo.getMisAnimaciones().size(); i++) {
			comboBoxAnimaciones.addItem(miCubo.getMisAnimaciones().get(i).getNombre());
			}
		}
		
	}


	boolean ControladordeLeds(int LedElegido) {
		boolean estado = false;
		int capaElegida = 0;
		
		capaElegida = comboBox.getSelectedIndex();
		
		if(!miCapa[capaElegida].getMisLed()[LedElegido]) {
			miCapa[capaElegida].modificadorLed(LedElegido);
			estado = true;
		}else {
			miCapa[capaElegida].modificadorLed(LedElegido);;
			estado = false;
		}
		
		return estado;
	}
}

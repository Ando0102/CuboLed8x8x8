package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logic.Animacion;
import Logic.Cubo;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ImageIcon;

public class PrepararSeleccion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Cubo miCubo;
	private JScrollPane scrollPane;
	private DefaultTableModel model;
	private JTable table;
	private JLabel avisodeAnimaciones;
	private Object[] fila;
	private JScrollPane scrollPane_1;
	private JLabel avisodeSeleccion;
	private DefaultTableModel model1;
	private JTable table1;
	private Object[] fila1;
	private int AnimacionSeleccionada;
	private int SeleccionSeleccionada;

	/**
	 * Create the dialog.
	 */
	public PrepararSeleccion(final Cubo Cubo) {
		this.miCubo = Cubo;
		setTitle("Editando Selecci\u00F3n");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PrepararSeleccion.class.getResource("/Imagenes/cubo grande.png")));
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 634, 402);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(175, 238, 238));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(175, 238, 238));
			panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "Selecci\u00F3n de Animaci\u00F3n para Presentar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(373, 11, 235, 308);
			panel.add(panel_2);
			panel_2.setLayout(null);
			{
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(10, 32, 215, 162);
				
			avisodeSeleccion = new JLabel("    Selección Vacía ");
				
				String[] titu2 = {" Nombre ", "Descripción"};
				model1 = new DefaultTableModel();
				model1.setColumnIdentifiers(titu2);
				
				table1 = new JTable();
				table1.addMouseListener(new MouseAdapter() {

					@Override
					public void mouseClicked(MouseEvent arg0) {
							if(table1.getSelectedRow()>=0) {
								SeleccionSeleccionada = table1.getSelectedRow();
							}
					}
				});
				table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				table1.setModel(model1);
				
					if(!miCubo.getSeleccion().isEmpty()) {
						CargarTabladeSeleccion();
					}else { scrollPane_1.setViewportView(avisodeSeleccion);}
					
				panel_2.add(scrollPane_1);
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Animaci\u00F3n Existentes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 11, 235, 308);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 40, 215, 153);
			panel_1.add(scrollPane);
			
			avisodeAnimaciones = new JLabel(" No Existe Ninguna Animación ");
			
			String[] titu1 = {" Nombre ", "Descripción"};
			model = new DefaultTableModel();
			model.setColumnIdentifiers(titu1);
			
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent arg0) {
					if(table.getSelectedRow()>=0) {
						AnimacionSeleccionada = table.getSelectedRow();
					}
				}
			});
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.setModel(model);
			
				if(!miCubo.getMisAnimaciones().isEmpty()) {
					CargarTabla();
				}else { scrollPane.setViewportView(avisodeAnimaciones);}
				
			
			panel_1.add(scrollPane);
			
			JButton btnEnviar = new JButton("");
			btnEnviar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					Animacion aux = null;
					
					aux = miCubo.getMisAnimaciones().get(AnimacionSeleccionada);
					miCubo.getSeleccion().add(aux);
					CargarTabla();
					CargarTabladeSeleccion();
				}
			});
			btnEnviar.setBackground(new Color(255, 255, 255));
			btnEnviar.setIcon(new ImageIcon(PrepararSeleccion.class.getResource("/Imagenes/Entrar.png")));
			btnEnviar.setBounds(288, 57, 53, 40);
			panel.add(btnEnviar);
			
			JButton btnEliminar = new JButton("");
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					miCubo.getSeleccion().remove(SeleccionSeleccionada);
					CargarTabla();
					CargarTabladeSeleccion();
				}
			});
			btnEliminar.setBackground(new Color(255, 255, 255));
			btnEliminar.setIcon(new ImageIcon(PrepararSeleccion.class.getResource("/Imagenes/Sacar.png")));
			btnEliminar.setBounds(288, 118, 53, 40);
			panel.add(btnEliminar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(175, 238, 238));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Realizar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(!miCubo.getSeleccion().isEmpty()) {
							
							if(Verificador_de_Seleccion()) {
									JOptionPane.showMessageDialog(null, " Selección Completada ", "Información", JOptionPane.INFORMATION_MESSAGE);
									dispose();
							}else {
								JOptionPane.showMessageDialog(null, " Selección sin Animación ", "Advertencia", JOptionPane.WARNING_MESSAGE);
							}
						}else {
							JOptionPane.showMessageDialog(null, " No Existe Selección ", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}


				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				buttonPane.add(cancelButton);
			}
		}
	}

	private void CargarTabladeSeleccion() {
		model1.setRowCount(0);
		fila1 = new Object[model.getColumnCount()];

		for(int i = 0; i <miCubo.getSeleccion().size(); i++) {
			fila1[0] = miCubo.getSeleccion().get(i).getNombre();
			fila1[1] = miCubo.getSeleccion().get(i).getDescripcion();
			model1.addRow(fila1);
		}
		
		scrollPane_1.setViewportView(table1);
		
	}

	private void CargarTabla() {
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];

		for(int i = 0; i <miCubo.getMisAnimaciones().size(); i++) {
			fila[0] = miCubo.getMisAnimaciones().get(i).getNombre();
			fila[1] = miCubo.getMisAnimaciones().get(i).getDescripcion();
			model.addRow(fila);
		}
		
		scrollPane.setViewportView(table);
		
	}
	
	///////////////////////////////REVISA LA SELECCION PARA VER SI EXISTE POR LO MENOS UN LED ENCENDIDO EN ELLA//////
	private boolean Verificador_de_Seleccion() {
		boolean ojo = false;
		
		
		for(int i = 0; i<miCubo.getSeleccion().size() || ojo!=true; i++) {
			for(int j = 0; j<8; j++) {
				for(int k = 0; k<64; k++) {
					if(miCubo.getSeleccion().get(i).getCapas()[j].getMisLed()[k] == true){
						ojo = true;
					}
				}
			}
			
		}
		
		return ojo;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////
}

package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import Logic.Animacion;
import Logic.Cubo;

import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;

public class CrearNuevaAnimacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private Cubo miCubo;
	private int Indice = 0;
	private JTextArea editorPane;

	
	public CrearNuevaAnimacion(final Cubo miCubo) {
		this.miCubo = miCubo;
		setModal(true);
		setTitle("Crear Nueva Animaci\u00F3n");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CrearNuevaAnimacion.class.getResource("/Imagenes/cubo grande.png")));
		setBounds(100, 100, 494, 348);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(176, 224, 230));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(176, 224, 230));
			panel.setBorder(new TitledBorder(null, "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Nombre de la Animaci\u00F3n :");
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblNewLabel.setBounds(10, 65, 153, 33);
			panel.add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBounds(151, 71, 161, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			JLabel lblDescripcinDeLa = new JLabel("Descripci\u00F3n de la Animaci\u00F3n :");
			lblDescripcinDeLa.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblDescripcinDeLa.setBounds(10, 109, 211, 26);
			panel.add(lblDescripcinDeLa);
			
			editorPane = new JTextArea();
			editorPane.setBackground(SystemColor.window);
			editorPane.setLineWrap(true);
			editorPane.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			editorPane.setBounds(20, 146, 421, 95);
			panel.add(editorPane);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBackground(SystemColor.activeCaption);
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\arman\\Downloads\\3d_paint_folder_20524.png"));
			lblNewLabel_1.setBounds(337, 11, 104, 124);
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			lblNewLabel_2.setBounds(20, 146, 421, 95);
			panel.add(lblNewLabel_2);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(176, 224, 230));
			buttonPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Crear Animaci\u00F3n");
				okButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						String nombre = null;
						String descripcion = null;
						
						if(!textField.getText().equalsIgnoreCase("")) {
							nombre = textField.getText();
							descripcion = editorPane.getText();
							
							Animacion aux = new Animacion(nombre, descripcion);
							miCubo.getMisAnimaciones().add(Indice, aux);
							Indice++;
							
							InterfacePrincipal.CargarComboBox();
							
							JOptionPane.showMessageDialog(null, " Nueva Animación Creada ", "Infomación", JOptionPane.INFORMATION_MESSAGE);
							dispose();
							
						}
						else {
							JOptionPane.showMessageDialog(null, " Por favor, completar datos ", "Advertencia", JOptionPane.WARNING_MESSAGE);
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
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

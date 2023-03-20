package mave_proyect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;

public class VentanaMonedas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMonedas window = new VentanaMonedas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaMonedas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel ventanasBotton = new JPanel();
		ventanasBotton.setBounds(77, 222, 263, 22);
		frame.getContentPane().add(ventanasBotton);
		ventanasBotton.setLayout(null);
		
		JButton btnNewButton = new JButton("Monedas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 0, 89, 23);
		ventanasBotton.add(btnNewButton);
		
		JButton btnTemperatura = new JButton("Temperatura");
		btnTemperatura.setBounds(88, 0, 89, 23);
		ventanasBotton.add(btnTemperatura);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(174, 0, 89, 23);
		ventanasBotton.add(btnNewButton_1_1);
		
		JPanel ventanaConversion = new JPanel();
		ventanaConversion.setBounds(0, 0, 434, 208);
		frame.getContentPane().add(ventanaConversion);
		ventanaConversion.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1 Dólar estadounidense Es igual a");
		lblNewLabel.setBounds(56, 11, 161, 14);
		ventanaConversion.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("4,851.00 Peso colombiano");
		lblNewLabel_1.setBounds(56, 38, 169, 30);
		ventanaConversion.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(66, 85, 128, 22);
		ventanaConversion.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(212, 86, 106, 22);
		ventanaConversion.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(212, 154, 106, 22);
		ventanaConversion.add(comboBox_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(66, 153, 128, 22);
		ventanaConversion.add(textArea_1);
	}
}

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
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JLayeredPane;

public class VentanaMonedas {

	private JFrame frame;
	private JLabel tipoDeCambioLabel;
	private boolean updatingValue1 = false;
	private boolean updatingValue2 = false;
	private JComboBox<String> variableOrigen;
	private JComboBox<String> variableDestino;
	private JTextArea valor1;
	private JTextArea valor2;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
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
	  public VentanaMonedas() throws IOException {
		     
		    
		    initialize();   
	  }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws IOException{	
		ExchangeRateResponse Moneda = new ExchangeRateResponse();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel ventanasBotton = new JPanel();
		ventanasBotton.setBounds(77, 222, 263, 28);
		frame.getContentPane().add(ventanasBotton);
		
		JButton btnNewButton = new JButton("Monedas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		ventanasBotton.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		ventanasBotton.add(btnNewButton);
		
		JButton btnTemperatura = new JButton("Temperatura");
		ventanasBotton.add(btnTemperatura);
		
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
		
		JTextArea valor1 = new JTextArea();
		valor1.setText("1");
		valor1.setBounds(66, 85, 128, 22);
		ventanaConversion.add(valor1);
		
		/*valor1.getDocument().addDocumentListener((DocumentListener) new DocumentListener() {
			
			/*@Override
			public void insertUpdate(DocumentEvent e)  {
				try {
					actualizarResultado(Moneda,valor1,valor2,variableOrigen,variableDestino);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				try {
					actualizarResultado(Moneda,valor1,valor2,variableOrigen,variableDestino);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}*/

		
		JComboBox<String> variableOrigen = new JComboBox<String>();
		variableOrigen.setBounds(212, 86, 106, 22);
		variableOrigen.setModel(new DefaultComboBoxModel<String>(new String[] {"USD", "EUR", "JPY", "GBP","COP", "MXN", "CAD", "BRL"}));
		variableOrigen.setSelectedIndex(1);
		ventanaConversion.add(variableOrigen);
		
		JComboBox<String> variableDestino = new JComboBox<String>();
		variableDestino.setModel(new DefaultComboBoxModel<String>(new String[] {"USD", "EUR", "JPY", "GBP","COP", "MXN", "CAD", "BRL"}));
		variableDestino.setBounds(212, 154, 106, 22);
		variableOrigen.setSelectedIndex(4);
		ventanaConversion.add(variableDestino);
		
		JTextArea valor2 = new JTextArea();
		valor2.setText("0,00021");
		valor2.setBounds(66, 153, 128, 22);
		ventanaConversion.add(valor2);
		

		valor2.getDocument().addDocumentListener((DocumentListener) new DocumentListener() {
			
			@Override
			public void insertUpdate(DocumentEvent e)  {
				try {
					actualizarResultado(Moneda,valor2,valor1,variableDestino,variableOrigen);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				try {
					actualizarResultado(Moneda,valor2,valor1,variableDestino,variableOrigen);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}

			

		    // Métodos removeUpdate y changedUpdate no mostrados
		});
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1, 1);
		frame.getContentPane().add(layeredPane);
		

		
	}

	protected void actualizarResultado(ExchangeRateResponse Moneda, JTextArea modificado, 
    		JTextArea actualizar,JComboBox<String> origen,
    		JComboBox<String> destino) throws IOException {
		
		
		String monedaOrigen = (String) origen.getSelectedItem(); 
		  String monedaDestino = (String) destino.getSelectedItem();  
		  double cantidad = Double.parseDouble(modificado.getText()); 
		  
		  Moneda = ApiFuncional.obtenerTipoDeCambio
				  (monedaOrigen, monedaDestino,cantidad);
		  modificado.setText(Moneda.getQuery().getFrom());
		  actualizar.setText( Double.toString(Moneda.getResult()));
		// TODO Auto-generated method stub
		
	}
}

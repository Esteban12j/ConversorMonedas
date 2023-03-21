package mave_proyect;

import java.io.IOException;

import javax.naming.directory.ModificationItem;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class actualizarResultado  {
	
    public void actualizarValor(ExchangeRateResponse Moneda, JTextArea modificado, 
    		JTextArea actualizar,JComboBox<String> origen,
    		JComboBox<String> destino) throws IOException {
		
		  String monedaOrigen = (String) origen.getSelectedItem(); 
		  String monedaDestino = (String) destino.getSelectedItem();  
		  double cantidad = Double.parseDouble(modificado.getText()); 
		  
		  Moneda = ApiFuncional.obtenerTipoDeCambio
				  (monedaOrigen, monedaDestino,cantidad);
		  modificado.setText(Moneda.getQuery().getFrom());
		  actualizar.setText( Double.toString(Moneda.getResult()));
        
    }
    
 

}

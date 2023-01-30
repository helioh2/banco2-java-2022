package br.ufpr.ja.figuras;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainSwing {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Teste de janela");
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(600, 400));
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
		
		JButton button = new JButton("CLIQUE EM MIM");
		panel.add(button);
		button.setLocation(new Point(300, 200));
		final String texto = "INICIO";

		JLabel label = new JLabel(texto);
		panel.add(label);
		label.setLocation(300, 500);
		
		button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("UFA");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setText("SAI DAQUI");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
//				texto;
				label.setText("CLICOU");
				
			}
		});
		
		
	}

}

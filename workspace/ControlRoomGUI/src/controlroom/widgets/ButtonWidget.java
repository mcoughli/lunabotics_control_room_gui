package controlroom.widgets;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonWidget extends Widget {
	JCheckBox simulationCbox = new JCheckBox("Simulation");

	public ButtonWidget(int x, int y, String title) {
		//super(x, y, title);
		
		JPanel panel = new JPanel(new GridLayout(2,1));
		simulationCbox.setVisible(true);
		//panel.add(new JLabel(title));
		panel.add(simulationCbox);
		
		this.add(panel);
	}
	
	public void paintComponent(Graphics g) {
		
		//Use actual pictures of Buttons to improve the graphics of the GUI
		g.setColor(Color.GREEN);
		g.fillOval(20, 60, 120, 120);
		
		g.setColor(Color.RED);
		g.fillOval(160, 60, 120, 120);
		
	}
}

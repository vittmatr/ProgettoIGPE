package game.view;


import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

import game.settings.Settings;
import game.utility.CaricatoreImmagini;

public class PannelloLivello extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private BufferedImage sfondo;
	
	public PannelloLivello(FlowLayout g) {
		super(g);
		caricaRirsorse();
	}
	
	private void caricaRirsorse() {
		CaricatoreImmagini loader = new CaricatoreImmagini();
		sfondo = loader.caricaImmagine("/img/Livelli.png");
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(sfondo, 0, 0, Settings.LARGHEZZA, Settings.ALTEZZA, this);


	}


}
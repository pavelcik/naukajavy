import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Thing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Thing() {
		super("Najedz na mnie!");
		setLayout(new FlowLayout());
		
		Icon obrazek = new ImageIcon(getClass().getResource("obrazek.jpg"));
		Icon disabledobrazek = new ImageIcon(getClass().getResource("kotek.png"));
		JLabel miejscenaobrazek = new JLabel();
		miejscenaobrazek.setIcon(disabledobrazek);
		add(miejscenaobrazek);
		
		miejscenaobrazek.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				miejscenaobrazek.setIcon(obrazek);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				miejscenaobrazek.setIcon(obrazek);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				miejscenaobrazek.setIcon(disabledobrazek);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				miejscenaobrazek.setIcon(obrazek);
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				miejscenaobrazek.setIcon(obrazek);
				
			}});
		miejscenaobrazek.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				miejscenaobrazek.setIcon(obrazek);
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				miejscenaobrazek.setIcon(obrazek);
				
			}
			
				
	});
		
		
		
		
		
		
		
		
	}}
	
	
	
	


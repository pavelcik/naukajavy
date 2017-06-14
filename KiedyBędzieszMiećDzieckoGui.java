import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KiedyBêdzieszMieæDzieckoGui extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static JFrame glownaramka;
	
	private static JButton inputbutton;
	
	
	
	private static JLabel prosbaoimie;
	
	private static JTextField miejscenaimie;
	private static JLabel odpowiedz;
	
	static String imie;
	int wiek = (int) (Math.random()*100);
	static String pytanie = "Podaj swoje imiê, a przepowiem Ci przysz³oœæ: ";
	
	
	public static void main(String[] args) {
		
		
		KiedyBêdzieszMieæDzieckoGui dziecko = new KiedyBêdzieszMieæDzieckoGui();
		
		
		dziecko.przepowiedzPrzyszlosc();
	
	}
	
	public KiedyBêdzieszMieæDzieckoGui() {
		przygotujGui();
	}
	
	private void przepowiedzPrzyszlosc() {
		if(wiek <20)
			wiek+=20;
		System.out.println(imie+" urodzisz dziecko w wieku "+wiek+" lat");
	}
	private void przygotujGui() {
		
		glownaramka = new JFrame("Twoja osobista wró¿ka");
		
		inputbutton = new JButton("Enter");
		
		
		prosbaoimie = new JLabel("Podaj swoje imiê");
		
		miejscenaimie = new JTextField("");
		
		odpowiedz = new JLabel();
		
		
		glownaramka.setSize(500, 500);
		glownaramka.setVisible(true);
		glownaramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		glownaramka.setLayout(new BorderLayout());
		glownaramka.add(prosbaoimie,BorderLayout.WEST);
		glownaramka.add(miejscenaimie,BorderLayout.CENTER);
		glownaramka.add(inputbutton,BorderLayout.EAST);
		
		
		
	
	
	KiedyBêdzieszMieæDzieckoGui.miejscenaimie.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			imie = miejscenaimie.getText();
			
			
			prosbaoimie.setVisible(false);
			miejscenaimie.setVisible(false);
			inputbutton.setVisible(false);
			glownaramka.add(odpowiedz,BorderLayout.CENTER,Font.BOLD);
			
			
			
			odpowiedz.setText(imie+" urodzisz dziecko w wieku "+wiek+" lat");
			
		}});}}
		
	
	
	
		
	

	



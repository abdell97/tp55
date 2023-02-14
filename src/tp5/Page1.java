package tp5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.*;

public class Page1 implements ActionListener {
	
	JButton beffacer,benregistrer;
	JLabel lcne,lnom,lprenom,lsexe,lville,lemail,llangue;
	JTextField tcne,tnom,tprenom,temail;
	
	JCheckBox ar,fr,en,es;
	JRadioButton homme,femme;
	ButtonGroup gr2;
	JComboBox   cville;			
	
	public Panel monContenu() {
		
		//quelques param�tres
		///positions(x,y)+largeur � hauteur
		int x=200,y=50,lar=200,haut=30;
		///couleur de font
		Color label_font_color=new Color(200,210,200);
		
		Panel pan=new Panel();
		pan.setBounds(0, 0, 800, 580);
		pan.setLayout(null);
		pan.setBackground(Color.white);
		
		
		////les Labels
		lcne=new JLabel("CNE");
		lcne.setBackground(label_font_color);
		lcne.setBounds(x, y+ (haut+10)*0, lar, haut);
		lcne.setOpaque(true);
		pan.add(lcne);
		
		
		
		lnom=new JLabel("Nom");
		lnom.setBounds(x, y+(haut+10)*1, lar, haut);
		lnom.setBackground(label_font_color);
		lnom.setOpaque(true);
		pan.add(lnom);
		
		lprenom=new JLabel("Prénom");
		lprenom.setBounds(x, y+(haut+10)*2, lar, haut);
		lprenom.setBackground(label_font_color);
		lprenom.setOpaque(true);
		pan.add(lprenom);
		
		lsexe=new JLabel("Sexe");
		lsexe.setBounds(x, y+(haut+10)*3, lar, haut);
		lsexe.setBackground(label_font_color);
		lsexe.setOpaque(true);
		pan.add(lsexe);
		
		lville=new JLabel("Ville");
		lville.setBounds(x, y+(haut+10)*4, lar, haut);
		lville.setBackground(label_font_color);
		lville.setOpaque(true);
		pan.add(lville);
		
		lemail=new JLabel("Email");
		lemail.setBounds(x, y+(haut+10)*5, lar, haut);
		lemail.setBackground(label_font_color);
		lemail.setOpaque(true);
		pan.add(lemail);
		
		
		llangue=new JLabel("Langue");
		llangue.setBounds(x, y+(haut+10)*6, lar, haut);
		llangue.setBackground(label_font_color);
		llangue.setOpaque(true);
		pan.add(llangue);
		
		
		////////////Champ de text 
		
		tcne=new JTextField();
		tcne.setBounds(x+lar+20, y+ (haut+10)*0, lar, haut);
		pan.add(tcne);
		
		tnom=new JTextField();
		tnom.setBounds(x+lar+20, y+ (haut+10)*1, lar, haut);
		pan.add(tnom);
		
		tprenom=new JTextField();
		tprenom.setBounds(x+lar+20, y+ (haut+10)*2, lar, haut);
		pan.add(tprenom);
		
		temail=new JTextField();
		temail.setBounds(x+lar+20, y+ (haut+10)*5, lar, haut);
		pan.add(temail);
		
		///Bouton Radio  
		
		//CheckboxGroup  gr1=new CheckboxGroup ();
		
		gr2=new ButtonGroup();
		
		homme=new JRadioButton("Homme",true);
		homme.setBounds(x+lar+20, y+ (haut+10)*3, lar/2, haut);
		pan.add(homme);
	
		
		femme=new JRadioButton("Femme",false);
		femme.setBounds(x+lar+20+lar/2, y+ (haut+10)*3, lar/2, haut);
		pan.add(femme);
		
		
		gr2.add(homme);
		gr2.add(femme);
		  
		////List de choix unique
		cville=new JComboBox();
		cville.addItem(null);
		cville.addItem("Ouarzazate");
		cville.addItem("Errachidia");
		cville.addItem("Zagoura");
		cville.addItem("Tinghir");
		cville.addItem("Midelt");
		cville.setBounds(x+lar+20, y+ (haut+10)*4, lar, haut);
		pan.add(cville);
		
		///les cases � cocher
		
		ar=new JCheckBox("AR");
		ar.setBounds(x+lar+20, y+ (haut+10)*6, lar/4, haut);
		pan.add(ar);
		
		fr=new JCheckBox("FR");
		fr.setBounds(x+lar+20+lar/4, y+ (haut+10)*6, lar/4, haut);
		pan.add(fr);
		
		en=new JCheckBox("EN");
		en.setBounds(x+lar+20+lar/2, y+ (haut+10)*6, lar/4, haut);
		pan.add(en);
		
		es=new JCheckBox("ES");
		es.setBounds(x+lar+20+3*lar/4, y+ (haut+10)*6, lar/4, haut);
		pan.add(es);
		
		
		///les Bouttons
		benregistrer=new JButton("Enregistrer");
		benregistrer.setBounds(x, y+ (haut+10)*8, lar, haut);
		pan.add(benregistrer);
		benregistrer.addActionListener(this);
		
		beffacer=new JButton("Effacer");
		beffacer.setBounds(x+lar+20, y+ (haut+10)*8, lar, haut);
		pan.add(beffacer);
		beffacer.addActionListener(this);
		
		pan.setVisible(true);
		
		return pan;
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		// TODO Auto-generated method stub
		
		Object source=arg.getSource();
		
		if(source.equals(benregistrer)) {
			
			if(tcne.getText().equals("") || tnom.getText().equals("")) {
				System.out.print(" Remplir tous les champs obligatoires");
			}
			
			
			
		}else if(source.equals(beffacer)) {
			
			System.out.print("effacer tous");
			
			tcne.setText("");
			tnom.setText(" ");
			tprenom.setText(" ");
			temail.setText(" ");
			
			
			ar.setSelected(false);
			en.setSelected(false);
			fr.setSelected(false);
			es.setSelected(false);
			
			cville.setSelectedIndex(0);
			
			//cville.setSelectedItem("Ouarzazate");
		}
		
	}


	

}

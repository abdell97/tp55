package tp5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class Ajouter implements ActionListener {
	
	JButton ajouter;
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
		
		lprenom=new JLabel("Pr�nom");
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
		ajouter=new JButton("AJOUTER");
		ajouter.addActionListener(this);
		
		ajouter.setBounds(x, y+ (haut+10)*8, lar, haut);
		pan.add(ajouter);
	
		
	
		
		pan.setVisible(true);
		
		return pan;
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		// TODO Auto-generated method stub
		int n=0;
Object source=arg.getSource();
		
		if(source.equals(ajouter)) {
			String cne = tcne.getText().toString().trim();
			String nom = tnom.getText().toString().trim();
 			String prenom = tprenom.getText().toString().trim();
 			String email = temail.getText().toString().trim();
 			String ville = cville.getSelectedItem()==null? "" : cville.getSelectedItem().toString().trim();
 			String sexe = homme.isSelected()? "homme" : "femme";
 			ArrayList<String> language = new ArrayList<String>();
 			
 			if (ar.isSelected()) {
 				language.add(ar.getText().toString().trim());
 			}
 			if (fr.isSelected()) {
 				language.add(fr.getText().toString().trim());
 			}
 			if (en.isSelected()) {
 				language.add(en.getText().toString().trim());
 			}
 			if (es.isSelected()) {
 				language.add(es.getText().toString().trim());
 			}
 			String etdLan="";
 			for (String lan : language) {
 				etdLan+=lan+",";
 			}
 			if (cne.equals("")|| nom.equals("")||prenom.equals("")||email.equals("")||ville.equals("")||sexe.equals("")||language.equals("")) {
 				JOptionPane.showMessageDialog(null, "vouillez rempires tout lew chams s'il vo plait");
			}else {
				int y = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment modifier ces infos?",
		                "Confirmation", JOptionPane.YES_NO_OPTION);
		       
		 
		            if (n == 1) {
		                
			
 			
		ConnectionDB connexion = new ConnectionDB();
		PreparedStatement sql;
		try {
			sql = connexion.con.prepareStatement("INSERT INTO `etudiant`(`cne`, `nom`, `prenom`, `sexe`, `ville`, `email`, `langue`) VALUES (?,?,?,?,?,?,?)");
			sql.setString(1,cne);
	 		sql.setString(2,nom);
	 		sql.setString(3,prenom);
	 		sql.setString(4,sexe);
	 		sql.setString(5,ville);
	 		sql.setString(6,email);
	 		sql.setString(7,etdLan);
	 		sql.executeUpdate();
	 		
	 		JOptionPane.showMessageDialog(null, "l'eleve ajouter avec seccuse");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}}
		            else {
		            	JOptionPane.showMessageDialog(null,"Impossible d'ajoutez l'eleve","erreur",JOptionPane.ERROR_MESSAGE);
		               
		            }
		           
					}
		
			}
		
		}
	
		
	}



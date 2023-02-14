package tp5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import javax.swing.*;

public class Fenetre implements ActionListener {
	
	JFrame fen;
	JMenuBar barre;
	JMenu mfichier,mhelp,mafficher;
	JMenuItem mienregistrer, mieffacer, miquitter, miquestion, miapropos,maffiche,ajouter,updat,suppr;
	JPanel GlobalPan ;
	public Fenetre(){	 

	}	
	/////////////////////////////////
	void affciher() {
		fen=new JFrame();
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		fen.setTitle("Mon Application En SWING");
		fen.setBounds(100, 100, 800, 600);
		
		
		
		////
		///----------------------les--Menus----------------
		barre = new JMenuBar();
		GlobalPan = new JPanel();
		
		
		GlobalPan.setBounds(0, 0, 800, 600);
		///----------------------MENU Fichier----------------
		mfichier = new JMenu("Fichier");
		
		mienregistrer = new JMenuItem("Enregistrer");
		mieffacer = new JMenuItem("Effacer");
		miquitter = new JMenuItem("Quitter");
		
		mfichier.add(mienregistrer);
		mfichier.add(mieffacer);
		mfichier.addSeparator();
		mfichier.add(miquitter);
		
		///----------------------MENU Affichage----------------
		mafficher = new JMenu("affichier");
		
		 maffiche = new JMenuItem("afficher");
		 ajouter = new JMenuItem("ajouter");
		 updat = new JMenuItem("Mise a jour");
		 suppr = new JMenuItem("Supprimer");
		 
		 mafficher.add(suppr);
		mafficher.add(maffiche);
		mafficher.add(ajouter);
		mafficher.add(updat);
		maffiche.addActionListener(this);
		ajouter.addActionListener(this);
		updat.addActionListener(this);
		suppr.addActionListener(this);
		
		///----------------------MENU HELP----------------
		mhelp = new JMenu("Help");
		
		miquestion = new JMenuItem("Question(?)");
		miapropos = new JMenuItem("A propos");
		
		mhelp.add(miquestion);
		mhelp.add(miapropos);
		
		
		barre.add(mfichier);
		barre.add(mafficher);
		barre.add(mhelp);
		///ajouter la barre de menu dans la fenetre<fen>
		fen.setJMenuBar(barre);
		////------------fin de menu-------------------------
		
		
		////
		///---------------------Ajouter le contenu-------------
		Miseajour p1=new Miseajour();
	    //fen.add(p1.monContenu());
	    fen.add(GlobalPan);
	    
			//---------------------------------	
		fen.setLayout(null);
		fen.setBackground(Color.gray);
		fen.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source =e.getSource();
		if(source.equals(ajouter)) {
			System.out.println("here");
			Ajouter p2=new Ajouter();
			GlobalPan.removeAll();
			GlobalPan.repaint();
			GlobalPan.revalidate();
	        GlobalPan.add(p2.monContenu());
	        GlobalPan.repaint();
		    GlobalPan.revalidate();}
		if(source.equals(maffiche)){
			Afficher p3=new Afficher();
			GlobalPan.removeAll();
			GlobalPan.repaint();
			GlobalPan.revalidate();
			
		    GlobalPan.add(p3.monContenu());
		    GlobalPan.repaint();
			GlobalPan.revalidate();
		}
		if(source.equals(updat)){
			 Miseajour p4=new Miseajour();
			 GlobalPan.removeAll();
				GlobalPan.repaint();
				GlobalPan.revalidate();
				
				GlobalPan.add(p4.monContenu());
			    
			    GlobalPan.repaint();
				GlobalPan.revalidate();
			 
			 
		}
		
		if(source.equals(suppr)){
			 Supprimer p4=new Supprimer();
			 
			 GlobalPan.removeAll();
				GlobalPan.repaint();
				GlobalPan.revalidate();
				GlobalPan.add(p4.monContenu());
				
			    GlobalPan.repaint();
				GlobalPan.revalidate();
		}
	}
  ///////////////////////////////////////////////

		
		
		
	}
	
	
	
	



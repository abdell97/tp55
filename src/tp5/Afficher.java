package tp5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Afficher implements ActionListener{
	
public Component monContenu() {
	
	// TODO Auto-generated method stub
	int x=200,y=50,lar=200,haut=30;
	///couleur de font
	Color label_font_color=new Color(200,210,200);
	
	Panel pan=new Panel();
	
	pan.setBounds(0, 0, 800, 580);
	pan.setLayout(null);
	pan.setBackground(Color.white);	
	 String[] columns = new String[] {
	            "cne", "Nom", "Prenom", "Sexe", "Ville","Email","Lnangue"
	        };
	 
	 DefaultTableModel tab = new DefaultTableModel(columns,0);
	 
	        //crée un JTable avec des données
	        JTable table = new JTable(tab);
	        table.setBounds(0, 0, 800, 580);
	        ConnectionDB dbconn = new ConnectionDB();
			
			// UPdate
			try {
			Statement st=dbconn.con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM etudiant");
			while(rs.next()) {
				tab.addRow(new Object[]{rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
			}
			 pan.add(table);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
	       
	return pan;
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}


}

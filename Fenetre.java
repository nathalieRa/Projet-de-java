/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author acces_libre
 */
public class Fenetre extends JFrame{
    
    private JMenuBar menuBar  = new JMenuBar();
    private JPanel container = new JPanel();
    private JMenu forme = new JMenu ("Forme"),
        calcul = new JMenu ("Calcul"),
        modification = new JMenu ("Modification"),
        copie = new JMenu ("Copie"),
        couleurfond = new JMenu("Couleur Fond"),
        couleurforme = new JMenu ("Couleur forme"),
        couleur = new JMenu ("Couleur"),
        effacer = new JMenu ("Effacer");

	// créations des sous menu
    private JMenuItem carre = new JMenuItem ("Carré"),
        rond = new JMenuItem ("Rond"),
        ligne = new JMenuItem ("Ligne"),
        pinceau = new JMenuItem ("Pinceau"),
        perimetre = new JMenuItem ("Périmètre"),
        aire = new JMenuItem ("Aire"),
        distance = new JMenuItem ("Distance"),
        translation = new JMenuItem ("Translation"),
        symétrie = new JMenuItem ("Symétrie"),
        rotation = new JMenuItem ("Rotation"),
        agrandissement = new JMenuItem ("Agrandissement"),
        vert = new JMenuItem("Vert"),
        rouge = new JMenuItem ("Rouge"),
        blanc = new JMenuItem ("Blanc"),
        bleu = new JMenuItem ("Bleu"),
        jaune = new JMenuItem ("Jaune"),
        fondVert = new JMenuItem("Vert"),
        fondRouge = new JMenuItem ("Rouge"),
        fondBlanc = new JMenuItem ("Blanc"),
        fondBleu = new JMenuItem ("Bleu"),
        fondJaune = new JMenuItem ("Jaune");

    private Dessin dessin = new Dessin();
	// Listener
    /*PinceauListener pin = new PinceauListener();
	CarreListener dessin_carre = new CarreListener();
	CalculListener calc = new CalculListener();
	ModifListener modif = new ModifListener();
	CouleurListener coul = new CouleurListener();
	FondCouleurListener col = new FondCouleurListener();
	EffacerListener effac = new EffacerListener();
*/
        LigneListener lig = new LigneListener();
        
	public Fenetre(){
		// intitialisation de la fenêtre
		this.setTitle("Projet JAVA L3");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null);

		// permet de voir
		this.initMenu();
		//this.setContentPane(pan);
		this.getContentPane().add(dessin, BorderLayout.CENTER);
		this.setVisible(true);   
	}
    
        public void initMenu(){
        
            ligne.addActionListener(lig);
            
            this.couleurfond.add(fondVert);
            this.couleurfond.add(fondBlanc);
            this.couleurfond.add(fondBleu);
            this.couleurfond.add(fondRouge);
            this.couleurfond.add(fondJaune);
            this.couleurforme.add(vert);
            this.couleurforme.add(blanc);
            this.couleurforme.add(bleu);
            this.couleurforme.add(rouge);
            this.couleurforme.add(jaune);
            // ajout des sous menu
            this.forme.add(carre);
            this.forme.add(rond);
            this.forme.add(pinceau);
            this.forme.add(ligne);    
            this.calcul.add(aire);
            this.calcul.add(distance);
            this.calcul.add(perimetre);
            this.modification.add(agrandissement);
            this.modification.add(symétrie);
            this.modification.add(translation);
            this.modification.add(rotation);
            this.couleur.add(couleurfond);
            this.couleur.add(couleurforme);

            // création du menu
            this.menuBar.add(forme);
            this.menuBar.add(couleur);
            //this.menuBar.add(couleurforme);
            this.menuBar.add(modification);
            this.menuBar.add(effacer);
            this.menuBar.add(copie);
            this.menuBar.add(calcul);

            //ajout du menu
            this.setJMenuBar(menuBar);
        }
        
        class LigneListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("hfjshf"); 
                dessin.azer();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
}

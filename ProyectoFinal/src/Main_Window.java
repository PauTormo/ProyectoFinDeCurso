

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


//Main window of Graphic interface
public class Main_Window extends JFrame{
	ConnectionBDD con;
	JPanel panelcen;
	PanelUp panelup;
	PanelInf panelinf;
	PanelCenL panelCenL;
	PanelCenR panelCenR;
	PanelCenInf panelCenInf;
	WarriorContainer warriorsContainer;
	Warriors warriors[];
	private ArrayList<Warriors> wp;
	Character_Window cw;
	
	public Main_Window() {
		con= new ConnectionBDD();
        warriors= new Warriors[2];
		panelup = new PanelUp();
		panelcen = new JPanel(new BorderLayout());
		panelinf = new PanelInf();
		wp=new ArrayList<Warriors>();
		warriorsContainer = new WarriorContainer();
		//setResizable(false);
		wp= warriorsContainer.createWarriorContainer(con);
		for(Warriors w : wp) System.out.println(w.toString());
		panelCenL = new PanelCenL();
		panelCenR = new PanelCenR();
		panelCenInf = new PanelCenInf();
		panelCenL.setOpaque(true);
		panelCenR.setOpaque(true);
		panelCenInf.setOpaque(true);
		panelCenL.setBackground(new Color(220,220,220));
		panelCenR.setBackground(new Color(220,220,220));
		panelCenInf.setBackground(new Color(220,220,220));
		
		panelup.chochar.addActionListener (
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						cw= new Character_Window(wp);
						cw.setAlwaysOnTop(true);
						setEnabled(false);
						cw.addWindowListener(
								new WindowAdapter() {

								
									@Override
									public void windowClosing(WindowEvent arg0) {
										setEnabled(true);
										
									}
								}
								
								);
					}
					
				});
		panelup.choweap.addActionListener (
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						Weapon_Window cw= new Weapon_Window();
						cw.setAlwaysOnTop(true);
						setEnabled(false);
						cw.addWindowListener(
								new WindowAdapter() {

								
									@Override
									public void windowClosing(WindowEvent arg0) {
										setEnabled(true);
										
									}
								}
								
								);
					}
					
				});
	
		setSize(900,750);
		panelcen.setOpaque(true);
		panelup.setOpaque(true);
		panelinf.setOpaque(true);
		panelcen.setBackground(new Color(220,220,220));
		panelup.setBackground(new Color(220,220,220));
		panelinf.setBackground(new Color(220,220,220));
		
		add(panelcen,BorderLayout.CENTER);
		panelcen.add(panelCenL,BorderLayout.WEST);
		panelcen.add(panelCenR,BorderLayout.EAST);
		panelcen.add(panelCenInf,BorderLayout.SOUTH);
		add(panelup,BorderLayout.NORTH);
		add(panelinf,BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	
	
}


//Superior panel of Main window "Main_Window"
class PanelUp extends JPanel{
	JButton chochar,choweap,ranking;
	public PanelUp() {
		chochar = new JButton("Choose Character");
		choweap = new JButton("Choose Weapon");
		ranking = new JButton("Ranking");
		add(chochar);
		add(choweap);
		add(ranking);
	}
}

//Inferior panel of Main window "Main_Window"
class PanelInf extends JPanel{
	JScrollPane scrlbar;
	JTextArea cmndline;
	public PanelInf() {
		cmndline = new JTextArea(6,81);
		scrlbar = new JScrollPane(cmndline);
		cmndline.setEditable(false);
		add(scrlbar);
	}
}

//Center Panel
//Left panel of Center Panel of Main Window "Main_Window"
class PanelCenL extends JPanel{
	JLabel img;
	JProgressBar hp_bar;
	PanelCenLInf panelCenLInf;
	public PanelCenL() {
		panelCenLInf = new PanelCenLInf();
		panelCenLInf.setSize(200, 200);
		setLayout(new BorderLayout());
		Image imagen = new ImageIcon("imagenes/Weapons/DoubleDagger.png").getImage();
		ImageIcon imagen2 = new ImageIcon(imagen.getScaledInstance(250, 250, Image.SCALE_SMOOTH));
		img=new JLabel(imagen2);
		img.getPreferredSize();
		
		panelCenLInf.setOpaque(true);
		panelCenLInf.setBackground(new Color(220,220,220));
		
		hp_bar = new JProgressBar(0,100);
		hp_bar.setPreferredSize(new Dimension(400,80));
		hp_bar.setValue(100);
		hp_bar.setForeground(Color.green);
		hp_bar.setStringPainted(true);
		
		setSize(420,500);
		add(hp_bar,BorderLayout.NORTH);
		add(img,BorderLayout.CENTER);
		add(panelCenLInf,BorderLayout.SOUTH);
	}
}
class PanelCenLInf extends JPanel{
	JPanel izq,der,cen;
	JLabel img;
	JList statsname, stats;
	JProgressBar str,def,agi,spd;
	public PanelCenLInf() {
		
		setSize(200, 200);
		izq = new JPanel();
		cen = new JPanel();
		der = new JPanel(new GridLayout(4,1));
		
		String[] info= {"Power","Agility","Speed","Defense"}; 
		statsname=new JList(info);
		
		statsname.setBackground(new Color(220,220,220));
		Image imagen = new ImageIcon("imagenes/Warriors/haldir.jpg").getImage();
		ImageIcon imagen2 = new ImageIcon(imagen.getScaledInstance(65, 50, Image.SCALE_SMOOTH));
		img=new JLabel(imagen2);
		img.getPreferredSize();
	
		izq.setOpaque(true);
		izq.setBackground(new Color(220,220,220));
		der.setOpaque(true);
		der.setBackground(new Color(220,220,220));
		cen.setOpaque(true);
		cen.setBackground(new Color(220,220,220));
		cen.setPreferredSize(new Dimension(100,0));
		izq.add(img);
		izq.add(statsname);
		
	
		
		str = new JProgressBar(0,15);
		str.setPreferredSize(new Dimension(140,18));
		str.setValue(15);
		str.setStringPainted(false);
		str.setForeground(Color.red);

		agi = new JProgressBar(0,15);
		agi.setPreferredSize(new Dimension(140,18));
		agi.setValue(15);
		agi.setStringPainted(false);
		agi.setForeground(new Color(153,50,204));
		
		def = new JProgressBar(0,15);
		def.setPreferredSize(new Dimension(140,18));
		def.setValue(15);
		def.setStringPainted(false);
		def.setForeground(Color.blue);
		
		spd = new JProgressBar(0,15);
		spd.setPreferredSize(new Dimension(140,18));
		spd.setValue(15);
		spd.setStringPainted(false);
		spd.setForeground(Color.yellow);
		
		der.add(str);
		der.add(agi);
		der.add(def);
		der.add(spd);
		
		
		add(izq,BorderLayout.WEST);
		add(cen,BorderLayout.CENTER);
		add(der,BorderLayout.EAST);
	}
}
//Right panel of Center Panel of Main Window "panelcen"
class PanelCenR extends JPanel{
	JLabel img;
	JProgressBar hp_bar;
	PanelCenRInf panelCenRInf;
	public PanelCenR() {
		panelCenRInf = new PanelCenRInf();
		panelCenRInf.setSize(200, 200);
		setLayout(new BorderLayout());
		Image imagen = new ImageIcon("imagenes/Weapons/DoubleDagger.png").getImage();
		ImageIcon imagen2 = new ImageIcon(imagen.getScaledInstance(250, 250, Image.SCALE_SMOOTH));
		img=new JLabel(imagen2);
		img.getPreferredSize();
		
		panelCenRInf.setOpaque(true);
		panelCenRInf.setBackground(new Color(220,220,220));
		
		hp_bar = new JProgressBar(0,100);
		hp_bar.setPreferredSize(new Dimension(400,80));
		hp_bar.setValue(100);
		hp_bar.setForeground(Color.green);
		hp_bar.setStringPainted(true);
		
		setSize(420,500);
		add(hp_bar,BorderLayout.NORTH);
		add(img,BorderLayout.CENTER);
		add(panelCenRInf,BorderLayout.SOUTH);
	}
}
class PanelCenRInf extends JPanel{
	JPanel izq,der,cen;
	JLabel img;
	JList statsname, stats;
	JProgressBar str,def,agi,spd;
	public PanelCenRInf() {
		
		setSize(200, 200);
		izq = new JPanel();
		cen = new JPanel();
		der = new JPanel(new GridLayout(4,1));
		
		String[] info= {"Power","Agility","Speed","Defense"}; 
		statsname=new JList(info);
		statsname.setBackground(new Color(220,220,220));
		Image imagen = new ImageIcon("imagenes/Weapons/DoubleDagger.png").getImage();
		ImageIcon imagen2 = new ImageIcon(imagen.getScaledInstance(65, 50, Image.SCALE_SMOOTH));
		img=new JLabel(imagen2);
		img.getPreferredSize();
	
		izq.setOpaque(true);
		izq.setBackground(new Color(220,220,220));
		der.setOpaque(true);
		der.setBackground(new Color(220,220,220));
		cen.setOpaque(true);
		cen.setBackground(new Color(220,220,220));
		cen.setPreferredSize(new Dimension(100,0));
		izq.add(img);
		izq.add(statsname);
		
	
		
		str = new JProgressBar(0,15);
		str.setPreferredSize(new Dimension(140,18));
		str.setValue(8);
		str.setStringPainted(false);
		str.setForeground(Color.red);

		agi = new JProgressBar(0,15);
		agi.setPreferredSize(new Dimension(140,18));
		agi.setValue(15);
		agi.setStringPainted(false);
		agi.setForeground(new Color(153,50,204));
		
		def = new JProgressBar(0,15);
		def.setPreferredSize(new Dimension(140,18));
		def.setValue(15);
		def.setStringPainted(false);
		def.setForeground(Color.blue);
		
		spd = new JProgressBar(0,15);
		spd.setPreferredSize(new Dimension(140,18));
		spd.setValue(15);
		spd.setStringPainted(false);
		spd.setForeground(Color.yellow);
		
		der.add(str);
		der.add(agi);
		der.add(def);
		der.add(spd);
		
		add(der,BorderLayout.WEST);
		
		add(cen,BorderLayout.CENTER);
		add(izq,BorderLayout.EAST);
	}
}
//Inferior panel of Center Panel of Main Window "panelcen"
class PanelCenInf extends JPanel{
	JButton fight,clcons;
	public PanelCenInf() {
		fight=new JButton("FIGHT");
		clcons=new JButton("Clear Console");
		
		add(fight);
		add(clcons);
	}
}



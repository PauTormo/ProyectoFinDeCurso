


import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Character_Window extends JFrame{
	JButton img,img2,img3,img4,img5,img6,img7,img8,img9;
	JButton images[];
	public Character_Window(ArrayList<Warriors> wp) {
		setLayout(new GridLayout(3,3));
		setSize(900,750);
		images=new JButton[9];
		int i=0;
		for(Warriors w : wp) {
			Image image = new ImageIcon("imagenes/Warriors/"+w.getImagePath()).getImage();
			ImageIcon imageC1 = new ImageIcon(image.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
			images[i]=new JButton(imageC1);
			images[i].getPreferredSize();
			add(images[i]);	
		}
		
	/*	Image boromir = new ImageIcon("imagenes/Warriors/Boromir.jpg").getImage();
		ImageIcon imageC1 = new ImageIcon(boromir.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img=new JButton(imageC1);
		img.getPreferredSize();
		add(img);
		
		Image aragorn = new ImageIcon("imagenes/Warriors/Aragorn.jpg").getImage();
		ImageIcon imageC2 = new ImageIcon(aragorn.getScaledInstance(300, 250, Image.SCALE_SMOOTH));		
		img2=new JButton(imageC2);
		img2.getPreferredSize();
		add(img2);

		Image eomer = new ImageIcon("imagenes/Warriors/eomer.png").getImage();
		ImageIcon imageC3 = new ImageIcon(eomer.getScaledInstance(300, 250, Image.SCALE_SMOOTH));		
		img3=new JButton(imageC3);
		img3.getPreferredSize();
		add(img3);
		
		Image gimli = new ImageIcon("imagenes/Warriors/gimli.png").getImage();
		ImageIcon imageC4 = new ImageIcon(gimli.getScaledInstance(300, 250, Image.SCALE_SMOOTH));			
		img4=new JButton(imageC4);
		img4.getPreferredSize();
		add(img4);
		
		Image balin = new ImageIcon("imagenes/Warriors/balin.jpeg").getImage();
		ImageIcon imageC5 = new ImageIcon(balin.getScaledInstance(300, 250, Image.SCALE_SMOOTH));	
		img5=new JButton(imageC5);
		img5.getPreferredSize();
		add(img5);

		Image dwalin = new ImageIcon("imagenes/Warriors/dwalin.jpg").getImage();
		ImageIcon imageC6 = new ImageIcon(dwalin.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img6=new JButton(imageC6);
		img6.getPreferredSize();
		add(img6);
		
		Image haldir = new ImageIcon("imagenes/Warriors/haldir.jpg").getImage();
		ImageIcon imageC7 = new ImageIcon(haldir.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img7=new JButton(imageC7);
		img7.getPreferredSize();
		add(img7);
		
		Image legolas = new ImageIcon("imagenes/Warriors/legolas.jpg").getImage();
		ImageIcon imageC8 = new ImageIcon(legolas.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img8=new JButton(imageC8);
		img8.getPreferredSize();
		add(img8);
	
		Image elrond = new ImageIcon("imagenes/Warriors/elrond.jpg").getImage();
		ImageIcon imageC9 = new ImageIcon(elrond.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img9=new JButton(imageC9);
		img9.getPreferredSize();
		add(img9);*/
		
		setVisible(true);
	}
}

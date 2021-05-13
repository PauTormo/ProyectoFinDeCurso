


import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Weapon_Window extends JFrame{
	JButton img,img2,img3,img4,img5,img6,img7,img8,img9;
	public Weapon_Window() {
		setLayout(new GridLayout(3,3));
		setSize(900,750);
		
		Image sword = new ImageIcon("imagenes/Weapons/Sword.jpg").getImage();
		ImageIcon imageW1 = new ImageIcon(sword.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img=new JButton(imageW1);
		img.getPreferredSize();
		add(img);
		
		Image doubleswords = new ImageIcon("imagenes/Weapons/double swords.jpg").getImage();
		ImageIcon imageW2 = new ImageIcon(doubleswords.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img2=new JButton(imageW2);
		img2.getPreferredSize();
		add(img2);
		
		Image katana = new ImageIcon("imagenes/Weapons/katana.jpg").getImage();
		ImageIcon imageW3 = new ImageIcon(katana.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img3=new JButton(imageW3);
		img3.getPreferredSize();
		add(img3);
		
		Image bow = new ImageIcon("imagenes/Weapons/bow.jpg").getImage();
		ImageIcon imageW4 = new ImageIcon(bow.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img4=new JButton(imageW4);
		img4.getPreferredSize();
		add(img4);
		
		Image ax = new ImageIcon("imagenes/Weapons/ax.jpg").getImage();
		ImageIcon imageW5 = new ImageIcon(ax.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img5=new JButton(imageW5);
		img5.getPreferredSize();
		add(img5);
		
		Image twoAx = new ImageIcon("imagenes/Weapons/two-handed ax.jpg").getImage();
		ImageIcon imageW6 = new ImageIcon(twoAx.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img6=new JButton(imageW6);
		img6.getPreferredSize();
		add(img6);
		
		Image scimitar = new ImageIcon("imagenes/Weapons/Scimitar.jpg").getImage();
		ImageIcon imageW7 = new ImageIcon(scimitar.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img7=new JButton(imageW7);
		img7.getPreferredSize();
		add(img7);
		
		Image dirk = new ImageIcon("imagenes/Weapons/dirk.jpg").getImage();
		ImageIcon imageW8 = new ImageIcon(dirk.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img8=new JButton(imageW8);
		img8.getPreferredSize();
		add(img8);
		
		Image dagger = new ImageIcon("imagenes/Weapons/dagger.jpg").getImage();
		ImageIcon imageW9 = new ImageIcon(dagger.getScaledInstance(300, 250, Image.SCALE_SMOOTH));
		img9=new JButton(imageW9);
		img9.getPreferredSize();
		add(img9);
		
		setVisible(true);
	}
}

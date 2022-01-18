package myfirstguipackage;

import javax.swing.*;
import java.util.Scanner;
import java.awt.Color;
import java.awt.color.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class guirunner {
	public static void main(String[] args) throws FileNotFoundException {
		File sus = new File("src/myfirstguipackage/houses.txt");
		Scanner fill = new Scanner(sus);
		ArrayList<House> house = new ArrayList<House>();
		for (int i = 0; i < 4; i++) {
			int bedrooms = fill.nextInt();
			double bathrooms = fill.nextDouble();
			int cost = fill.nextInt();
			String address = fill.next();
			String imagelocation = fill.next();
			house.add(new House(bedrooms, bathrooms, cost, address, imagelocation));

		}
		buildGUI(house);

	}

	private static void buildGUI(final ArrayList<House> house) {
		JFrame frame = new JFrame("basic gui");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,1000);

		// add eveerything to frame here
		JLabel lablel1 = new JLabel("our houses");
		lablel1.setBounds(20, 40, 100, 30);
		frame.add(lablel1);
		JButton button1 = new JButton(house.get(0).getaddress());
		button1.setBounds(270, 20, 500, 30);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// say what to do when button is pressed
				buildGUI2(0, house);

			}

			JButton button = new JButton(house.get(0).getaddress());
		});

		
		
		JButton button2 = new JButton(house.get(1).getaddress());
		button2.setBounds(270, 100, 500, 30);
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// say what to do when button is pressed
				buildGUI2(1, house);

			}

		});
		JButton button3 = new JButton(house.get(2).getaddress());
		button3.setBounds(270, 150, 500, 30);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// say what to do when button is pressed
				buildGUI2(2, house);

			}

		});
		JButton button4 = new JButton(house.get(3).getaddress());
		button4.setBounds(270, 200, 500, 30);
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// say what to do when button is pressed
				buildGUI2(3, house);

			}

		})
		;

		
		
		
		
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button4);
		frame.add(button3);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	private static void buildGUI2(int whichone, ArrayList<House> hobohut) {
		JFrame frame = new JFrame("gg");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// add eveerything to frame here
		JLabel lablel1 = new JLabel("address = " + hobohut.get(whichone).getaddress() + " cost = "
				+ hobohut.get(whichone).getcost() + " bedrooms  = " + hobohut.get(whichone).getbathrooms()
				+ " bathrooms = " + hobohut.get(whichone).getbathrooms());
		lablel1.setBounds(20, 40, 500, 30);
		frame.add(lablel1);

		frame.setSize(1000, 1000);

		JLabel picturelabel = new JLabel();
		picturelabel.setBounds(20, 350, 500, 500);
		ImageIcon thiccboywings = new ImageIcon(hobohut.get(whichone).getimagelocation());
		ImageIcon scaledimage = new ImageIcon(thiccboywings.getImage().getScaledInstance(picturelabel.getWidth(),
				picturelabel.getHeight(), java.awt.Image.SCALE_SMOOTH));
		JLabel picturelabel2 = new JLabel(scaledimage);
		picturelabel2.setBounds(20, 350, scaledimage.getIconHeight(), scaledimage.getIconWidth());
		frame.add(picturelabel2);
		frame.setLayout(null);
		frame.setVisible(true);

	}
}

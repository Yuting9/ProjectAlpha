import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class page {
	private static JTextField txtName;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	public static void main(String args[]){
		game();
	}
	public static void game(){
		final String ideal = "--Ideals", align = "--Morals";
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(700, 500);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		
		JLabel lblCharacterCreation = new JLabel("Character Creation");
		panel.add(lblCharacterCreation);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		panel_1.add(btnCancel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Character", null, panel_2, null);
		panel_2.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(10, 10, 157, 20);
		panel_2.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(177, 9, 46, 19);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblName);
		
		JComboBox raceCombo = new JComboBox();
		raceCombo.setBounds(10, 36, 135, 20);
		raceCombo.setToolTipText("choose[0] a race");
		raceCombo.setModel(new DefaultComboBoxModel(new String[] {"   ","Dwarf", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Tiefling"}));
		panel_2.add(raceCombo);
		
		JLabel lblAlignment = new JLabel("choose[0] Alignment");
		lblAlignment.setBounds(454, 9, 116, 19);
		lblAlignment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox combo1 = new JComboBox();
		combo1.setBounds(250, 10, 95, 20);
		combo1.setModel(new DefaultComboBoxModel(new String[] {"--Ideals","Lawful", "Neutral", "Chaotic"}));
		panel_2.add(combo1);
		
		JComboBox combo2 = new JComboBox();
		combo2.setBounds(349, 10, 95, 20);
		combo2.setModel(new DefaultComboBoxModel(new String[] {"--Morals","Good", "Neutral", "Evil"}));
		panel_2.add(combo2);
		
		combo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = (String) combo1.getSelectedItem();
				String al = (String) combo2.getSelectedItem();
				if(!al.equals("--Morals") && !id.equals("--Ideals")){
					if(al.equals("Neutral") && id.equals("Neutral"))
						id = "True";
					lblAlignment.setText(id+" "+al);
				}
				else{
					lblAlignment.setText("choose[0] Alignment");
				}
			}
		});
		combo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = (String) combo1.getSelectedItem();
				String al = (String) combo2.getSelectedItem();
				if(!al.equals("--Morals") && !id.equals("--Ideals")){
					if(al.equals("Neutral") && id.equals("Neutral"))
						id = "True";
					lblAlignment.setText(id+" "+al);
				}
				else{
					lblAlignment.setText("choose[0] Alignment");
				}
			}
		});
		panel_2.add(lblAlignment);
		
		
		JLabel lblRace = new JLabel("Race");
		lblRace.setBounds(155, 35, 33, 19);
		lblRace.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblRace);
		
		DefaultComboBoxModel def = new DefaultComboBoxModel(new String[] {"N/A"});
		DefaultComboBoxModel dwr = new DefaultComboBoxModel(new String[] {"Hill Dwarf", "Mountain Dwarf"});
		DefaultComboBoxModel hal = new DefaultComboBoxModel(new String[] {"Ligntfoot", "Stout"});
		DefaultComboBoxModel elf = new DefaultComboBoxModel(new String[] {"High Elf", "Wood Elf", "Dark Elf"});
		DefaultComboBoxModel hum = new DefaultComboBoxModel(new String[] {"Calishite", "Chondathan",
																		  "Damaran", "Illuskan", "Mulan", "Rashemi",
																		  "Shou", "Tethyran", "Turami"});
		DefaultComboBoxModel dgb = new DefaultComboBoxModel(new String[] {"Black", "Blue", "Brass", "Bronze", "Copper",
																		  "Gold", "Green", "Red", "Silver", "White"});
		DefaultComboBoxModel gnm = new DefaultComboBoxModel(new String[] {"Forest Gnome", "Rock Gnome", "Deep Gnome"});
		DefaultComboBoxModel hlf = new DefaultComboBoxModel(new String[] {"N/A"});
		DefaultComboBoxModel hor = new DefaultComboBoxModel(new String[] {"N/A"});
		DefaultComboBoxModel tie = new DefaultComboBoxModel(new String[] {"N/A"});
		
		JComboBox subCombo = new JComboBox();
		subCombo.setBounds(10, 62, 135, 20);
		subCombo.setModel(def);
		panel_2.add(subCombo);
		
		JLabel lblsubRace = new JLabel("Subrace");
		lblsubRace.setBounds(157, 61, 55, 19);
		lblsubRace.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblsubRace);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		
		JScrollPane scrollBar = new JScrollPane(textArea);
		scrollBar.setBounds(10, 273, 377, 116);
		panel_2.add(scrollBar);
		
		JLabel lblCharacter = new JLabel("Character Biography");
		lblCharacter.setBounds(398, 320, 150, 21);
		lblCharacter.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.add(lblCharacter);
		
		textField = new JTextField();
		textField.setBounds(10, 122, 86, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 148, 86, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 174, 86, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 200, 86, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEyeColor = new JLabel("Eye Color");
		lblEyeColor.setBounds(102, 123, 61, 19);
		lblEyeColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblEyeColor);
		
		JLabel lblHairColor = new JLabel("Hair Color");
		lblHairColor.setBounds(102, 149, 62, 19);
		lblHairColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblHairColor);
		
		JLabel lblSkinColor = new JLabel("Skin Color");
		lblSkinColor.setBounds(102, 175, 62, 19);
		lblSkinColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblSkinColor);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(102, 201, 41, 19);
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(102, 226, 45, 19);
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblWeight);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 226, 86, 20);
		textField_4.setColumns(10);
		panel_2.add(textField_4);
		
		raceCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = (String) raceCombo.getSelectedItem();
				switch(id){
				case "Dwarf":
					subCombo.setModel(dwr);
					break;
				case "Elf":
					subCombo.setModel(elf);
					break;
				case "Halfling":
					subCombo.setModel(hal);
					break;
				case "Human":
					subCombo.setModel(hum);
					break;
				case "Dragonborn":
					subCombo.setModel(dgb);
					break;
				case "Gnome":
					subCombo.setModel(gnm);
					break;
				case "Half-Elf":
					subCombo.setModel(hlf);
					break;
				case "Half-Orc":
					subCombo.setModel(hor);
					break;
				case "Tiefling":
					subCombo.setModel(tie);
					break;
				default:
					subCombo.setModel(def);
				}
			}
		});
		
		final int[] att = new int[8], pts = new int[1];
		pts[0] = 27;
		Arrays.fill(att, 8);
		
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Attributes", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane.setEditable(false);
		textPane.setText(Integer.toString(att[0]));
		textPane.setBounds(10, 110, 53, 26);
		panel_3.add(textPane);
		
		JButton btnUp = new JButton("+");
		btnUp.setBounds(10, 84, 53, 28);
		panel_3.add(btnUp);
		
		JButton button_0 = new JButton("-");
		button_0.setBounds(10, 135, 53, 26);
		panel_3.add(button_0);
		
		JLabel lblStrength = new JLabel("Strength");
		lblStrength.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStrength.setBounds(63, 110, 67, 26);
		panel_3.add(lblStrength);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1.setText(Integer.toString(pts[0]));
		textPane_1.setBounds(10, 28, 26, 26);
		panel_3.add(textPane_1);
		
		JLabel lblPointsRemaining = new JLabel("Points Remaining");
		lblPointsRemaining.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPointsRemaining.setBounds(46, 28, 154, 26);
		panel_3.add(lblPointsRemaining);
		
		JLabel lblDexterity = new JLabel("Dexterity");
		lblDexterity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDexterity.setBounds(193, 110, 67, 26);
		panel_3.add(lblDexterity);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBounds(140, 84, 53, 28);
		panel_3.add(button_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText(Integer.toString(att[1]));
		textPane_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane_2.setEditable(false);
		textPane_2.setBounds(140, 110, 53, 26);
		panel_3.add(textPane_2);
		
		JButton button_2 = new JButton("-");
		button_2.setBounds(140, 135, 53, 26);
		panel_3.add(button_2);
		
		JLabel lblConstitution = new JLabel("Constitution");
		lblConstitution.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConstitution.setBounds(323, 110, 81, 26);
		panel_3.add(lblConstitution);
		
		JButton button_3 = new JButton("+");
		button_3.setBounds(270, 84, 53, 28);
		panel_3.add(button_3);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText(Integer.toString(att[2]));
		textPane_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane_3.setEditable(false);
		textPane_3.setBounds(270, 110, 53, 26);
		panel_3.add(textPane_3);
		
		JButton button_4 = new JButton("-");
		button_4.setBounds(270, 135, 53, 26);
		panel_3.add(button_4);
		
		JLabel lblIntelligence = new JLabel("Intelligence");
		lblIntelligence.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIntelligence.setBounds(63, 203, 81, 26);
		panel_3.add(lblIntelligence);
		
		JButton button_5 = new JButton("+");
		button_5.setBounds(10, 177, 53, 28);
		panel_3.add(button_5);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText(Integer.toString(att[3]));
		textPane_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane_4.setEditable(false);
		textPane_4.setBounds(10, 203, 53, 26);
		panel_3.add(textPane_4);
		
		JButton button_6 = new JButton("-");
		button_6.setBounds(10, 228, 53, 26);
		panel_3.add(button_6);
		
		JButton button_7 = new JButton("+");
		button_7.setBounds(140, 177, 53, 28);
		panel_3.add(button_7);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText(Integer.toString(att[4]));
		textPane_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane_5.setEditable(false);
		textPane_5.setBounds(140, 203, 53, 26);
		panel_3.add(textPane_5);
		
		JButton button_8 = new JButton("-");
		button_8.setBounds(140, 228, 53, 26);
		panel_3.add(button_8);
		
		JLabel lblWisdom = new JLabel("Wisdom");
		lblWisdom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWisdom.setBounds(193, 203, 81, 26);
		panel_3.add(lblWisdom);
		
		JButton button_9 = new JButton("+");
		button_9.setBounds(270, 177, 53, 28);
		panel_3.add(button_9);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText(Integer.toString(att[5]));
		textPane_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane_6.setEditable(false);
		textPane_6.setBounds(270, 203, 53, 26);
		panel_3.add(textPane_6);
		
		JButton button_10 = new JButton("-");
		button_10.setBounds(270, 228, 53, 26);
		panel_3.add(button_10);
		
		JLabel lblCharisma = new JLabel("Charisma");
		lblCharisma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCharisma.setBounds(323, 203, 81, 26);
		panel_3.add(lblCharisma);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(412, 7, 171, 368);
		panel_3.add(panel_5);
		FlowLayout fl_panel_5 = new FlowLayout(FlowLayout.CENTER, 5, 5);
		panel_5.setLayout(fl_panel_5);
		
		JRadioButton rdBtnAcrobatics = new JRadioButton("Acrobatics");
		rdBtnAcrobatics.setEnabled(false);
		panel_5.add(rdBtnAcrobatics);
		
		JRadioButton rdBtnAnimalH = new JRadioButton("Animal Handling");
		rdBtnAnimalH.setEnabled(false);
		panel_5.add(rdBtnAnimalH);
		
		JRadioButton rdBtnArcana = new JRadioButton("Arcana");
		rdBtnArcana.setEnabled(false);
		panel_5.add(rdBtnArcana);
		
		JRadioButton rdBtnAthletics = new JRadioButton("Athletics");
		rdBtnAthletics.setEnabled(false);
		panel_5.add(rdBtnAthletics);
		
		JRadioButton rdBtnDeception = new JRadioButton("Deception");
		rdBtnDeception.setEnabled(false);
		panel_5.add(rdBtnDeception);
		
		JRadioButton rdBtnHistory = new JRadioButton("History");
		rdBtnHistory.setEnabled(false);
		panel_5.add(rdBtnHistory);
		
		JRadioButton rdBtnInsight = new JRadioButton("Insight");
		rdBtnInsight.setEnabled(false);
		panel_5.add(rdBtnInsight);
		
		JRadioButton rdBtnIntimidation = new JRadioButton("Intimidation");
		rdBtnIntimidation.setEnabled(false);
		panel_5.add(rdBtnIntimidation);
		
		JRadioButton rdBtnInvestigation = new JRadioButton("Investigation");
		rdBtnInvestigation.setEnabled(false);
		panel_5.add(rdBtnInvestigation);
		
		JRadioButton rdBtnMedicine = new JRadioButton("Medicine");
		rdBtnMedicine.setEnabled(false);
		panel_5.add(rdBtnMedicine);
		
		JRadioButton rdBtnNature = new JRadioButton("Nature");
		rdBtnNature.setEnabled(false);
		panel_5.add(rdBtnNature);
		
		JRadioButton rdBtnPerception = new JRadioButton("Perception");
		rdBtnPerception.setEnabled(false);
		panel_5.add(rdBtnPerception);
		
		JRadioButton rdBtnPerform = new JRadioButton("Performance");
		rdBtnPerform.setEnabled(false);
		panel_5.add(rdBtnPerform);
		
		JRadioButton rdBtnPersuasion = new JRadioButton("Persuasion");
		rdBtnPersuasion.setEnabled(false);
		panel_5.add(rdBtnPersuasion);
		
		JRadioButton rdBtnReligion = new JRadioButton("Religion");
		rdBtnReligion.setEnabled(false);
		panel_5.add(rdBtnReligion);
		
		JRadioButton rdbtnSlightOfHand = new JRadioButton("Slight of Hand");
		rdbtnSlightOfHand.setEnabled(false);
		panel_5.add(rdbtnSlightOfHand);
		
		JRadioButton rdbtnStealth = new JRadioButton("Stealth");
		rdbtnStealth.setEnabled(false);
		panel_5.add(rdbtnStealth);
		
		JRadioButton rdbtnSurvival = new JRadioButton("Survival");
		rdbtnSurvival.setEnabled(false);
		panel_5.add(rdbtnSurvival);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Class","Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"}));
		comboBox.setBounds(10, 286, 81, 20);
		panel_3.add(comboBox);
		
		int[] choose = new int[1];
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String what = (String)comboBox.getSelectedItem();
				rdBtnAcrobatics.setSelected(false);
				rdBtnAnimalH.setSelected(false);
				rdBtnArcana.setSelected(false);
				rdBtnAthletics.setSelected(false);
				rdBtnDeception.setSelected(false);
				rdBtnHistory.setSelected(false);
				rdBtnInsight.setSelected(false);
				rdBtnIntimidation.setSelected(false);
				rdBtnInvestigation.setSelected(false);
				rdBtnMedicine.setSelected(false);
				rdBtnNature.setSelected(false);
				rdBtnPerception.setSelected(false);
				rdBtnPerform.setSelected(false);
				rdBtnPersuasion.setSelected(false);
				rdBtnReligion.setSelected(false);
				rdbtnSlightOfHand.setSelected(false);
				rdbtnStealth.setSelected(false);
				rdbtnSurvival.setSelected(false);
				rdBtnAcrobatics.setEnabled(false);
				rdBtnAnimalH.setEnabled(false);
				rdBtnArcana.setEnabled(false);
				rdBtnAthletics.setEnabled(false);
				rdBtnDeception.setEnabled(false);
				rdBtnHistory.setEnabled(false);
				rdBtnInsight.setEnabled(false);
				rdBtnIntimidation.setEnabled(false);
				rdBtnInvestigation.setEnabled(false);
				rdBtnMedicine.setEnabled(false);
				rdBtnNature.setEnabled(false);
				rdBtnPerception.setEnabled(false);
				rdBtnPerform.setEnabled(false);
				rdBtnPersuasion.setEnabled(false);
				rdBtnReligion.setEnabled(false);
				rdbtnSlightOfHand.setEnabled(false);
				rdbtnStealth.setEnabled(false);
				rdbtnSurvival.setEnabled(false);
				switch(what){
				case "Barbarian":
					rdBtnAcrobatics.setEnabled(false);
					rdBtnAnimalH.setEnabled(true);
					rdBtnArcana.setEnabled(false);
					rdBtnAthletics.setEnabled(true);
					rdBtnDeception.setEnabled(false);
					rdBtnHistory.setEnabled(false);
					rdBtnInsight.setEnabled(false);
					rdBtnIntimidation.setEnabled(true);
					rdBtnInvestigation.setEnabled(false);
					rdBtnMedicine.setEnabled(false);
					rdBtnNature.setEnabled(true);
					rdBtnPerception.setEnabled(true);
					rdBtnPerform.setEnabled(false);
					rdBtnPersuasion.setEnabled(false);
					rdBtnReligion.setEnabled(false);
					rdbtnSlightOfHand.setEnabled(false);
					rdbtnStealth.setEnabled(false);
					rdbtnSurvival.setEnabled(true);
					choose[0] = 2;
					break;
				case "Bard":
					rdBtnAcrobatics.setEnabled(true);
					rdBtnAnimalH.setEnabled(true);
					rdBtnArcana.setEnabled(true);
					rdBtnAthletics.setEnabled(true);
					rdBtnDeception.setEnabled(true);
					rdBtnHistory.setEnabled(true);
					rdBtnInsight.setEnabled(true);
					rdBtnIntimidation.setEnabled(true);
					rdBtnInvestigation.setEnabled(true);
					rdBtnMedicine.setEnabled(true);
					rdBtnNature.setEnabled(true);
					rdBtnPerception.setEnabled(true);
					rdBtnPerform.setEnabled(true);
					rdBtnPersuasion.setEnabled(true);
					rdBtnReligion.setEnabled(true);
					rdbtnSlightOfHand.setEnabled(true);
					rdbtnStealth.setEnabled(true);
					rdbtnSurvival.setEnabled(true);
					choose[0] = 3;
					break;
				case "Cleric":
					rdBtnAcrobatics.setEnabled(false);
					rdBtnAnimalH.setEnabled(false);
					rdBtnArcana.setEnabled(false);
					rdBtnAthletics.setEnabled(false);
					rdBtnDeception.setEnabled(false);
					rdBtnHistory.setEnabled(true);
					rdBtnInsight.setEnabled(true);
					rdBtnIntimidation.setEnabled(false);
					rdBtnInvestigation.setEnabled(false);
					rdBtnMedicine.setEnabled(true);
					rdBtnNature.setEnabled(false);
					rdBtnPerception.setEnabled(false);
					rdBtnPerform.setEnabled(false);
					rdBtnPersuasion.setEnabled(false);
					rdBtnReligion.setEnabled(true);
					rdbtnSlightOfHand.setEnabled(false);
					rdbtnStealth.setEnabled(false);
					rdbtnSurvival.setEnabled(false);
					choose[0] = 2;
					break;
				case "Druid":
					rdBtnAcrobatics.setEnabled(false);
					rdBtnAnimalH.setEnabled(true);
					rdBtnArcana.setEnabled(true);
					rdBtnAthletics.setEnabled(false);
					rdBtnDeception.setEnabled(false);
					rdBtnHistory.setEnabled(false);
					rdBtnInsight.setEnabled(true);
					rdBtnIntimidation.setEnabled(false);
					rdBtnInvestigation.setEnabled(false);
					rdBtnMedicine.setEnabled(true);
					rdBtnNature.setEnabled(true);
					rdBtnPerception.setEnabled(true);
					rdBtnPerform.setEnabled(false);
					rdBtnPersuasion.setEnabled(false);
					rdBtnReligion.setEnabled(true);
					rdbtnSlightOfHand.setEnabled(false);
					rdbtnStealth.setEnabled(false);
					rdbtnSurvival.setEnabled(true);
					choose[0] = 2;
					break;
				case "Fighter":
					rdBtnAcrobatics.setEnabled(true);
					rdBtnAnimalH.setEnabled(true);
					rdBtnAthletics.setEnabled(true);
					rdBtnHistory.setEnabled(true);
					rdBtnInsight.setEnabled(true);
					rdBtnIntimidation.setEnabled(true);
					rdBtnPerception.setEnabled(true);
					rdbtnSurvival.setEnabled(true);
					choose[0] = 2;
					break;
				case "Monk":
					rdBtnAcrobatics.setEnabled(true);
					rdBtnAthletics.setEnabled(true);
					rdBtnHistory.setEnabled(true);
					rdBtnInsight.setEnabled(true);
					rdBtnReligion.setEnabled(true);
					rdbtnStealth.setEnabled(true);
					choose[0] = 2;
					break;
				case "Paladin":
					rdBtnAthletics.setEnabled(true);
					rdBtnInsight.setEnabled(true);
					rdBtnIntimidation.setEnabled(true);
					rdBtnMedicine.setEnabled(true);
					rdBtnPersuasion.setEnabled(true);
					rdBtnReligion.setEnabled(true);
					choose[0] = 2;
					break;
				case "Ranger":
					rdBtnAnimalH.setEnabled(true);
					rdBtnAthletics.setEnabled(true);
					rdBtnInsight.setEnabled(true);
					rdBtnInvestigation.setEnabled(false);
					rdBtnNature.setEnabled(true);
					rdBtnPerception.setEnabled(true);
					rdbtnStealth.setEnabled(true);
					rdbtnSurvival.setEnabled(true);
					choose[0] = 3;
					break;
				case "Rogue":
					rdBtnAcrobatics.setEnabled(true);
					rdBtnAthletics.setEnabled(true);
					rdBtnDeception.setEnabled(true);
					rdBtnInsight.setEnabled(true);
					rdBtnIntimidation.setEnabled(true);
					rdBtnPerception.setEnabled(true);
					rdbtnSlightOfHand.setEnabled(true);
					rdbtnStealth.setEnabled(true);
					choose[0] = 4;
					break;
				case "Sorcerer":
					rdBtnArcana.setEnabled(true);
					rdBtnDeception.setEnabled(true);
					rdBtnInsight.setEnabled(true);
					rdBtnIntimidation.setEnabled(true);
					rdBtnPersuasion.setEnabled(true);
					rdBtnReligion.setEnabled(true);
					choose[0] = 2;
					break;
				case "Warlock":
					rdBtnArcana.setEnabled(true);
					rdBtnDeception.setEnabled(true);
					rdBtnHistory.setEnabled(true);
					rdBtnIntimidation.setEnabled(true);
					rdBtnInvestigation.setEnabled(true);
					rdBtnNature.setEnabled(true);
					rdBtnReligion.setEnabled(true);
					choose[0] = 2;
					break;
				case "Wizard":
					rdBtnArcana.setEnabled(true);
					rdBtnHistory.setEnabled(true);
					rdBtnInsight.setEnabled(true);
					rdBtnInvestigation.setEnabled(true);
					rdBtnMedicine.setEnabled(true);
					rdBtnReligion.setEnabled(true);
					choose[0] = 2;
					break;
				default:
					choose[0] = 0;
					break;
				}
			}
		});
		
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ptcost = 0;
				if(att[0]<20){
					if((att[0]+1)<13){
						ptcost = (att[0]+1)-8;
					}
					else{
						ptcost = 5+((att[0]+1)-13)*2;
					}
					if(pts[0]>=ptcost){
						pts[0]-=ptcost;
						att[0]++;
						textPane.setText(Integer.toString(att[0]));
						textPane_1.setText(Integer.toString(pts[0]));
					}
				}
			}
		});

		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ptcost = 0;
				if(att[0]>8){
					if((att[0])<13){
						ptcost = (att[0])-8;
					}
					else{
						ptcost = 5+((att[0])-13)*2;
					}
					pts[0]+=ptcost;
					att[0]--;
					textPane.setText(Integer.toString(att[0]));
					textPane_1.setText(Integer.toString(pts[0]));
				}
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ptcost = 0;
				if(att[1]<20){
					if((att[1]+1)<13){
						ptcost = (att[1]+1)-8;
					}
					else{
						ptcost = 5+((att[1]+1)-13)*2;
					}
					if(pts[0]>=ptcost){
						pts[0]-=ptcost;
						att[1]++;
						textPane_2.setText(Integer.toString(att[1]));
						textPane_1.setText(Integer.toString(pts[0]));
					}
				}
			}
		});

		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ptcost = 0;
				if(att[1]>8){
					if((att[1])<13){
						ptcost = (att[1])-8;
					}
					else{
						ptcost = 5+((att[1])-13)*2;
					}
					pts[0]+=ptcost;
					att[1]--;
					textPane_2.setText(Integer.toString(att[1]));
					textPane_1.setText(Integer.toString(pts[0]));
				}
			}
		});
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ptcost = 0;
				if(att[2]<20){
					if((att[2]+1)<13){
						ptcost = (att[2]+1)-8;
					}
					else{
						ptcost = 5+((att[2]+1)-13)*2;
					}
					if(pts[0]>=ptcost){
						pts[0]-=ptcost;
						att[2]++;
						textPane_3.setText(Integer.toString(att[2]));
						textPane_1.setText(Integer.toString(pts[0]));
					}
				}
			}
		});
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ptcost = 0;
				if(att[2]>8){
					if((att[2])<13){
						ptcost = (att[2])-8;
					}
					else{
						ptcost = 5+((att[2])-13)*2;
					}
					pts[0]+=ptcost;
					att[2]--;
					textPane_3.setText(Integer.toString(att[2]));
					textPane_1.setText(Integer.toString(pts[0]));
				}
			}
		});

		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ptcost = 0;
				if(att[3]<20){
					if((att[3]+1)<13){
						ptcost = (att[3]+1)-8;
					}
					else{
						ptcost = 5+((att[3]+1)-13)*2;
					}
					if(pts[0]>=ptcost){
						pts[0]-=ptcost;
						att[3]++;
						textPane_4.setText(Integer.toString(att[3]));
						textPane_1.setText(Integer.toString(pts[0]));
					}
				}
			}
		});
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ptcost = 0;
				if(att[3]>8){
					if((att[3])<13){
						ptcost = (att[3])-8;
					}
					else{
						ptcost = 5+((att[3])-13)*2;
					}
					pts[0]+=ptcost;
					att[3]--;
					textPane_4.setText(Integer.toString(att[3]));
					textPane_1.setText(Integer.toString(pts[0]));
				}
			}
		});

		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ptcost = 0;
				if(att[4]<20){
					if((att[4]+1)<13){
						ptcost = (att[4]+1)-8;
					}
					else{
						ptcost = 5+((att[4]+1)-13)*2;
					}
					if(pts[0]>=ptcost){
						pts[0]-=ptcost;
						att[4]++;
						textPane_5.setText(Integer.toString(att[4]));
						textPane_1.setText(Integer.toString(pts[0]));
					}
				}
			}
		});
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ptcost = 0;
				if(att[4]>8){
					if((att[4])<13){
						ptcost = (att[4])-8;
					}
					else{
						ptcost = 5+((att[4])-13)*2;
					}
					pts[0]+=ptcost;
					att[4]--;
					textPane_5.setText(Integer.toString(att[4]));
					textPane_1.setText(Integer.toString(pts[0]));
				}
			}
		});

		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ptcost = 0;
				if(att[5]<20){
					if((att[5]+1)<13){
						ptcost = (att[5]+1)-8;
					}
					else{
						ptcost = 5+((att[5]+1)-13)*2;
					}
					if(pts[0]>=ptcost){
						pts[0]-=ptcost;
						att[5]++;
						textPane_6.setText(Integer.toString(att[5]));
						textPane_1.setText(Integer.toString(pts[0]));
					}
				}
			}
		});
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ptcost = 0;
				if(att[5]>8){
					if((att[5])<13){
						ptcost = (att[5])-8;
					}
					else{
						ptcost = 5+((att[5])-13)*2;
					}
					pts[0]+=ptcost;
					att[5]--;
					textPane_6.setText(Integer.toString(att[5]));
					textPane_1.setText(Integer.toString(pts[0]));
				}
			}
		});
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Details", null, panel_4, null);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

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
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		txtName = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.NORTH, txtName, 10, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, txtName, 10, SpringLayout.WEST, panel_2);
		panel_2.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblName, -1, SpringLayout.NORTH, txtName);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblName, 6, SpringLayout.EAST, txtName);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblName, 52, SpringLayout.EAST, txtName);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblName);
		
		JLabel lblAlignment = new JLabel("Choose Alignment");
		lblAlignment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox combo1 = new JComboBox();
		sl_panel_2.putConstraint(SpringLayout.WEST, combo1, 6, SpringLayout.EAST, lblName);
		combo1.setModel(new DefaultComboBoxModel(new String[] {"--Ideals","Lawful", "Neutral", "Chaotic"}));
		sl_panel_2.putConstraint(SpringLayout.NORTH, combo1, 0, SpringLayout.NORTH, txtName);
		panel_2.add(combo1);
		
		JComboBox combo2 = new JComboBox();
		combo2.setModel(new DefaultComboBoxModel(new String[] {"--Morals","Good", "Neutral", "Evil"}));
		sl_panel_2.putConstraint(SpringLayout.NORTH, combo2, 0, SpringLayout.NORTH, txtName);
		sl_panel_2.putConstraint(SpringLayout.WEST, combo2, 6, SpringLayout.EAST, combo1);
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
					lblAlignment.setText("Choose Alignment");
				}
			}
		});
		combo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = (String) combo1.getSelectedItem();
				String al = (String)combo2.getSelectedItem();
				if(!al.equals("--Morals") && !id.equals("--Ideals")){
					if(al.equals("Neutral") && id.equals("Neutral"))
						id = "True";
					lblAlignment.setText(id+" "+al);
				}
				else{
					lblAlignment.setText("Choose Alignment");
				}
			}
		});
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblAlignment, 10, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblAlignment, 6, SpringLayout.EAST, combo2);
		panel_2.add(lblAlignment);
		
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		sl_panel_2.putConstraint(SpringLayout.NORTH, textArea, -126, SpringLayout.SOUTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, textArea, 10, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textArea, -10, SpringLayout.SOUTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, textArea, 68, SpringLayout.EAST, lblAlignment);
		
		JScrollPane scrollBar = new JScrollPane(textArea);
		sl_panel_2.putConstraint(SpringLayout.NORTH, scrollBar, 0, SpringLayout.NORTH, textArea);
		sl_panel_2.putConstraint(SpringLayout.WEST, scrollBar, 10, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, scrollBar, -10, SpringLayout.SOUTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, scrollBar, -89, SpringLayout.EAST, textArea);
		panel_2.add(scrollBar);
		
		JLabel lblCharacter = new JLabel("Character Biography");
		sl_panel_2.putConstraint(SpringLayout.WEST, lblCharacter, 11, SpringLayout.EAST, scrollBar);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblCharacter, -58, SpringLayout.SOUTH, panel_2);
		lblCharacter.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.add(lblCharacter);
		
		textField = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, txtName);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textField, -6, SpringLayout.NORTH, textField_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, txtName);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textField_1, -6, SpringLayout.NORTH, textField_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, txtName);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textField_2, -6, SpringLayout.NORTH, textField_3);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, txtName);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEyeColor = new JLabel("Eye Color");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblEyeColor, -1, SpringLayout.NORTH, textField);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblEyeColor, 0, SpringLayout.WEST, lblName);
		lblEyeColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblEyeColor);
		
		JLabel lblHairColor = new JLabel("Hair Color");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblHairColor, -1, SpringLayout.NORTH, textField_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblHairColor, 6, SpringLayout.EAST, textField_1);
		lblHairColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblHairColor);
		
		JLabel lblSkinColor = new JLabel("Skin Color");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblSkinColor, -1, SpringLayout.NORTH, textField_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblSkinColor, 5, SpringLayout.EAST, textField_2);
		lblSkinColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblSkinColor);
		
		JLabel lblHeight = new JLabel("Height");
		sl_panel_2.putConstraint(SpringLayout.WEST, lblHeight, 6, SpringLayout.EAST, textField_3);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblSkinColor, -7, SpringLayout.NORTH, lblHeight);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblHeight, -1, SpringLayout.NORTH, textField_3);
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblWeight);
		
		textField_4 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.WEST, lblWeight, 7, SpringLayout.EAST, textField_4);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textField_3, -6, SpringLayout.NORTH, textField_4);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblWeight, -1, SpringLayout.NORTH, textField_4);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textField_4, -12, SpringLayout.NORTH, scrollBar);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, txtName);
		textField_4.setColumns(10);
		panel_2.add(textField_4);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Class", null, panel_3, null);
		SpringLayout springLayout = new SpringLayout();
		panel_3.setLayout(springLayout);

		JComboBox classCombo = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, classCombo, 10, SpringLayout.NORTH, panel_3);
		springLayout.putConstraint(SpringLayout.WEST, classCombo, 10, SpringLayout.WEST, panel_3);
		sl_panel_2.putConstraint(SpringLayout.EAST, classCombo, 0, SpringLayout.EAST, txtName);
		classCombo.setToolTipText("Choose a race");
		sl_panel_2.putConstraint(SpringLayout.NORTH, classCombo, 6, SpringLayout.SOUTH, txtName);
		sl_panel_2.putConstraint(SpringLayout.WEST, classCombo, 10, SpringLayout.WEST, panel_2);
		classCombo.setModel(new DefaultComboBoxModel(new String[] {"   ","Dwarf", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Tiefling"}));
		panel_3.add(classCombo);

		JLabel lblSubclass = new JLabel("Subclass");
		springLayout.putConstraint(SpringLayout.NORTH, lblSubclass, -1, SpringLayout.NORTH, classCombo);
		lblSubclass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_3.add(lblSubclass);

		JLabel lblClass = new JLabel("Class");
		springLayout.putConstraint(SpringLayout.NORTH, lblClass, -1, SpringLayout.NORTH, classCombo);
		springLayout.putConstraint(SpringLayout.WEST, lblClass, 6, SpringLayout.EAST, classCombo);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblClass, -1, SpringLayout.NORTH, classCombo);
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_3.add(lblClass);
		
		
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
		springLayout.putConstraint(SpringLayout.WEST, lblSubclass, 6, SpringLayout.EAST, subCombo);
		springLayout.putConstraint(SpringLayout.EAST, subCombo, 170, SpringLayout.EAST, classCombo);
		springLayout.putConstraint(SpringLayout.NORTH, subCombo, 0, SpringLayout.NORTH, classCombo);
		springLayout.putConstraint(SpringLayout.WEST, subCombo, 10, SpringLayout.EAST, lblClass);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblSubclass, -1, SpringLayout.NORTH, subCombo);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblSubclass, 55, SpringLayout.EAST, subCombo);
		subCombo.setModel(def);
		sl_panel_2.putConstraint(SpringLayout.NORTH, subCombo, 6, SpringLayout.SOUTH, classCombo);
		sl_panel_2.putConstraint(SpringLayout.WEST, subCombo, 0, SpringLayout.WEST, txtName);
		panel_3.add(subCombo);
		
		classCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = (String) classCombo.getSelectedItem();
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
		
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Attributes", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Details", null, panel_5, null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

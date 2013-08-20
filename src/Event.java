import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;


public class Event extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Event() {
		setBackground(Color.GRAY);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEvent = new JLabel("Event");
		lblEvent.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEvent.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblEvent = new GridBagConstraints();
		gbc_lblEvent.anchor = GridBagConstraints.WEST;
		gbc_lblEvent.insets = new Insets(0, 0, 5, 5);
		gbc_lblEvent.gridx = 1;
		gbc_lblEvent.gridy = 0;
		add(lblEvent, gbc_lblEvent);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 2;
		gbc_lblName.gridy = 1;
		add(lblName, gbc_lblName);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblType = new JLabel("Type");
		lblType.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblType = new GridBagConstraints();
		gbc_lblType.anchor = GridBagConstraints.WEST;
		gbc_lblType.insets = new Insets(0, 0, 5, 5);
		gbc_lblType.gridx = 2;
		gbc_lblType.gridy = 2;
		add(lblType, gbc_lblType);
		
		JRadioButton rdbtnAct = new JRadioButton("Uncontrollable");
		rdbtnAct.setForeground(Color.WHITE);
		rdbtnAct.setBackground(Color.GRAY);
		GridBagConstraints gbc_rdbtnAct = new GridBagConstraints();
		gbc_rdbtnAct.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAct.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAct.gridx = 3;
		gbc_rdbtnAct.gridy = 2;
		add(rdbtnAct, gbc_rdbtnAct);
		
		JRadioButton rdbtnSense = new JRadioButton("Controllable");
		rdbtnSense.setForeground(Color.WHITE);
		rdbtnSense.setBackground(Color.GRAY);
		GridBagConstraints gbc_rdbtnSense = new GridBagConstraints();
		gbc_rdbtnSense.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSense.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSense.gridx = 3;
		gbc_rdbtnSense.gridy = 3;
		add(rdbtnSense, gbc_rdbtnSense);
		
		JLabel lblType_1 = new JLabel("Type");
		lblType_1.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblType_1 = new GridBagConstraints();
		gbc_lblType_1.anchor = GridBagConstraints.WEST;
		gbc_lblType_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblType_1.gridx = 2;
		gbc_lblType_1.gridy = 5;
		add(lblType_1, gbc_lblType_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Listen\r\nSee\r\nSense\r\nTalk\r\nMove");
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 5;
		add(comboBox, gbc_comboBox);

	}

}

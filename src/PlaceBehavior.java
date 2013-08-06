import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;


public class PlaceBehavior extends JPanel {

	/**
	 * Create the panel.
	 */
	public PlaceBehavior() {
		setBackground(Color.GRAY);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Specification");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblEvent = new JLabel("Event");
		lblEvent.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblEvent = new GridBagConstraints();
		gbc_lblEvent.anchor = GridBagConstraints.EAST;
		gbc_lblEvent.insets = new Insets(0, 0, 5, 5);
		gbc_lblEvent.gridx = 2;
		gbc_lblEvent.gridy = 2;
		add(lblEvent, gbc_lblEvent);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 2;
		add(comboBox, gbc_comboBox);
		
		JLabel lblGuard = new JLabel("Guard");
		lblGuard.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblGuard = new GridBagConstraints();
		gbc_lblGuard.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuard.gridx = 2;
		gbc_lblGuard.gridy = 3;
		add(lblGuard, gbc_lblGuard);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 3;
		gbc_textArea.gridy = 3;
		add(textArea, gbc_textArea);
		
		JLabel lblAction = new JLabel("Action");
		lblAction.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblAction = new GridBagConstraints();
		gbc_lblAction.insets = new Insets(0, 0, 0, 5);
		gbc_lblAction.gridx = 2;
		gbc_lblAction.gridy = 4;
		add(lblAction, gbc_lblAction);
		
		JTextArea textArea_1 = new JTextArea();
		GridBagConstraints gbc_textArea_1 = new GridBagConstraints();
		gbc_textArea_1.fill = GridBagConstraints.BOTH;
		gbc_textArea_1.gridx = 3;
		gbc_textArea_1.gridy = 4;
		add(textArea_1, gbc_textArea_1);

	}

}

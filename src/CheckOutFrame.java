import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.ScrollPane;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class CheckOutFrame extends JFrame {

	private JPanel contentPane;
	public JTable sTable;
	private JTextField txtTotal;
	private JTextField txtChange;
	private int changeAmount;
	private int payAmount;
	private JTextField textField;
	private JTextField textField_1;

	public CheckOutFrame(int total, JTable table) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 314, 338);
		contentPane.add(scrollPane);

		sTable = new JTable();
		sTable.setEnabled(false);

		sTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Item", "Price" }));
		sTable.setModel(table.getModel());

		scrollPane.setViewportView(sTable);

		JPanel panel = new JPanel();
		panel.setBounds(10, 445, 314, 71);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 4, 0));

		JLabel lblNewLabel_1 = new JLabel("TOTAL AMOUNT:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		panel.add(lblNewLabel_1);

		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		panel.add(txtTotal);
		txtTotal.setColumns(10);
		txtTotal.setText(String.valueOf(total));

		JLabel lblNewLabel_2 = new JLabel("PAY AMOUNT:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		panel.add(lblNewLabel_2);

		JFormattedTextField txtPayAmount = new JFormattedTextField();
		txtPayAmount.setText("0");
		txtPayAmount.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

				if (!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		panel.add(txtPayAmount);

		JLabel lblNewLabel = new JLabel("CHANGE:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);

		txtChange = new JTextField();
		txtChange.setEditable(false);
		panel.add(txtChange);
		txtChange.setColumns(10);
		txtChange.setText("0");

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 360, 314, 74);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 2, 0, 0));

		JLabel lblNewLabel_4 = new JLabel("CUSTOMER'S NAME");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4);

		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("DELIVERY ADDRESS");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_3);

		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtReceipt = new JTextArea();
		txtReceipt.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtReceipt.setEditable(false);
		txtReceipt.setBounds(334, 13, 320, 537);
		contentPane.add(txtReceipt);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 527, 314, 23);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 3, 0, 0));
		
				JButton btnNewButton = new JButton("CALCULATE");
				panel_2.add(btnNewButton);
				btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
						
						JButton btnNewButton_1 = new JButton("PRINT");
						btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 11));
						panel_2.add(btnNewButton_1);
				
						JButton btnCancel = new JButton("CANCEL");
						panel_2.add(btnCancel);
						btnCancel.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								dispose();

							}
						});
						btnCancel.setFont(new Font("Arial", Font.PLAIN, 11));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						payAmount = Integer.parseInt(txtPayAmount.getText());
						changeAmount = payAmount - total;

						if (payAmount < total) {

							JFrame warn = new JFrame("WARNING");
							warn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

							JOptionPane.showMessageDialog(warn, "Not Enough Funds!", "WARNING", JOptionPane.WARNING_MESSAGE);

						} else {
							
							update(txtReceipt);
							txtChange.setText(String.valueOf(changeAmount));
						}	

					}
				});
	}

	public void setVal(JTextField var, String val) {

		var.setText(val);

	}

	public JTextField getTxtTotal() {
		return txtTotal;
	}
	
	public void update(JTextArea txtReceipt) {
		
		txtReceipt.setText(txtReceipt.getText() + "========================================\n");
		txtReceipt.setText(txtReceipt.getText() + "   MC LENIN'S BURGER AND PIZZA PLACE\n");
		txtReceipt.setText(txtReceipt.getText() + "========================================\n");
		DefaultTableModel model = (DefaultTableModel) sTable.getModel();
		
		for(int i=0; i<sTable.getRowCount(); i++) {
			String item = sTable.getValueAt(i, 0).toString();
			String price = sTable.getValueAt(i, 1).toString();
			
			txtReceipt.setText(txtReceipt.getText() + " " + item + "  " + price + "  \n");
			
		}
		
	}
}

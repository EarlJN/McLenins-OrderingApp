import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class CheckOutFrame extends JFrame {

	private JPanel contentPane;
	public JTable sTable;
	private JTextField txtTotal;
	private JTextField txtChange;
	private int changeAmount;
	private int payAmount;
	private JTextField txtCustomer;
	private JTextField txtAddress;

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

		txtCustomer = new JTextField();
		panel_1.add(txtCustomer);
		txtCustomer.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("DELIVERY ADDRESS");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_3);

		txtAddress = new JTextField();
		panel_1.add(txtAddress);
		txtAddress.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(334, 13, 320, 503);
		contentPane.add(scrollPane_1);
		
		JTextArea txtReceipt = new JTextArea();
		txtReceipt.setLineWrap(true);
		scrollPane_1.setViewportView(txtReceipt);
		txtReceipt.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtReceipt.setEditable(false);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		panel_2.setBounds(10, 527, 314, 23);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 3, 0, 0));
		
				JButton btnNewButton = new JButton("CALCULATE");
				panel_2.add(btnNewButton);
				btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
				
						JButton btnCancel = new JButton("CANCEL");
						panel_2.add(btnCancel);
						btnCancel.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								dispose();

							}
						});
						btnCancel.setFont(new Font("Arial", Font.PLAIN, 11));
						
						JPanel panel_3 = new JPanel();
						panel_3.setBackground(Color.YELLOW);
						panel_3.setBounds(334, 527, 320, 23);
						contentPane.add(panel_3);
						panel_3.setLayout(new GridLayout(1, 2, 50, 0));
						
						JButton btnNewButton_2 = new JButton("GENERATE");
						btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 11));
						btnNewButton_2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								update(txtReceipt);
							}
						});
						panel_3.add(btnNewButton_2);
						
						JButton btnNewButton_1 = new JButton("PRINT");
						btnNewButton_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								try {
									txtReceipt.print();
								} catch (PrinterException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
					
						});
						btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 11));
						panel_3.add(btnNewButton_1);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						payAmount = Integer.parseInt(txtPayAmount.getText());
						changeAmount = payAmount - total;

						if (payAmount < total) {

							JFrame warn = new JFrame("WARNING");
							warn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

							JOptionPane.showMessageDialog(warn, "Not Enough Funds!", "WARNING", JOptionPane.WARNING_MESSAGE);

						} else {
							
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
		
		txtReceipt.setText("");
		
		txtReceipt.setText(txtReceipt.getText() + "=====================================\n");
		txtReceipt.setText(txtReceipt.getText() + "   MC LENIN'S BURGER AND PIZZA PLACE\n");
		txtReceipt.setText(txtReceipt.getText() + "=====================================\n");
		DefaultTableModel model = (DefaultTableModel) sTable.getModel();
		
		for(int i=0; i<sTable.getRowCount(); i++) {
			String item = sTable.getValueAt(i, 0).toString();
			String price = sTable.getValueAt(i, 1).toString();
			
			txtReceipt.setText(txtReceipt.getText() + " " + item + "  P " + price + "  \n");
			
		}
		
		
		txtReceipt.setText(txtReceipt.getText() + "=====================================\n");
		txtReceipt.setText(txtReceipt.getText() + "  Total Amount: P " + txtTotal.getText() +"\n");
		txtReceipt.setText(txtReceipt.getText() + "  Payment Amount: P " + String.valueOf(payAmount) + "\n");
		txtReceipt.setText(txtReceipt.getText() + "  Change: P " + txtChange.getText() + "\n");
		txtReceipt.setText(txtReceipt.getText() + "=====================================\n");
		txtReceipt.setText(txtReceipt.getText() + "=====================================\n");
		txtReceipt.setText(txtReceipt.getText() + "  Customer Name: " + txtCustomer.getText()+"\n");
		txtReceipt.setText(txtReceipt.getText() + "  Deliver To: " + txtAddress.getText()+"\n");
		txtReceipt.setText(txtReceipt.getText() + "=====================================\n");
		txtReceipt.setText(txtReceipt.getText() + "=====================================\n");
		txtReceipt.setText(txtReceipt.getText() + "THANK YOU! Come Again!!!!\n");
		txtReceipt.setText(txtReceipt.getText() + "=====================================\n");
		
		
	}
}

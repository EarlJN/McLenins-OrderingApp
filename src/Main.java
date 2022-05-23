import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Main {
	private JTable table;
	private int total;

	private JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setResizable(false);
		mainFrame.setTitle("MC Lenin's Burger Grill Ordering App");
		mainFrame.getContentPane().setBackground(Color.YELLOW);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setBounds(100, 100, 1050, 600);
		mainFrame.getContentPane().setLayout(null);
		mainFrame.getContentPane().setLayout(null);

		JPanel pnlHeading = new JPanel();
		pnlHeading.setBackground(Color.RED);
		pnlHeading.setBounds(0, 0, 1064, 70);
		mainFrame.getContentPane().add(pnlHeading);
		pnlHeading.setLayout(null);

		JLabel txtTitle = new JLabel("MC LENIN's BURGER & PIZZA PLACE");
		txtTitle.setBackground(Color.YELLOW);
		txtTitle.setBounds(160, 19, 763, 40);
		txtTitle.setFont(new Font("Red October", Font.PLAIN, 36));
		txtTitle.setForeground(Color.YELLOW);
		pnlHeading.add(txtTitle);

		JLabel imgLogo = new JLabel("New label");
		imgLogo.setBounds(10, 11, 140, 46);
		Image logo = new ImageIcon(this.getClass().getResource("/logo_1.png")).getImage();
		imgLogo.setIcon(new ImageIcon(logo));
		pnlHeading.add(imgLogo);

		JLabel imgLogo_2 = new JLabel("New label");
		imgLogo_2.setBounds(954, 13, 59, 46);
		setImg(imgLogo_2, "./imgs/logo_2.png");
		pnlHeading.add(imgLogo_2);

		JPanel pnlMenu = new JPanel();
		pnlMenu.setBackground(new Color(255, 255, 204));
		pnlMenu.setBounds(119, 81, 636, 469);
		mainFrame.getContentPane().add(pnlMenu);
		pnlMenu.setLayout(new CardLayout(0, 0));

		JPanel menu_1 = new JPanel();
		menu_1.setBackground(Color.CYAN);
		menu_1.setForeground(Color.CYAN);
		pnlMenu.add(menu_1, "menu_1");
		menu_1.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel inv1_1 = new JPanel();
		inv1_1.setBackground(new Color(255, 255, 204));
		inv1_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv1_1);
		inv1_1.setLayout(null);

		JButton btnOrder1_1 = new JButton("ORDER");
		btnOrder1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Classic Burger", "80");
			}
		});
		btnOrder1_1.setForeground(Color.YELLOW);
		btnOrder1_1.setBackground(Color.RED);
		btnOrder1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder1_1.setBounds(10, 200, 139, 23);
		inv1_1.add(btnOrder1_1);

		JLabel imgMenu1_1 = new JLabel("burger_1");
		imgMenu1_1.setBounds(10, 52, 139, 137);
		setImg(imgMenu1_1, "./imgs/burger_1.png");

		inv1_1.add(imgMenu1_1);

		JLabel lblHeading1_1 = new JLabel("CLASSIC BURGER");
		lblHeading1_1.setBackground(Color.RED);
		lblHeading1_1.setForeground(Color.RED);
		lblHeading1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading1_1.setBounds(10, 11, 139, 20);
		inv1_1.add(lblHeading1_1);

		Label label = new Label("80 PHP");
		label.setFont(new Font("Arial", Font.PLAIN, 11));
		label.setAlignment(Label.CENTER);
		label.setBounds(10, 30, 139, 22);
		inv1_1.add(label);

		JPanel inv2_1 = new JPanel();
		inv2_1.setBackground(new Color(255, 255, 204));
		inv2_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv2_1);
		inv2_1.setLayout(null);

		JLabel imgMenu2_1 = new JLabel("burger_2");
		imgMenu2_1.setBounds(10, 52, 139, 137);
		setImg(imgMenu2_1, "./imgs/Burger_2.png");
		inv2_1.add(imgMenu2_1);

		JButton btnOrder2_1 = new JButton("ORDER");
		btnOrder2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Cheese Burger", "100");
			}

		});
		btnOrder2_1.setForeground(Color.YELLOW);
		btnOrder2_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder2_1.setBackground(Color.RED);
		btnOrder2_1.setBounds(10, 200, 139, 23);
		inv2_1.add(btnOrder2_1);

		JLabel lblHeading2_1 = new JLabel("CHEESE BURGER");
		lblHeading2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading2_1.setForeground(Color.RED);
		lblHeading2_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading2_1.setBackground(Color.RED);
		lblHeading2_1.setBounds(10, 11, 139, 20);
		inv2_1.add(lblHeading2_1);

		Label label_1 = new Label("100 PHP");
		label_1.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(10, 30, 139, 22);
		inv2_1.add(label_1);

		JPanel inv3_1 = new JPanel();
		inv3_1.setBackground(new Color(255, 255, 204));
		inv3_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv3_1);
		inv3_1.setLayout(null);

		JLabel imgMenu3_1 = new JLabel("burger_3");
		imgMenu3_1.setBounds(10, 52, 139, 137);
		setImg(imgMenu3_1, "./imgs/burger_3.png");
		inv3_1.add(imgMenu3_1);

		JButton btnOrder3_1 = new JButton("ORDER");
		btnOrder3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Bacon Cheese Burger", "150");
			}
		});
		btnOrder3_1.setForeground(Color.YELLOW);
		btnOrder3_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder3_1.setBackground(Color.RED);
		btnOrder3_1.setBounds(10, 200, 139, 23);
		inv3_1.add(btnOrder3_1);

		JLabel lblHeading3_1 = new JLabel("BACON CHEESE BURGER");
		lblHeading3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading3_1.setForeground(Color.RED);
		lblHeading3_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		lblHeading3_1.setBackground(Color.RED);
		lblHeading3_1.setBounds(10, 11, 139, 20);
		inv3_1.add(lblHeading3_1);

		Label label_1_1 = new Label("150 PHP");
		label_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1_1.setAlignment(Label.CENTER);
		label_1_1.setBounds(10, 30, 139, 22);
		inv3_1.add(label_1_1);

		JPanel inv4_1 = new JPanel();
		inv4_1.setBackground(new Color(255, 255, 204));
		inv4_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv4_1);
		inv4_1.setLayout(null);

		JLabel imgMenu4_1 = new JLabel("burger_4");
		imgMenu4_1.setBounds(10, 52, 139, 137);
		setImg(imgMenu4_1, "./imgs/burger_4.png");
		inv4_1.add(imgMenu4_1);

		JButton btnOrder4_1 = new JButton("ORDER");
		btnOrder4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Double Cheese Burger", "250");
			}
		});
		btnOrder4_1.setForeground(Color.YELLOW);
		btnOrder4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder4_1.setBackground(Color.RED);
		btnOrder4_1.setBounds(10, 200, 139, 23);
		inv4_1.add(btnOrder4_1);

		JLabel lblHeading4_1 = new JLabel("DOUBLE CHEESE BURGER");
		lblHeading4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading4_1.setForeground(Color.RED);
		lblHeading4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 11));
		lblHeading4_1.setBackground(Color.RED);
		lblHeading4_1.setBounds(10, 11, 139, 20);
		inv4_1.add(lblHeading4_1);

		Label label_1_2 = new Label("250 PHP");
		label_1_2.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1_2.setAlignment(Label.CENTER);
		label_1_2.setBounds(10, 30, 139, 22);
		inv4_1.add(label_1_2);

		JPanel inv5_1 = new JPanel();
		inv5_1.setBackground(new Color(255, 255, 204));
		inv5_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv5_1);
		inv5_1.setLayout(null);

		JLabel imgMenu5_1 = new JLabel("burger_5");
		imgMenu5_1.setBounds(10, 52, 139, 137);
		setImg(imgMenu5_1, "./imgs/burger_5.png");
		inv5_1.add(imgMenu5_1);

		JLabel lblHeading5_1 = new JLabel("QUAD BACON BURGER");
		lblHeading5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading5_1.setForeground(Color.RED);
		lblHeading5_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblHeading5_1.setBackground(Color.RED);
		lblHeading5_1.setBounds(10, 11, 139, 20);
		inv5_1.add(lblHeading5_1);

		Label lblPrice5_1 = new Label("350 PHP");
		lblPrice5_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_1.setAlignment(Label.CENTER);
		lblPrice5_1.setBounds(10, 30, 139, 22);
		inv5_1.add(lblPrice5_1);

		JButton btnOrder5_1 = new JButton("ORDER");
		btnOrder5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Quad Bacon Burger", "350");
			}
		});
		btnOrder5_1.setForeground(Color.YELLOW);
		btnOrder5_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder5_1.setBackground(Color.RED);
		btnOrder5_1.setBounds(10, 200, 139, 23);
		inv5_1.add(btnOrder5_1);

		JPanel inv6_1 = new JPanel();
		inv6_1.setBackground(new Color(255, 255, 204));
		inv6_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv6_1);
		inv6_1.setLayout(null);

		JLabel imgMenu6_1 = new JLabel("burger_6");
		imgMenu6_1.setBounds(10, 52, 139, 137);
		setImg(imgMenu6_1, "./imgs/burger_6.png");
		inv6_1.add(imgMenu6_1);

		JLabel lblHeading6_1 = new JLabel("VEGAN BURGER");
		lblHeading6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading6_1.setForeground(Color.RED);
		lblHeading6_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading6_1.setBackground(Color.RED);
		lblHeading6_1.setBounds(10, 11, 139, 20);
		inv6_1.add(lblHeading6_1);

		Label lblPrice6_1 = new Label("60 PHP");
		lblPrice6_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice6_1.setAlignment(Label.CENTER);
		lblPrice6_1.setBounds(10, 30, 139, 22);
		inv6_1.add(lblPrice6_1);

		JButton btnOrder6_1 = new JButton("ORDER");
		btnOrder6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Vegan Burger", "60");
			}
		});
		btnOrder6_1.setForeground(Color.YELLOW);
		btnOrder6_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder6_1.setBackground(Color.RED);
		btnOrder6_1.setBounds(10, 200, 139, 23);
		inv6_1.add(btnOrder6_1);

		JPanel inv7_1 = new JPanel();
		inv7_1.setBackground(new Color(255, 255, 204));
		inv7_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv7_1);
		inv7_1.setLayout(null);

		JLabel imgMenu7_1 = new JLabel("burger_7");
		imgMenu7_1.setBounds(10, 52, 139, 137);
		setImg(imgMenu7_1, "./imgs/burger_7.png");
		inv7_1.add(imgMenu7_1);

		JLabel lblHeading7_1 = new JLabel("FRIES BURGER");
		lblHeading7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading7_1.setForeground(Color.RED);
		lblHeading7_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading7_1.setBackground(Color.RED);
		lblHeading7_1.setBounds(10, 11, 139, 20);
		inv7_1.add(lblHeading7_1);

		Label lblPrice7_1 = new Label("120 PHP");
		lblPrice7_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice7_1.setAlignment(Label.CENTER);
		lblPrice7_1.setBounds(10, 30, 139, 22);
		inv7_1.add(lblPrice7_1);

		JButton btnOrder7_1 = new JButton("ORDER");
		btnOrder7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Fries Burger", "120");
			}
		});
		btnOrder7_1.setForeground(Color.YELLOW);
		btnOrder7_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder7_1.setBackground(Color.RED);
		btnOrder7_1.setBounds(10, 200, 139, 23);
		inv7_1.add(btnOrder7_1);

		JPanel inv8_1 = new JPanel();
		inv8_1.setBackground(new Color(255, 255, 204));
		inv8_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv8_1);
		inv8_1.setLayout(null);

		JLabel imgMenu8_1 = new JLabel("burger_8");
		imgMenu8_1.setBounds(10, 52, 139, 137);
		setImg(imgMenu8_1, "./imgs/burger_8.png");
		inv8_1.add(imgMenu8_1);

		JLabel lblHeading8_1 = new JLabel("EXTREME BURGER");
		lblHeading8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading8_1.setForeground(Color.RED);
		lblHeading8_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading8_1.setBackground(Color.RED);
		lblHeading8_1.setBounds(10, 11, 139, 20);
		inv8_1.add(lblHeading8_1);

		Label lblPrice8_1 = new Label("1250 PHP");
		lblPrice8_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice8_1.setAlignment(Label.CENTER);
		lblPrice8_1.setBounds(10, 30, 139, 22);
		inv8_1.add(lblPrice8_1);

		JButton btnOrder8_1 = new JButton("ORDER");
		btnOrder8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Extreme Burger", "1250");
			}
		});
		btnOrder8_1.setForeground(Color.YELLOW);
		btnOrder8_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder8_1.setBackground(Color.RED);
		btnOrder8_1.setBounds(10, 200, 139, 23);
		inv8_1.add(btnOrder8_1);

		JPanel menu_2 = new JPanel();
		menu_2.setBackground(Color.BLACK);
		pnlMenu.add(menu_2, "menu_2");
		menu_2.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel inv1_2 = new JPanel();
		inv1_2.setBorder(new LineBorder(Color.RED, 2));
		inv1_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv1_2);
		inv1_2.setLayout(null);

		JButton btnOrder1_2 = new JButton("ORDER");
		btnOrder1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Leninade", "60");
			}
		});
		btnOrder1_2.setForeground(Color.YELLOW);
		btnOrder1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder1_2.setBackground(Color.RED);
		btnOrder1_2.setBounds(10, 200, 139, 23);
		inv1_2.add(btnOrder1_2);

		JLabel lblHeader1_2 = new JLabel("LENINADE");
		lblHeader1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader1_2.setForeground(Color.RED);
		lblHeader1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader1_2.setBackground(Color.RED);
		lblHeader1_2.setBounds(10, 11, 139, 20);
		inv1_2.add(lblHeader1_2);

		JLabel imgMenu1_2 = new JLabel("New label");
		imgMenu1_2.setBounds(10, 52, 139, 137);
		setImg(imgMenu1_2, "./imgs/drinks_1.png");
		inv1_2.add(imgMenu1_2);

		Label lblPrice5_2_1 = new Label("60 PHP");
		lblPrice5_2_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2_1.setAlignment(Label.CENTER);
		lblPrice5_2_1.setBounds(10, 30, 139, 22);
		inv1_2.add(lblPrice5_2_1);

		JPanel inv2_2 = new JPanel();
		inv2_2.setBorder(new LineBorder(Color.RED, 2));
		inv2_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv2_2);
		inv2_2.setLayout(null);

		JButton btnOrder2_2 = new JButton("ORDER");
		btnOrder2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Kvass", "70");
			}
		});
		btnOrder2_2.setForeground(Color.YELLOW);
		btnOrder2_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder2_2.setBackground(Color.RED);
		btnOrder2_2.setBounds(10, 200, 139, 23);
		inv2_2.add(btnOrder2_2);

		JLabel lblHeader2_2 = new JLabel("KVASS");
		lblHeader2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader2_2.setForeground(Color.RED);
		lblHeader2_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader2_2.setBackground(Color.RED);
		lblHeader2_2.setBounds(10, 11, 139, 20);
		inv2_2.add(lblHeader2_2);

		JLabel imgMenu2_2 = new JLabel("Leninade");
		imgMenu2_2.setBounds(10, 52, 139, 137);
		setImg(imgMenu2_2, "./imgs/drinks_2.png");
		inv2_2.add(imgMenu2_2);

		Label lblPrice5_2_2 = new Label("70 PHP");
		lblPrice5_2_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2_2.setAlignment(Label.CENTER);
		lblPrice5_2_2.setBounds(10, 30, 139, 22);
		inv2_2.add(lblPrice5_2_2);

		JPanel inv3_2 = new JPanel();
		inv3_2.setBorder(new LineBorder(Color.RED, 2));
		inv3_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv3_2);
		inv3_2.setLayout(null);

		JButton btnOrder3_2 = new JButton("ORDER");
		btnOrder3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Tarkhun", "70");
			}
		});
		btnOrder3_2.setForeground(Color.YELLOW);
		btnOrder3_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder3_2.setBackground(Color.RED);
		btnOrder3_2.setBounds(10, 200, 139, 23);
		inv3_2.add(btnOrder3_2);

		JLabel lblHeader3_2 = new JLabel("TARKHUN");
		lblHeader3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader3_2.setForeground(Color.RED);
		lblHeader3_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader3_2.setBackground(Color.RED);
		lblHeader3_2.setBounds(10, 11, 139, 20);
		inv3_2.add(lblHeader3_2);

		JLabel imgMenu3_2 = new JLabel("Tarkhun");
		imgMenu3_2.setBounds(10, 52, 139, 137);
		setImg(imgMenu3_2, "./imgs/drinks_3.png");
		inv3_2.add(imgMenu3_2);

		Label lblPrice5_2_3 = new Label("70 PHP");
		lblPrice5_2_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2_3.setAlignment(Label.CENTER);
		lblPrice5_2_3.setBounds(10, 30, 139, 22);
		inv3_2.add(lblPrice5_2_3);

		JPanel inv4_2 = new JPanel();
		inv4_2.setBorder(new LineBorder(Color.RED, 2));
		inv4_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv4_2);
		inv4_2.setLayout(null);

		JButton btnOrder4_2 = new JButton("ORDER");
		btnOrder4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Medovukha", "80");
			}
		});
		btnOrder4_2.setForeground(Color.YELLOW);
		btnOrder4_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder4_2.setBackground(Color.RED);
		btnOrder4_2.setBounds(10, 200, 139, 23);
		inv4_2.add(btnOrder4_2);

		JLabel lblHeader4_2 = new JLabel("MEDOVUKHA");
		lblHeader4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader4_2.setForeground(Color.RED);
		lblHeader4_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader4_2.setBackground(Color.RED);
		lblHeader4_2.setBounds(10, 11, 139, 20);
		inv4_2.add(lblHeader4_2);

		JLabel imgMenu4_2 = new JLabel("New label");
		imgMenu4_2.setBounds(10, 52, 139, 137);
		setImg(imgMenu4_2, "./imgs/drinks_4.png");
		inv4_2.add(imgMenu4_2);

		Label lblPrice5_2_4 = new Label("80 PHP");
		lblPrice5_2_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2_4.setAlignment(Label.CENTER);
		lblPrice5_2_4.setBounds(10, 30, 139, 22);
		inv4_2.add(lblPrice5_2_4);

		JPanel inv5_2 = new JPanel();
		inv5_2.setBorder(new LineBorder(Color.RED, 2));
		inv5_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv5_2);
		inv5_2.setLayout(null);

		JLabel imgMenu5_2 = new JLabel("burger_1");
		imgMenu5_2.setBounds(10, 52, 139, 137);
		setImg(imgMenu5_2, "./imgs/drinks_5.png");
		inv5_2.add(imgMenu5_2);

		JButton btnOrder5_2 = new JButton("ORDER");
		btnOrder5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Pepsi", "30");
			}
		});
		btnOrder5_2.setForeground(Color.YELLOW);
		btnOrder5_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder5_2.setBackground(Color.RED);
		btnOrder5_2.setBounds(10, 200, 139, 23);
		inv5_2.add(btnOrder5_2);

		JLabel lblHeading5_2 = new JLabel("PEPSI");
		lblHeading5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading5_2.setForeground(Color.RED);
		lblHeading5_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading5_2.setBackground(Color.RED);
		lblHeading5_2.setBounds(10, 11, 139, 20);
		inv5_2.add(lblHeading5_2);

		Label lblPrice5_2 = new Label("30 PHP");
		lblPrice5_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2.setAlignment(Label.CENTER);
		lblPrice5_2.setBounds(10, 30, 139, 22);
		inv5_2.add(lblPrice5_2);

		JPanel inv6_2 = new JPanel();
		inv6_2.setBorder(new LineBorder(Color.RED, 2));
		inv6_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv6_2);
		inv6_2.setLayout(null);

		JLabel imgMenu6_2 = new JLabel("burger_1");
		imgMenu6_2.setBounds(10, 52, 139, 137);
		setImg(imgMenu6_2, "./imgs/drinks_6.png");
		inv6_2.add(imgMenu6_2);

		JButton btnOrder6_2 = new JButton("ORDER");
		btnOrder6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Coke", "30");
			}
		});
		btnOrder6_2.setForeground(Color.YELLOW);
		btnOrder6_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder6_2.setBackground(Color.RED);
		btnOrder6_2.setBounds(10, 200, 139, 23);
		inv6_2.add(btnOrder6_2);

		JLabel lblHeading6_2 = new JLabel("COKE");
		lblHeading6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading6_2.setForeground(Color.RED);
		lblHeading6_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading6_2.setBackground(Color.RED);
		lblHeading6_2.setBounds(10, 11, 139, 20);
		inv6_2.add(lblHeading6_2);

		Label lblPrice6_2 = new Label("30 PHP");
		lblPrice6_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice6_2.setAlignment(Label.CENTER);
		lblPrice6_2.setBounds(10, 30, 139, 22);
		inv6_2.add(lblPrice6_2);

		JPanel inv7_2 = new JPanel();
		inv7_2.setBorder(new LineBorder(Color.RED, 2));
		inv7_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv7_2);
		inv7_2.setLayout(null);

		JLabel imgMenu7_2 = new JLabel("burger_1");
		imgMenu7_2.setBounds(10, 52, 139, 137);
		setImg(imgMenu7_2, "./imgs/drinks_7.png");
		inv7_2.add(imgMenu7_2);

		JButton btnOrder7_2 = new JButton("ORDER");
		btnOrder7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Mountain Dew", "30");
			}
		});
		btnOrder7_2.setForeground(Color.YELLOW);
		btnOrder7_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder7_2.setBackground(Color.RED);
		btnOrder7_2.setBounds(10, 200, 139, 23);
		inv7_2.add(btnOrder7_2);

		JLabel lblHeading7_2 = new JLabel("MOUNTAIN DEW");
		lblHeading7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading7_2.setForeground(Color.RED);
		lblHeading7_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading7_2.setBackground(Color.RED);
		lblHeading7_2.setBounds(10, 11, 139, 20);
		inv7_2.add(lblHeading7_2);

		Label lblPrice7_2 = new Label("30 PHP");
		lblPrice7_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice7_2.setAlignment(Label.CENTER);
		lblPrice7_2.setBounds(10, 30, 139, 22);
		inv7_2.add(lblPrice7_2);

		JPanel inv8_2 = new JPanel();
		inv8_2.setBorder(new LineBorder(Color.RED, 2));
		inv8_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv8_2);
		inv8_2.setLayout(null);

		JLabel imgMenu8_2 = new JLabel("burger_1");
		imgMenu8_2.setBounds(10, 52, 139, 137);
		setImg(imgMenu8_2, "./imgs/drinks_8.png");
		inv8_2.add(imgMenu8_2);

		JButton btnOrder8_2 = new JButton("ORDER");
		btnOrder8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Sprite", "30");
			}
		});
		btnOrder8_2.setForeground(Color.YELLOW);
		btnOrder8_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder8_2.setBackground(Color.RED);
		btnOrder8_2.setBounds(10, 200, 139, 23);
		inv8_2.add(btnOrder8_2);

		JLabel lblHeading8_2 = new JLabel("SPRITE");
		lblHeading8_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading8_2.setForeground(Color.RED);
		lblHeading8_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading8_2.setBackground(Color.RED);
		lblHeading8_2.setBounds(10, 11, 139, 20);
		inv8_2.add(lblHeading8_2);

		Label lblPrice8_2 = new Label("30 PHP");
		lblPrice8_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice8_2.setAlignment(Label.CENTER);
		lblPrice8_2.setBounds(10, 30, 139, 22);
		inv8_2.add(lblPrice8_2);

		JPanel menu_3 = new JPanel();
		menu_3.setBackground(Color.GREEN);
		pnlMenu.add(menu_3, "menu_3");
		menu_3.setLayout(null);

		JPanel inv1_3 = new JPanel();
		inv1_3.setBounds(0, 0, 159, 234);
		inv1_3.setBackground(new Color(255, 255, 204));
		inv1_3.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(inv1_3);
		inv1_3.setLayout(null);

		JLabel lblHeader_1_3 = new JLabel("MEDOVIK");
		lblHeader_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader_1_3.setForeground(Color.RED);
		lblHeader_1_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader_1_3.setBackground(Color.RED);
		lblHeader_1_3.setBounds(10, 11, 139, 20);
		inv1_3.add(lblHeader_1_3);

		JLabel imgMenu1_3 = new JLabel("New label");
		imgMenu1_3.setBounds(10, 52, 139, 137);
		setImg(imgMenu1_3, "./imgs/dessert_1.png");
		inv1_3.add(imgMenu1_3);

		JButton btnOrder1_3 = new JButton("ORDER");
		btnOrder1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Medovik", "300");
			}
		});
		btnOrder1_3.setForeground(Color.YELLOW);
		btnOrder1_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder1_3.setBackground(Color.RED);
		btnOrder1_3.setBounds(10, 200, 139, 23);
		inv1_3.add(btnOrder1_3);

		Label lblPrice5_2_5_1 = new Label("300 PHP");
		lblPrice5_2_5_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2_5_1.setAlignment(Label.CENTER);
		lblPrice5_2_5_1.setBounds(10, 30, 139, 22);
		inv1_3.add(lblPrice5_2_5_1);

		JPanel inv2_3 = new JPanel();
		inv2_3.setBounds(159, 0, 159, 234);
		inv2_3.setBackground(new Color(255, 255, 204));
		inv2_3.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(inv2_3);
		inv2_3.setLayout(null);

		JLabel lblHeader2_3 = new JLabel("SYRNIKI");
		lblHeader2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader2_3.setForeground(Color.RED);
		lblHeader2_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader2_3.setBackground(Color.RED);
		lblHeader2_3.setBounds(10, 11, 139, 20);
		inv2_3.add(lblHeader2_3);

		JLabel imgMenu2_3 = new JLabel("New label");
		imgMenu2_3.setBounds(10, 52, 139, 137);
		setImg(imgMenu2_3, "./imgs/dessert_2.png");
		inv2_3.add(imgMenu2_3);

		JButton btnOrder2_3 = new JButton("ORDER");
		btnOrder2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Syrniki", "250");
			}
		});
		btnOrder2_3.setForeground(Color.YELLOW);
		btnOrder2_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder2_3.setBackground(Color.RED);
		btnOrder2_3.setBounds(10, 200, 139, 23);
		inv2_3.add(btnOrder2_3);

		Label lblPrice5_2_5_2 = new Label("250 PHP");
		lblPrice5_2_5_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2_5_2.setAlignment(Label.CENTER);
		lblPrice5_2_5_2.setBounds(10, 30, 139, 22);
		inv2_3.add(lblPrice5_2_5_2);

		JPanel inv3_3 = new JPanel();
		inv3_3.setBounds(318, 0, 159, 234);
		inv3_3.setBackground(new Color(255, 255, 204));
		inv3_3.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(inv3_3);
		inv3_3.setLayout(null);

		JLabel lblHeader3_3 = new JLabel("BAKLAVA");
		lblHeader3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader3_3.setForeground(Color.RED);
		lblHeader3_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader3_3.setBackground(Color.RED);
		lblHeader3_3.setBounds(10, 11, 139, 20);
		inv3_3.add(lblHeader3_3);

		JLabel imgMenu3_3 = new JLabel("New label");
		imgMenu3_3.setBounds(10, 52, 139, 137);
		setImg(imgMenu3_3, "./imgs/dessert_3.png");
		inv3_3.add(imgMenu3_3);

		JButton btnOrder3_3 = new JButton("ORDER");
		btnOrder3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Baklava", "250");
			}
		});
		btnOrder3_3.setForeground(Color.YELLOW);
		btnOrder3_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder3_3.setBackground(Color.RED);
		btnOrder3_3.setBounds(10, 200, 139, 23);
		inv3_3.add(btnOrder3_3);

		Label lblPrice5_2_5_3 = new Label("250 PHP");
		lblPrice5_2_5_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2_5_3.setAlignment(Label.CENTER);
		lblPrice5_2_5_3.setBounds(10, 30, 139, 22);
		inv3_3.add(lblPrice5_2_5_3);

		JPanel inv4_3 = new JPanel();
		inv4_3.setBounds(477, 0, 159, 234);
		inv4_3.setBackground(new Color(255, 255, 204));
		inv4_3.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(inv4_3);
		inv4_3.setLayout(null);

		JLabel lblHeader4_3 = new JLabel("VARENKI");
		lblHeader4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader4_3.setForeground(Color.RED);
		lblHeader4_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader4_3.setBackground(Color.RED);
		lblHeader4_3.setBounds(10, 11, 139, 20);
		inv4_3.add(lblHeader4_3);

		JLabel imgMenu4_3 = new JLabel("New label");
		imgMenu4_3.setBounds(10, 52, 139, 137);
		setImg(imgMenu4_3, "./imgs/dessert_4.png");
		inv4_3.add(imgMenu4_3);

		JButton btnOrder4_3 = new JButton("ORDER");
		btnOrder4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Varenki", "250");
			}
		});
		btnOrder4_3.setForeground(Color.YELLOW);
		btnOrder4_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder4_3.setBackground(Color.RED);
		btnOrder4_3.setBounds(10, 200, 139, 23);
		inv4_3.add(btnOrder4_3);

		Label lblPrice5_2_5_4 = new Label("250 PHP");
		lblPrice5_2_5_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2_5_4.setAlignment(Label.CENTER);
		lblPrice5_2_5_4.setBounds(10, 30, 139, 22);
		inv4_3.add(lblPrice5_2_5_4);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(0, 234, 159, 234);
		panel_9.setBackground(new Color(255, 255, 204));
		panel_9.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(panel_9);
		panel_9.setLayout(null);

		JButton btnOrder5_2_1 = new JButton("ORDER");
		btnOrder5_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Gold Icecream", "300");

			}
		});
		btnOrder5_2_1.setForeground(Color.YELLOW);
		btnOrder5_2_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder5_2_1.setBackground(Color.RED);
		btnOrder5_2_1.setBounds(10, 200, 139, 23);
		panel_9.add(btnOrder5_2_1);

		JLabel imgMenu5_2_1 = new JLabel("burger_1");
		imgMenu5_2_1.setBounds(10, 52, 139, 137);
		setImg(imgMenu5_2_1, "./imgs/dessert_5.png");
		panel_9.add(imgMenu5_2_1);

		Label lblPrice5_2_5 = new Label("300 PHP");
		lblPrice5_2_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2_5.setAlignment(Label.CENTER);
		lblPrice5_2_5.setBounds(10, 30, 139, 22);
		panel_9.add(lblPrice5_2_5);

		JLabel lblHeading5_2_1 = new JLabel("GOLD ICECREAM");
		lblHeading5_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading5_2_1.setForeground(Color.RED);
		lblHeading5_2_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading5_2_1.setBackground(Color.RED);
		lblHeading5_2_1.setBounds(10, 11, 139, 20);
		panel_9.add(lblHeading5_2_1);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(159, 234, 159, 234);
		panel_10.setBackground(new Color(255, 255, 204));
		panel_10.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(panel_10);
		panel_10.setLayout(null);

		JButton btnOrder5_2_2 = new JButton("ORDER");
		btnOrder5_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Vanilla Icecream", "100");
			}
		});
		btnOrder5_2_2.setForeground(Color.YELLOW);
		btnOrder5_2_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder5_2_2.setBackground(Color.RED);
		btnOrder5_2_2.setBounds(10, 200, 139, 23);
		panel_10.add(btnOrder5_2_2);

		JLabel imgMenu5_2_2 = new JLabel("burger_1");
		imgMenu5_2_2.setBounds(10, 52, 139, 137);
		setImg(imgMenu5_2_2, "./imgs/dessert_6.png");
		panel_10.add(imgMenu5_2_2);

		Label lblPrice5_2_6 = new Label("100 PHP");
		lblPrice5_2_6.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2_6.setAlignment(Label.CENTER);
		lblPrice5_2_6.setBounds(10, 30, 139, 22);
		panel_10.add(lblPrice5_2_6);

		JLabel lblHeading5_2_2 = new JLabel("VANILLA ICECREAM");
		lblHeading5_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading5_2_2.setForeground(Color.RED);
		lblHeading5_2_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading5_2_2.setBackground(Color.RED);
		lblHeading5_2_2.setBounds(10, 11, 139, 20);
		panel_10.add(lblHeading5_2_2);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(318, 234, 159, 234);
		panel_11.setBackground(new Color(255, 255, 204));
		panel_11.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(panel_11);
		panel_11.setLayout(null);

		JButton btnOrder5_2_3 = new JButton("ORDER");
		btnOrder5_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Truffle Chocolate", "200");
			}
		});
		btnOrder5_2_3.setForeground(Color.YELLOW);
		btnOrder5_2_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder5_2_3.setBackground(Color.RED);
		btnOrder5_2_3.setBounds(10, 200, 139, 23);
		panel_11.add(btnOrder5_2_3);

		JLabel imgMenu5_2_3 = new JLabel("burger_1");
		imgMenu5_2_3.setBounds(10, 52, 139, 137);
		setImg(imgMenu5_2_3, "./imgs/dessert_7.png");
		panel_11.add(imgMenu5_2_3);

		Label lblPrice5_2_7 = new Label("200 PHP");
		lblPrice5_2_7.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2_7.setAlignment(Label.CENTER);
		lblPrice5_2_7.setBounds(10, 30, 139, 22);
		panel_11.add(lblPrice5_2_7);

		JLabel lblHeading5_2_3 = new JLabel("TRUFFLE CHOCOLATE");
		lblHeading5_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading5_2_3.setForeground(Color.RED);
		lblHeading5_2_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblHeading5_2_3.setBackground(Color.RED);
		lblHeading5_2_3.setBounds(10, 11, 139, 20);
		panel_11.add(lblHeading5_2_3);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(477, 234, 159, 234);
		panel_12.setBackground(new Color(255, 255, 204));
		panel_12.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(panel_12);
		panel_12.setLayout(null);

		JButton btnOrder5_2_4 = new JButton("ORDER");
		btnOrder5_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Choco Pudding", "400");
			}
		});
		btnOrder5_2_4.setForeground(Color.YELLOW);
		btnOrder5_2_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder5_2_4.setBackground(Color.RED);
		btnOrder5_2_4.setBounds(10, 200, 139, 23);
		panel_12.add(btnOrder5_2_4);

		JLabel imgMenu5_2_4 = new JLabel("burger_1");
		imgMenu5_2_4.setBounds(10, 52, 139, 137);
		setImg(imgMenu5_2_4, "./imgs/dessert_8.png");
		panel_12.add(imgMenu5_2_4);

		Label lblPrice5_2_8 = new Label("400 PHP");
		lblPrice5_2_8.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_2_8.setAlignment(Label.CENTER);
		lblPrice5_2_8.setBounds(10, 30, 139, 22);
		panel_12.add(lblPrice5_2_8);

		JLabel lblHeading5_2_4 = new JLabel("CHOCO PUDDING");
		lblHeading5_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading5_2_4.setForeground(Color.RED);
		lblHeading5_2_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading5_2_4.setBackground(Color.RED);
		lblHeading5_2_4.setBounds(10, 11, 139, 20);
		panel_12.add(lblHeading5_2_4);

		JPanel menu_4 = new JPanel();
		menu_4.setLayout(new GridLayout(2, 2, 0, 0));
		pnlMenu.add(menu_4, "menu_4");

		JPanel inv1_1_1 = new JPanel();
		inv1_1_1.setLayout(null);
		inv1_1_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		inv1_1_1.setBackground(new Color(255, 255, 204));
		menu_4.add(inv1_1_1);

		JButton btnOrder1_4 = new JButton("ORDER");
		btnOrder1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Cheese Pizza", "150");
			}
		});
		btnOrder1_4.setForeground(Color.YELLOW);
		btnOrder1_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder1_4.setBackground(Color.RED);
		btnOrder1_4.setBounds(10, 200, 139, 23);
		inv1_1_1.add(btnOrder1_4);

		JLabel imgMenu1_4 = new JLabel("pizzas_1");
		imgMenu1_4.setBounds(10, 52, 139, 137);
		setImg(imgMenu1_4, "./imgs/pizzas_1.png");
		inv1_1_1.add(imgMenu1_4);

		JLabel lblHeading1_4 = new JLabel("CHEESE PIZZA");
		lblHeading1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading1_4.setForeground(Color.RED);
		lblHeading1_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading1_4.setBackground(Color.RED);
		lblHeading1_4.setBounds(10, 11, 139, 20);
		inv1_1_1.add(lblHeading1_4);

		Label lblPrice1_4 = new Label("150 PHP");
		lblPrice1_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice1_4.setAlignment(Label.CENTER);
		lblPrice1_4.setBounds(10, 30, 139, 22);
		inv1_1_1.add(lblPrice1_4);

		JPanel inv2_1_1 = new JPanel();
		inv2_1_1.setLayout(null);
		inv2_1_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		inv2_1_1.setBackground(new Color(255, 255, 204));
		menu_4.add(inv2_1_1);

		JLabel imgMenu2_4 = new JLabel("burger_2");
		imgMenu2_4.setBounds(10, 52, 139, 137);
		setImg(imgMenu2_4, "./imgs/pizzas_2.png");
		inv2_1_1.add(imgMenu2_4);

		JButton btnOrder2_1_1 = new JButton("ORDER");
		btnOrder2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Bacon Pizza", "250");
			}
		});
		btnOrder2_1_1.setForeground(Color.YELLOW);
		btnOrder2_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder2_1_1.setBackground(Color.RED);
		btnOrder2_1_1.setBounds(10, 200, 139, 23);
		inv2_1_1.add(btnOrder2_1_1);

		JLabel lblHeading2_4 = new JLabel("BACON PIZZA");
		lblHeading2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading2_4.setForeground(Color.RED);
		lblHeading2_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading2_4.setBackground(Color.RED);
		lblHeading2_4.setBounds(10, 11, 139, 20);
		inv2_1_1.add(lblHeading2_4);

		Label lblPrice2_4 = new Label("250 PHP");
		lblPrice2_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice2_4.setAlignment(Label.CENTER);
		lblPrice2_4.setBounds(10, 30, 139, 22);
		inv2_1_1.add(lblPrice2_4);

		JPanel inv3_1_1 = new JPanel();
		inv3_1_1.setLayout(null);
		inv3_1_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		inv3_1_1.setBackground(new Color(255, 255, 204));
		menu_4.add(inv3_1_1);

		JLabel imgMenu3_4 = new JLabel("burger_3");
		imgMenu3_4.setBounds(10, 52, 139, 137);
		setImg(imgMenu3_4, "./imgs/pizzas_3.png");
		inv3_1_1.add(imgMenu3_4);

		JButton btnOrder3_1_1 = new JButton("ORDER");
		btnOrder3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Pepperoni Pizza", "200");
			}
		});
		btnOrder3_1_1.setForeground(Color.YELLOW);
		btnOrder3_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder3_1_1.setBackground(Color.RED);
		btnOrder3_1_1.setBounds(10, 200, 139, 23);
		inv3_1_1.add(btnOrder3_1_1);

		JLabel lblHeading3_4 = new JLabel("PEPPERONI PIZZA");
		lblHeading3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading3_4.setForeground(Color.RED);
		lblHeading3_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading3_4.setBackground(Color.RED);
		lblHeading3_4.setBounds(10, 11, 139, 20);
		inv3_1_1.add(lblHeading3_4);

		Label lblPrice3_4 = new Label("200 PHP");
		lblPrice3_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice3_4.setAlignment(Label.CENTER);
		lblPrice3_4.setBounds(10, 30, 139, 22);
		inv3_1_1.add(lblPrice3_4);

		JPanel inv4_1_1 = new JPanel();
		inv4_1_1.setLayout(null);
		inv4_1_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		inv4_1_1.setBackground(new Color(255, 255, 204));
		menu_4.add(inv4_1_1);

		JLabel imgMenu4_4 = new JLabel("burger_4");
		imgMenu4_4.setBounds(10, 52, 139, 137);
		setImg(imgMenu4_4, "./imgs/pizzas_4.png");
		inv4_1_1.add(imgMenu4_4);

		JButton btnOrder4_1_1 = new JButton("ORDER");
		btnOrder4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Olive Pizza", "270");
			}
		});
		btnOrder4_1_1.setForeground(Color.YELLOW);
		btnOrder4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder4_1_1.setBackground(Color.RED);
		btnOrder4_1_1.setBounds(10, 200, 139, 23);
		inv4_1_1.add(btnOrder4_1_1);

		JLabel lblHeading4_4 = new JLabel("OLIVE PIZZA");
		lblHeading4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading4_4.setForeground(Color.RED);
		lblHeading4_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading4_4.setBackground(Color.RED);
		lblHeading4_4.setBounds(10, 11, 139, 20);
		inv4_1_1.add(lblHeading4_4);

		Label lblPrice4_4 = new Label("270 PHP");
		lblPrice4_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice4_4.setAlignment(Label.CENTER);
		lblPrice4_4.setBounds(10, 30, 139, 22);
		inv4_1_1.add(lblPrice4_4);

		JPanel inv5_1_1 = new JPanel();
		inv5_1_1.setLayout(null);
		inv5_1_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		inv5_1_1.setBackground(new Color(255, 255, 204));
		menu_4.add(inv5_1_1);

		JLabel imgMenu5_4 = new JLabel("burger_5");
		imgMenu5_4.setBounds(10, 52, 139, 137);
		setImg(imgMenu5_4, "./imgs/pizzas_5.png");
		inv5_1_1.add(imgMenu5_4);

		JLabel lblHeading5_4 = new JLabel("VEGAN PIZZA");
		lblHeading5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading5_4.setForeground(Color.RED);
		lblHeading5_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading5_4.setBackground(Color.RED);
		lblHeading5_4.setBounds(10, 11, 139, 20);
		inv5_1_1.add(lblHeading5_4);

		Label lblPrice5_4 = new Label("350 PHP");
		lblPrice5_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice5_4.setAlignment(Label.CENTER);
		lblPrice5_4.setBounds(10, 30, 139, 22);
		inv5_1_1.add(lblPrice5_4);

		JButton btnOrder5_1_1 = new JButton("ORDER");
		btnOrder5_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Vegan Pizza", "350");
			}
		});
		btnOrder5_1_1.setForeground(Color.YELLOW);
		btnOrder5_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder5_1_1.setBackground(Color.RED);
		btnOrder5_1_1.setBounds(10, 200, 139, 23);
		inv5_1_1.add(btnOrder5_1_1);

		JPanel inv6_1_1 = new JPanel();
		inv6_1_1.setLayout(null);
		inv6_1_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		inv6_1_1.setBackground(new Color(255, 255, 204));
		menu_4.add(inv6_1_1);

		JLabel imgMenu6_4 = new JLabel("burger_6");
		imgMenu6_4.setBounds(10, 52, 139, 137);
		setImg(imgMenu6_4, "./imgs/pizzas_6.png");
		inv6_1_1.add(imgMenu6_4);

		JLabel lblHeading6_4 = new JLabel("MUSHROOM PIZZA");
		lblHeading6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading6_4.setForeground(Color.RED);
		lblHeading6_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading6_4.setBackground(Color.RED);
		lblHeading6_4.setBounds(10, 11, 139, 20);
		inv6_1_1.add(lblHeading6_4);

		Label lblPrice6_4 = new Label("300 PHP");
		lblPrice6_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice6_4.setAlignment(Label.CENTER);
		lblPrice6_4.setBounds(10, 30, 139, 22);
		inv6_1_1.add(lblPrice6_4);

		JButton btnOrder6_1_1 = new JButton("ORDER");
		btnOrder6_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Mushroom Pizza", "300");
			}
		});
		btnOrder6_1_1.setForeground(Color.YELLOW);
		btnOrder6_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder6_1_1.setBackground(Color.RED);
		btnOrder6_1_1.setBounds(10, 200, 139, 23);
		inv6_1_1.add(btnOrder6_1_1);

		JPanel inv7_1_1 = new JPanel();
		inv7_1_1.setLayout(null);
		inv7_1_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		inv7_1_1.setBackground(new Color(255, 255, 204));
		menu_4.add(inv7_1_1);

		JLabel imgMenu7_4 = new JLabel("burger_7");
		imgMenu7_4.setBounds(10, 52, 139, 137);
		setImg(imgMenu7_4, "./imgs/pizzas_7.png");
		inv7_1_1.add(imgMenu7_4);

		JLabel lblHeading7_4 = new JLabel("HAWAIIAN PIZZA");
		lblHeading7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading7_4.setForeground(Color.RED);
		lblHeading7_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading7_4.setBackground(Color.RED);
		lblHeading7_4.setBounds(10, 11, 139, 20);
		inv7_1_1.add(lblHeading7_4);

		Label lblPrice7_4 = new Label("225 PHP");
		lblPrice7_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice7_4.setAlignment(Label.CENTER);
		lblPrice7_4.setBounds(10, 30, 139, 22);
		inv7_1_1.add(lblPrice7_4);

		JButton btnOrder7_1_1 = new JButton("ORDER");
		btnOrder7_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Hawaiian Pizza", "225");
			}
		});
		btnOrder7_1_1.setForeground(Color.YELLOW);
		btnOrder7_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder7_1_1.setBackground(Color.RED);
		btnOrder7_1_1.setBounds(10, 200, 139, 23);
		inv7_1_1.add(btnOrder7_1_1);

		JPanel inv8_1_1 = new JPanel();
		inv8_1_1.setLayout(null);
		inv8_1_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		inv8_1_1.setBackground(new Color(255, 255, 204));
		menu_4.add(inv8_1_1);

		JLabel imgMenu8_4 = new JLabel("burger_8");
		imgMenu8_4.setBounds(10, 52, 139, 137);
		setImg(imgMenu8_4, "./imgs/pizzas_8.png");
		inv8_1_1.add(imgMenu8_4);

		JLabel lblHeading8_4 = new JLabel("GOLDEN PIZZA");
		lblHeading8_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading8_4.setForeground(Color.RED);
		lblHeading8_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading8_4.setBackground(Color.RED);
		lblHeading8_4.setBounds(10, 11, 139, 20);
		inv8_1_1.add(lblHeading8_4);

		Label lblPrice8_4 = new Label("5000 PHP");
		lblPrice8_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrice8_4.setAlignment(Label.CENTER);
		lblPrice8_4.setBounds(10, 30, 139, 22);
		inv8_1_1.add(lblPrice8_4);

		JButton btnOrder8_1_1 = new JButton("ORDER");
		btnOrder8_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Golden Pizza", "5000");
			}
		});
		btnOrder8_1_1.setForeground(Color.YELLOW);
		btnOrder8_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder8_1_1.setBackground(Color.RED);
		btnOrder8_1_1.setBounds(10, 200, 139, 23);
		inv8_1_1.add(btnOrder8_1_1);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.RED);
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 70, 110, 481);
		mainFrame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));

		JButton btnMenu_1 = new JButton("Burgers");
		btnMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) (pnlMenu.getLayout());
				c.show(pnlMenu, "menu_1");

			}
		});
		btnMenu_1.setFont(new Font("Red October Light", Font.PLAIN, 13));
		btnMenu_1.setForeground(Color.YELLOW);
		btnMenu_1.setBackground(Color.RED);
		panel_1.add(btnMenu_1);

		JButton btnMenu_2 = new JButton("Drinks");
		btnMenu_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) (pnlMenu.getLayout());
				c.show(pnlMenu, "menu_2");

			}
		});

		btnMenu_2.setFont(new Font("Red October Light", Font.PLAIN, 14));
		btnMenu_2.setForeground(Color.YELLOW);
		btnMenu_2.setBackground(Color.RED);
		panel_1.add(btnMenu_2);

		JButton btnMenu_3 = new JButton("Desserts");
		btnMenu_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) (pnlMenu.getLayout());
				c.show(pnlMenu, "menu_3");

			}
		});
		btnMenu_3.setFont(new Font("Red October Light", Font.PLAIN, 11));
		btnMenu_3.setForeground(Color.YELLOW);
		btnMenu_3.setBackground(Color.RED);
		panel_1.add(btnMenu_3);

		JButton btnMenu_4 = new JButton("Pizzas");
		btnMenu_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) (pnlMenu.getLayout());
				c.show(pnlMenu, "menu_4");
			}
		});
		btnMenu_4.setFont(new Font("Red October Light", Font.PLAIN, 13));
		btnMenu_4.setForeground(Color.YELLOW);
		btnMenu_4.setBackground(Color.RED);
		panel_1.add(btnMenu_4);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(765, 81, 259, 418);
		mainFrame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setEnabled(true);
		table.setRowSelectionAllowed(false);
		table.setBorder(null);
		table.setShowGrid(false);
		table.setBackground(new Color(255, 255, 204));
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Item", "Price" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(30);
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("CHECK-OUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				total = 0;

				for (int i = 0; i < table.getRowCount(); i++) {

					total += Integer.parseInt(table.getValueAt(i, 1).toString());
				}

				CheckOutFrame cOut = new CheckOutFrame(total);
				cOut.setVisible(true);

			}

		});
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(765, 510, 120, 30);
		mainFrame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("VOID");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				total = 0;
				((DefaultTableModel) table.getModel()).setRowCount(0);

			}
		});
		btnNewButton_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton_1.setForeground(Color.YELLOW);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(904, 510, 120, 30);
		mainFrame.getContentPane().add(btnNewButton_1);
	}

	public void tempButtonFunction(String var, String price) {

		String input[] = { var, price };
		DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
		tblModel.addRow(input);

	}

	public void setImg(JLabel label, String dir) {

		ImageIcon imageIcon = new ImageIcon(dir);
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(label.getWidth(), label.getHeight(), java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);
		label.setIcon(imageIcon);

	}

}

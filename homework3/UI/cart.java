package homework3.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import homework3.prog.product;

public class cart extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField cash;
	private

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cart frame = new cart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 414, 65);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("貓咪購物車");
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(132, 10, 150, 45);
		panel.add(lblNewLabel_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 85, 414, 566);
		contentPane.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("販售", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("會員ID");
		lblNewLabel_5.setBounds(32, 40, 80, 15);
		panel_3.add(lblNewLabel_5);
		
		id = new JTextField();
		id.setBounds(122, 34, 80, 20);
		panel_3.add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("乾飼料 $1000");
		lblNewLabel.setBounds(32, 65, 80, 20);
		panel_3.add(lblNewLabel);
		
		JSpinner dry = new JSpinner();
		dry.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		dry.setBounds(122, 65, 80, 20);
		panel_3.add(dry);
		
		JLabel lblNewLabel_1 = new JLabel("罐頭 $60");
		lblNewLabel_1.setBounds(32, 95, 80, 20);
		panel_3.add(lblNewLabel_1);
		
		JSpinner can = new JSpinner();
		can.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		can.setBounds(122, 95, 80, 20);
		panel_3.add(can);
		
		JLabel lblNewLabel_3 = new JLabel("主食餐包 $45");
		lblNewLabel_3.setBounds(32, 125, 80, 20);
		panel_3.add(lblNewLabel_3);
		
		JSpinner bag = new JSpinner();
		bag.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		bag.setBounds(122, 125, 80, 20);
		panel_3.add(bag);
		
		JCheckBox member = new JCheckBox("會員價9折");
		member.setBounds(32, 163, 120, 20);
		panel_3.add(member);
		
		JLabel lblNewLabel_4 = new JLabel("付款方式");
		lblNewLabel_4.setBounds(32, 198, 80, 20);
		panel_3.add(lblNewLabel_4);
		
		JRadioButton payCash = new JRadioButton("現金實付");
		payCash.setBounds(32, 224, 80, 20);
		panel_3.add(payCash);
		
		JRadioButton payCredit = new JRadioButton("信用卡 手續費3%");
		payCredit.setBounds(32, 253, 120, 20);
		panel_3.add(payCredit);
				
		cash = new JTextField();
		cash.setBounds(122, 224, 80, 20);
		panel_3.add(cash);
		cash.setColumns(10);
		
		JButton btnNewButton = new JButton("小結");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				product p1=new product(id.getText()+)
			}
		});
		btnNewButton.setBounds(32, 292, 87, 23);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("付款");
		btnNewButton_2.setBounds(129, 292, 87, 23);
		panel_3.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("訂單", null, panel_1, null);
		panel_1.setLayout(null);
	}
}

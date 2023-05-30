package homework3.UI;

import java.awt.EventQueue;
import javax.swing.text.JTextComponent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JPasswordField PW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 85, 414, 250);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("帳號");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel.setBounds(101, 50, 45, 30);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(101, 108, 45, 30);
		panel_1.add(lblNewLabel_1);
		
		ID = new JTextField();
		ID.setBounds(156, 50, 96, 30);
		panel_1.add(ID);
		ID.setColumns(10);
		
		PW = new JPasswordField();
		PW.setBounds(156, 108, 96, 30);
		panel_1.add(PW);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 345, 414, 306);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("忘記密碼");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				info f1=new info();
				f1.setVisible(true);
			}
		});
		btnNewButton.setBounds(101, 180, 85, 30);
		panel_1.add(btnNewButton);
		
		JButton signIn = new JButton("登入");
		signIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				char[] password = PW.getPassword();
				char[] correctPass = new char[] {'0', '0', '0', '0'};
				boolean PWC=true; 
				if (Arrays.equals(password, correctPass)) {
					PWC=true;
				} else {
					PWC=false;
				}
				
				if(ID.getText().equals("BB123")&& PWC==true){
					cart C1=new cart();
					C1.setVisible(true);
					dispose();
				}else {
					info f1=new info();
					f1.setVisible(true);
				}
			}
		});
		signIn.setBounds(212, 180, 85, 30);
		panel_1.add(signIn);
		
		
	}
}

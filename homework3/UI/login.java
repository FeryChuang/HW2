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
import javax.swing.ImageIcon;

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
		setBounds(450, 150, 450, 700);
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
		panel_1.setBounds(10, 85, 414, 566);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("帳號");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel.setBounds(186, 24, 45, 30);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(186, 82, 45, 30);
		panel_1.add(lblNewLabel_1);
		
		ID = new JTextField();
		ID.setBounds(241, 24, 96, 30);
		panel_1.add(ID);
		ID.setColumns(10);
		
		PW = new JPasswordField();
		PW.setBounds(241, 82, 96, 30);
		panel_1.add(PW);
		
		JButton btnNewButton = new JButton("忘記密碼");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				info f1=new info();
				f1.setVisible(true);
			}
		});
		btnNewButton.setBounds(186, 154, 85, 30);
		panel_1.add(btnNewButton);
		
		JButton signIn = new JButton("登入");
		signIn.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
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
				
				if(ID.getText().equals("bb")&& PWC==true){
					cart C1=new cart();
					C1.setVisible(true);
					dispose();
				}else {
					info f1=new info();
					f1.setVisible(true);
				}
			}
		});
		signIn.setBounds(297, 154, 85, 30);
		panel_1.add(signIn);
		
		JButton btnNewButton_1 = new JButton("離開");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		btnNewButton_1.setBounds(297, 206, 85, 30);
		panel_1.add(btnNewButton_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(login.class.getResource("/homework3/img/catCart2.jpg")));
		lblNewLabel_3.setBounds(10, 10, 394, 546);
		panel_1.add(lblNewLabel_3);
		
		
		
	}
}

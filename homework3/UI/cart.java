package homework3.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;

import homework3.prog.product;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cart extends JFrame {

	private JPanel contentPane;
	private JTextField cash;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private product p1=null;
	private JTextField id;
	DefaultTableModel model;
	private JTable table;
	

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
		tabbedPane.setBounds(10, 229, 414, 383);
		contentPane.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("販售", null, panel_3, null);
		panel_3.setLayout(null);
				
		
		JLabel lblNewLabel_3 = new JLabel("現金實付");
		lblNewLabel_3.setBounds(46, 292, 54, 20);
		panel_3.add(lblNewLabel_3);
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("訂單", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("會員ID");
		lblNewLabel_5.setBounds(28, 119, 80, 15);
		contentPane.add(lblNewLabel_5);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(118, 113, 80, 20);
		contentPane.add(id);
		
		JLabel lblNewLabel = new JLabel("乾飼料 $1000");
		lblNewLabel.setBounds(28, 144, 80, 20);
		contentPane.add(lblNewLabel);
		
		JSpinner dry = new JSpinner();
		dry.setBounds(118, 144, 80, 20);
		contentPane.add(dry);
		
		JLabel lblNewLabel_1 = new JLabel("罐頭 $50");
		lblNewLabel_1.setBounds(28, 174, 80, 20);
		contentPane.add(lblNewLabel_1);
		
		JSpinner can = new JSpinner();
		can.setBounds(118, 174, 80, 20);
		contentPane.add(can);
		
		JCheckBox member = new JCheckBox("會員價9折");
		member.setBounds(246, 113, 120, 20);
		contentPane.add(member);
		
		JLabel lblNewLabel_4 = new JLabel("付款方式");
		lblNewLabel_4.setBounds(246, 148, 80, 20);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton payCash = new JRadioButton("現金實付");
		payCash.setSelected(true);
		buttonGroup.add(payCash);
		payCash.setBounds(246, 174, 80, 20);
		contentPane.add(payCash);
		
		JRadioButton payCredit = new JRadioButton("信用卡 手續費3%");
		buttonGroup.add(payCredit);
		payCredit.setBounds(246, 203, 120, 20);
		contentPane.add(payCredit);
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 80, 389, 261);
		panel_1.add(scrollPane_1);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				id.setText(model.getValueAt(i,0).toString());
				dry.setValue(model.getValueAt(i, 1));
				can.setValue(model.getValueAt(i, 2));
			}
		});
		scrollPane_1.setViewportView(table);
		model =new DefaultTableModel();
		Object[] column= {"ID","乾飼料","罐頭","總金額"};
		Object[] row=new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
				
		
		cash = new JTextField();
		cash.setBounds(41, 315, 80, 20);
		panel_3.add(cash);
		cash.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 45, 389, 237);
		panel_3.add(scrollPane);
		
		JTextArea output = new JTextArea();
		output.setBounds(12, 45, 387, 235);
		panel_3.add(output);
		
		JButton btnNewButton = new JButton("計算");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "請輸入會員名稱");
				}else {
				boolean PM=true;
				if(payCash.isSelected()) {PM=true;}					
				if(payCredit.isSelected()) {PM=false;}
				p1=new product(id.getText(),member.isSelected(),((int)dry.getValue()),((int)can.getValue()),PM);
				output.setText(p1.output());
				
				
					
			}}
		});
		btnNewButton.setBounds(298, 10, 80, 25);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("現金結帳");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (cash.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "請輸入現金");
				}else {
				int CO=Integer.parseInt(cash.getText());
				output.setText(p1.output()+"\n\t\t找零"+"\n\t\t\t"+(CO-p1.getSum()));
				row[0]=id.getText();
				row[1]=dry.getValue();
				row[2]=can.getValue();
				row[3]=p1.getSum();
				model.addRow(row);
				
				id.setText("");
				dry.setValue(0);
				can.setValue(0);
				JOptionPane.showMessageDialog(null, "訂購成功!");
			}}
		});
		btnNewButton_2.setBounds(131, 313, 100, 25);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("信用卡結帳");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				row[0]=id.getText();
				row[1]=dry.getValue();
				row[2]=can.getValue();
				row[3]=p1.getSum();
				model.addRow(row);
				
				id.setText("");
				dry.setValue(0);
				can.setValue(0);
				JOptionPane.showMessageDialog(null, "訂購成功!");
			}
		});
		btnNewButton_1.setBounds(241, 313, 100, 25);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("列印明細");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				output.print();
				}catch(PrinterException ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_6.setBounds(301, 358, 100, 25);
		panel_3.add(btnNewButton_6);
		
		
		
		JButton btnNewButton_3 = new JButton("修改訂單");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "請輸入會員名稱");
				}else{
					boolean PM=true;
					if(payCash.isSelected()) {PM=true;}					
					if(payCredit.isSelected()) {PM=false;}
					p1=new product(id.getText(),member.isSelected(),((int)dry.getValue()),((int)can.getValue()),PM);
									
					int i=table.getSelectedRow();
					if(i>=0) {
						model.setValueAt(id.getText(), i, 0);
						model.setValueAt(dry.getValue(), i, 1);
						model.setValueAt(can.getValue(), i, 2);
						model.setValueAt(p1.getSum(), i, 3);
					}
				}
			}
		});
		btnNewButton_3.setBounds(179, 27, 100, 25);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("刪除訂單");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "已刪除!");
					
				}else {
					JOptionPane.showMessageDialog(null, "請選擇一筆訂單");
				}
			}
		});
		btnNewButton_4.setBounds(301, 27, 100, 25);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("離開");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_5.setBounds(337, 628, 80, 25);
		contentPane.add(btnNewButton_5);
		
		
		
	}
}

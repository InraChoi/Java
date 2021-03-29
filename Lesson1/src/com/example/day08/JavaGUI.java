package com.example.day08;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class JavaGUI extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable tblBook;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaGUI frame = new JavaGUI();
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
	public JavaGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				// 창이 열리면 데이터테이블을 로드한다.
				LoadTbl();
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBUtil.DBClose();
				System.out.println("프로그램을 모두 종료합니다.");
				System.exit(0);
			}
		});
		btnExit.setBounds(662, 286, 89, 23);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("도서정보시스템");
		lblNewLabel.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 398, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("도서명");
		lblNewLabel_1.setBounds(23, 85, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("저자명");
		lblNewLabel_2.setBounds(23, 121, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(62, 85, 169, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(62, 118, 169, 21);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("초기화");
		btnNewButton.setBounds(23, 160, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("저장");
		btnNewButton_1.setBounds(134, 160, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(23, 193, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("삭제");
		btnNewButton_3.setBounds(134, 193, 97, 23);
		contentPane.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(243, 49, 508, 223);
		contentPane.add(scrollPane);
		
		tblBook = new JTable();
		scrollPane.setViewportView(tblBook);
	}// end of constructor
	
	private void LoadTbl() {
		// 모델 선언 
		model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("도서명");
		model.addColumn("저자명");
		
		// 데이터베이스가 연결되어 있지 않으면 연결한다.
		if(DBUtil.dbconn == null) DBUtil.DBConnet();
		
		// 질의구문
		String sql = "SELECT * FROM bookinfo";
		try {
			PreparedStatement pstmt = DBUtil.dbconn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				model.addRow(new Object[] {
						rs.getInt(1),		// id
						rs.getString(2),	// title
						rs.getString(3)		// author
				});
			}
			
			tblBook.setModel(model);
			tblBook.setAutoResizeMode(0);
			tblBook.getColumnModel().getColumn(0).setPreferredWidth(50);;
			tblBook.getColumnModel().getColumn(1).setPreferredWidth(200);;
			tblBook.getColumnModel().getColumn(2).setPreferredWidth(80);;
			
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "테이블 검색 중 오류가 발생하였습니다.");
		}
		
	}// end of loadTbl
}//end of class

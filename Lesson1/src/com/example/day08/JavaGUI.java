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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JavaGUI extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtTitle;
	private JTextField txtAuthor;
	private JTable tblBook;
	DefaultTableModel model;
	int bookid4update;

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
		
		txtTitle = new JTextField();
		txtTitle.setBounds(62, 85, 169, 21);
		contentPane.add(txtTitle);
		txtTitle.setColumns(10);
		
		txtAuthor = new JTextField();
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(62, 118, 169, 21);
		contentPane.add(txtAuthor);
		
		JButton btnReset = new JButton("초기화");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTitle.setText("");
				txtAuthor.setText("");
			}
		});
		btnReset.setBounds(23, 160, 97, 23);
		contentPane.add(btnReset);
		
		JButton btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "INSERT INTO bookinfo (title,author) VALUES (?,?)";
				String title = txtTitle.getText();
				String author = txtAuthor.getText();
				try {
					PreparedStatement pstmt = DBUtil.dbconn.prepareStatement(sql);
					pstmt.setString(1, title);
					pstmt.setString(2, author);
					
					// 실제적 자료추가
					pstmt.execute();
					// 테이블 다시 로드
					LoadTbl();
				}catch(SQLException einsert) {
					JOptionPane.showMessageDialog(null, "자료 추가 중 오류가 발생하였습니다.");
				}
			}
		});
		
		btnSave.setBounds(134, 160, 97, 23);
		contentPane.add(btnSave);
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "UPDATE bookinfo SET title = ? , author = ? WHERE id = ?";
				String title = txtTitle.getText();
				String author = txtAuthor.getText();
				
				try {
					PreparedStatement pstmt = DBUtil.dbconn.prepareStatement(sql);
					pstmt.setString(1, title);
					pstmt.setString(2, author);
					pstmt.setInt(3, bookid4update);
					
					// 실제적 자료추가
					pstmt.execute();
					// 테이블 다시 로드
					LoadTbl();
				}catch(SQLException eupdate) {
					JOptionPane.showMessageDialog(null, "자료 수정 중 오류가 발생하였습니다.");
					eupdate.printStackTrace();
				}
			}
		});
		btnUpdate.setBounds(23, 193, 97, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String sql = "DELETE FROM bookinfo  WHERE id = ?";
					
					try {
						PreparedStatement pstmt = DBUtil.dbconn.prepareStatement(sql);
						pstmt.setInt(1, bookid4update);
						
						// 실제적 자료 삭제
						pstmt.execute();
						// 테이블 다시 로드
						LoadTbl();
					}catch(SQLException edelete) {
						JOptionPane.showMessageDialog(null, "자료 삭제 중 오류가 발생하였습니다.");
						edelete.printStackTrace();
					}
			}
		});
		
		btnDelete.setBounds(134, 193, 97, 23);
		contentPane.add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(243, 49, 508, 223);
		contentPane.add(scrollPane);
		
		tblBook = new JTable();
		tblBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tblBook.getSelectedRow();
				bookid4update = Integer.parseInt(tblBook.getModel().getValueAt(row, 0).toString());
				
				setTextField(bookid4update);
			}
		});
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
	
	private void setTextField(int id) {
		String sql = "SELECT title,author FROM bookinfo WHERE id = ? ";
		try {
			PreparedStatement pstmt = DBUtil.dbconn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();	// 쿼리실행후 결과 갖고오기
			
			while(rs.next()) {
				txtTitle.setText(rs.getString(1));
				txtAuthor.setText(rs.getString(2));
			}
			
		}catch(SQLException esel) {
			JOptionPane.showMessageDialog(null, "테이블 검색 중 오류가 발생하였습니다.");
			
		}
	} // end of setTextField
}//end of class

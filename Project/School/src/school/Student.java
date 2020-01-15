package school;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Student extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtmobile;
	private JTextField txtcourse;
	private JTable table;

	// Creating connection object for mysql
	Connection con1;
	PreparedStatement insert;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
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
	public Student() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 24));
		lblNewLabel.setBounds(279, 11, 260, 46);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(19, 61, 355, 229);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblname = new JLabel("Name");
		lblname.setFont(new Font("Candara", Font.PLAIN, 17));
		lblname.setBounds(10, 44, 66, 20);
		panel_1.add(lblname);
		
		JLabel lblmobile = new JLabel("Mobile");
		lblmobile.setFont(new Font("Candara", Font.PLAIN, 17));
		lblmobile.setBounds(10, 88, 83, 20);
		panel_1.add(lblmobile);
		
		JLabel lblcourse = new JLabel("Course");
		lblcourse.setFont(new Font("Candara", Font.PLAIN, 17));
		lblcourse.setBounds(10, 134, 72, 20);
		panel_1.add(lblcourse);
		
		txtname = new JTextField();
		txtname.setBounds(120, 42, 193, 20);
		panel_1.add(txtname);
		txtname.setColumns(10);
		
		txtmobile = new JTextField();
		txtmobile.setBounds(120, 86, 193, 20);
		panel_1.add(txtmobile);
		txtmobile.setColumns(10);
		
		txtcourse = new JTextField();
		txtcourse.setBounds(120, 132, 193, 20);
		panel_1.add(txtcourse);
		txtcourse.setColumns(10);
		
		JButton btnadd = new JButton("Add");
		btnadd.addActionListener(new ActionListener() {
			// Creating connection object for mysql
			Connection con1;
			PreparedStatement insert;
			
			// Method to take input form feild and store it into DB table
			public void actionPerformed(ActionEvent e) {
				// My code 
				// Collecting value from Text field
				String name = txtname.getText(); // If not blue, then wrong name
				String mobile = txtmobile.getText();
				String course = txtcourse.getText();
				try {
					Class.forName("com.mysql.jdbc.Driver");
					// first: localhost address, Second: user name, third: password
					con1 = DriverManager.getConnection("jdbc:mysql://localhost/studentrecord", "root", "");
					insert = con1.prepareStatement("INSERT INTO record(studentName, studentNumber, studentCourse) VALUES (?, ?, ?)");
					insert.setString(1, name); // Point to 1st ? in statement
					insert.setString(2, mobile); // Point to 2nd ? in statement
					insert.setString(3, course); // Point to 3rd ? in statement
					// Executing the insert statement
					insert.executeUpdate();
					// Success Message pop-up
					JOptionPane.showMessageDialog(btnadd, "Record Added!!!");
					// Update=ing table
					tableUpdate();
					// Resetting the text field
					txtname.setText("");
					txtmobile.setText("");
					txtcourse.setText("");
					// Setting fouces of the cursor on the name field
					txtname.requestFocus();	
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnadd.setBounds(20, 173, 89, 23);
		panel_1.add(btnadd);
		
		JButton btndelete = new JButton("Delete");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel Df = (DefaultTableModel)table.getModel();
				// Index of the selected row from the table
				int selectedIndex = table.getSelectedRow();
				
				try {
					int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
					int confirm = JOptionPane.showConfirmDialog(btndelete, "Do you want to delete?", "Warning", JOptionPane.YES_NO_OPTION); 
					if(confirm == JOptionPane.YES_OPTION) {
						Class.forName("com.mysql.jdbc.Driver");
						// first: localhost address, Second: user name, third: password
						con1 = DriverManager.getConnection("jdbc:mysql://localhost/studentrecord", "root", "");
						insert = con1.prepareStatement("DELETE FROM record WHERE studentId=?");
						insert.setInt(1, id); // Point to 1st ? in statement
						// Executing the insert statement
						insert.executeUpdate();
						// Success Message pop-up
						JOptionPane.showMessageDialog(btndelete, "Record Deleted!!!");
						// Update=ing table
						tableUpdate();
						// Resetting the text field
						txtname.setText("");
						txtmobile.setText("");
						txtcourse.setText("");
						// Setting fouces of the cursor on the name field
						txtname.requestFocus();
					}	
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		btndelete.setBounds(120, 173, 89, 23);
		panel_1.add(btndelete);
		
		JButton btnupdate = new JButton("Update");
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// My Code
				DefaultTableModel Df = (DefaultTableModel)table.getModel();
				// Index of the selected row from the table
				int selectedIndex = table.getSelectedRow();
				try {
					int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
					String name = txtname.getText();
					String mobile = txtmobile.getText();
					String course = txtcourse.getText();
					
					Class.forName("com.mysql.jdbc.Driver");
					// first: localhost address, Second: user name, third: password
					con1 = DriverManager.getConnection("jdbc:mysql://localhost/studentrecord", "root", "");
					insert = con1.prepareStatement("UPDATE record SET studentName=?, studentNumber=?, studentCourse=? WHERE studentId=?");
					insert.setString(1, name); // Point to 1st ? in statement
					insert.setString(2, mobile); // Point to 2nd ? in statement
					insert.setString(3, course); // Point to 3rd ? in statement
					insert.setInt(4, id); // Point to 4th ? in statement
					// Executing the insert statement
					insert.executeUpdate();
					// Success Message pop-up
					JOptionPane.showMessageDialog(btnupdate, "Record Updated!!!");
					// Update=ing table
					tableUpdate();
					// Resetting the text field
					txtname.setText("");
					txtmobile.setText("");
					txtcourse.setText("");
					// Setting fouces of the cursor on the name field
					txtname.requestFocus();	
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnupdate.setBounds(219, 173, 89, 23);
		panel_1.add(btnupdate);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(402, 68, 353, 220);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// My Code
				DefaultTableModel Df = (DefaultTableModel)table.getModel();
				// Index of the selected row from the table
				int selectedIndex = table.getSelectedRow();
				//Setting text field
				txtname.setText(Df.getValueAt(selectedIndex, 1).toString());
				txtmobile.setText(Df.getValueAt(selectedIndex, 2).toString());
				txtcourse.setText(Df.getValueAt(selectedIndex, 3).toString());
			}
		});
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student ID", "Name", "Mobile No.", "Course"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableUpdate();
	}
	
	// Method to refresh the content of the table displaying student information
	public void tableUpdate() {
		int c;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// first: localhost address, Second: user name, third: password
			con1 = DriverManager.getConnection("jdbc:mysql://localhost/studentrecord", "root", "");
			insert = con1.prepareStatement("SELECT * FROM record ");
			// Executing the Query 
			ResultSet rs = insert.executeQuery();
			ResultSetMetaData Rss = rs.getMetaData();
			// get the total count of column in the table
			c = Rss.getColumnCount();		
			// Passing the value to the table
			DefaultTableModel Df = (DefaultTableModel)table.getModel();
			// Setting the pointer to the start of the table
			Df.setRowCount(0);
			// Displaying Each Student record in table
			// Next Rows
			while(rs.next()) {
				Vector<String> v = new Vector<String>();
				// Next Column
				for(int col=1; col<c; col++) {
					v.add(rs.getString("studentId"));
					v.add(rs.getString("studentName"));
					v.add(rs.getString("studentNumber"));
					v.add(rs.getString("studentCourse"));
				}
				Df.addRow(v);
			}	
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

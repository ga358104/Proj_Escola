import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BooksGUI {

	private JFrame frame;
	private JTextField itemAmount;
	private JTextField textField_1;
	private JTextField curAmt;
	private JTextField curInfo;
	private JTextField oSubtotal;
	private JTextField bID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BooksGUI window = new BooksGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BooksGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{300, 100,100,100, 250, 50, 10};
		gridBagLayout.rowHeights = new int[]{30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel amtOrders = new JLabel("  Enter # of items in this order");
		GridBagConstraints gbc_amtOrders = new GridBagConstraints();
		gbc_amtOrders.insets = new Insets(0, 0, 5, 5);
		gbc_amtOrders.gridx = 0;
		gbc_amtOrders.gridy = 0;
		frame.getContentPane().add(amtOrders, gbc_amtOrders);
		
		itemAmount = new JTextField();
		GridBagConstraints gbc_itemAmount = new GridBagConstraints();
		gbc_itemAmount.insets = new Insets(0, 0, 5, 5);
		gbc_itemAmount.fill = GridBagConstraints.HORIZONTAL;
		gbc_itemAmount.gridx = 4;
		gbc_itemAmount.gridy = 0;
		frame.getContentPane().add(itemAmount, gbc_itemAmount);
		itemAmount.setColumns(10);
		
		JLabel bookId = new JLabel("    Enter Book ID for Item #1");
		GridBagConstraints gbc_bookId = new GridBagConstraints();
		gbc_bookId.fill = GridBagConstraints.BOTH;
		gbc_bookId.insets = new Insets(0, 0, 5, 5);
		gbc_bookId.gridx = 0;
		gbc_bookId.gridy = 1;
		frame.getContentPane().add(bookId, gbc_bookId);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 1;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Book ID for Item #1");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		bID = new JTextField();
		GridBagConstraints gbc_bID = new GridBagConstraints();
		gbc_bID.insets = new Insets(0, 0, 5, 5);
		gbc_bID.fill = GridBagConstraints.HORIZONTAL;
		gbc_bID.gridx = 4;
		gbc_bID.gridy = 2;
		frame.getContentPane().add(bID, gbc_bID);
		bID.setColumns(10);
		
		JLabel amtOfBooks = new JLabel("  Enter quantity for Item #1");
		GridBagConstraints gbc_amtOfBooks = new GridBagConstraints();
		gbc_amtOfBooks.insets = new Insets(0, 0, 5, 5);
		gbc_amtOfBooks.gridx = 0;
		gbc_amtOfBooks.gridy = 3;
		frame.getContentPane().add(amtOfBooks, gbc_amtOfBooks);
		
		curAmt = new JTextField();
		GridBagConstraints gbc_curAmt = new GridBagConstraints();
		gbc_curAmt.insets = new Insets(0, 0, 5, 5);
		gbc_curAmt.fill = GridBagConstraints.HORIZONTAL;
		gbc_curAmt.gridx = 4;
		gbc_curAmt.gridy = 3;
		frame.getContentPane().add(curAmt, gbc_curAmt);
		curAmt.setColumns(10);
		
		JLabel itemInfo = new JLabel("Item #1 Info");
		GridBagConstraints gbc_itemInfo = new GridBagConstraints();
		gbc_itemInfo.insets = new Insets(0, 0, 5, 5);
		gbc_itemInfo.gridx = 0;
		gbc_itemInfo.gridy = 4;
		frame.getContentPane().add(itemInfo, gbc_itemInfo);
		
		curInfo = new JTextField();
		curInfo.setEditable(false);
		GridBagConstraints gbc_curInfo = new GridBagConstraints();
		gbc_curInfo.insets = new Insets(0, 0, 5, 5);
		gbc_curInfo.fill = GridBagConstraints.HORIZONTAL;
		gbc_curInfo.gridx = 4;
		gbc_curInfo.gridy = 4;
		frame.getContentPane().add(curInfo, gbc_curInfo);
		curInfo.setColumns(10);
		
		JLabel subtotal = new JLabel("  Order Subtotal for 0 item(s)");
		GridBagConstraints gbc_subtotal = new GridBagConstraints();
		gbc_subtotal.insets = new Insets(0, 0, 5, 5);
		gbc_subtotal.gridx = 0;
		gbc_subtotal.gridy = 5;
		frame.getContentPane().add(subtotal, gbc_subtotal);
		
		oSubtotal = new JTextField();
		oSubtotal.setEditable(false);
		GridBagConstraints gbc_oSubtotal = new GridBagConstraints();
		gbc_oSubtotal.insets = new Insets(0, 0, 5, 5);
		gbc_oSubtotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_oSubtotal.gridx = 4;
		gbc_oSubtotal.gridy = 5;
		frame.getContentPane().add(oSubtotal, gbc_oSubtotal);
		oSubtotal.setColumns(10);
		
		
		JButton confirm = new JButton("Confirm Item #1");
		confirm.setEnabled(false);
		GridBagConstraints gbc_confirm = new GridBagConstraints();
		gbc_confirm.anchor = GridBagConstraints.WEST;
		gbc_confirm.insets = new Insets(0, 0, 5, 5);
		gbc_confirm.gridx = 1;
		gbc_confirm.gridy = 7;
		frame.getContentPane().add(confirm, gbc_confirm);
		
		JButton view = new JButton("View Order");
		view.setEnabled(false);
		GridBagConstraints gbc_view = new GridBagConstraints();
		gbc_view.insets = new Insets(0, 0, 5, 5);
		gbc_view.gridx = 2;
		gbc_view.gridy = 7;
		frame.getContentPane().add(view, gbc_view);
		
		JButton finish = new JButton("Finish Order");
		finish.setEnabled(false);
		GridBagConstraints gbc_finish = new GridBagConstraints();
		gbc_finish.insets = new Insets(0, 0, 5, 5);
		gbc_finish.gridx = 3;
		gbc_finish.gridy = 7;
		frame.getContentPane().add(finish, gbc_finish);
		
		JButton process = new JButton("Process Item #1");
		JButton exit = new JButton("Exit");
		
		JButton newOrder = new JButton("New Order");
		newOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemAmount.setText("");
				textField_1.setText("");
				curAmt.setText("");
				curInfo.setText("");
				oSubtotal.setText("");
				process.setEnabled(true);
				confirm.setEnabled(false);
				newOrder.setEnabled(true);
				finish.setEnabled(false);
				view.setEnabled(false);
				exit.setEnabled(true);
				
				
				
				
			}
		});
		GridBagConstraints gbc_newOrder = new GridBagConstraints();
		gbc_newOrder.insets = new Insets(0, 0, 5, 5);
		gbc_newOrder.gridx = 4;
		gbc_newOrder.gridy = 7;
		frame.getContentPane().add(newOrder, gbc_newOrder);
		
		
		//exit
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		GridBagConstraints gbc_exit = new GridBagConstraints();
		gbc_exit.insets = new Insets(0, 0, 5, 0);
		gbc_exit.gridx = 5;
		gbc_exit.gridy = 7;
		frame.getContentPane().add(exit, gbc_exit);
		
		//process
		process.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				confirm.setEnabled(true);
				process.setEnabled(false);
				itemAmount.setEditable(false);
				
			}
		});
		//confirm
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			view.setEnabled(true);
			finish.setEnabled(true);
			process.setEnabled(true);
			confirm.setEnabled(false);
			
			
			}
		});
		GridBagConstraints gbc_process = new GridBagConstraints();
		gbc_process.insets = new Insets(0, 0, 5, 5);
		gbc_process.gridx = 0;
		gbc_process.gridy = 7;
		frame.getContentPane().add(process, gbc_process);
		
	}

}

package PS4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import PS4.CalcEngine;

public class CalcGUI {

	private JFrame frame;
	private JTextField textFieldA;
	private JTextField textFieldY;
	private JTextField textFieldAI;
	private JTextField textFieldFV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI window = new CalcGUI();
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
	public CalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblInvestmentAmount = new JLabel("Investment Amount");
		frame.getContentPane().add(lblInvestmentAmount, "4, 4");
		
		textFieldA = new JTextField();
		frame.getContentPane().add(textFieldA, "8, 4, fill, default");
		textFieldA.setColumns(10);
		
		JLabel lblYears = new JLabel("Years");
		frame.getContentPane().add(lblYears, "4, 6");
		
		textFieldY = new JTextField();
		frame.getContentPane().add(textFieldY, "8, 6, fill, default");
		textFieldY.setColumns(10);
		
		JLabel lblAnnualInterestRate = new JLabel("Annual Interest Rate");
		frame.getContentPane().add(lblAnnualInterestRate, "4, 8");
		
		textFieldAI = new JTextField();
		frame.getContentPane().add(textFieldAI, "8, 8, fill, default");
		textFieldAI.setColumns(10);
		
		JLabel lblFutureValue = new JLabel("Future Value");
		frame.getContentPane().add(lblFutureValue, "4, 10");
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double Amount = Double.parseDouble(textFieldA.getText());
                double Years = Double.parseDouble(textFieldY.getText());
                double InterestRate = Double.parseDouble(textFieldAI.getText());
                textFieldFV.setText(PS4.CalcEngine.calculate(Amount, Years, InterestRate));
			}
		});
		
		textFieldFV = new JTextField();
		frame.getContentPane().add(textFieldFV, "8, 10, fill, default");
		textFieldFV.setColumns(10);
		frame.getContentPane().add(btnCalculate, "8, 12");
	}

}

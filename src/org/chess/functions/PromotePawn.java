package org.chess.functions;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.GridLayout;

public class PromotePawn extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCongratulationsYourPawn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PromotePawn dialog = new PromotePawn();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PromotePawn() {
		setTitle("Promote");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 255, 255));
			contentPanel.add(panel, BorderLayout.NORTH);
			{
				txtCongratulationsYourPawn = new JTextField();
				txtCongratulationsYourPawn.setBorder(null);
				txtCongratulationsYourPawn.setText("Congratulations! Your pawn is eligible to be promoted!");
				panel.add(txtCongratulationsYourPawn);
				txtCongratulationsYourPawn.setColumns(35);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new GridLayout(3, 4, 0, 0));
			{
				JButton promoteToRook = new JButton();
				JButton promoteToKnight = new JButton();
				JButton promoteToBishop = new JButton();
				JButton promoteToQueen = new JButton();
				
				panel.add(promoteToRook, 4);
				panel.add(promoteToKnight, 5);
				panel.add(promoteToBishop, 6);
				panel.add(promoteToQueen, 7);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}

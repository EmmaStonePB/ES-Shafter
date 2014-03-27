package com.emmastone.rs3.scripts.esshafter.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.powerbot.script.methods.MethodContext;
import org.powerbot.script.methods.MethodProvider;

import com.emmastone.rs3.scripts.esshafter.tasks.banking.Banker;
import com.emmastone.rs3.scripts.esshafter.tasks.crafting.Shafter;
import com.emmastone.rs3.scripts.framework.Task;

public class Gui extends MethodProvider {

	protected static final JComboBox Bank = null;
	protected static final JComboBox Drop = null;
	private JFrame frame = new JFrame();
	private List<Task> taskList;

	public Gui(MethodContext ctx, List<Task> taskList) {
		super(ctx);
		initialise();
		this.taskList = taskList;

	}

	private void initialise() {

		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 380, 362);
		frame.getContentPane().setLayout(null);
		JButton btnStart = new JButton("Start!");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				taskList.add(new Shafter(ctx));
				taskList.add(new Banker(ctx));
				frame.dispose();

			}
		});
		btnStart.setBounds(13, 57, 353, 225);
		frame.getContentPane().add(btnStart);

	}

}

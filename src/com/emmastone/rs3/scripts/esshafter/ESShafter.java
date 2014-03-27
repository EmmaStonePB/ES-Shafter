package com.emmastone.rs3.scripts.esshafter;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import org.powerbot.event.MessageEvent;
import org.powerbot.event.MessageListener;
import org.powerbot.event.PaintListener;
import org.powerbot.script.Manifest;
import org.powerbot.script.PollingScript;

import com.emmastone.rs3.scripts.esshafter.gui.Gui;
import com.emmastone.rs3.scripts.framework.Task;

@Manifest(description = "Super awesome arrow shafter script.", name = "ESShafter")
public class ESShafter extends PollingScript implements PaintListener,
		MessageListener {

	@Override
	public void messaged(MessageEvent e) {
		if (e.getMessage().contains("You carefully cut the wood")){
	    shafts++;
		shafts++;
		shafts++;
		shafts++;
		shafts++;
		shafts++;
		shafts++;
		shafts++;
		shafts++;
		shafts++;
		shafts++;
		shafts++;
		shafts++;
		shafts++;
		shafts++;
		}
	}

	private List<Task> taskList = new ArrayList<Task>();
	long scriptRunTime = getTotalRuntime();

	long startTime;
	long startShaft = 0;
	private int shafts = 0;

	public String formatTime(final long time) {
		final int sec = (int) (time / 1000), h = sec / 3600, m = sec / 60 % 60, s = sec % 60;
		return (h < 10 ? "0" + h : h) + ":" + (m < 10 ? "0" + m : m) + ":"
				+ (s < 10 ? "0" + s : s);
	}

	public void start() {

		ctx.camera.setPitch(true);
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Gui(ctx, taskList);
			}
		});

	}

	@Override
	public int poll() {
		for (Task task : taskList) {
			if (task.activate()) {
				task.execute();
			}
		}

		return 100;
	}

	@Override
	public void repaint(Graphics g) {

		g.setColor(Color.BLACK);
		g.drawRect(5, 5, 150, 81);
		g.setColor(Color.WHITE);
		g.fillRect(6, 6, 149, 80);
		g.setColor(Color.BLACK);
		g.setFont(new Font("PLAIN", 1, 12));
		g.drawString("ESMiner V1", 46, 23);
		g.setFont(new Font("PLAIN", 1, 9));
		g.drawString("Shafts Created:", 15, 50);
		g.drawString(" " + shafts, 100, 50);
		g.drawString("Timer:", 15, 70);
		g.drawString(" " + formatTime(getRuntime()), 100, 70);
		g.setFont(new Font("PLAIN", 3, 7));
		g.drawString("#EmmasCode", 100, 82);

	}

}

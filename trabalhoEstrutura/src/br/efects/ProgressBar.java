package br.efects;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar extends JFrame {

	private static final long serialVersionUID = 1L;
	JProgressBar jb;
	int i = 0, num = 0;

	public ProgressBar() {
		jb = new JProgressBar(0, 2000);
		//jb = new JProgressBar(0, 3000);
		jb.setBounds(40, 40, 160, 30);
		jb.setValue(0);
		jb.setStringPainted(true);
		add(jb);
		setSize(250, 150);
		setLayout(null);
	}

	public void iterate() {
		while (i <= 2000) {
			jb.setValue(i);
			i = i + 10;
			try {
				Thread.sleep(150);
			} catch (Exception e) {
			}
			
		}
	}

}

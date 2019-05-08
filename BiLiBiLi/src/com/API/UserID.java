package com.API;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.bilibili.Action;
/*
 * @anther Luncode
 * 用户输入uid
 * 未完成
 * */
public class UserID extends JFrame{
	public static JTextField useruidtext = new JTextField(10);
	public UserID() {
		//例如https://space.bilibili.com/22753506    22753506就是自己b站的uid
		JLabel label = new JLabel("输入b站的id");
		JButton submit = new JButton("提交UID");
		submit.addActionListener(new Action());
		add(label,BorderLayout.WEST);
		add(useruidtext,BorderLayout.EAST);
		add(submit,BorderLayout.SOUTH);
		setSize(200,100);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(UserID.EXIT_ON_CLOSE);
	}
	
//	public static void main(String[] args) {
//		new UserID();
//	}
}

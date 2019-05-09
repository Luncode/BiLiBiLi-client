package com.API;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.bilibili.Action;
import com.bilibili.bilibili;
/*
 * @anther Luncode
 * 用户输入uid
 * 未完成
 * */
public class UserID extends JFrame{
	public static JTextField useruidtext = new JTextField(9);
	public UserID() {
		//例如https://space.bilibili.com/22753506    22753506就是自己b站的uid
		JLabel label = new JLabel("输入b站的UID");
		JButton submit = new JButton("提交UID");
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 if(e.getActionCommand().equals("提交UID")){
					if(!UserID.useruidtext.getText().equals("")) {
						BILIBILIAPI.Userid=UserID.useruidtext.getText();
						setVisible(false);
					}else {
						JOptionPane.showMessageDialog(null, "不能为空");
					}
					//System.out.println(BILIBILIAPI.Userid);
				}
			}
		});
		add(label,BorderLayout.WEST);
		add(useruidtext,BorderLayout.EAST);
		add(submit,BorderLayout.SOUTH);
		setSize(200,100);
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);
		setVisible(true);
		setDefaultCloseOperation(UserID.EXIT_ON_CLOSE);
	}
	
//	public static void main(String[] args) {
//		new UserID();
//	}
}

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
 * �û�����uid
 * δ���
 * */
public class UserID extends JFrame{
	public static JTextField useruidtext = new JTextField(9);
	public UserID() {
		//����https://space.bilibili.com/22753506    22753506�����Լ�bվ��uid
		JLabel label = new JLabel("����bվ��UID");
		JButton submit = new JButton("�ύUID");
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 if(e.getActionCommand().equals("�ύUID")){
					if(!UserID.useruidtext.getText().equals("")) {
						BILIBILIAPI.Userid=UserID.useruidtext.getText();
						setVisible(false);
					}else {
						JOptionPane.showMessageDialog(null, "����Ϊ��");
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

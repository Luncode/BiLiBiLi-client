package com.bilibili;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.json.JsonData;

public class Action implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		
		if (event.getActionCommand().equals("�ٷ���վ")) {
			JOptionPane.showMessageDialog(null, "http://-------------");
		}else if(event.getActionCommand().equals("��������")){
			JsonData js = new JsonData();
			int follower=js.getFollower();
			int folloing=js.getFollowings();
			JOptionPane.showMessageDialog(null, "��˿����:"+follower+"\n��ע������:"+folloing);
		}
		
	}
}

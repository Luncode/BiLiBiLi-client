package com.bilibili;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.API.BILIBILIAPI;
import com.API.UserID;
import com.json.JsonData;
/*
 * @anther Luncode
 * �¼�����
 * */
public class Action implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		
		if (event.getActionCommand().equals("��������")) {
			JOptionPane.showMessageDialog(null, "Github:Luncode\n"
					+ "ͬʱ��л������jar��������Աchrriis,Google,Java\n"
					+ "DJNativeSwing.jar\n"
					+ "gson-2.8.5.jar\n"
					+ "DJNativeSwing-SWT.jar\n"
					+ "SWT4.3.jar ");
		}else if(event.getActionCommand().equals("��������")){
			JsonData js = new JsonData();
			int follower=js.getFollower();
			int folloing=js.getFollowings();
			JOptionPane.showMessageDialog(null, "��˿����:"+follower+"\n��ע������:"+folloing);
		}else if(event.getActionCommand().equals("�ύUID")){
			BILIBILIAPI.Userid=UserID.useruidtext.getText();
			//System.out.println(BILIBILIAPI.Userid);
		}else {
			JOptionPane.showMessageDialog(null, "������");
		}
		
	}
}

package com.bilibili;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.API.BILIBILIAPI;
import com.API.UserID;
import com.Newbangumi.NewbanGumi;
import com.json.JsonData;
import com.json.NewbangumiData;
/*
 * @anther Luncode
 * �¼�����
 * */
public class Action implements ActionListener,ItemListener{
	public void actionPerformed(ActionEvent event) {
		
		if (event.getActionCommand().equals("��������")) {
			JOptionPane.showMessageDialog(null, "Github:Luncode\n"
					+ "ͬʱ��л������jar��������Ա:chrriis,Google,Java,Jack Jiang\n"
					+ "DJNativeSwing.jar\n"
					+ "gson-2.8.5.jar\n"
					+ "DJNativeSwing-SWT.jar\n"
					+"beautyeye.jar"
					+ "SWT4.3.jar ");
		}else if(event.getActionCommand().equals("��������")){
			JsonData js = new JsonData();
			int follower=js.getFollower();
			int folloing=js.getFollowings();
			JOptionPane.showMessageDialog(null, "��˿����:"+follower+"\n��ע������:"+folloing);
		}else {
			JOptionPane.showMessageDialog(null, "������");
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {
            switch (NewbanGumi.NewbanGumibox.getSelectedIndex()) {
			case 0:
				NewbanGumi.area.setText("�������� - ( �b- �b)�ĥ�  Ǭ��~");
				System.out.println("0");
				break;
			case 1:
				NewbanGumi.area.setText("��һ\n"+NewbangumiData.GetNewbangumiData());
				System.out.println("1");
				break;
			case 2:
				NewbanGumi.area.setText("�ܶ�\n");
				System.out.println("2");
				break;
			case 3:
				NewbanGumi.area.setText("����\n");
				System.out.println("3");
				break;
			case 4:
				NewbanGumi.area.setText("����\n");
				System.out.println("4");
				break;
			case 5:
				NewbanGumi.area.setText("����\n");
				System.out.println("5");
				break;
			case 6:
				NewbanGumi.area.setText("����\n");
				System.out.println("6");
				break;
			case 7:
				NewbanGumi.area.setText("����\n");
				System.out.println("7");
				break;
            }
        }
	}
}

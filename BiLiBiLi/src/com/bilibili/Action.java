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
 * 事件监听
 * */
public class Action implements ActionListener,ItemListener{
	public void actionPerformed(ActionEvent event) {
		
		if (event.getActionCommand().equals("关于作者")) {
			JOptionPane.showMessageDialog(null, "Github:Luncode\n"
					+ "同时感谢第三方jar包开发人员:chrriis,Google,Java,Jack Jiang\n"
					+ "DJNativeSwing.jar\n"
					+ "gson-2.8.5.jar\n"
					+ "DJNativeSwing-SWT.jar\n"
					+"beautyeye.jar"
					+ "SWT4.3.jar ");
		}else if(event.getActionCommand().equals("个人中心")){
			JsonData js = new JsonData();
			int follower=js.getFollower();
			int folloing=js.getFollowings();
			JOptionPane.showMessageDialog(null, "粉丝数量:"+follower+"\n关注的人数:"+folloing);
		}else {
			JOptionPane.showMessageDialog(null, "开发中");
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {
            switch (NewbanGumi.NewbanGumibox.getSelectedIndex()) {
			case 0:
				NewbanGumi.area.setText("哔哩哔哩 - ( ゜- ゜)つロ  乾杯~");
				System.out.println("0");
				break;
			case 1:
				NewbanGumi.area.setText("周一\n"+NewbangumiData.GetNewbangumiData());
				System.out.println("1");
				break;
			case 2:
				NewbanGumi.area.setText("周二\n");
				System.out.println("2");
				break;
			case 3:
				NewbanGumi.area.setText("周三\n");
				System.out.println("3");
				break;
			case 4:
				NewbanGumi.area.setText("周四\n");
				System.out.println("4");
				break;
			case 5:
				NewbanGumi.area.setText("周五\n");
				System.out.println("5");
				break;
			case 6:
				NewbanGumi.area.setText("周六\n");
				System.out.println("6");
				break;
			case 7:
				NewbanGumi.area.setText("周天\n");
				System.out.println("7");
				break;
            }
        }
	}
}

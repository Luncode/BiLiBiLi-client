package com.Newbangumi;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.GridLayout;



import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import com.bilibili.Action;
/*
 * @anther Luncode
 * 番剧时刻表（未完成）
 * */
public class NewbanGumi extends JFrame{
	public static JComboBox<String> NewbanGumibox = new JComboBox<String>();
	public static JPanel jPaneldown = new JPanel();
	public static JTextArea area = new JTextArea();
	String date[]= {"选择(￣▽￣)","星期一","星期二","星期三","星期四","星期五","星期六","星期天"};
	public NewbanGumi() {
		 Font font = new Font("Serif",0,15); 
		JPanel jPanelup = new JPanel();
		JLabel text = new JLabel("选择星期：");
		for (int i = 0; i < date.length; i++) {
			NewbanGumibox.addItem(date[i]);
		}
		
		NewbanGumibox.addItemListener(new Action());
		
		//jPaneldown.setBackground(Color.cyan);
		jPanelup.add(text,BorderLayout.EAST);
		jPanelup.add(NewbanGumibox,BorderLayout.WEST);
		add(jPanelup,BorderLayout.NORTH);
		jPaneldown.setLayout(new GridLayout(1,1));
		area.setFont(font);
		area.setLineWrap(true);
		area.setText("哔哩哔哩 - ( ゜- ゜)つロ  乾杯~");
		area.setEditable(false);
		jPaneldown.add(new JScrollPane(area));
		add(jPaneldown);
		setTitle("新番时刻表");
		setSize(300,600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(NewbanGumi.EXIT_ON_CLOSE);
	}
	
//测试类
//	public static void main(String[] args) {
//		try {
//			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
//			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		new NewbanGumi();
//	}
}

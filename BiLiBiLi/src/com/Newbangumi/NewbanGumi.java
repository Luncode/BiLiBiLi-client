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
 * ����ʱ�̱�δ��ɣ�
 * */
public class NewbanGumi extends JFrame{
	public static JComboBox<String> NewbanGumibox = new JComboBox<String>();
	public static JPanel jPaneldown = new JPanel();
	public static JTextArea area = new JTextArea();
	String date[]= {"ѡ��(������)","����һ","���ڶ�","������","������","������","������","������"};
	public NewbanGumi() {
		 Font font = new Font("Serif",0,15); 
		JPanel jPanelup = new JPanel();
		JLabel text = new JLabel("ѡ�����ڣ�");
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
		area.setText("�������� - ( �b- �b)�ĥ�  Ǭ��~");
		area.setEditable(false);
		jPaneldown.add(new JScrollPane(area));
		add(jPaneldown);
		setTitle("�·�ʱ�̱�");
		setSize(300,600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(NewbanGumi.EXIT_ON_CLOSE);
	}
	
//������
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

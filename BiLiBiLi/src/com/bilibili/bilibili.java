package com.bilibili;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;


public class bilibili{
		
	private String path;
	
	public static void main(String[] args) {
		
		//JScrollPane jscrollPane = new JScrollPane();
		
		JLabel label = new JLabel("<html><font color=black size=3>���������ɱ�~����һ��</font></html>");  

		//������ҳ
		JEditorPane editorPane = new JEditorPane();  
		String path= "http://www.bilibili.com";  //��ҳ��ַ
		editorPane.setEditable(true);           //���editorPane����Ϊֻ������Ȼ��ʾ�Ͳ�����
		try {
			editorPane.setPage(path);
		} catch (IOException e) {
			System.out.println("���ش���");
		} 
		
		//�������ƴ���
		JFrame bili = new JFrame("�������� - ( �b- �b)�ĥ�  Ǭ��~");
		
		//ͼ��
		Image ico= Toolkit.getDefaultToolkit().getImage("icon/icon.png");
		
		//�˵���
		JMenuBar menuBar=new JMenuBar(); 
		String mString[]={"�û���¼","����AV��","��������"};
		JMenu menu[]=new JMenu[mString.length];//�˵�
		for (int i = 0; i < mString.length; i++) {
			menu[i] = new JMenu(mString[i]);
			menuBar.add(menu[i]);
			
		}
		
		//�˵�������
		String login[]={"��������","�ҵ�Ǯ��","Ͷ�����","�ղ�","��ʷ��¼"};
		JMenuItem item[]=new JMenuItem[login.length];
		for(int i = 0; i < item.length; i++) {
			item[i]=new JMenuItem(login[i]);
			item[i].addActionListener(new Action());
			menu[0].add(item[i]);
		}
		//�����˺�
		JTextArea tArea = new JTextArea(10,20);
		tArea=new JTextArea("����AV��");
		menu[1].add(tArea);
		
		//��������
		JMenuItem aboutItem = new JMenuItem("�ٷ���վ");
		menu[2].add(aboutItem);
		aboutItem.addActionListener(new Action());
		
		//Flowlayout����
		bili.setLayout(new FlowLayout(0));
		
		//����ͼ��
		bili.setIconImage(ico);
		
		//��Ӳ˵���
		bili.add(menuBar,BorderLayout.NORTH);
		
		bili.add(label,BorderLayout.NORTH);

		bili.add(editorPane,BorderLayout.CENTER);
		
		//���ڴ�С
		bili.setSize(1200, 800);
		
		//�˳��������
		bili.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����λ�þ���
		bili.setLocationRelativeTo(null);
		//���ڿɼ���
		bili.setVisible(true);

	      }

		
	}




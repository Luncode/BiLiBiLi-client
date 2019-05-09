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
import javax.swing.SwingUtilities;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;

/*
 * @anther Luncode
 * �����
 * */
public class bilibili extends JFrame{
		
	public bilibili() {
		UIUtils.setPreferredLookAndFeel();
		NativeInterface.open();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//�������ƴ���
				setTitle("�������� - ( �b- �b)�ĥ�  Ǭ��~");
				//ͼ��
				Image ico= Toolkit.getDefaultToolkit().getImage("icon/icon.png");
				
				//�˵���
				JMenuBar menuBar=new JMenuBar(); 
				String mString[]={"�û�����","����AV��","����"};
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
				//����av��  δ���
				JTextArea tArea = new JTextArea(10,20);
				tArea=new JTextArea("����av��");
				menu[1].add(tArea);
				
				//��������
				JMenuItem aboutItem = new JMenuItem("��������");
				menu[2].add(aboutItem);
				aboutItem.addActionListener(new Action());
				
				//����ͼ��
				setIconImage(ico);
				
				//��Ӳ˵���
				add(menuBar,BorderLayout.NORTH);
				
				//��ʾ��ҳ����
				add(new WebBrowser(),BorderLayout.CENTER);
				
				//���ڴ�С
				setSize(1200, 700);
				
				//�˳��������
				setDefaultCloseOperation(bilibili.EXIT_ON_CLOSE);
				//����λ�þ���
				setLocationRelativeTo(null);
				//���ڿɼ���
				setVisible(true);
			}
		});
		NativeInterface.runEventPump();
			
	}
	
	//������
//	public static void main(String[] args) {
//			new bilibili();
//	}

//JScrollPane jscrollPane = new JScrollPane();

		//JLabel label = new JLabel("<html><font color=black size=3>���������ɱ�~����һ��</font></html>");  

		//������ҳ
//		JEditorPane editorPane = new JEditorPane();  
//		String path= "http://www.bilibili.com";  //��ҳ��ַ
//		//editorPane.setEditable(true);           //���editorPane����Ϊֻ������Ȼ��ʾ�Ͳ�����
//		try {
//			editorPane.setContentType("text/html");
//			editorPane.setPage(path);
//		} catch (IOException e) {
//			System.out.println("���ش���");
//		} 
//		
}

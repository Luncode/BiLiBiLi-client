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
		
		JLabel label = new JLabel("<html><font color=black size=3>哔哩哔哩干杯~测试一下</font></html>");  

		//加载网页
		JEditorPane editorPane = new JEditorPane();  
		String path= "http://www.bilibili.com";  //网页地址
		editorPane.setEditable(true);           //请把editorPane设置为只读，不然显示就不整齐
		try {
			editorPane.setPage(path);
		} catch (IOException e) {
			System.out.println("加载错误");
		} 
		
		//创建名称窗口
		JFrame bili = new JFrame("哔哩哔哩 - ( ゜- ゜)つロ  乾杯~");
		
		//图标
		Image ico= Toolkit.getDefaultToolkit().getImage("icon/icon.png");
		
		//菜单栏
		JMenuBar menuBar=new JMenuBar(); 
		String mString[]={"用户登录","搜索AV号","关于作者"};
		JMenu menu[]=new JMenu[mString.length];//菜单
		for (int i = 0; i < mString.length; i++) {
			menu[i] = new JMenu(mString[i]);
			menuBar.add(menu[i]);
			
		}
		
		//菜单下拉栏
		String login[]={"个人中心","我的钱包","投稿管理","收藏","历史记录"};
		JMenuItem item[]=new JMenuItem[login.length];
		for(int i = 0; i < item.length; i++) {
			item[i]=new JMenuItem(login[i]);
			item[i].addActionListener(new Action());
			menu[0].add(item[i]);
		}
		//搜索账号
		JTextArea tArea = new JTextArea(10,20);
		tArea=new JTextArea("搜索AV号");
		menu[1].add(tArea);
		
		//关于作者
		JMenuItem aboutItem = new JMenuItem("官方网站");
		menu[2].add(aboutItem);
		aboutItem.addActionListener(new Action());
		
		//Flowlayout布局
		bili.setLayout(new FlowLayout(0));
		
		//定义图标
		bili.setIconImage(ico);
		
		//添加菜单栏
		bili.add(menuBar,BorderLayout.NORTH);
		
		bili.add(label,BorderLayout.NORTH);

		bili.add(editorPane,BorderLayout.CENTER);
		
		//窗口大小
		bili.setSize(1200, 800);
		
		//退出清除缓存
		bili.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//窗口位置居中
		bili.setLocationRelativeTo(null);
		//窗口可见性
		bili.setVisible(true);

	      }

		
	}




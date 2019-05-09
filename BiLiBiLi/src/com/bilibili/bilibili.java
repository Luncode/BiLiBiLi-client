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
 * 主入口
 * */
public class bilibili extends JFrame{
		
	public bilibili() {
		UIUtils.setPreferredLookAndFeel();
		NativeInterface.open();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//创建名称窗口
				setTitle("哔哩哔哩 - ( ゜- ゜)つロ  乾杯~");
				//图标
				Image ico= Toolkit.getDefaultToolkit().getImage("icon/icon.png");
				
				//菜单栏
				JMenuBar menuBar=new JMenuBar(); 
				String mString[]={"用户操作","搜索AV号","关于"};
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
				//搜索av号  未完成
				JTextArea tArea = new JTextArea(10,20);
				tArea=new JTextArea("输入av号");
				menu[1].add(tArea);
				
				//关于作者
				JMenuItem aboutItem = new JMenuItem("关于作者");
				menu[2].add(aboutItem);
				aboutItem.addActionListener(new Action());
				
				//定义图标
				setIconImage(ico);
				
				//添加菜单栏
				add(menuBar,BorderLayout.NORTH);
				
				//显示网页内容
				add(new WebBrowser(),BorderLayout.CENTER);
				
				//窗口大小
				setSize(1200, 700);
				
				//退出清除缓存
				setDefaultCloseOperation(bilibili.EXIT_ON_CLOSE);
				//窗口位置居中
				setLocationRelativeTo(null);
				//窗口可见性
				setVisible(true);
			}
		});
		NativeInterface.runEventPump();
			
	}
	
	//测试类
//	public static void main(String[] args) {
//			new bilibili();
//	}

//JScrollPane jscrollPane = new JScrollPane();

		//JLabel label = new JLabel("<html><font color=black size=3>哔哩哔哩干杯~测试一下</font></html>");  

		//加载网页
//		JEditorPane editorPane = new JEditorPane();  
//		String path= "http://www.bilibili.com";  //网页地址
//		//editorPane.setEditable(true);           //请把editorPane设置为只读，不然显示就不整齐
//		try {
//			editorPane.setContentType("text/html");
//			editorPane.setPage(path);
//		} catch (IOException e) {
//			System.out.println("加载错误");
//		} 
//		
}

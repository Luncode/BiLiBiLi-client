package com.bilibili;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.API.BILIBILIAPI;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
/*
 * @anther Luncode
 * WebBrowser Gui
 * */
public class WebBrowser extends JPanel {
	  public WebBrowser() {
		  super(new BorderLayout());
		   JPanel webBrowserPanel = new JPanel(new BorderLayout());
		   webBrowserPanel.setBorder(BorderFactory.createTitledBorder("ﬂŸ¡®ﬂŸ¡® - ( ©b- ©b)§ƒ•Ì  «¨±≠~"));
		   final JWebBrowser webBrowser = new JWebBrowser();
		   webBrowser.isMenuBarVisible();
		   webBrowser.navigate(BILIBILIAPI.index);
		   webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
		   add(webBrowserPanel, BorderLayout.CENTER);
		   setSize(1000,800);
	  }
	  
	  //≤‚ ‘¿‡
//	  public static void main(String[] args) {
//		  UIUtils.setPreferredLookAndFeel();
//		   NativeInterface.open();
//		   SwingUtilities.invokeLater(new Runnable() {
//		     public void run() {
//		       JFrame frame = new JFrame("DJ Native Swing Test");
//		       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		       frame.getContentPane().add(new WebBrowser(), BorderLayout.CENTER);
//		       frame.setSize(1000, 800);
//		       frame.setLocationByPlatform(true);
//		       frame.setVisible(true);
//		     }
//		   });
//		   NativeInterface.runEventPump();
//		 }
	}

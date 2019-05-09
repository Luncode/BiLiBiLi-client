package com.start;

import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import com.API.UserID;
import com.Newbangumi.NewbanGumi;
import com.bilibili.bilibili;
/*
 * @anther Luncode
 * Ö÷Æô¶¯
 * */
public class Strat {
	public static void main(String[] args) {
		try {
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.put("RootPane.setupButtonVisible", false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//new UserID();
		new NewbanGumi();
		new bilibili();
		
	}
}


import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Jframe extends Action{
	class test extends JPanel{
		ImageIcon backgroundIcon = new ImageIcon("icon\\ioon.png");
		Image image = Toolkit.getDefaultToolkit().getImage("icon\\ioon.png");
		int h,w;
		public void paint(Graphics g) {
			g.drawImage(image,0,0,null);
		}
	}
		
	public static void main(String[] args) {

		//创建名称窗口
		JFrame bili = new JFrame("~~哔哩>_<哔哩~~");
		//定义Toolkit 图标方法
		Toolkit imgToolkit = Toolkit.getDefaultToolkit();
		Image image = imgToolkit.createImage("icon\\icon.png");
		
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
		for (int i = 0; i < item.length; i++) {
			item[i]=new JMenuItem(login[i]);
			menu[0].add(login[i]);
		}
		//搜索账号
		JTextArea tArea = new JTextArea(1,7);
		tArea=new JTextArea("搜索AV号");
		menu[1].add(tArea);
		//关于作者
		JMenuItem aboutItem = new JMenuItem("官方网站");
		menu[2].add(aboutItem);
		//Flowlayout布局
		bili.setLayout(new FlowLayout(0));
		//定义图标
		bili.setIconImage(image);
		//添加菜单栏
		bili.add(menuBar);
		//窗口大小
		bili.setSize(1000, 700);
		//退出清除缓存
		bili.setDefaultCloseOperation(bili.EXIT_ON_CLOSE);
		//窗口位置居中
		bili.setLocationRelativeTo(null);
		//窗口可见性
		bili.setVisible(true);
		//窗口不可拖动
		bili.setResizable(false);

	}

	//实现Toolkit的方法
	private static Object getToolkit() {
		// TODO Auto-generated method stub
		return null;
	}

}


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

		//�������ƴ���
		JFrame bili = new JFrame("~~����>_<����~~");
		//����Toolkit ͼ�귽��
		Toolkit imgToolkit = Toolkit.getDefaultToolkit();
		Image image = imgToolkit.createImage("icon\\icon.png");
		
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
		for (int i = 0; i < item.length; i++) {
			item[i]=new JMenuItem(login[i]);
			menu[0].add(login[i]);
		}
		//�����˺�
		JTextArea tArea = new JTextArea(1,7);
		tArea=new JTextArea("����AV��");
		menu[1].add(tArea);
		//��������
		JMenuItem aboutItem = new JMenuItem("�ٷ���վ");
		menu[2].add(aboutItem);
		//Flowlayout����
		bili.setLayout(new FlowLayout(0));
		//����ͼ��
		bili.setIconImage(image);
		//��Ӳ˵���
		bili.add(menuBar);
		//���ڴ�С
		bili.setSize(1000, 700);
		//�˳��������
		bili.setDefaultCloseOperation(bili.EXIT_ON_CLOSE);
		//����λ�þ���
		bili.setLocationRelativeTo(null);
		//���ڿɼ���
		bili.setVisible(true);
		//���ڲ����϶�
		bili.setResizable(false);

	}

	//ʵ��Toolkit�ķ���
	private static Object getToolkit() {
		// TODO Auto-generated method stub
		return null;
	}

}

package cn.edu.scau.cmi.liangzaoqing.client;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.wb.swt.SWTResourceManager;

import cn.edu.scau.cmi.bar.QRCoder;
import cn.edu.scau.cmi.liangshanhero.encyrpt.MD5;
import cn.edu.scau.cmi.liangshanhero.encyrpt.RSA_Encrypt;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;

public class FoodTraceCodeClient {

	protected Shell shell;
	private Text text;
	private Text text_4;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FoodTraceCodeClient window = new FoodTraceCodeClient();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		
//		时间
		ArrayList<Long> codeWriteTimeList=new ArrayList<Long>();
		ArrayList<Long> codeReadTimeList=new ArrayList<Long>();
		
		shell = new Shell();
		shell.setSize(575, 350);
		shell.setText("农产品追溯二维码生成器");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(140, 21, 108, 23);
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(26, 24, 80, 17);
		label.setText("农产品追溯码");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(26, 70, 61, 17);
		lblNewLabel.setText("追溯码加密");
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setText("纠错编码加密");
		label_1.setBounds(26, 115, 84, 17);
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setText("图像加密");
		label_2.setBounds(26, 157, 61, 17);
		
		Combo combo = new Combo(shell, SWT.NONE);
		combo.setItems(new String[] {"不加密", "RSA", "DES", "MD5", "SHA-1"});
		combo.setBounds(140, 67, 108, 25);
		combo.setText("请选择加密方式");
		
		Combo combo_1 = new Combo(shell, SWT.NONE);
		combo_1.setItems(new String[] {"不加密", "RSA", "DES", "MD5", "SHA-1"});
		combo_1.setBounds(140, 112, 108, 25);
		combo_1.setText("请选择加密方式");
		
		Combo combo_2 = new Combo(shell, SWT.NONE);
		combo_2.setItems(new String[] {"不加密", "RSA", "DES", "MD5", "SHA-1"});
		combo_2.setBounds(140, 154, 108, 25);
		combo_2.setText("请选择加密方式");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				Date timeBeforeEncrypt=new Date();
				long t1 = timeBeforeEncrypt.getTime();
				System.out.println(t1);
				
//				追溯条码
				String encode=text.getText();//
//				String md5Encode=MD5.getInstance().getMD5(encode);
				String rsaEncode=null;
				try {
//					rsaEncode=RSA_Encrypt.encrypt(md5Encode);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
//				text_2.setText(rsaEncode);
				File targetFile=new File("d:/foodTraceCodeImage/不加密的二维条码.jpg");
				try {
					QRCoder.encode(encode, null, false, null,targetFile);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				btnNewButton.setImage(SWTResourceManager.getImage("d:/foodTraceCodeImage/多维加密条码.jpg"));
				
				Date timeAfterEncrypt=new Date();
				long t2 = timeAfterEncrypt.getTime();
				
				codeWriteTimeList.add(t2-t1);
				
				long sumCodeWriteTime=0;
				
				for(long codeWriteTime:codeWriteTimeList) {
					sumCodeWriteTime=sumCodeWriteTime+codeWriteTime;
					
					
				}
				
				String intervel=Long.toString(sumCodeWriteTime/codeWriteTimeList.size());
				
				System.out.println(t2);
				text_4.setText(intervel);
				
				
				
			}
		});
		btnNewButton.setImage(SWTResourceManager.getImage("d:/foodTraceCodeImage/多维加密条码.jpg"));
		btnNewButton.setBounds(254, 21, 296, 223);
		btnNewButton.setText("点击该按钮生成条码");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(26, 191, 108, 17);
		lblNewLabel_1.setText("条码生成时间(毫秒)");
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setText("生成条码的时间");
		text_4.setBounds(140, 185, 108, 23);
		
		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setText("条码解码时间(毫秒)");
		label_3.setBounds(26, 227, 108, 17);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setText("解密条码的时间");
		text_1.setBounds(140, 221, 108, 23);
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setText("加密后的条码");
		label_4.setBounds(26, 261, 91, 17);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setText("加密后的条码");
		text_2.setBounds(123, 255, 426, 23);

	}
}

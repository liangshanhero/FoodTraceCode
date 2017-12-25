package cn.edu.scau.cmi.liangzaoqing.client;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;

public class FoodTraceCodeClient {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;

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
		shell = new Shell();
		shell.setSize(628, 433);
		shell.setText("农产品追溯二维码生成器");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(112, 21, 490, 23);
		
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
		combo.setBounds(112, 67, 108, 25);
		combo.setText("请选择加密方式");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setText("请输入密码");
		text_1.setBounds(226, 70, 376, 23);
		
		Combo combo_1 = new Combo(shell, SWT.NONE);
		combo_1.setItems(new String[] {"不加密", "RSA", "DES", "MD5", "SHA-1"});
		combo_1.setBounds(112, 107, 108, 25);
		combo_1.setText("请选择加密方式");
		
		Combo combo_2 = new Combo(shell, SWT.NONE);
		combo_2.setItems(new String[] {"不加密", "RSA", "DES", "MD5", "SHA-1"});
		combo_2.setBounds(112, 149, 108, 25);
		combo_2.setText("请选择加密方式");
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setText("请输入密码");
		text_2.setBounds(226, 109, 376, 23);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setText("请输入密码");
		text_3.setBounds(226, 151, 376, 23);

	}
}

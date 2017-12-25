/*package cn.edu.scau.cmi.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

import cn.edu.scau.cmi.qrbar.QRCoder;

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class LoginClientSwt {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_company;
	private Text text_product_address;
	private Text text_product_type;
	static Properties pps = new Properties();
	
	private static String imgPath;

	public static String getImgPath() {
		return imgPath;
	}

	public static void setImgPath(String imgPath) throws FileNotFoundException, IOException {
		
		
		pps.load(new FileInputStream("project.properties"));
		pps.getProperty("oneBarDirectionary");
		LoginClientSwt.imgPath = imgPath;
	}

	*//**
	 * Launch the application.
	 * @param args
	 *//*
	public static void main(String[] args) {
		try {
			LoginClientSwt window = new LoginClientSwt();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	*//**
	 * Open the window.
	 *//*
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

	*//**
	 * Create contents of the window.
	 *//*
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("\u98DF\u54C1\u6570\u636E\u91C7\u96C6\u5BA2\u6237\u7AEF");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(20, 204, 72, 22);
		btnNewButton.setText("\u767B\u5F55");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(20, 64, 70, 18);
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(20, 23, 54, 12);
		label.setText("\u7528\u6237\u540D");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(20, 140, 70, 18);
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBounds(20, 101, 54, 12);
		label_1.setText("\u5BC6\u7801");
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setBounds(151, 23, 54, 12);
		label_2.setText("\u516C\u53F8\u540D");
		
		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setBounds(151, 64, 54, 12);
		label_3.setText("\u4EA7\u5730");
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setBounds(151, 101, 54, 12);
		label_4.setText("\u4EA7\u54C1\u7C7B\u578B");
		
		Button button = new Button(shell, SWT.NONE);
		button.setBounds(162, 204, 72, 22);
		button.setText("\u6253\u5370\u4E00\u7EF4\u7801");
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String content = "Scau";
				try {
					QRCoder.encode(content, imgPath);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button_1.setText("\u6253\u5370\u4E8C\u7EF4\u7801");
		button_1.setBounds(274, 204, 72, 22);
		
		text_company = new Text(shell, SWT.BORDER);
		text_company.setBounds(221, 23, 70, 18);
		
		text_product_address = new Text(shell, SWT.BORDER);
		text_product_address.setBounds(221, 58, 70, 18);
		
		text_product_type = new Text(shell, SWT.BORDER);
		text_product_type.setBounds(221, 98, 70, 18);

	}
}
*/
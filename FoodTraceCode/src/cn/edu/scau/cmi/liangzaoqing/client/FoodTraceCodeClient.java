package cn.edu.scau.cmi.liangzaoqing.client;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class FoodTraceCodeClient {

	protected Shell shell;

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
		shell.setSize(450, 300);
		shell.setText("农产品追溯码生成器");

	}

}

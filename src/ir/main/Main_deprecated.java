package ir.main;
//package ir.main;
//
//import ir.gui.GuiBuilder;
//
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.widgets.Display;
//import org.eclipse.swt.widgets.Shell;
//import org.eclipse.swt.widgets.Button;
//import org.eclipse.swt.events.SelectionAdapter;
//import org.eclipse.swt.events.SelectionEvent;
//import org.eclipse.swt.widgets.Menu;
//import org.eclipse.swt.widgets.MenuItem;
//
//public class Main {
//
//	protected Shell shlSwtApplication;
//	
//	/**
//	 * @wbp.parser.entryPoint
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		try {
//			Main window = new Main();
//			window.open();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//
//	}
//
//	public void open() {
//		Display display = Display.getDefault();
////		createContents();
//		shlSwtApplication.open();
//		shlSwtApplication.layout();
//		while (!shlSwtApplication.isDisposed()) {
//			if (!display.readAndDispatch()) {
//				display.sleep();
//			}
//		}
//	}
//
//	protected void 
//	createContents() {
//		shlSwtApplication = new Shell();
//		shlSwtApplication.setSize(577, 491);
//		shlSwtApplication.setText("ImageGenerator");
//
//		GuiBuilder.createContents__Buttons(shlSwtApplication);
//		GuiBuilder.createContents__Menues(shlSwtApplication);
//		
////		_createContents__Buttons();
//		
//		
////		_createContents__Menues();
//
//	}//createContents()
//
//}

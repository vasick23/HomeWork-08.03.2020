import java.awt.BorderLayout;
import javax.swing.*;
import com.chessmaster.manager.CustomStack;
import com.chessmaster.manager.GameBoard;
public class ApplicationMain{
	public static void main(String[] args){		
		GameBoard.init();
		JFrame windowFrame = new JFrame();
		JLabel statusbar = new JLabel("Problem and game info will be displayed here.");
		windowFrame.add(statusbar, BorderLayout.SOUTH);
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(520, 545);
		windowFrame.setResizable(false);
		windowFrame.add(new GameBoardPanel());	
		windowFrame.setVisible(true);
				System.out.println("Stack using Array");
			        System.out.println("----------------------------");
			        // Stack is defined to hold only String values
				CustomStack<String> arrayStack = new CustomStack<String>();
				System.out.println("Initial Stack size : "+arrayStack.size());
				arrayStack.push("Element One");
				arrayStack.push("Element Two");
				System.out.println("Stack size after push : "+arrayStack.size());
				System.out.println("Topmost element : "+arrayStack.pop());
				System.out.println("Stack size after pop : "+arrayStack.size());
	}
}
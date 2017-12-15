package calculator;
import javax.swing.JFrame;
//Классе JFrameApp для создания окна приложения и указания его параметров
//Класс JFrameApp наследуем от JFame
public class JFrameApp extends JFrame 
{
public JFrameApp() 
 {
 	//Создаем окно нашего приложения, указываем его размеры
 	setBounds(100, 100, 247, 388);
	//добавляем в него стандартные кнопки (свернуть, закрыть, развернуть на весь экран
 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	//делаем окно не масштабируемым  
 	setResizable(false);
 	//Указываем строку которая отображается в заголовке окга
 	setTitle("Calculator");
 	//Создаем панель на которой будем размещать все наши кнопки
 	JPanelApp panelApp = new JPanelApp();
 	//добавлем панель в окно
 	getContentPane().add( panelApp);
 	//говорим что нужно показать окно нашего приложения
 	setVisible(true);
 }
}

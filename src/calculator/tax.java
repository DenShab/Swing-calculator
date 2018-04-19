package calculator;

/*Класс tax. В нем мы реализовываем метод, который будет выполнять расчет налогов */
public class tax {
	public double calcTax ( double d,double dsumm, double child,double proc,boolean fam) 
	 {
		//переменная tax хранит результат вычисления
		double tax=0;
		//try отлавливает исключения
		try{
			//алгоритм расчета налога
			if(dsumm>40000)tax = (proc/100)*d;
			else
			{
				//переменная ded хранит вычеты
				//deduction метод вычисления вычетов
				double ded=deduction(child,fam);
				if(ded<=d)tax = (proc/100)*(d-ded);
				else tax=0;
			}
		}
		//обработчик ошибок заносит -1 в tax в случае возникновения исключения
		catch(ArithmeticException exception){tax=-1;}
		return tax;
	 }
//метод deduction расчитывает вычеты в зависимости от колличества детей и состава семьи 
	public double deduction(double child, boolean fam) {
		double ded=0;
		if(child>0)
		{
			if(fam)ded=600+600*child;
			else ded=600+1200*child;
		}
		else ded=600;
		return ded;
	}
}

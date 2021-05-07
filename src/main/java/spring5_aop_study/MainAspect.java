package spring5_aop_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring5_aop_study.aop.Calculator;
import spring5_aop_study.config.AppCix;

public class MainAspect {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCix.class)){
			Calculator cal1 = ctx.getBean("calculator1",Calculator.class);
			long fiveFact1 = cal1.factorial(5);
			System.out.printf("cal1.factorial(5) = %d%n",fiveFact1 );
			System.out.println(cal1.getClass().getName());
			
			Calculator cal2 = ctx.getBean("calculator2",Calculator.class);
			long fiveFact2 = cal2.factorial(5);
			System.out.printf("cal2.factorial(5) = %d%n",fiveFact2 );
			System.out.println(cal2.getClass().getName());
			
		}

	}

}

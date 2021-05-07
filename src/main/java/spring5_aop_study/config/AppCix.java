package spring5_aop_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import spring5_aop_study.aop.Calculator;
import spring5_aop_study.aop.ImpeCalculator;
import spring5_aop_study.aop.RecCalculator;
import spring5_aop_study.aspect.ExecTimeAspect;

@Configuration
@EnableAspectJAutoProxy
public class AppCix {

	@Bean
	public ExecTimeAspect execTimeAspect() {
		return new ExecTimeAspect();
	}
	
	@Bean
	public Calculator calculator1() {
		return new RecCalculator();
	}
	
	@Bean
	public Calculator calculator2() {
		return new ImpeCalculator();
	}
}

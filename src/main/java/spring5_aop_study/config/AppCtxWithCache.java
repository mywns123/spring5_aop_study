package spring5_aop_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import spring5_aop_study.aop.Calculator;
import spring5_aop_study.aop.RecCalculator;
import spring5_aop_study.aspect.CacheAspect;
import spring5_aop_study.aspect.ExecTimeAspect;

@Configuration
@EnableAspectJAutoProxy
public class AppCtxWithCache {
	
	@Bean
	public CacheAspect cacheAspect() {
		return new CacheAspect();
	}
	
	@Bean
	public ExecTimeAspect execTimeAspect() {
		return new ExecTimeAspect();
	}
	
	@Bean
	public Calculator calculator() {
		return new RecCalculator();
	}
	/*
	@Bean
	public Calculator calculator2() {
		return new ImpeCalculator();
	}
	*/
}

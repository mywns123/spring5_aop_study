package spring5_aop_study.aop;

public class ExecTimeCalculator implements Calculator {

	private Calculator delegate;
	
	public ExecTimeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}

	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
//		long start = System.currentTimeMillis();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
//		long end = System.currentTimeMillis();
		System.out.printf("%s.factorial(%d) 실행시간 = %d%n",
				delegate.getClass().getSimpleName(), num, (end - start));

		return result;
	}

}

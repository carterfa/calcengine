package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {

    	String[] statements = {
    			"divide 100.0 50.0",
				"add 25.0 92.0",
				"fgsdfgsdfg 5.0 0.0",
				"addX 25.0",
				"subtract 225.0 17.0",
				"multiply 11.0 3.0"

		};

    	CalculateHelper helper = new CalculateHelper();

    	for(String statement:statements){
    		try {
				helper.process(statement);
				System.out.println(helper);
			} catch(InvalidStatementExpression e){
    			System.out.println(e.getMessage());
    			if(e.getCause() != null){
    				System.out.println("  Original exception: " + e.getCause().getMessage());
				}
			}
		}


//    	MathEquation[] equations = new MathEquation[4];
//    	equations[0] = new MathEquation('d', 100d, 50.0d);
//    	equations[1] = new MathEquation('a', 25.0d, 92.0d);
//    	equations[2] = new MathEquation('s', 225.0d, 17.0d);
//
//		for (MathEquation equation: equations) {
//			equation.execute();
//			System.out.print("result = ");
//			System.out.println(equation.result);
//		}
//
//		double leftDouble = 9.0d;
//		double rightDouble = 4.0d;
//		MathEquation equationOverload = new MathEquation('d');
//		equationOverload.execute(leftDouble, rightDouble);
//		System.out.println(equationOverload.getResult());

//		CalculateBase[] calculators = {
//				new Divider (100.0d, 50.0d),
//				new Adder (25.0d, 92.0d),
//				new Subtracter(225.0d, 17.0d),
//				new Multiplier(11.0d, 3.0d)
//
//		};
//
//		for (CalculateBase calculator:calculators) {
//			calculator.calculate();
//			System.out.print("result = ");
//			System.out.println(calculator.getResult());
//		}


    }


}

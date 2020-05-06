package com.pluralsight.calcengine;

public class InvalidStatementExpression extends Exception {

    public InvalidStatementExpression(String reason, String statement){
        super(reason + ": " + statement);
    };

    public InvalidStatementExpression(String reason, String statement, Throwable cause){
        super(reason + ": " + statement, cause);
    };
}

package edu.sjsu.fwjs;

public class Interpreter {

    public static void main(String[] args) throws Exception {
        Expression prog = new BinOpExpr(Op.ADD,
                new ValueExpr(new IntVal(3)),
                new ValueExpr(new IntVal(4)));
        System.out.println("'3 + 4;' evaluates to " + prog.evaluate(new Environment()));

        IfExpr ife = new IfExpr(new ValueExpr(new BoolVal(true)),
                new ValueExpr(new IntVal(1)),
                new ValueExpr(new IntVal(2)));
        IntVal iv = (IntVal) ife.evaluate(new Environment());
        System.out.println(iv);

        Environment env = new Environment();
        IfExpr badife = new IfExpr(new ValueExpr(new IntVal(0)),
                new ValueExpr(new IntVal(1)),
                new ValueExpr(new IntVal(2)));
        System.out.println( badife.evaluate(env));

    }
}
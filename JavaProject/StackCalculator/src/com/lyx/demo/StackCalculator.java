package com.lyx.demo;

/**
 * 支持 + - * / 的双栈结构计算器。
 */
public class StackCalculator {
    private String equation;//计算式
    private int index;//计算式读取指针
    private ArrayStack numStack;//数值栈
    private ArrayStack operStack;//符号栈

    public StackCalculator(String equation) {
        this.equation = equation;
        index = 0;
        numStack = new ArrayStack();
        operStack = new ArrayStack();
    }

    /**
     * 输出算式结果
     * @return 算式结果
     */
    public int getResult(){
        //读取算式
        while (index<equation.length()){
            int current = equation.charAt(index++);
            //判断数字or运算符
            if (isOpea(current)){
                //运算符操作
                if (operStack.isEmpty()){
                    //符号栈为空则直接入栈
                    operStack.push(current);
                }else {
                    //符号栈非空，则比较优先级
                    if (operPriority(current)>operPriority(operStack.peepTop())){
                        //入栈运算符大于栈顶符号优先级
                        operStack.push(current);
                    }else {
                        //入栈运算符小于等于栈顶符号优先级
                        //进行局部运算
                        int result = compute();
                        //局部运算结果入数值栈
                        numStack.push(result);
                        //运算符入符号栈
                        operStack.push(current);
                    }
                }
            }else {
                //数字操作:
                //如果算式中下一位读取的仍是数字，则判定需要读取多位数
                if (nextIsNum()){
                    String numStr = String.valueOf((char)current);
                    while (nextIsNum()){
                        //读取下一位数字
                        char nextNum = equation.charAt(index++);
                        //将多位数连接
                        numStr = numStr + nextNum;
                    }
                    //将String类型数字转为对应int值压入数值栈
                    numStack.push(Integer.parseInt(numStr));
                }else {
                    // 将char-> 数字 直接入数值栈
                    numStack.push(Integer.parseInt((char)current+""));
                }
            }
        }
        //完成清栈运算，得出最终结果
        while (!operStack.isEmpty()){
            int result = compute();
            numStack.push(result);
        }
        return numStack.peepTop();
    }

    /**
     * 数值栈出栈两个数值，字符栈出栈一个运算符进行局部运算
     * @return 局部运算结果
     */
    public int compute(){
        int num1 = numStack.pop();
        int num2 = numStack.pop();
        int oper = operStack.pop();
        int result = 0;
        switch (oper){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num2-num1;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num2/num1;
                break;
            default:
                break;
        }
        return result;
    }

    /**
     * 判断是否为运算符
     * @param data 待判断字符
     * @return T/F
     */
    public boolean isOpea(int data){
        return data=='+'||data=='-'||data=='*'||data=='/';
    }

    /**
     * 判断运算符优先级
     * @param oper 运算符
     * @return 优先级
     */
    public int operPriority(int oper){
        if (oper=='+'||oper=='-'){
            return 0;
        }
        if (oper=='*'||oper=='/'){
            return 1;
        }
        return -1;
    }

    /**
     * 打印输出双栈情况
     */
    public void  printComputeStack(){
        numStack.printStack();
        operStack.printStack();
    }

    /**
     * 判断从算式中读取的下一位是否仍为数字
     * @return
     */
    public boolean nextIsNum(){
        return index<equation.length()&&!isOpea(equation.charAt(index));
    }
}

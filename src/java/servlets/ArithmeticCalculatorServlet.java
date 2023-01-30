
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String resultStart = "---";
        request.setAttribute("finalAnswer", resultStart);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNum = request.getParameter("firstNum");
        String secondNum = request.getParameter("secondNum");
        String operation = request.getParameter("operation");
        
        boolean isNum;
        try{
            Integer.parseInt(firstNum);
            Integer.parseInt(secondNum);
            isNum = true;
        } catch(NumberFormatException e){
            isNum = false;
        }
        
        if(isNum == false){
            String notNum = "Invalid";
            request.setAttribute("finalAnswer", notNum);
            request.setAttribute("numOne", firstNum);
            request.setAttribute("numTwo", secondNum);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }
        int numOne = Integer.parseInt(firstNum);
        int numTwo = Integer.parseInt(secondNum);
        int answer;
        switch (operation) {
            case "+":
                answer = numOne + numTwo;
                request.setAttribute("finalAnswer", answer);
                break;
            case "-":
                answer = numOne - numTwo;
                request.setAttribute("finalAnswer", answer);
                break;
            case "*":
                answer = numOne * numTwo;
                request.setAttribute("finalAnswer", answer);
                break;
            case "%":
                answer = numOne / numTwo;
                request.setAttribute("finalAnswer", answer);
                break;
            default:
                break;
        }
        
        request.setAttribute("numOne", firstNum);
        request.setAttribute("numTwo", secondNum);
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }
}

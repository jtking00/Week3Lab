
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userAge = request.getParameter("userAge");
        
        if (userAge == null || userAge.equals("")){
            String emptyInput = "You must give your current age.";
            request.setAttribute("userAgeResults", emptyInput);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }
        
        boolean isNum = false;
        try{
            Integer.parseInt(userAge);
            isNum = true;
        } catch(NumberFormatException e){
            isNum = false;
        }
        
        if(isNum == false){
            String notNum = "You must enter a number.";
            request.setAttribute("userAgeResults", notNum);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }
        
        int age = Integer.parseInt(userAge) + 1;
        String ageResults = "Your age next birthday will be " + age;
        
        request.setAttribute("userAgeResults", ageResults);
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }
}

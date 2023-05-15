package cn.edu.guet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String startStation = request.getParameter("startStation");
        String endStation = request.getParameter("endStation");
        String departureData = request.getParameter("departureData");
        System.out.println("起始站：" + startStation);
        System.out.println("终点站：" + endStation);
        System.out.println("出发日期：" + departureData);

        String allTickets =   TicketSearch.search(startStation,endStation,departureData);
        request.setCharacterEncoding("UTF-8");
        //设置响应类型
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out= response.getWriter();
        out.print(allTickets);
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

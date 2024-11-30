package com.parking.parkinglot;
import com.parking.parkinglot.common.UserDto;
import com.parking.parkinglot.ejb.UsersBean;
import jakarta.inject.Inject;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "Users", value = "/Users")

public class Users extends HttpServlet {
    //@Override
    @Inject
    UsersBean userBean;
    protected void doGet(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        List<UserDto> user=userBean.findAllUsers();
        request.setAttribute("user", user);
        request.getRequestDispatcher("/WEB-INF/pages/users.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
    }
}
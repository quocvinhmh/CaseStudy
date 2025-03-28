package com.example.casestudy.controll;

import com.example.casestudy.model.Contract.Contract;
import com.example.casestudy.service.ContractService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractHome", value = "/Contract")
public class ContractControll extends HttpServlet {
private ContractService contractService = new ContractService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            default:
                showlist(req, resp);
        }
    }
    private void showlist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Contract> contractList = contractService.findAllContract();
        req.setAttribute("contractList", contractList);
        req.getRequestDispatcher("/View/Contract/list.jsp").forward(req, resp);
    }
}

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
            case "search":
                showid(req, resp);
                break;
            default:
                showlist(req, resp);
                break;
        }
    }

    private void showlist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Contract> contractList = contractService.findAllContract();
        req.setAttribute("contractList", contractList);
        req.getRequestDispatcher("/View/Contract/list.jsp").forward(req, resp);
        System.out.println("Số lượng hợp đồng: " + contractList.size());
    }

    private void showid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idParam = req.getParameter("contractID");
        if (idParam != null && !idParam.isEmpty()) {
            try {
                int contractID = Integer.parseInt(idParam);
                List<Contract> searchContract = contractService.searchContract(contractID);
                req.setAttribute("contractList", searchContract);
            } catch (NumberFormatException e) {
                req.setAttribute("error", "Contract ID không hợp lệ");
            }
        } else {
            req.setAttribute("error", "Chưa cung cấp Contract ID");
        }
        req.getRequestDispatcher("/View/Contract/list.jsp").forward(req, resp);
    }
}
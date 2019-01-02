/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.model.NewEntity;
import java.io.IOException;
import java.io.PrintWriter;
import javax.print.attribute.standard.MediaSize;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sabeur
 */

@WebServlet(urlPatterns = "/loginy")
public class TestServlet extends HttpServlet{
    NewSessionBean sessionBean=new NewSessionBean();
     
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String region=req.getParameter("region");
        NewEntity entity=sessionBean.find(2);
        entity.setLocalistation(region);
        sessionBean.insert(region);
        PrintWriter w = resp.getWriter();
        w.print(entity.toString());

    }
    
}

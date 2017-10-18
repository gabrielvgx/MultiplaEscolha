/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.controller;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jaops
 */
public class Login {
    public static String execute (HttpServletRequest request){
        String jsp = "";
        System.out.println("0");
        try {
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            System.out.println("1");
            
            if(email.isEmpty()&&senha.isEmpty()){
               jsp = "/erro.jsp";
            } else {
                jsp = "/index.jsp";
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return jsp;
    }
}

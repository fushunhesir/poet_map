package servlet;

import com.google.gson.Gson;
import pojo.Poem;
import service.PoemService;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;


@WebServlet("/FindPoemServlet")
@MultipartConfig
public class FindPoemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doPost(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setHeader("Access-Control-Allow-Origin","*");
        response.setCharacterEncoding("utf-8");

        //获取参数
        String poet = request.getParameter("poet");
        String year = request.getParameter("year");
        String type = request.getParameter("type");

        List<Poem> list=findPoem(poet,year,type);

        String str = new Gson().toJson(list);

        System.out.println(poet);
        System.out.println(str);
        response.getWriter().println(str);
    }


    private List<Poem> findPoem(String poet,String year,String type){
        PoemService poemService = new PoemService();
        List<Poem> list =poemService.selectPoem(poet,year,type);
        return list;
    }


}


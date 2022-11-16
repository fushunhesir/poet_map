package servlet;

import com.google.gson.Gson;
import pojo.Poem;
import service.PoemService;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


@WebServlet("/FindPoetServlet")
@MultipartConfig
public class FindPoetServlet extends HttpServlet {
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

        List<Poem> list=findPoet(poet);

        List<String> stringList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            stringList.add(list.get(i).getPoet());
        }

        List<String> stringList1=unique(stringList);

        String str = new Gson().toJson(stringList1);

        response.getWriter().println(str);
    }

    private List<String> unique(List<String> stringList) {
        HashSet<String> set = new HashSet<>(stringList);
        List<String> stringList1=new ArrayList<>(set);
        return stringList1;
    }


    private List<Poem> findPoet(String poet){
        PoemService poemService = new PoemService();
        List<Poem> list =poemService.selectPoet(poet);
        return list;
    }


}


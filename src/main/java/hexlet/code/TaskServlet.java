package hexlet.code;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("GET request!!");
        List<TaskEntity> tasks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            TaskEntity task = new TaskEntity();
            task.name = "Task name- " + i;
            task.description = "Task Description- " + i;
            task.status = "Pending";
            tasks.add(task);
        }
        request.setAttribute("tasks", tasks);
        request.getRequestDispatcher("/tasks.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      String taskName =  request.getParameter("name");
      String taskDescription = request.getParameter("description");
      String taskStatus = request.getParameter("status");

      System.out.println("Task name: " + taskName);
      System.out.println("Task description: " + taskDescription);
      System.out.println("Task status: " + taskStatus);
       response.sendRedirect("/tasks");


    }
}

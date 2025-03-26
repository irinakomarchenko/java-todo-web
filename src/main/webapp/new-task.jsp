<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
    <head>
        <title>Hello!</title>
    </head>
    <body>
        <h1>CREATE TASK</h1>
        <form action="/tasks" method="post">
            <label>
                Task name:
                <input type="text" name="name" required>
            </label>
            <br>
            <label>
                Task description:
                <input type="textarea" textarea name="description" required>
            </label>
            <br>
            <label>
                Task status: <select name="status" >
                <option value="Pending">Pending</option>
                <option value="In Progress">In Progress</option>
                <option value="Complete">Complete</option>
                </select>
                </label>
            <br>
            <button type="submit">Create</button>
        </form>
    </body>
    </html>
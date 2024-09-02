package contrroler;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet(name = "Uploading", urlPatterns = {"/Uploading"})
public class Uploading extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//       String email = req.getParameter("email");
//
//        String applicationPath = req.getServletContext().getRealPath("");
//        File directory = new File(applicationPath + "file");
//
//        // Create the directory if it doesn't exist
//        if (!directory.exists()) {
//            directory.mkdirs();
//        }
//
//        File newFile = new File(directory, "hello.png");
//
//        Part filePart = req.getPart("file");
//        InputStream inputStream = filePart.getInputStream();
//
//        Files.copy(inputStream, newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
       
        String email = req.getParameter("email");
        Part filePart = req.getPart("file");

        InputStream inputStream = filePart.getInputStream();

        String applicationPath = req.getServletContext().getRealPath("//files");

        Files.copy(inputStream, Paths.get(applicationPath, "hello.png"), StandardCopyOption.REPLACE_EXISTING);

    }
}

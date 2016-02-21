package com.daggerok.ctrl;

import com.daggerok.domain.File;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
@RequestMapping("/file")
public class FileCtrl {
    public static final String REDIRECT = "redirect:/file";

    @RequestMapping
    public String index() {
        return "file";
    }

    @RequestMapping(value = "/upload")
    public String upload() {
        return REDIRECT;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String upload(@ModelAttribute Model model, @RequestBody File file, HttpServletRequest request)
            throws IOException {

        Files.newInputStream(Paths.get(file.getFilename()));
        model.addAttribute("done", "Success");
        return REDIRECT; // TODO
    }

    @RequestMapping(value = "/download")
    public String download() {
        return REDIRECT;
    }

    @RequestMapping(value = "/download", method = RequestMethod.POST)
    public @ResponseBody String download(@ModelAttribute Model model, @RequestBody File file, HttpServletRequest request)
            throws IOException {

        Files.newInputStream(Paths.get(file.getFilename()));
        model.addAttribute("done", "Success");
        return REDIRECT; // TODO
    }
}
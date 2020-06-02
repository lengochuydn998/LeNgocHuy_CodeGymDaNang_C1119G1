package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    SubjectService subjectService;

    @GetMapping("/")
    public String list(Model model, @PageableDefault(size =3) Pageable pageable, @RequestParam Optional<String> keyword){
        String key = null;
        if (keyword.isPresent()){
            key = keyword.get();
            model.addAttribute("blogs", blogService.findAllByNameOrderBy(key, pageable));
            model.addAttribute("listsubject",subjectService.findAll());
        }else {
            Page<Blog> blogList = blogService.findAll(pageable);
            model.addAttribute("blogs",blogList);
            model.addAttribute("listsubject",subjectService.findAll());
        }
        model.addAttribute("keyword",key);
        return "index";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("blog",new Blog());
        model.addAttribute("listsubject",subjectService.findAll());
        return "create";
    }
    @PostMapping("/save")
    public String create(@ModelAttribute("blog") Blog blog, RedirectAttributes redirect){
        blogService.save(blog);
        redirect.addFlashAttribute("message","Create new blog successfully");
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id,Model model){
        Blog blog =blogService.findById(id);
        model.addAttribute("blog",blog);
        model.addAttribute("listsubject",subjectService.findAll());
        return "edit";
    }
    @PostMapping("edit")
    public String update(@ModelAttribute(name="blog") Blog blog,RedirectAttributes redirect){
        blogService.save(blog);
        redirect.addFlashAttribute("message","Edit Blog Successfully");
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteForm(@PathVariable Integer id,Model model){
        Blog blog =blogService.findById(id);
        model.addAttribute("blog",blog);
        model.addAttribute("listsubject",subjectService.findAll());
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(@ModelAttribute("blog") Blog blog,RedirectAttributes redirect){
        blogService.remove(blog.getId());
        redirect.addFlashAttribute("message","Delete Blog Successfully");
        return "redirect:/";
    }
    @GetMapping("/listSubject/{id}")
    public String subject(@PathVariable Integer id,Model model,Pageable pageable){
        Page<Blog> blogs = blogService.findBySubject_Id(id,pageable);
        model.addAttribute("blogs",blogs);
        model.addAttribute("listsubject",subjectService.findAll());
        return "index";
    }

}

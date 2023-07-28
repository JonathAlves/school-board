package com.guerradev.schoolboard.controllers;

import com.guerradev.schoolboard.model.Curso;
import com.guerradev.schoolboard.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CursoController {
    @Autowired
    private CursoRepository cursoRepository;
    //pega a view de cadastro de curso
    @GetMapping("/cursos")
    public ModelAndView cursos(Curso curso){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("curso/formCurso");
        mv.addObject("curso", new Curso());
        return mv;
    }
    //Cadastra curso
    @PostMapping("cadastrarCurso")
    public ModelAndView cadastraCurso(Curso curso){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/listarCursos");
        cursoRepository.save(curso);
        return mv;
    }

    //Recupera cursos cadastrados
    @GetMapping("listarCursos")
    public ModelAndView listarCursos(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("curso/listCursos");
        mv.addObject("cursosList", cursoRepository.findAll());
        return mv;
    }
}

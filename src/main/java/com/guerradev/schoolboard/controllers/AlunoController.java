package com.guerradev.schoolboard.controllers;

import com.guerradev.schoolboard.model.Aluno;
import com.guerradev.schoolboard.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    //Pega a view de cadastro de aluno
    @GetMapping("/alunos")
    public ModelAndView alunos(Aluno aluno){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aluno/formAluno");
        mv.addObject("aluno", new Aluno());
        return mv;
    }

    //Efetua o cadastro do aluno
    @PostMapping("cadastrarAluno")
    public ModelAndView cadastraAluno(Aluno aluno){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/listarAlunos");
        alunoRepository.save(aluno);
        return mv;
    }

    //Recupera alunos cadastrados
    @GetMapping("listarAlunos")
    public ModelAndView listarAlunos(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aluno/listAlunos");
        mv.addObject("alunosList", alunoRepository.findAll());
        return mv;
    }
}

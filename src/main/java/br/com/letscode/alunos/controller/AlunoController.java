package br.com.letscode.alunos.controller;

import br.com.letscode.alunos.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlunoController {
    @RequestMapping("/alunos")
    public String handler(Model model) {
        Aluno aluno = new Aluno();
        aluno.setIdade(25);
        aluno.setNome("Hugo Brendow");
        aluno.setTurma("CI&T");
        model.addAttribute("aluno", aluno);
        return "alunos";
    }
}

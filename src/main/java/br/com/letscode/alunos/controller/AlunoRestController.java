package br.com.letscode.alunos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("listagem")
public class AlunoRestController {
    @GetMapping("alunos")
    public br.com.letscode.alunos.model.Aluno getAluno() {
        br.com.letscode.alunos.model.Aluno aluno = new br.com.letscode.alunos.model.Aluno();
        aluno.setNome("Hugo Brendow");
        aluno.setIdade(25);
        aluno.setTurma("CI&T");
        return aluno;
    }
}


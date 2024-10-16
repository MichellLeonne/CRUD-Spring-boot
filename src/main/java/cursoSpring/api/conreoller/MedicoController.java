package cursoSpring.api.conreoller;

import cursoSpring.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/medicos")

public class MedicoController {
    @PostMapping
    public void Cadastrar(@RequestBody DadosCadastroMedico dados) {
        System.out.println(dados);

    }
}

package cursoSpring.api.conreoller;

import cursoSpring.api.endereco.Endereco;
import cursoSpring.api.medico.DadosCadastroMedico;
import cursoSpring.api.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.reactive.TransactionalOperator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/medicos")

public class MedicoController {

    @Autowired
    private MedicoRepository repository;
    @Autowired
    private TransactionalOperator transactionalOperator;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));

    }
}

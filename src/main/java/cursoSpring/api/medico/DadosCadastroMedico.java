package cursoSpring.api.medico;

import cursoSpring.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco ) {

}

package israel.av2apiserve.q6_q2.facade;

import org.springframework.stereotype.Component;

import israel.av2apiserve.q6_q2.dto.StudantDto;


@Component
public class DefultStudantFacade implements StudantFacade{

    @Override
    public StudantDto getDadosPessoais() {
        return new StudantDto();
    }

}

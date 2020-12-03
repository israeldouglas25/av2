package israel.av2apiserve.q6_q2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import israel.av2apiserve.q6_q2.dto.StudantDto;
import israel.av2apiserve.q6_q2.facade.StudantFacade;




@RestController
@RequestMapping("/q6/users")
public class StudantController {

    @Autowired
    private StudantFacade studantFacade;
    
    @GetMapping("/dadosPessoais")
    public ResponseEntity<StudantDto> getDadosPessoais(){

        return new ResponseEntity<StudantDto>(studantFacade.getDadosPessoais(),HttpStatus.OK);
    }
    
}

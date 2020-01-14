
package br.edu.ifal.gestao_festa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvidadosControle {
@Autowired
private Convidados convidados;

    @RequestMapping("/convidados")  
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados", convidados.findAll());
        return modelAndView;
        }

        @RequestMapping("/adicionar")  
        public ModelAndView adicionar(Convidado convidado){
        convidados.save(convidado);
        return new ModelAndView("redirect:/convidados");
     
        }

        }

      
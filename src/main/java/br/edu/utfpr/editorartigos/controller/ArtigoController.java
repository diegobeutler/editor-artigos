package br.edu.utfpr.editorartigos.controller;

import br.edu.utfpr.editorartigos.model.Artigo;
import br.edu.utfpr.editorartigos.model.Categoria;
import br.edu.utfpr.editorartigos.service.ArtigoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artigo")
@RequiredArgsConstructor
public class ArtigoController {
    private final ArtigoService artigoService;

    @PostMapping("incluir")
    private Artigo incluir(@RequestBody Artigo artigo) throws Exception {
        return artigoService.cadastrarArtigo(artigo);
    }

    @PostMapping("alterar")
    private Artigo alterar(@RequestBody Artigo artigo) throws Exception {
        return artigoService.cadastrarArtigo(artigo);
    }

    @DeleteMapping("excluir")
    private void excluir(@RequestBody Long id) throws Exception {
        artigoService.deletarArtigo(id);
    }


    @GetMapping("pesquisar-todos")
    private void pesquisarTodos() {
        artigoService.listarTodos();
    }

    @GetMapping("{id}")
    private Artigo findOne(@PathVariable("id") Long id) {
        return artigoService.findOne(id);
    }

}

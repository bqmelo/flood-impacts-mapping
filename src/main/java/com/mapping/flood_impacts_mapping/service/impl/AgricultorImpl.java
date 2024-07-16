package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.Agricultor;
import com.mapping.flood_impacts_mapping.entity.Bairro;
import com.mapping.flood_impacts_mapping.entity.Status;
import com.mapping.flood_impacts_mapping.entity.Usuarios;
import com.mapping.flood_impacts_mapping.repository.AgricultorRepository;
import com.mapping.flood_impacts_mapping.repository.BairroRepository;
import com.mapping.flood_impacts_mapping.repository.StatusRepository;
import com.mapping.flood_impacts_mapping.repository.UsuariosRepository;
import com.mapping.flood_impacts_mapping.service.AgricultorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgricultorImpl implements AgricultorService {

    @Autowired
    AgricultorRepository agricultorRepository;

    @Autowired
    BairroRepository bairroRepository;

    @Autowired
    UsuariosRepository usuariosRepository;

    @Autowired
    StatusRepository statusRepository;

    @Override
    public List<Agricultor> getAllAgricultores(String razaoSocial) {
        if (razaoSocial != null) {
            return agricultorRepository.findAgricultoresByFilters(razaoSocial);
        } else {
            return (List<Agricultor>) agricultorRepository.findAll();
        }
    }

    @Override
    public Agricultor getAgricultorById(int id) {
        Optional<Agricultor> farmer = agricultorRepository.findById(id);
        return farmer.orElse(null);
    }

    public Agricultor createAgricultor(Agricultor agricultor) {
        Usuarios usuarios = usuariosRepository.findById(agricultor.getIdAgricultor())
                .orElseThrow(() -> new RuntimeException("ID do usuário não encontrado: " + agricultor.getIdAgricultor()));

        if (usuarios.getIdTipoUsuario().getIdTipoUsuario() != 1){
            throw new RuntimeException("Usuario nao tem o tipo Agricultor");
        }
        Agricultor existente = agricultorRepository.findById(agricultor.getIdAgricultor()).orElse(null);

        if (existente != null) {
            throw new RuntimeException("Agricultor ja cadastrado.");
        }

        Bairro bairro = bairroRepository.findById(agricultor.getBairro().getIdBairro())
                .orElseThrow(() -> new RuntimeException("Bairro não encontrado"));

        Usuarios analista = usuariosRepository.findById(agricultor.getIdAnalistaGovernamental().getIdUsuario())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        agricultor.setBairro(bairro);
        agricultor.setIdAnalistaGovernamental(analista);

        return agricultorRepository.save(agricultor);
    }

    @Override
    public Agricultor updateAgricultor(Agricultor agricultor) {
        Agricultor existingAgricultor = agricultorRepository.findById(agricultor.getIdAgricultor())
                .orElseThrow(() -> new RuntimeException("ID do agricultor não encontrado: " + agricultor.getIdAgricultor()));

        agricultor.setIdAgricultor(agricultor.getIdAgricultor());

        Bairro bairro = bairroRepository.findById(agricultor.getBairro().getIdBairro())
                .orElseThrow(() -> new RuntimeException("Bairro não encontrado"));

        Usuarios analista = usuariosRepository.findById(agricultor.getIdAnalistaGovernamental().getIdUsuario())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Status status = statusRepository.findById(agricultor.getIdStatusValidacao().getIdStatus())
                        .orElseThrow(() -> new RuntimeException("Status invalido"));

        existingAgricultor.setIdAgricultor(agricultor.getIdAgricultor());
        existingAgricultor.setBairro(bairro);
        existingAgricultor.setIdAnalistaGovernamental(analista);
        existingAgricultor.setCnpj(agricultor.getCnpj());
        existingAgricultor.setRazaoSocial(agricultor.getRazaoSocial());
        existingAgricultor.setAreaTotalPropriedade(agricultor.getAreaTotalPropriedade());
        existingAgricultor.setRua(agricultor.getRua());
        existingAgricultor.setNumero(agricultor.getNumero());
        existingAgricultor.setComplemento(agricultor.getComplemento());
        existingAgricultor.setCep(agricultor.getCep());
        existingAgricultor.setBairro(bairro);
        existingAgricultor.setIdAnalistaGovernamental(analista);
        existingAgricultor.setIdStatusValidacao(status);

        return agricultorRepository.save(agricultor);
    }

    @Override
    public void deleteAgricultor(int id) {
        agricultorRepository.deleteById(id);
    }
}

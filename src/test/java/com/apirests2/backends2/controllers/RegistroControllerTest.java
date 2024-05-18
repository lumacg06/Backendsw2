package com.apirests2.backends2.controllers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;
import java.util.Optional;
import com.apirests2.backends2.models.Registro;
import com.apirests2.backends2.repositories.RegistroRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@WebMvcTest(RegistroController.class)
public class RegistroControllerTest {
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;
    @MockBean
    private RegistroRepository registroRepository;
    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testObtenerTodosLosRegistros() throws Exception {
        when(registroRepository.findAll()).thenReturn(Collections.emptyList());
        mockMvc.perform(get("/api/registros"))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
        verify(registroRepository, times(1)).findAll();
    }

    @Test
    public void testObtenerUsuarioPoridRegistro() throws Exception {
        Registro registro = new Registro();
        registro.setIdregistro(1L);
        when(registroRepository.findById(1L)).thenReturn(Optional.of(registro));
        mockMvc.perform(get("/api/registros/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.idregistro").value(1));
        verify(registroRepository, times(1)).findById(1L);

    }

    @Test
    public void testCrearRegistro() throws Exception {
        Registro registro = new Registro();
        registro.setIdregistro(1L);
        when(registroRepository.save(any(Registro.class))).thenReturn(registro);
        mockMvc.perform(post("/api/registros")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"idregistro\":null, \"otroCampo\":\"valor\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.idregistro").value(1));
        verify(registroRepository, times(1)).save(any(Registro.class));

    }
    @Test
    public void testActualizarRegistro() throws Exception {
        Registro registro = new Registro();
        registro.setIdregistro(1L);
        when(registroRepository.save(any(Registro.class))).thenReturn(registro);
        mockMvc.perform(put("/api/registros/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"otroCampo\":\"valorActualizado\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.idregistro").value(1));
        verify(registroRepository, times(1)).save(any(Registro.class));

    }

    @Test
    public void testEliminarRegistro() throws Exception {
        doNothing().when(registroRepository).deleteById(1L);

        mockMvc.perform(delete("/api/registros/1"))
                .andExpect(status().isOk());

        verify(registroRepository, times(1)).deleteById(1L);
    }
}
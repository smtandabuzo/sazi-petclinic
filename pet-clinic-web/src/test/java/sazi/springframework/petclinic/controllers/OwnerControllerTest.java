package sazi.springframework.petclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import sazi.springframework.petclinic.model.Owner;
import sazi.springframework.petclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {
    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController ownerController;

    Set<Owner> ownerSet;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        ownerSet = new HashSet<>();
        ownerSet.add(Owner.builder().id(1L).build());
        ownerSet.add(Owner.builder().id(2L).build());
        mockMvc = MockMvcBuilders.standaloneSetup(ownerController).build();
    }

    @Test
    void listOwners() {
        //when(ownerService.findAll()).thenReturn(ownerSet);
        //mockMvc.perform(get("/"));
    }

    @Test
    void findOwners() {
    }

    @Test
    void displayOwner() throws Exception {
        //when(ownerService.findById(anyLong())).thenReturn(Owner.builder().id(1l).build());

       // mockMvc.perform(get("/owners/123"))
        //        .andExpect(status().isOk())
        //        .andExpect(view().name("owners/ownerDetails"))
         //       .andExpect(model().attribute("owner", hasProperty("id", is(1l))));
    }
}
package com.certamen.practica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.certamen.practica.model.Producto;

@Repository
public class productoRepository {
    
    private List<Producto>product=new ArrayList<>();
}

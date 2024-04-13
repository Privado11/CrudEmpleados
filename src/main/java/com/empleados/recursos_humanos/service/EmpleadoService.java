package com.empleados.recursos_humanos.service;

import com.empleados.recursos_humanos.modelo.Empleado;

import java.util.List;

public interface EmpleadoService {
    public List<Empleado> getAllEmpleados();
    public Empleado buscarPorId(Long idEmpleado);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}

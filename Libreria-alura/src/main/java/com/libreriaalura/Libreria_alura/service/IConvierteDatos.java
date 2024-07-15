package com.libreriaalura.Libreria_alura.service;

public interface IConvierteDatos {
    <T> T ObtenerDatos(String json, Class<T> clasa);

    <T> T obtenerDatos(String json, Class<T> clase);
}

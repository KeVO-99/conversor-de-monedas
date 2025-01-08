package com.aluracursos.service;

import com.google.gson.JsonObject;

public class ConversorDeMonedas {
        private JsonObject divisas;

        public ConversorDeMonedas(JsonObject divisas) {
            this.divisas = divisas;
        }

        public double convertir(String origen, String destino, double monto) {
            double divisaOrigen = divisas.get(origen).getAsDouble();
            double divisaDestino = divisas.get(destino).getAsDouble();
            return (monto / divisaOrigen) * divisaDestino;
        }
}

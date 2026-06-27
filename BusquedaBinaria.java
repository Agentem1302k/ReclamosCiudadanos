public Reclamo busquedaBinaria(int codigo) {
        int inicio = 0;
        int fin = listaReclamos.size() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (listaReclamos.get(medio).codigo == codigo) {
                return listaReclamos.get(medio);
            }
            if (listaReclamos.get(medio).codigo < codigo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return null;
    }

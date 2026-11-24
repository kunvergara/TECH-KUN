package com.techkun.principal;

import com.techkun.dao.productodao;
import com.techkun.modelo.producto;

public class pruebaconexion {

    public static void main(String[] args) {

        productodao dao = new productodao();
        if (dao.eliminar(4)) {
    System.out.println("Producto eliminado correctamente");
} else {
    System.out.println("No se pudo eliminar el producto");
}
producto actualizado = new producto(
    4,
    "Teclado inalámbrico",
    "Teclado USB actualizado",
    55000,
    15
);

if (dao.actualizar(actualizado)) {
    System.out.println("Producto actualizado correctamente");
} else {
    System.out.println("No se pudo actualizar el producto");
}
        producto nuevo = new producto(
            0,
            "Teclado",
            "Teclado USB",
            45000,
            10
        );

        if (dao.registrar(nuevo)) {
            System.out.println("Producto registrado correctamente");
        } else {
            System.out.println("No se pudo registrar el producto");
        }

        System.out.println("Lista de productos:");

        for (producto p : dao.consultar()) {
            System.out.println(
                p.getId() + " - " +
                p.getNombre() + " - " +
                p.getPrecio() + " - " +
                p.getCantidad()
            );
        }
    }
}
package com.estebi.coffeapp.adapters

class CaffeProvider {
    companion object{
        val caffeList = listOf<Caffe>(
            Caffe(
                "Capuccino",
                "El capuchino bebida nacida \nen Italia.",
                2,
                "https://www.nespresso.com/ncp/res/uploads/recipes/nespresso-recipes-CAPPUCCINO-BANANA-SESAME-SEEDS.jpg"
            ),
            Caffe(
                "Café solo",
                "Bebida a través de una \ncafetera expreso.",
                2,
                "https://www.gastronomiavasca.net/uploads/image/file/6114/caf__solo.jpg"
            ),
            Caffe(
                "Café Irlandes",
                "El Café irlandés consiste \nen la mezcla de whisky irlandés.",
                2,
                "https://www.recetasderechupete.com/wp-content/uploads/2021/03/Irish-coffee-2.jpg"
            ),
            Caffe(
                "Café con hielo",
                "Servir el café mezclado \ncon un alimento congelado.",
                2,
                "https://images.hola.com/imagenes/cocina/recetas/20190812147394/receta-cafe-aromatico-hielo/0-709-480/cafe-aromatico-canela-m.jpg"
            ),
        )
    }
}
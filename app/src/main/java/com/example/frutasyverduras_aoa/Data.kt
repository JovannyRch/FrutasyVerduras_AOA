package com.example.frutasyverduras_aoa


data class Fruit(val name: String, val description: String, val benefits: String)

val fruits = listOf(
    Fruit(
        name = "Fresa",
        description = "La fresa es una fruta dulce y jugosa que se consume fresca o en preparaciones como mermeladas, postres y bebidas. Es rica en antioxidantes y vitamina C.",
        benefits = "Mejora la salud cardiovascular, ayuda a controlar los niveles de azúcar en sangre y refuerza el sistema inmunológico."
    ),
    Fruit(
        name = "Cereza",
        description = "La cereza es una fruta pequeña y redonda, conocida por su sabor dulce y su color rojo brillante. Se consume fresca, en postres o como jugo.",
        benefits = "Reduce la inflamación, mejora el sueño y aporta antioxidantes beneficiosos para la salud."
    ),
    Fruit(
        name = "Guayaba",
        description = "La guayaba es una fruta tropical con pulpa dulce y aromática, rica en vitamina C y fibra. Se consume fresca, en jugos o mermeladas.",
        benefits = "Mejora la digestión, refuerza el sistema inmunológico y promueve la salud de la piel."
    ),
    Fruit(
        name = "Mango",
        description = "El mango es una fruta tropical jugosa y dulce, conocida por su pulpa amarilla y su sabor distintivo. Es una excelente fuente de vitamina A y C.",
        benefits = "Mejora la salud ocular, refuerza el sistema inmunológico y ayuda a la digestión."
    ),
    Fruit(
        name = "Piña",
        description = "La piña es una fruta tropical con una pulpa dulce y ácida, rica en vitamina C y bromelina, una enzima que ayuda a la digestión.",
        benefits = "Promueve la salud digestiva, reduce la inflamación y fortalece el sistema inmunológico."
    ),
    Fruit(
        name = "Manzana",
        description = "La manzana es una fruta crujiente y jugosa que se consume fresca, en jugos o en preparaciones como postres y ensaladas. Es rica en fibra y vitamina C.",
        benefits = "Ayuda a la digestión, promueve la salud cardiovascular y contribuye al control del peso."
    ),
    Fruit(
        name = "Banana",
        description = "La banana es una fruta tropical suave y dulce, conocida por su alto contenido de potasio y carbohidratos. Se consume fresca o en batidos.",
        benefits = "Proporciona energía, mejora la salud digestiva y ayuda a mantener la presión arterial saludable."
    ),
    Fruit(
        name = "Uva",
        description = "La uva es una fruta pequeña y jugosa que se consume fresca, en jugos o en la producción de vino. Es rica en antioxidantes y vitaminas.",
        benefits = "Promueve la salud cardiovascular, mejora la salud ocular y aporta antioxidantes."
    ),
    Fruit(
        name = "Naranja",
        description = "La naranja es una fruta cítrica conocida por su sabor dulce y ácido. Es una excelente fuente de vitamina C y se consume fresca o en jugos.",
        benefits = "Refuerza el sistema inmunológico, mejora la salud de la piel y ayuda a la absorción de hierro."
    ),
    Fruit(
        name = "Kiwi",
        description = "El kiwi es una fruta exótica con una pulpa verde brillante y un sabor agridulce. Es rico en vitamina C, vitamina K y fibra.",
        benefits = "Mejora la digestión, refuerza el sistema inmunológico y promueve la salud cardiovascular."
    )
)

data class Vegetable(val name: String, val description: String, val benefits: String)

val vegetables = listOf(
    Vegetable(
        name = "Brócoli",
        description = "El brócoli es una verdura verde y saludable, rica en fibra, vitaminas y minerales. Se consume cocido, al vapor o crudo en ensaladas.",
        benefits = "Rico en antioxidantes, ayuda a mejorar la salud digestiva y fortalece el sistema inmunológico."
    ),
    Vegetable(
        name = "Lechuga",
        description = "La lechuga es una verdura de hoja verde que se utiliza principalmente en ensaladas. Es baja en calorías y rica en vitaminas y minerales.",
        benefits = "Promueve la salud digestiva, ayuda en la hidratación y es rica en antioxidantes."
    ),
    Vegetable(
        name = "Espinaca",
        description = "La espinaca es una verdura de hoja verde rica en hierro, vitaminas y minerales. Se puede consumir fresca en ensaladas o cocida en diversas preparaciones.",
        benefits = "Fortalece los huesos, mejora la salud ocular y promueve la salud cardiovascular."
    ),
    Vegetable(
        name = "Zanahoria",
        description = "La zanahoria es una raíz vegetal conocida por su color naranja brillante y su sabor dulce. Es rica en betacaroteno, fibra y vitaminas.",
        benefits = "Mejora la visión, refuerza el sistema inmunológico y promueve la salud de la piel."
    ),
    Vegetable(
        name = "Pepino",
        description = "El pepino es una verdura fresca y crujiente, compuesta principalmente por agua. Es bajo en calorías y se consume principalmente en ensaladas.",
        benefits = "Hidrata el cuerpo, ayuda en la pérdida de peso y promueve la salud digestiva."
    ),
    Vegetable(
        name = "Tomate",
        description = "El tomate es una fruta/verdura jugosa y versátil, rica en licopeno, vitaminas y minerales. Se consume fresco, en salsas, jugos y muchas otras preparaciones.",
        benefits = "Reduce el riesgo de enfermedades cardíacas, mejora la salud ocular y aporta antioxidantes."
    ),
    Vegetable(
        name = "Pimiento",
        description = "El pimiento es una verdura colorida y crujiente, rica en vitamina C, antioxidantes y fibra. Se consume fresco o cocido en diversas preparaciones.",
        benefits = "Refuerza el sistema inmunológico, mejora la salud ocular y ayuda en la digestión."
    ),
    Vegetable(
        name = "Calabacín",
        description = "El calabacín es una verdura suave y versátil, rica en vitaminas y minerales. Se consume cocido, al vapor o en crudo en ensaladas.",
        benefits = "Mejora la salud digestiva, ayuda a la pérdida de peso y es rico en antioxidantes."
    ),
    Vegetable(
        name = "Coliflor",
        description = "La coliflor es una verdura crucífera blanca, rica en fibra, vitaminas y minerales. Se consume cocida, al vapor o cruda en ensaladas.",
        benefits = "Promueve la salud digestiva, fortalece el sistema inmunológico y ayuda en la desintoxicación del cuerpo."
    ),
    Vegetable(
        name = "Berenjena",
        description = "La berenjena es una verdura morada y versátil, rica en antioxidantes, vitaminas y minerales. Se consume cocida en diversas preparaciones.",
        benefits = "Mejora la salud cardiovascular, ayuda en la digestión y es rica en antioxidantes."
    )
)
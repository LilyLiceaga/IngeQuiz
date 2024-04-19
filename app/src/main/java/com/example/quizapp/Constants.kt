package com.example.quizapp

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "¿Con qué nombre se conoce la siguiente expresión?",
            R.drawable.identidaddeeuler,
            arrayListOf("Identidad de Euler", "Identidad piatagorica ", "Identidad geometrica", "Ecuacion de continuidad\n"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "¿Con qué nombre se conoce la siguiente expresión?",
            R.drawable.ecuaciondelosgasesideales,
            arrayListOf("Ecuacion de bernoulli", "Ecuacion de los gases",
            "Ecuacion de los gases ideales", "Ecuacion de equilibrio"),
            2
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "¿Con qué nombre se conoce la siguiente expresión?",
            R.drawable.eficiencia_termica,
            arrayListOf("Eficiencia total", "Eficiencia energetica",
            "Eficiencia electrica", "Eficencia termica"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "¿Con qué nombre se conoce la siguiente expresión?",
            R.drawable.numero_de_reynolds,
            arrayListOf("Ecuación de Darcy", "Número de Reynolds",
            "Ecuación de Hagen-Poiseuille", "Factor de friccion para flujo laminar"),
            1
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "¿Con qué nombre se conoce la siguiente expresión?",
            R.drawable.viscosidad_dinamica,
            arrayListOf("gravedad especifica", "viscosidad estatica",
            "viscosidad dinamica", "carga piezometrica"),
            2
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "¿Con qué nombre se conoce la siguiente expresión?",
            R.drawable.frecuencia_angular,
            arrayListOf("frecuencia angular", "respuesta de frecuecia",
            "respuesta de frecuencia total rectangular", "frecuencia triangular"),
            0
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "¿Qué enuncia la Ley de corrientes de Kirchhoff?",
            R.drawable.kirchhoff,
            arrayListOf("La suma de todas las corrientes en una malla es igual a cero", "La suma de todos lo voltajes en una malla es igual a cero",
            "La suma de todas las corrientes en un nodo es igual a cero", "La suma de todos los voltajes en un nodo es igual a cero"),
            2
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "¿Qué enuncia la Ley de voltajes de kirchhoff?",
            R.drawable.kirchhoff,
            arrayListOf("La suma de todas las corrientes en una malla es igual a cero", "La suma de todos lo voltajes en una malla es igual a cero",
                "La suma de todas las corrientes en un nodo es igual a cero", "La suma de todos los voltajes en un nodo es igual a cero"),
            1
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "¿Que enuncia la primera ley de Newton?",
            R.drawable.newton,
            arrayListOf("A toda accion corresponde una reaccion de igual o mayor magnitud pero en sentido opuesto", "Todo cuerpo permanecera en reposo a menos que una fuerza de reaccion impacte en su centro de graveadad especificamente",
            "Todo cuerpo permanecrea en equilibrio a menos que una fuerza altere ese estado de equilibrio", "La fuerza es directamente proporcional con la masa y la aceleracion"),

            1
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "¿Con qué nombre se conoce la siguiente expresión?",
            R.drawable.laplace,
            arrayListOf("Transformada de Laplace", "Transformada de Fourier",
            "Ecuacion de Transferencia", "Ecuacion de Dirac"),
            0
        )
        questionsList.add(questionTen)

        return questionsList
    }
}
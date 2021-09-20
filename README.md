[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=5602087&assignment_repo_type=AssignmentRepo)
# EjerciciosFicheros1.1

##Ejercicio 6

|Método invocado|Valor devuelto en GNU/Linux|Valor devuelto en Windows|Descripción del método|
| ------------- | ------------------------------ | ------------- | ------------------------------ |
| toString      | home/Users/AlumnoDAM/eclipse-workspace/Ejercicios1.1/prueba.txt | C:\Users\AlumnoDAM\eclipse-workspace\Ejercicios1.1\prueba.txt |Devuelve la representación de la ruta en un string        |
| getFileName   | prueba.txt        |   prueba.txt |Devuelve el nombre del fichero o el último elemento de la secuencia de elementos         |
| getName  | Users        |    Users |Devuelve el elemento de la ruta correspondiente a la posición dada, la posición 0 es la más cercana a la raíz       |
| getNameCount  | 5        |    5 |Devuelve el número de elementos de la ruta       |
| subpath(0,2)  | Users/AlumnoDam        |    Users\AlumnoDAM |Devuelve la secuencia de la ruta (sin incluir el elemento raíz) como está indicado por los índices        |
| getParent     | /Users/AlumnoDAM/eclipse-workspace/Ejercicios1.1       |    C:\Users\AlumnoDAM\eclipse-workspace\Ejercicios1.1 |Devuelve la ruta del directorio padre        |
| getRoot       | /       |    C:\ |Devuelve la raíz de la ruta       |

b)¿Qué ocurre si utilizamos la ruta relativa  home/pepe y Usuarios\pepe en vez de ruta absoluta? ¿Y subpath(0,1)? ¿Qué valores obtienes en GNU/Linux y Windows? Anota y entiende los resultados.

-Al utilizar la ruta relativa funciona de la misma manera que la ruta absoluta, solo que en el getRoot ya no aparece la raiz.

##Ejercicio 7

-Al utilizar el normalize elimina las redundancias dejando la ruta sin los puntos

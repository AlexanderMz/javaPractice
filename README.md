## Tablero caja de seguridad

## Getting Started

Para ingresar las letras del alfabeto en las posiciones correspondientes del tablero se deben utilizar una de las siguientes teclas que indican una dirección a desplazarse en el tablero
A = Izquierda, W = Arriba, S = Abajo, D = Derecha.  
Cada vez que se presiona una de estas teclas, se agrega la letra del alfabeto consecutiva en orden A, B, C, D…, 

Un pedazo de carta mohoso a un lado de la caja fuerte revela que la primera letra del alfabeto (A) se encuentra en la posición [0][0] del tablero 
 
 ![image](https://user-images.githubusercontent.com/12861422/117549850-4e98ec00-b002-11eb-8dc2-d75a552df519.png)

 
Ilustración 1Tablero al iniciar la ejecución del sistema
Al momento de ingresar la secuencia, considera que el sistema contabiliza todos los intentos por lo tanto si una letra se ingresa fuera de los límites del tablero, esta se descontará de la cola y notificará al usuario para luego proceder con la siguiente letra.
Para abrir la caja fuerte se debe seguir la siguiente combinación :
Derecha - Abajo
Izquierda x2 (Desecha letra E) - Abajo x2 
Derecha x2 - Abajo 
Derecha - Abajo 
Derecha x 3(Desecha letra O) -Arriba x5
Izquierda x3 Abajo x2 
Derecha
Al terminar esta secuencia del tablero deberá presentar exactamente la siguiente forma

![image](https://user-images.githubusercontent.com/12861422/117549841-4345c080-b002-11eb-9770-759aa301a349.png)

 
Ilustración 2 Tablero al terminar de ingresar la secuencia

Una vez obtenida esta forma, la contraseña para abrir la caja fuerte esta compuesta de la diagonal principal resultante más el numero de casillas que no tienen letra
Imprimir la diagonal principal resultante y el número de casillas vacías. Estos datos deben ser calculados mediante el sistema.
 ![image](https://user-images.githubusercontent.com/12861422/117549853-53f63680-b002-11eb-95bf-720ccf6adaa5.png)



## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).

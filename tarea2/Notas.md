# 1 Alumnos

* Un alumno estará matriculado en un ciclo.

> Respecto a esto, ya que no se pide ninguna clase que lleve el control de los ciclos que se crean, y ya que los alumnos  matriculados se guardan en el curso y los cursos se guardan en cada ciclo el mecanismo que limite que un alumno solo pueda estar en un ciclo deberá llevarse a cabo en el programa principal. Es decir, cuando se matriculen alumnos en un curso, deberá comprobarse que el mismo alumno no esté matriculado en otros cursos de otros ciclos.

---
# 2 Delegados
* Un alumno puede ser delegado de un único ciclo y curso.
* Sólo habrá un delegado por ciclo y curso.
>La implementación `Ciclo[Curso[alumnos,delegado]]` implica que se puede comprobar que el delegado se encuentre entre los alumnos del curso, y debido a la propiedad del punto 1, si el programa principal controla que un alumno sólo pueda estar en un ciclo, estará limitando también que dicho alumno sólo pueda ser delegado de ese curso.

---
# 3 Profesores
* Un profesor estará asignado a uno o más módulos.

> el límite inferior se aplica con un constructor que exige un modulo o lista de modulos.

---
# 4 Tutores
* Un tutor ha de ser profesor del ciclo y curso.
* Un tutor está asociado a un ciclo y curso.
> La implementación `Ciclo[Curso[tutor,modulo-profesor[profesor]]]` hace posible comprobar que un tutor sea profesor en alguno de los módulos de ese curso y por lo tanto también del ciclo. El método ciclos.Curso.setTutor(Profesor) realiza esta comprobación.

---
# 5 Ciclos
* Un ciclo tiene uno o más módulos.

> ya que sólo se define un límite inferior para el número de módulos esta característica se implementa creando un constructor que obliga a registrar o bien un módulo o una lista de módulos, pero no se permite crear un objeto Ciclo sin ningún módulo.


* Un ciclo tendrá dos os tres cursos.

> Se define un setter para la cantidad de cursos que sólo admite 2 o 3 e inicializa el array de cursos dándole un tamaño acorde a este parámetro.

---
# 6 Modulos
* Un módulo ha de estar asignado a un curso (1º, 2º o 3º).

> La asignación al curso se hace de forma natural ya que cada curso guarda una lista de los módulos que se imparten en él Si bien esta implementación no restringe que un módulo pueda estar en distintos cursos, permite que el mismo módulo pueda impartirse en distintos ciclos, por ejemplo el módulo "Lenguajes de marcas" puede impartirse tanto en ASIR como en DAM, sin necesidad de crear dos objetos idénticos de la clase Modulo. para llevar a cabo esta implementación será necesario un mecanismo que gestione los módulos en el programa principal.

---
# 7 Aulas
* Un aula tendrá asignado uno o más módulos.

> La asignación de aulas a modulos se lleva a cabo creando una variable de tipo Aula dentro de cada módulo. Esta implementación se explica más en detalle en el siguiente punto (relación aula-modulo).

---
# 8 Relación aula-módulo
* Para reflejar la relación entre aulas y módulos podremos utilizar la clase AulaModulo que almacenará pares "Aula" / "Modulo".
* Un módulo solo se impartirá en un aula.
> Al guardar el objeto Aula dentro de cada se cumple esta restricción.

* Un aula podrá utilizarse en varios módulos.

> En este caso hacemos una aproximación distinta al de los pares Aula-Modulo: Cada objeto de la clase Modulo guarda una objeto de la clase Aula que identifica el aula donde se imparte dicho modulo. El objeto Aula puede volver a utilizarse en otros objetos de la clase Modulo, el mecanismo que guarde las aulas que se van creando deberá ser implementado en el programa principal. O también podría crearse una clase destinada a instanciarse una sola vez cuyo propósito sea llevar un control de las aulas existentes.

# 9 Relación módulo-profesor
> Aunque en el punto anterior descarto la posibilidad de implementar los pares aula-módulo, un mecanismo similar se puede utilizar para gestionar los profesores y los módulos.

> En esta aproximación un módulo puede tener distintos profesores en distintos cursos. 

> Se permite que un profesor esté asignado a varios módulos.

> Un módulo en un curso se imparte por un sólo profesor.

> Un módulo puede impartirse en distintos ciclos y cursos con distintos profesores.

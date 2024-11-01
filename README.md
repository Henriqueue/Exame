# Exame
Um código simples para a realização de um exame de Diabtes, tome o seguinte como exemplo:

A diabetes é um grupo de doenças que resultam em muito açúcar no sangue.
A verificação da quantidade de açúcar no sangue (glicemia) e um dos principais
exame para diagnosticar a diabetes. O exame deve ser realizado com a pessoa em
jejum para que o resultado não seja influenciado e seja um falso positivo.
Os valores de referência do exame da glicose em jejum são:

Nível de glicose Diagnóstico
Até 99 mg/dL Normal
De 100 a 125 mg/dL Pré-diabetes
> 125 mg/dL Diabetes

Analise a classe descrita do diagrama a seguir.

Exame
idExame: int
nivelGlicose: int
obterDiagnostico(): String

Método obterDiagnostico(): deve retornar um texto com o diagnostico do
exame conforme a tabela de referência acima.

1. Implemente a classe Exame utilizando os conceitos já estudados de OO.
2. Implementa uma aplicação que realize as seguintes operações:
a. Criar e instanciar um objeto da classe Exame
b. Receber, via teclado, o identificador do exame e o nível de glicose,
armazenando-os nos respectivos atributos.
c. Mostrar os dados armazenado
d. Mostrar o diagnostico do exame.

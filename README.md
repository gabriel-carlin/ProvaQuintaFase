# ProvaQuintaFase

## Como iniciar a prova ?

- Clone esse repositorio
- Crie a branch com o seu nome (altere apenas sua branch)
- Faça as alterações necessarias e envie para sua branch
- Caso não consiga fazer isso na sua branch e enviar, comprima o projeto via zip e envia no ava
- Tutorial Git: https://www.youtube.com/watch?v=vvn2ZKnT_e8

### Qualquer duvida falar com o professor, boa sorte!!

## Ressolvam o problema a baixo: 
Uma grande rede de lojas deseja desenvolver um sistema de gestão de colaboradores, permitindo armazenar informações dos funcionários e calcular seus salários de acordo com o tipo de trabalho realizado. A loja possui diferentes tipos de trabalhadores, cada um com uma forma específica de cálculo do salário. Os funcionários do caixa recebem um salário fixo mensal. Os vendedores possuem um salário base e uma comissão por venda realizada, sendo o cálculo do salário final baseado na soma do salário base com o total das comissões, que é obtido multiplicando a quantidade de vendas pelo valor da comissão por venda. Os repositores são pagos por hora trabalhada, devendo informar a quantidade de horas trabalhadas no mês e o valor pago por hora para que o salário seja calculado corretamente. Os seguranças recebem um salário fixo, mas caso trabalhem no período noturno, recebem um adicional noturno fixo sobre o salário. Os faxineiros possuem um salário fixo, mas podem receber um bônus por turno extra trabalhado, sendo necessário que o sistema registre a quantidade de turnos extras realizados e o valor do bônus por turno para calcular o salário corretamente.

O sistema deve garantir que nenhum valor seja negativo, incluindo salário base, comissão, horas trabalhadas, turnos extras e adicionais. Caso o usuário tente inserir um valor inválido, o sistema deve exibir uma mensagem informando que o valor não é permitido e definir o valor como zero. As validações devem ser feitas sem utilizar exceções e try-catch, pois esse conceito ainda não foi ensinado, sendo necessário utilizar apenas mensagens no console e retornos simples para lidar com entradas inválidas.

O sistema deve oferecer um menu interativo que pode ser implementado tanto no terminal quanto utilizando JOptionPane, permitindo que o usuário escolha entre criar um funcionário do caixa, um vendedor, um repositor, um segurança ou um faxineiro. Após escolher o tipo de funcionário e inserir os dados necessários, o sistema deve exibir as informações do colaborador criado, incluindo seu salário final, calculado de acordo com as regras de cada tipo de trabalhador. O programa deve continuar executando até que o usuário escolha explicitamente a opção de encerrar o sistema. Caso contrário, o menu deve ser exibido novamente para permitir novas operações.

Além da implementação do sistema, os alunos devem desenvolver testes unitários para validar diferentes cenários. Os testes devem cobrir a criação de cada tipo de funcionário, garantindo que os cálculos dos salários sejam realizados corretamente com os valores fornecidos. Deve-se testar a criação de um funcionário do caixa com um salário fixo e verificar se o valor é armazenado corretamente. Para os vendedores, é necessário criar um cenário onde sejam definidos um salário base, uma comissão por venda e um número de vendas, garantindo que o cálculo do salário inclua a comissão corretamente. Para os repositores, deve-se criar um caso onde sejam inseridas as horas trabalhadas e o valor por hora, validando o cálculo do salário. No caso dos seguranças, deve-se testar tanto a criação de um segurança sem adicional noturno quanto com adicional noturno, conferindo se o salário final reflete essa diferença. Para os faxineiros, é necessário validar os cálculos tanto sem turnos extras quanto com turnos extras, garantindo que o bônus seja aplicado corretamente. Também é essencial testar a inserção de valores negativos para salário, comissão, horas trabalhadas e turnos extras, verificando se o sistema os define corretamente como zero e exibe a mensagem apropriada.

## Como será avaliado ? 
Critérios de Avaliação (Nota: 10 pontos)

✔️ (2 pts) Criar corretamente a estrutura para armazenar as informações dos funcionários.

✔️ (2 pts) Implementar corretamente os atributos e métodos conforme descrito no enunciado.

✔️ (2 pts) Implementar as validações sem exceções, apenas com System.out.println() e retornos padrão.

✔️ (1 pts) Garantir os cálculos dos salarios corretos.

✔️ (1 pts) Fazer os testes para garantir que tudo está funcionanco como deveria.

✔️ (2 pts) Criar o menu interativo, garantindo que o programa funcione conforme esperado.

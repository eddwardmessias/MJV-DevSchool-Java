<p align="center">
  <img alt="Icon" src="https://user-images.githubusercontent.com/83479454/146642203-a59e9b89-33af-4ebe-8ecf-a204dfe5ad23.png" width="230"/></p>
<h1>
  
<h2 align="center">
  Curso de Java realizado pela MJV - Technology &amp; Innovation. Lecionado pelo professor Gleyson Sampaio - Instrutor e Criador de Conteúdos na Digytal.
  </h2> 
  
<h1 align="center">
  Sumário:
  </h1>   
  
### Semana 1 - 13/12/21 a 17/12/21
  - [Aula 01 - Git](#aula01)
  - [Aula 02 - GitHub e GitFlow](#aula02)
  - [Aula 03 - Fundamentos da Linguagem Java](#aula03)
  - [Aula 04 - Fundamentos da Programação Orientada a Objetos](#aula04)
### Semana 2 - 20/12/21 a 21/12/21
  - [Aula 05 - Programação Orientada a Objetos & Padrão JavaBeans](#aula05)
  - [Aula 06 - Fundamentos das Collections](#aula06)
### Semana 3 - 27/12/21 a 28/12/21
  - [Aula 07 - Apresentação de Grupos](#aula07)
  - [Aula 08 - Classes Java](#aula08)
### Semana 4 - 03/01/22 a 07/01/22  
  - [Aula 09 - Apresentação e Estruturas Cond. e Fluxo](#aula09)
  - [Aula 10 - Apresentação e Estruturas Cond. e Fluxo](#aula10)
  - [Aula 11 - Apresentação e Estruturas Cond. e Fluxo](#aula11)
  
*******
  
<div id='aula01'/>
<h1 align="center">
  Semana 1 | Aula 01 - 13/12/2021
</h1> 
  
### 1. Conteúdos apresentados:
  
Apresentação. Reflexões acerta da Razão de ser Programador. A compreensão da teoria por meio de fundamentos/conceitos. A importância e potencialidade do git como ferramenta diária e imprescritível para o desenvolvedor principalmente no âmbito corporativo. O aprendizado de suas funcionalidades, seus comandos iniciais, suas configurações, bem como instruções a serem realizadas a partir da criação do diretório como aprendizagem e exercício prático. Gitignore.


### 2. Comandos executados:

``` 
git init
```
Cria o repositório (local) - auditar/backup.
``` 
git status
```
Faz a verificação de arquivos do diretório.
``` 
git add .
```
Realiza a inclusão de arquivos novos e modificados, assim como removidos no diretório.
``` 
git commit -m " *finalidade do commit* "
```
Realiza o commit conjuntamente com uma mensagem.
``` 
git log
```
Mostra o histórico de commits.
```
git push
```
Envia, compartilha arquivos do diretório(local) ao repositório.
```
touch .gitignore
```
Comando que ignora arquivos e pastas para ser ignorado pelo git.

### 3. Exercícios:

#### 3.1 Introdução
- Exercício 1 - Disponível em repositório próprio - https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-01

#### 3.2 Git
- Exercício 1 - Criação de diretório e inserção de 2 arquivos .txt (Nome | Contato). </br>
  Disponível em repositório próprio - https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-01  


### 4. Material de apoio:
- Gitbook Professor Gleyson: https://glysns.gitbook.io/git-e-github/
- Revisão escrita em repositório próprio - https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-01 

*******
  
<div id='aula02'/>
<h1 align="center">
  Semana 1 | Aula 02 - 14/12/2021 
</h1> 
  
### 1. Conteúdos apresentados:

Continuação aula 01. Configuração de usuário git. Demonstração e criação de repositório no GitHub. Noções de convenções e boas práticas atreladas ao git/github. Explicação e aplicações de autenticação GitHub, clone de repositório, branch, merge, pull request e readme.md.

### 2. Comandos executados:

#### 2.1 Configurar identificação Git 
```
git config --global user.name "Eddward Messias"
git config --global user.email eddward.messias@hotmail.com
```
Comando configurar minha identidade perante ao git, associados diretamente a identificação de commits.

### 2.1.1 Configuração e envio de arquivos ao repositório do GitHub.
```
git remote add origin url
```
Para selecionar o repositório remoto(github) que desejo hospedar os arquivos do diretório.
```
git branch -m main
```
Para selecionar o repositório remoto(github) que desejo hospedar os arquivos do diretório.
###### Obs ---> Uma curiosidade ao saber o porque do comando "Main" em vez do tão falado "Master", do qual foi trocado pelo GitHub em 1 de outubro de 2020 em consonância com o movimento  “Black Lives Matter”, tendo em vista a troca termos considerados não inclusivos e racistas, a exemplo da  Master(o “mestre”) que segundo o movimento dar explicita o controle outros processos ou aparelhos (os “escravos”)... então foi trocado o "Mestre" por "Principal".

```
git push -u origin
```
Envia arquivos do diretório local ao repositório remoto.

#### 2.1.2 Clonar um repositório: 
```
git clone url.git
```
Clona repositório remoto para diretório local.

#### 2.2 Criar e mudar branch: 
```
git branch NomeDesejado
```
Cria uma nova branch(nova ramificação).
```
git checkout NomeBranch ou git checkout -b NomeBranch
```
Troca para branch selecionada e no segundo caso troca e cria ao mesmo tempo uma nova branch.

#### 2.3 Unificação/Mesclagem de alterações realizadas em branchs - MERGE: 
```
git  merge  NomeDaBranch
```
Na branch principal "main", utiliza esse comando para unificar/mesclar alterações realizadas no repositório.

### 3. Exercícios:

#### 3.1 GitHub
- Exercício 1 e 2 - Disponível no repositório Grupo 01 - https://github.com/DomBarbosa8/MJV-JAVA

#### 3.2 GitFlow
- Exercício 1 - Disponível no repositório Grupo 01 - https://github.com/DomBarbosa8/MJV-JAVA/pulls?q=is%3Apr+is%3Aclosed
- Exercício 2 - Disponível em repositório próprio - https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-02

### 4. Material de apoio:
- Gitbook Professor Gleyson: https://glysns.gitbook.io/git-e-github/git-hub
- Revisão escrita em repositório próprio: https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-02
- Referências Bibliográficas da Obs: https://blog.curso-r.com/posts/2020-07-27-github-main-branch/ ; https://programadoresbrasil.com.br/2020/09/github-substituira-branch-master-por-branch-main-a-partir-de-outubro/?amp

*******

<div id='aula03'/>
<h1 align="center">
  Semana 1 | Aula 03 - 16/12/2021
</h1> 
  
### 1. Conteúdos apresentados:

História e Fundamentos da Linguagem Java. Principais Características. Plataformas Java. Diferença JDK e JRE. Algoritmos. Instalação e Configuração Eclipse EE IDE. Introdução a Classes.

### 2. Comandos executados:


### 3. Exercícios:
- Exercício 1 - Pesquisa e resumo sobre plataformas e evolução do Java.</br>
  Disponível em repositório próprio - https://github.com/eddwardmessias/MJV-DevSchool-Java/blob/main/Semana-1/Aula-03/Exercio01-Fundamentos-Java.pdf
- Exercício 2 -Lógica de programação em Pseudo Código(Portugol).</br>
  Disponível em repositório próprio - https://github.com/eddwardmessias/MJV-DevSchool-Java/blob/main/Semana-1/Aula-03/Execicio2-Portugol.txt

### 4. Material de apoio:
- Gitbook Professor Gleyson: https://glysns.gitbook.io/java/
- Revisão escrita em repositório próprio: https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-03 

*******

<div id='aula04'/>
<h1 align="center">
  Semana 1 | Aula 04 - 17/12/2021
</h1> 
  
### 1. Conteúdos apresentados:

Configuração Workspace. Convenção e boas práticas aplicadas a criação de Classes (CamelCase). Finalidade Classe. Contratos dos Métodos. Palavras Reservadas. Tipos Primitivos. Constantes. Distinção de Classes de Domínio/Modelo, Negócios, Repositório. Fundamentos da Programação Orientada a Objetos.

### 2. Comandos executados:


### 3. Exercícios:
- Exercício 1 - Declaração de variáveis e seus tipos.</br>
  Disponível em repositório próprio - https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-04/ExercicioJava-Aula4/aula-java-4-exercicio1 ;
  https://github.com/eddwardmessias/MJV-DevSchool-Java/blob/main/Semana-1/Aula-04/Exercicio01-Aula4.pdf


### 4. Material de apoio:
- Gitbook Professor Gleyson: https://glysns.gitbook.io/java/fundamentos/orientacao-a-objetos
- Revisão escrita em repositório próprio: https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-04 

*******

<div id='aula05'/>
<h1 align="center">
  Semana 2 | Aula 05 - 20/12/2021
</h1> 
  
### 1. Conteúdos apresentados:

Programação Orientada a Objetos: Abstração, modificadores de acesso, métodos getters e setters, construtores. Padrão JavaBeans. Debug. 

### 2. Comandos executados:


### 3. Exercícios:
- Exercício - Atividade realizada em grupo adicionando funcionalidades ao BankApplication.</br>
  Disponível em repositório do Gustavo (BankApp) - https://github.com/Gustavo-lima-rocha-de-sousa/cursojava-mjv/tree/master/Bank/src/bankapp


### 4. Material de apoio:
- Gitbook Professor Gleyson: https://glysns.gitbook.io/java/fundamentos/java-beans
- Revisão escrita em repositório próprio: https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-05 

*******
 
<div id='aula06'/>
<h1 align="center">
  Semana 2 | Aula 06 - 21/12/2021
</h1> 
  
### 1. Conteúdos apresentados:

Gerenciamento JavaBeans. Fundamentos Estruturais do Array. Conceitos Collections: List, Set, Queue(Fila), Map. Algoritmos Collections. Dinâmica Inicial Power Classes.

### 2. Comandos executados:


### 3. Exercícios:
- Exercício - Breve pesquisa e apresentação sobre as classes: java.lang.String, java.util.StringJoiner, java.lang.StringBuilder.</br>
  Disponível no repositório do Gustavo(Readme.md) - https://github.com/Gustavo-lima-rocha-de-sousa/PowerClass


### 4. Material de apoio:
- Slide apresentado em aula pelo Professor Gleyson.
- Revisão escrita em repositório próprio: https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-06 

*******
 
<div id='aula07'/>
<h1 align="center">
  Semana 3 | Aula 07 - 27/12/2021
</h1> 
  
### 1. Conteúdos apresentados:

Apresentações dos grupos: 01 | 02 | 03 | 04 | 05 | - Exercício Power Classe: Apresentação das principais classes da linguagem Java.

### 2. Comandos executados:


### 3. Exercícios:
- Exercício - Pesquisa, apresentação e aplicação das calsses: java.lang.String, java.util.StringJoiner, java.lang.StringBuilder.</br>
  Disponível no repositório do Gustavo(Readme.md) - https://github.com/Gustavo-lima-rocha-de-sousa/PowerClass


### 4. Material de apoio:
- Referências bibliográficas dispostas no Readme do projeto.</br>
  Disponível no repositório do Gustavo(Readme.md) - https://github.com/Gustavo-lima-rocha-de-sousa/PowerClass

*******
 
<div id='aula08'/>
<h1 align="center">
  Semana 3 | Aula 08 - 28/12/2021
</h1> 
  
### 1. Conteúdos apresentados:

Programação Orientada a Objetos: Abstração, modificadores de acesso, métodos getters e setters, construtores. Padrão JavaBeans. Debug. 

### 2. Comandos executados:


### 3. Exercícios:
- Exercício - Atividade realizada em grupo adicionando funcionalidades ao BankApplication.</br>
  Disponível em repositório do Gustavo (BankApp) - https://github.com/Gustavo-lima-rocha-de-sousa/cursojava-mjv/tree/master/Bank/src/bankapp


### 4. Material de apoio:
- Gitbook Professor Gleyson: https://glysns.gitbook.io/java/fundamentos/java-beans
- Revisão escrita em repositório próprio: https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-05 

*******

<div id='aula09'/>
<h1 align="center">
  Semana 4 | Aula 09 - 03/01/2022
</h1> 
  
### 1. Conteúdos apresentados:

Apresentação. Classe Formatter. Estrutras Condicionais. Estrutras de Repetição. 

### 2. Comandos executados:


### 3. Exercícios:
- Exercício - Atividade realizada em grupo adicionando funcionalidades ao BankApplication.</br>
  Disponível em repositório do Gustavo (BankApp) - https://github.com/Gustavo-lima-rocha-de-sousa/cursojava-mjv/tree/master/Bank/src/bankapp


### 4. Material de apoio:
- Gitbook Professor Gleyson: https://glysns.gitbook.io/java/fundamentos/java-beans
- Revisão escrita em repositório próprio: https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-05 

*******

<div id='aula10'/>
<h1 align="center">
  Semana 4 | Aula 10 - 06/01/2022
</h1> 
  
### 1. Conteúdos apresentados:

Apresentação. Classe Formatter. Estrutras Condicionais. Estrutras de Repetição. 

### 2. Comandos executados:


### 3. Exercícios:
- Exercício - Atividade realizada em grupo adicionando funcionalidades ao BankApplication.</br>
  Disponível em repositório do Gustavo (BankApp) - https://github.com/Gustavo-lima-rocha-de-sousa/cursojava-mjv/tree/master/Bank/src/bankapp


### 4. Material de apoio:
- Gitbook Professor Gleyson: https://glysns.gitbook.io/java/fundamentos/java-beans
- Revisão escrita em repositório próprio: https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-05 

*******

<div id='aula10'/>
<h1 align="center">
  Semana 4 | Aula 11 - 07/01/2021
</h1> 
  
### 1. Conteúdos apresentados:

Apresentação. Classe Formatter. Estrutras Condicionais. Estrutras de Repetição. 

### 2. Comandos executados:


### 3. Exercícios:
- Exercício - Atividade realizada em grupo adicionando funcionalidades ao BankApplication.</br>
  Disponível em repositório do Gustavo (BankApp) - https://github.com/Gustavo-lima-rocha-de-sousa/cursojava-mjv/tree/master/Bank/src/bankapp


### 4. Material de apoio:
- Gitbook Professor Gleyson: https://glysns.gitbook.io/java/fundamentos/java-beans
- Revisão escrita em repositório próprio: https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-05 

*******

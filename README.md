<p align="center">
  <img alt="Icon" src="https://user-images.githubusercontent.com/83479454/146642203-a59e9b89-33af-4ebe-8ecf-a204dfe5ad23.png" width="230"/></p>
<h1>
  
<h2 align="center">
  Curso de Java realizado pela MJV - Technology &amp; Innovation. Lecionado pelo professor Gleyson Sampaio - Instrutor e Criador de Conteúdos na Digytal.
  </h2> 
  
<h1 align="center">
  Sumário:
  </h1>   
  
### Semana 01 - 13/12/21 a 17/12/21
  - [Aula 1 - Git](#aula01)
  - [Aula 2 - GitHub e GitFlow](#aula02)
  - [Aula 3 - Git e GitHub](#aula03)
  - [Aula 4 - Git e GitHub](#aula04)
### Semana 02 - 20/12/21 a 21/12/21
  - [Aula 5 - Git e GitHub](#aula05)
  - [Aula 6 - Git e GitHub](#aula06)
### Semana 03 - 27/12/21 a 29/12/21
  - [Aula 7 - Git e GitHub](#aula07)
  - [Aula 8 - Git e GitHub](#aula08)
  - [Aula 9 - Git e GitHub](#aula09)

*******
  
<div id='aula01'/>
<h1 align="center">
  Semana 1 | Aula 01 - 13/12/2021
</h1> 
  
### 1. Conteúdos apresentados:
  
Apresentação. Reflexões acerta da Razão de ser Programador. A compreensão da teoria por meio de fundamentos/conceitos. A importância e potencialidade do git como ferramenta diária e imprescritível para o desenvolvedor principalmente no âmbito corporativo. O aprendizado de suas funcionalidades, seus comandos iniciais, suas configurações, bem como instruções a serem realizadas a partir da criação do diretório como aprendizagem e exercício prático. Gignore.


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
Envia, compartilha arquvivos do diretório(local) ao repositório.
```
touch .gitignore
```
Comando que ignora arquvivos e pastas para ser ignorado pelo git.

### 3. Exercícios:

#### 3.1 Introdução
- Exercício 1 - Disponível em repositório próprio - https://github.com/eddwardmessias/MJV-DevSchool-Java/tree/main/Semana-1/Aula-01

#### 3.2 Git
- Exercício 1 - Criação de diretório e insersão de 2 arquivos .txt (Nome | Contato). </br>
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
  Semana 1 | Aula 03 - 15/12/2021
</h1> 
  
### 1. Conteúdos apresentados:

História do Java. Principais Caracteristicas. Plataformas do Java. Diferença JDK e JRE. Algoritimo. Instalação e Configuração Eclipse EE IDE. Introdução a Classes.

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
 

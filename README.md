# Trabalho da matéria de Desenvolvimento Web.

## Pré-requisitos:

* maven
* git
* jdk >= 1.7

## Instalação:

Execute o comando abaixo no diretório em que for salvar o projeto:

    git clone https://github.com/asleao/trabalho-des-web.git

### Dinânimca de trabalho / Comandos:

#### Dinâmica:
Foram criadas 2 branches para que cada um realize as desenvolvimento de forma
independente. A branch "desenvolvimento_1" e a "desenvolvimento_2". A primeira
será a branch que eu irei trabalhar e a segunda o Wagner.

Trabalhar em branches separadas permite que cada um desenvolva o seu trabalho de
forma independente.

#### Mudar de Branch:

Para mudar de branch execute o comando no Git Bash:

    git checkout <nome_da_branch>

#### Enviar as modificações para o GitHub:

Para enviar as modificações feitas são necessários 4 comandos.

    git add . (Adiciona todos os arquivos modificados)
    ou
    git add <nome_do_arquivo> (Para adicionar individualmente cada arquivo)

Para verificar se os arquivos foram todos adicionados execute o comando:

    git status

Ele mostrará todos os arquivos que serão enviados ao repositório. Os que serão
enviados ficarão verdes e os que não serão vermelhos. O comando acima pode ser
executado antes do "git add" para verificar quais arquivos que estão aptos para
serem enviados.

Após ter adicionado os arquivos basta executar o comando:

    git commit -m "<mensagem descrevendo que modificações foram feitas.>" 

Feito isso execute o comando abaixo para enviar as modificações ao GitHub:

    git push origin <nome_da_branch_corrente>

#### Fazer o merge entre 2 branches

Para unir as modificações que estão em outra branch para a sua. Certifique-se de
que você está na branch que quer receber as modificações então execute
os comandos abaixo:

    git fetch origin
    git merge <nome_da_branch>
    git commit

Exemplo:
Você quer unir as modificações feitas na branch "desenvolvimento_1" para a sua
branch de trabalho "desenvolvimento_2". Certifique-se de que você está na
branch "desenvolvimento_2",com o comando "git status", e execute os comandos abaixo:

    git fetch origin
    git merge desenvolvimento_1
    git commit


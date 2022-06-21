# Chave SSH :key:

**Quem é esse tal de SSH?**

Secure Socket Shell é um protocolo que objetiva estabelecer uma conexão segura (encriptada) e dinâmica entre um servidor remoto e uma máquina local, garantindo os três pilares da informação: **Confiabilidade | Integridade | Disponibilidade.**



**Passo a passo para configurar a Chave SSH do Git no GitHub**

1. No menu do **GitHub**, no canto superior direito (onde está a sua foto), clique na seta e selecione Settings; 

2. No menu Account settings, lado esquerdo do monitor, selecione SSH and GPG keys;

3. Na área SSH keys, clique no botão: New SSH key;

4. Na tela SSH keys / Add new - Preencha:

   - Campo Title (preferencialmente com o nome do local onde você vai gerar a chave)

   - Campo Key - precisaremos, antes, criar a chave no Git Bash;

     ​

5. No **Git Bash** digite: 

   > **ssh-keygen -t ed25519 -C seu@email.com**

6. Clique Enter. O terminal deve retornar a informação sobre a Geração de um par de chaves pública/privada e o local onde esta chave foi gerada - pasta oculta: **.ssh**;

7. Clique Enter. Digite uma senha para criar esta chave;

8. Clique Enter. Confirme a senha digitada;

9. Clique Enter. O terminal retornará a informação de que sua chave foi criada;

10. Acesse a pasta (cd) onde essa chave foi gerada, informada na etapa 6 deste passo a passo;

11. Liste (ls) os arquivos dentro da pasta e verá que há dois arquivos: a chave privada **id_ed25519** e a chave pública **id_25519.pub**;

12. Abra o conteúdo da pasta .pub por meio do seguinte comando:

    > **cat id_25519.pub**

13. Selecione e copie o conteúdo retornado, vamos inserir estes dados no GitHub;

    ​

14. De volta no **GitHub**, cole o conteúdo no campo Key (nossa etapa 4);

15. Clique no botão Add SSH key;

    ​

16. Esta primeira etapa foi finalizada, nossa chave já está configurada no GitHub mas precisaremos seguir com a segunda etapa: inicialização do SSH Agent no terminal do Git Bash - ele fará o gerenciamento das chaves no plano de fundo,  então de volta no **Git Bash**, digite o seguinte comando: 

    > **eval $(ssh-agent -s)**

17. O terminal retornará Agent pid e alguma numeração;

18. Nesta etapa, teremos que adicionar a chave privada para o nosso agente, para que isso ocorra, digite o comando:

    > **ssh-add id_ed25519**

19. Digite a senha que você criou para a criação da chave (nossa etapa 7) e clique enter;

20. O terminal retornará com a informação que a chave foi adicionada.
     





 






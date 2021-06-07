<h1>
    <div align='center'>Teste QA - WebJump</div>
</h1>
<div align='center'>
    <img src="http://img.shields.io/static/v1?label=Java%20&message=11.0.11&color=red&logo=java"/>
    <img src="http://img.shields.io/static/v1?label=Eclipse%20&message=2021.03&color=purple&logo=eclipse"/>
    <img src="http://img.shields.io/static/v1?label=status%20&message=concluido&color=-green"/>
</div>
</br>
Esse repositório foi criado para subir os arquivos necessários rodar o script de testes do desafio

### Índice :scroll: 
- Ferramentas
- Executando os Testes
- Embora a instalação dos programas sejam simples deixei ao final alguns links para ajuda na instalação

### Ferramentas

Foram necessarias algumas ferramentas para o desenvolvimento deste software aqui vai um guia rápido para a instalação dessas ferramentas:


- [ChromeDriver Versão 91.0.4472.77 (Versão oficial) 64 bits](https://sites.google.com/a/chromium.org/chromedriver/downloads)
- [Java 11 SE e suas dependências](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)
- [Selenium WebDriver](https://www.selenium.dev/downloads/)
- [Eclipse 2021.03](https://www.eclipse.org/downloads/packages/installer)
- Linux Mint Cinamon 20.1

##### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Obs: Ao clicar você será redirecionado para a página de download.


### Para Executar os Testes

- Depois de ter instalado todas as ferraments abra o Eclipse IDE
<div align='center'>
    <img src='/imgsRD/eclipse.jpeg' width=40% height=40%>
</div>
- Depois disso abra o aqruivo "TesteWejump.java" 
    Esse é o arquivo que contém todas as classes de execução de cada caso de teste 
    Na primeira classe em inicializa() altere o caminho do System.Property("webdriver.chromedriver, "coloque aqui o diretório para onde o chomedriver esta intalado")
    feito isso o Script já estará funcionando corretamente.
<div align='center'>
    <img src='/imgsRD/caminho-cd.jpeg' width=40% height=40%>
</div>
- Para rodar o Script basta clicar no botão "RUN" Play button verde na barra de ferramentas isso irá rodar a suite inteira de testes.
<div align='center'>
    <img src='/imgsRD/run-btn.jpeg' width=40% height=40%>
</div>
- Para rodar um caso de teste especifico há duas maneiras: a primeira delas é colocar a anotação "@Ignore" depois da anotação "@Test" e esse teste será pulado
    Isso pode ser feito para mais de um teste 
<div align='center'>
  <img src='/imgsRD/ignore.jpeg' width=40% height=40%>
</div>

- Outra maneira de se rodar um caso de teste especifico é clicar sobre a declaração do teste (deverá aparecer uma barra azul lateral ao lado da numeração das linhas)
     e depois clicar no botão "RUN" assim ele só executará o teste selecionado.
<div align='center'>
    <img src='/imgsRD/seleciona.jpeg' width=40% height=40%>
</div>
- O aqruivo "DSL.java" é o arquivo onde está declarada todas as regras e as classes que são herdadas pelo "TestWejump.java". 
- Ao final da execução é esperado que todos os testes passem.
<div align='center'>
    <img src='/imgsRD/final-correto.jpeg' width=40% height=40%>
</div>

### Links para ajuda na instalação
- [ChromeDriver ](https://chromedriver.chromium.org/getting-started)
- [Java SDk](https://docs.datastax.com/en/jdk-install/doc/jdk-install/installOpenJdkDeb.html)
- [Selenium](https://www.selenium.dev/documentation/en/selenium_installation/installing_selenium_libraries/)
- [Eclipse](https://www.eclipse.org/downloads/packages/installer)

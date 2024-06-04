---
title: Modelagem e Diagramação de um Componente iPhone
---
classDiagram
    
    class A["iPhone"]
    
    class B["ReprodutorMusical"]{
    <<interface>>
    + selecionarMusica(String musica)
    + tocar() 
    + pausar() 
    }
   
    class C["AparelhoTelefonico"]{
    <<interface>>
    + ligar(String numero) 
    + atender() 
    + iniciarCorreioVoz()
    }

    class D["NavegadorInternet"]{
    <<interface>>
    + exibirPagina(String url) 
    + adicionarNovaAba()
    + atualizarPagina()
    }

    A --> B
    A --> C
    A --> D
    
    class E["iPode"]
    class F["Telefone"]
    class G["Computador"]
    
    E --> B
    F --> C
    G --> D
    


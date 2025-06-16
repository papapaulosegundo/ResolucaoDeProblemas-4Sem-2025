<h1 align="center"> Repositorio para a matéria de Resolução de Problemas 4º semestre - PUCPR </h1>

## Primeira Atividade Pilha e Fila: Implenta uma pilha e fila com vetores

*Descrição:*

Implementação de estruturas — **Pilha e Fila** — utilizando Java. O foco da atividade foi exercitar os conceitos fundamentais de estruturas de dados, além de implementar e realizar testes sobre o funcionamento das estruturas.

*Estruturas Implementadas:*

*A Pilha foi implementada com o conceito **LIFO** (Last In, First Out), utilizando um vetor para armazenar os elementos. As principais funções da Pilha são:* 

   - push(int valor): insere um elemento no topo da pilha.
   - pop(): remove o elemento do topo da pilha.
   - isEmpty(): verifica se a pilha está vazia.
   - isFull(): verifica se a pilha está cheia.
   - print(): imprime os elementos da pilha.

*A Fila foi implementada com o conceito **FIFO** (First In, First Out), também utilizando um vetor para armazenar os elementos. As principais funções da Fila são:*

   - enqueue(int valor): insere um elemento no final da fila.
   - dequeue(): remove um elemento do início da fila.
   - isEmpty(): verifica se a fila está vazia.
   - isFull(): verifica se a fila está cheia.
   - print(): imprime os elementos da fila.

*Tamanhos dos Conjuntos Testados*

   - 10 elementos
   - 100 elementos
   - 1.000 elementos
Cada conjunto foi preenchido com valores inteiros gerados aleatoriamente.

## Atividade Prática Supervisionada: Implementando uma pilha e fila com lista encadeada e uma classe merge que junta 2 filas

*Descrição:*

Teve como objetivo implementar as estruturas Pilha e Fila utilizando listas encadeadas dinâmicas, além de realizar o merge de duas filas ordenadas. O projeto foi desenvolvido em duas versões: uma com listas encadeadas e outra com vetores.

*Manual: Para testar a aplicação basta executar o projeto.* 

   - A classe Main apresentará um menu com uma série de opções.
   - As opções 1, 2 e 3 são para manipulação da pilha construída com lista encadeada. É possível inserir, remover e listar os elementos da pilha.
   - As opções 4, 5 e 6 são para manipulação da fila construída com lista encadeada. É possível inserir, remover e listar os elementos da fila.
   - A opção 7 realiza um merge de duas filas construídas com lista encadeada, ela solicita os dados das duas pilhas e apresenta a fila resultante.
   - A opção 8 também realiza um merge, mas com as filas construídas com vetores.

*Classes envolvidas:*

   - Lista: manipulação da lista encadeada
   - No: manipulação de um nó da lista
   - Pilha: pilha implementada com lista
   - Fila: fila implementada com lista
   - FilaV: fila implementada com vetor
   - Merge: classe que une duas filas em uma só.
   - MergeV: semelhante ao Merge, porém usa a Fila implementada com vetor.

*Descrição das Soluções:*

   - Uso de listas encadeadas em Pilha, Fila e Merge.
   - Exibição dos elementos removidos em cada operação de remoção.
   - Liberdade para o usuário inserir novos elementos dinamicamente.
   - O Merge utiliza as operações de fila (insere, remove) para combinar as duas filas ordenadas em uma nova fila C, mantendo a ordenação.

## Atividade Prática Supervisionada 2: Codígo Morse

*Descrição:*

Este projeto implementa uma Árvore Binária para representar o Código Morse. Cada nó da árvore corresponde a um símbolo alfanumérico, e o caminho da raiz ao nó descreve a sequência de pontos (.) e traços (-) do código Morse.

*Estruturas Implementadas:*

**ArvoreBinaria**

   - Classe principal que representa a árvore binária do código Morse. Principais funções:
   - inserir(String codigoMorse, char simbolo): insere um símbolo na árvore de acordo com seu código Morse.
   - buscar(char simbolo): retorna o código Morse de um símbolo na árvore.
   - exibir(): exibe a árvore binária de forma hierárquica.
   - decodificar(String mensagemMorse): converte uma mensagem em código Morse para texto.
   - codificar(String mensagemTexto): converte uma mensagem de texto para código Morse.

**NoArvore**
   - Classe que representa os nós da árvore, contendo o símbolo e as referências para os filhos esquerdo (.) e direito (-).

**MainArvore**
   - Classe principal para executar o programa e interagir com o usuário.

*Tamanhos dos Conjuntos Testados:*
   - Todas as letras do alfabeto (A-Z)
   - Todos os números (0-9)

*Conclusão:*

O projeto cumpriu seu objetivo de implementar uma árvore binária para representar o código Morse e permitiu exercitar operações clássicas em árvores (inserção, busca, exibição).

## Atividade Tabela Hash: Análise de Tabelas Hash em Java 

*Descrição Geral:*

Este projeto tem como objetivo implementar e analisar o desempenho de diferentes técnicas de tabelas hash, utilizando Java, com foco em:
   - Variação do tamanho da tabela
   - Variação das funções hash
   - Técnicas de resolução de colisões

*Objetivos:*
   1. Comparar o desempenho de diferentes funções hash.
   2. Avaliar o impacto do tamanho da tabela nos tempos de inserção e busca.
   3. Quantificar colisões e comparações.
   4. Analisar os resultados com dados iguais por meio de `seed` fixo.
   
*Estrutura do Projeto:*
   - AtividadeRA3.java`: Classe principal que realiza os testes de inserção e busca.
   - GeraRegistrosAleatorios.java`: Geração dos conjuntos de dados com registros aleatórios (classe `Registro`).
   - ListaEncadeada.java`: Implementação do tratamento de colisões por encadeamento separado.
   - Registro.java`: Representa o registro com código de 9 dígitos.
   - TabelaHash.java`: Implementação da tabela hash com suporte a múltiplas funções hash e contadores de desempenho.
   -  Análise Hash - RA3pdf.pdf`: Documento com os gráficos, tabelas e análise dos resultados.

*Funções:*
   - inserir: insere um registro na tabela.
   - buscar: busca um registro pela chave.
   - remover: remove um registro pela chave.
   - calcularHash: função de hash simples (chave % tamanhoTabela).
   - imprimir: exibe o conteúdo da tabela hash.

*Conjuntos de Dados:*
   - 1 milhão de registros
   - 5 milhões de registros
   - 20 milhões de registros

*Métricas Avaliadas:*
   - Tempo de inserção
   - Número de colisões
   - Tempo de busca
   - Número de comparações
Foram feitas ao menos 5 buscas em cada rodada, totalizando 27 rodadas (3 tamanhos × 3 funções hash × 3 conjuntos de dados).

*Resultados:*

Os resultados foram organizados em tabela presente no arquivo `Análise Hash - RA3pdf.pdf` [Visualizar Análise Hash (RA3)](./RA3Hash/Análise%20Hash%20-%20RA3pdf.pdf) . 
O desempenho de cada função hash e tamanho de tabela foi comparado e justificado com base nas métricas coletadas.

*Gráficos:*

**Gráfico 1: Análise por Fator de Carga:** 

![image](https://github.com/user-attachments/assets/c3c3cf46-9f95-428b-a9e3-c038bc0ab01d)


 **Gráfico 2: Análise por Algoritmo:**
 ![image](https://github.com/user-attachments/assets/77558f7a-51c0-497d-a7e7-c492997001b3)

*Análise Comparativa:*

   - O uso de encadeamento permitiu manter um desempenho estável mesmo em cenários com colisões.
   - O tempo de inserção e busca cresceu de forma moderada à medida que o volume de dados aumentou.
   - A função hash simples (% tamanhoTabela) pode gerar colisões para chaves próximas, sugerindo melhorias como uso de função hash mais sofisticada.

*Conclusão:*

A implementação atendeu ao objetivo proposto, demonstrando o funcionamento da tabela hash com tratamento de colisões.

## Atividade Ordenação: Avaliação de Algoritmos de Ordenação

*Descrição:*

Este projeto tem como objetivo comparar o desempenho de diferentes algoritmos de ordenação quanto ao:
  - Tempo de execução
  - Número de trocas
  - Número de iterações

*Foram utilizados vetores de números inteiros gerados aleatoriamente, com tamanhos de:*
  - 1.000 elementos
  - 10.000 elementos
  - 100.000 elementos
  - 500.000 elementos
  - 1.000.000 elementos
*Cada configuração foi testada em 5 rodadas distintas, com diferentes conjuntos de dados gerados a partir de seeds fixas, permitindo reprodutibilidade dos experimentos.

*Algoritmos implementados:*
   Grupo A:
      - Insert Sort
   Grupo B:
      - Merge Sort
      - Quick Sort
   Grupo C:
      - Radix Sort

*Estrutura do projeto:*

  - AtividadeRA4.java: Classe principal que orquestra os testes e coleta os resultados.
  - GeraRegistrosAleatorios.java: Responsável por gerar os vetores de inteiros com base em uma seed.
  - InsertSort.java: Implementação do algoritmo Insert Sort.
  - MergeSort.java: Implementação do algoritmo Merge Sort.
  - QuickSort.java: Implementação do algoritmo Quick Sort.
  - RadixSort.java: Implementação do algoritmo Radix Sort.
  - Resultado.java: Classe utilizada para armazenar e exibir os dados coletados (tempo, trocas, iterações).

*Métricas avaliadas - Para cada algoritmo e tamanho de vetor, o projeto registra:*

  - Tempo de execução (ms)
  - Número de trocas realizadas
  - Número de iterações (ou comparações, conforme o algoritmo)

*Observações:*

  - As seeds dos geradores foram fixadas para garantir que os mesmos dados sejam utilizados em diferentes rodadas e algoritmos.
  - Os algoritmos foram selecionados conforme os grupos propostos para o trabalho:
    - Grupo A: Insert Sort
    - Grupo B: Merge Sort e Quick Sort
    - Grupo C: Radix Sort

*Resultados:*

Os resultados foram organizados em tabelas e gráficos presente no arquivo `Dados_Ordenacoes.pdf` [Visualizar Análise Ordenações (RA4)](./RA4_Ordenacao/Dados_Ordenacoes.pdf) . 
O número de comparações, trocas e tempo médio de execução foi coletado para cada algoritmo em cada grupo de dados.

*Conclusão:* 

Quick Sort foi o mais eficiente, mostrando em todas as análises que ele foi o mais vantajoso


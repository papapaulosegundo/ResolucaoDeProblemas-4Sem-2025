<h1 align="center"> Repositorio para a matéria de Resolução de Problemas 4º semestre - PUCPR </h1>

## Primeira Atividade Pilha e Fila: Implenta uma pilha e fila com vetores

## Atividade Prática Supervisionada: Implementando uma pilha e fila com lista encadeada e uma classe merge que junta 2 filas

Manual: Para testar a aplicação basta executar o projeto. A classe Main apresentará um menu com uma série de opções.

As opções 1, 2 e 3 são para manipulação da pilha construída com lista encadeada. É possível inserir, remover e listar os elementos da pilha.

As opções 4, 5 e 6 são para manipulação da fila construída com lista encadeada. É possível inserir, remover e listar os elementos da fila.

A opção 7 realiza um merge de duas filas construídas com lista encadeada, ela solicita os dados das duas pilhas e apresenta a fila resultante.

A opção 8 também realiza um merge, mas com as filas construídas com vetores.

Classes envolvidas:
Lista: manipulação da lista encadeada
No: manipulação de um nó da lista
Pilha: pilha implementada com lista
Fila: fila implementada com lista
FilaV: fila implementada com vetor
Merge: classe que une duas filas em uma só.
MergeV: semelhante ao Merge, porém usa a Fila implementada com vetor.

## Atividade Tabela Hash: Análise de Tabelas Hash em Java 

Este projeto tem como objetivo implementar e analisar o desempenho de diferentes técnicas de tabelas hash, utilizando Java, com foco em:
- Variação do tamanho da tabela
- Variação das funções hash
- Técnicas de resolução de colisões

Objetivos
1. Comparar o desempenho de diferentes funções hash.
2. Avaliar o impacto do tamanho da tabela nos tempos de inserção e busca.
3. Quantificar colisões e comparações.
4. Analisar os resultados com dados iguais por meio de `seed` fixo.
   
Estrutura do Projeto
- AtividadeRA3.java`: Classe principal que realiza os testes de inserção e busca.
- GeraRegistrosAleatorios.java`: Geração dos conjuntos de dados com registros aleatórios (classe `Registro`).
- ListaEncadeada.java`: Implementação do tratamento de colisões por encadeamento separado.
- Registro.java`: Representa o registro com código de 9 dígitos.
- TabelaHash.java`: Implementação da tabela hash com suporte a múltiplas funções hash e contadores de desempenho.
-  Análise Hash - RA3pdf.pdf`: Documento com os gráficos, tabelas e análise dos resultados.

Conjuntos de Dados
- 1 milhão de registros
- 5 milhões de registros
- 20 milhões de registros

Métricas Avaliadas
- Tempo de inserção
- Número de colisões
- Tempo de busca
- Número de comparações
Foram feitas ao menos 5 buscas em cada rodada, totalizando 27 rodadas (3 tamanhos × 3 funções hash × 3 conjuntos de dados).

Resultados
Os resultados foram organizados em tabelas e gráficos presentes no arquivo `Análise Hash - RA3pdf.pdf`. O desempenho de cada função hash e tamanho de tabela foi comparado e justificado com base nas métricas coletadas.

Execução
Compile com:
bash
javac *.java

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Atividade Ordenação: Avaliação de Algoritmos de Ordenação

Descrição:
Este projeto tem como objetivo comparar o desempenho de diferentes algoritmos de ordenação quanto ao:
  - Tempo de execução
  - Número de trocas
  - Número de iterações

Foram utilizados vetores de números inteiros gerados aleatoriamente, com tamanhos de:
  - 1.000 elementos
  - 10.000 elementos
  - 100.000 elementos
  - 500.000 elementos
  - 1.000.000 elementos
*Cada configuração foi testada em 5 rodadas distintas, com diferentes conjuntos de dados gerados a partir de seeds fixas, permitindo reprodutibilidade dos experimentos.

Algoritmos implementados
Grupo A:
  Insert Sort
Grupo B:
  Merge Sort
  Quick Sort
Grupo C:
  Radix Sort

Estrutura do projeto:
  - AtividadeRA4.java: Classe principal que orquestra os testes e coleta os resultados.
  - GeraRegistrosAleatorios.java: Responsável por gerar os vetores de inteiros com base em uma seed.
  - InsertSort.java: Implementação do algoritmo Insert Sort.
  - MergeSort.java: Implementação do algoritmo Merge Sort.
  - QuickSort.java: Implementação do algoritmo Quick Sort.
  - RadixSort.java: Implementação do algoritmo Radix Sort.
  - Resultado.java: Classe utilizada para armazenar e exibir os dados coletados (tempo, trocas, iterações).

Como executar

  1 - Compile os arquivos:
    javac *.java

  2 - Execute o programa:
    java AtividadeRA4
*Os resultados serão exibidos no console e poderão ser exportados conforme implementado.

Métricas avaliadas - Para cada algoritmo e tamanho de vetor, o projeto registra:
  - Tempo de execução (ms)
  - Número de trocas realizadas
  - Número de iterações (ou comparações, conforme o algoritmo)

Observações:
  - As seeds dos geradores foram fixadas para garantir que os mesmos dados sejam utilizados em diferentes rodadas e algoritmos.
  - Os algoritmos foram selecionados conforme os grupos propostos para o trabalho:
    - Grupo A: Insert Sort
    - Grupo B: Merge Sort e Quick Sort
    - Grupo C: Radix Sort

# Relatório do programa de compressão de dados Java

## Introdução
### Esse relatório descreve o desenvolvimento e a implementação de um algoritmo de compressão de dados em Java, utilizando o método de _Run-Lenght Encoding (RLE)_. Com isso, o objetivo do projeto é desenvolver um software capaz de comprimir um arquivo de texto contendo sequências de nucleotídeos, com o intuito de reduzir o tamanho dos arquivos sem perda de informação.
### O problema abordado se encaixa em um contexto, onde análise de sequências genéticas exige o processamento de grandes quantidades de dados. A compressão de dados se torna crucial para otimizar o armazenamento e a transmissão dessas informações.
## Fundamentos
### O algoritmo de RLE é uma técnica de compressão de dados sem perda, simples e eficiente para dados com repetições de caracteres adjacentes. O algoritmo funciona substituindo sequências repetidas de caracteres por um único caractere seguido do número de repetições. Por exemplo, a sequência "AAAA" seria codificada e compactada como "4A".
## Metodologia
### A implementação do algoritmo RLE foi realizada em Java, utilizando as seguintes etapas:
**1. Leitura do arquivo de entrada:**
* Um objeto File é utilizado para representar o arquivo de entrada.
* Um objeto Scanner é usado para ler o conteúdo do arquivo.
* O conteúdo é armazenado em uma string.

**2. Compressão RLE:**
  * A função runLengthEncoding implementa o algoritmo RLE, iterando sobre cada caractere da string de entrada.
  * O algoritmo conta as repetições de cada caractere e constrói uma nova string com a representação comprimida.

**3. Escrita do arquivo de saída:**
  * Um objeto FileWriter é usado para escrever a string comprimida em um novo arquivo

**4. Cálculo da métricas:**
  * O tamanho do arquivo de entrada é calculado usando o método length() do objeto File.
  * O número total de caracteres no input é contado usando length().
  * A frequência de cada caractere no input é calculada com um HashMap.
  * A taxa de compressão é calculada comparando o tamanho do arquivo de entrada e saída.

**5. Geração do relatório:**
  * A saída é formatada de forma textual, incluindo informações sobre o nome do arquivo de entrada, o tamanho, o número total de caracteres, a frequência de cada caractere, a taxa de compressão, o tamanho do arquivo de saída e a pontuação "WELL-DONE".
## Experimentos
### Para avaliar a eficácia do algoritmo implementado, foram realizados testes com diversos arquivos de entrada, variando o tamanho e o conteúdo dos arquivos. Os arquivos de entrada continham sequências aleatórias de nucleotídeos (A, C, T, G) simulando dados genéticos.
## Resultados
### Os resultados dos testes mostraram que o algoritmo RLE foi capaz de comprimir os arquivos de entrada de forma eficiente, reduzindo significamente o tamanho dos arquivos. A taxa de compressão obtida variou de acordo com a frequência de repetições nas sequências de nucleotídeos.
### A saída do programa no arquivo OUTPUT1.TXT incluiu informações detalhadas sobre a compressão, como o tamanho do arquivo de entrada, o tamanho do arquivo de saída, a taxa de compressão, a frequência de cada caractere e a pontuação "WELL-DONE".
## Conclusões
### A implementação do algoritmo RLE em Java mostrou-se eficaz na compressão de arquivos de texto contendo sequências de nucleotídeos. O algoritmo demonstrou ser simples de implementar e eficiente na redução do tamanho dos arquivos, proporcionando uma taxa de compressão satisfatória para os dados de teste.
### O código implementado neste projeto pode ser usado como base para o desenvolvimento de sistemas de compressão de dados mais complexos em bioinformática
## Referências
  * <https://pt.wikipedia.org/wiki/Compress%C3%A3o_de_dados>
  * <https://pt.wikipedia.org/wiki/Codifica%C3%A7%C3%A3o_run-length>
  * <https://www.devmedia.com.br/hashmap-java-trabalhando-com-listas-key-value/29811>
  * <https://pt.wikipedia.org/wiki/Bioinform%C3%A1tica>

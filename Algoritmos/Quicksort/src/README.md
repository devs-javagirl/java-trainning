# Quicksort
    O quicksort é um algoritmo de ordenação utilizado em uma ampla variedade de situações, é um algoritmo rápido e eficiente, onde em seu pior caso pode ter uma complexidade de **O(n²)** porém no melhor caso pode chegar a **O(n log n)**. 
    O algoritimo consistem em estratégia de particionamento a partir de um elemento qualquer do vetor, **o pivot**, e de forma recursiva ordena essas partes menores até que todo o vetor esteja ordenado. 
    
    Após escolhido o pivot o particionamento deve ser aplicado, deixando a esquerda do elemento escolhido os elementos menores iguaia a ele e à direita os elementos maiores. 
    Não significa que os elementos estão ordenados, apenas que um partiiconamento foi feito e que agora precismaos ordenar cada uma das partes separadamente reaplicando o processo recursivamente.

    existem métodos para realizar o particionamento, o mais comumente utilizado como introdução e para entendimento do algorítimo, é o **Lomuto** mas temos outros como o **Hoare** e **Dual-Pivot**.
    
    O Lomuto é considerado mais simples, consiste em identificar os elementos menores ou iguais ao pivot colocá-los à frente dele e ao final posicionar o pivot a frente deles, deixando o pivot "no meio" do vetor.
    
    Por exemplo: 
    v=[9, 6, 8, 7, **3**, 0, 2, -1]
    Se consideramos o numero 3 como pivot, após o particionamento utilizando esse método teríamos um vetor semelhante a esse, não fizemos todas iterações é apenas para exemplo.
    v=[0,2,-1,**3**, 9,6,8,7]
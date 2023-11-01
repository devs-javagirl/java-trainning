<h2>OBSERVER PATTERN</h2>

<b>Definição:</b><p>
É um padrão de projeto comportamental que permite que você defina um mecanismo de assinatura para
notificar múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto que eles estão observando.<p>

<b>Problema:</b><p>
Imagine que você tem dois tipos de objetos: um Cliente e uma Loja. O cliente está muito interessado em uma marca particular de um produto (digamos que seja um novo modelo de iPhone) que logo deverá estar disponível na loja.<p>
O cliente pode visitar a loja todos os dias e checar a disponibilidade do produto. Mas enquanto o produto ainda está a caminho, a maioria dessas visitas serão em vão.<p>
Por outro lado, a loja poderia mandar milhares de emails (que poderiam ser considerados como spam) para todos os clientes cada vez que um novo produto se torna disponível. Isso salvaria alguns clientes de incontáveis viagens até a loja. Porém, ao mesmo tempo, irritaria outros clientes que não estão interessados em novos produtos.<p>
Parece que temos um conflito. Ou o cliente gasta tempo verificando a disponibilidade do produto ou a loja gasta recursos notificando os clientes errados.</p>

<b>Solução:</b>
O objeto que tem um estado interessante é quase sempre chamado de subject ou publisher.<p>
Todos os outros objetos que querem saber das mudanças do estado do publicador são chamados de observer ou subscriber.<p>
O padrão Observer sugere que você adicione um mecanismo de registro na classe subject (inclusão ou cancelamento). Esse mecanismo consiste em 1) um vetor para armazenar uma lista de referências aos objetos do Subject e 2) alguns métodos públicos que permitem adicionar assinantes e removê-los da lista.<p>
Quando um evento importante acontece com o Subject, ele chama um método específico de notificação de seus Observers.<p>
Todos os Observers implementam a mesma interface para que o Subject comunique-se com eles através daquela interface.<p>

<b>Projeto:</b><p>
Imagine que você tenha um e-commerce com diversos produtos, no qual alguns deles encontram-se sem estoque.<p>
Este e-commerce permite que o cliente cadastre seu e-mail para receber uma notificação quando houver reposição do produto em estoque.<p>


<b>Referências:</b><p>
https://refactoring.guru/pt-br/design-patterns/observer <p>
Curso Padrões de Projeto em JAVA na Prática - Udemy - Cod3r<p>
Medium - Observer Design Pattern in Java (https://medium.com/javarevisited/observer-design-pattern-in-java-updated-2023-800e2f997aff)
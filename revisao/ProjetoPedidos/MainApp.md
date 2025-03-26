classDiagram
direction BT
class Cliente {
  + Cliente(String, String, String) 
  - String nome
  - String email
  - String telefone
  + setEmail(String) void
  + getNome() String
  + getTelefone() String
  + toString() String
  + setTelefone(String) void
  + getEmail() String
  + setNome(String) void
}
class MainApp {
  + MainApp() 
  - ArrayList~Produto~ produtos
  - ArrayList~Cliente~ clientes
  - Scanner scanner
  - ArrayList~Pedido~ pedidos
  + main(String[]) void
  + cadastrarProduto() void
  + executarMenu() void
  + cadastrarCliente() void
  + criarPedido() void
  + listarPedidos() void
}
class Pagamento {
  + Pagamento(double, String) 
  - String metodo
  - double valor
  + toString() String
}
class Pedido {
  + Pedido(Cliente) 
  - int contador
  - int numero
  - Pagamento pagamento
  - Cliente cliente
  - ArrayList~Produto~ produtos
  + adicionarProduto(Produto, int) void
  + getPagamento() Pagamento
  + toString() String
  + calcularTotal() double
  + setPagamento(Pagamento) void
}
class Produto {
  + Produto(String, double, int) 
  - int quantidade
  - double preco
  - String nome
  + getNome() String
  + getQuantidade() int
  + toString() String
  + getPreco() double
  + setQuantidade(int) void
  + setNome(String) void
  + setPreco(double) void
  + reduzirEstoque(int) void
}

MainApp  ..>  Cliente : «create»
MainApp "1" *--> "clientes *" Cliente 
MainApp  ..>  Pagamento : «create»
MainApp  ..>  Pedido : «create»
MainApp "1" *--> "pedidos *" Pedido 
MainApp "1" *--> "produtos *" Produto 
MainApp  ..>  Produto : «create»
Pedido "1" *--> "cliente 1" Cliente 
Pedido "1" *--> "pagamento 1" Pagamento 
Pedido "1" *--> "produtos *" Produto 

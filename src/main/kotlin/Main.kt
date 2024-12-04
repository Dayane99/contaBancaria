package org.example
import java.util.Scanner

/**
 * Desenvolver um sistema bancário que permita a criação de contas bancárias e depósitos.
 *
 * Regras:
 * - O saldo da conta bancária deve ser atualizado após cada depósito.
 * - O sistema deve permitir a criação de depósitos em uma conta bancária.
 * - O sistema deve permitir a criação de contas bancárias.
 * - O sistema deve permitir a criação de usuários.
 * - O sistema deve permitir a associação de um usuário a uma conta bancária.
 * - O sistema deve permitir a consulta de depósitos realizados em uma conta bancária.
 * - Gerar recibo de depósito.
 * - Validar se os dados da conta bancária (número da conta e agência) são válidos;
 * - Garantir que o valor do depósito seja um número positivo;
 * - O sistema deve atualizar o saldo da conta automaticamente após um depósito bem-sucedido.
 * - Gerar recibo Número da conta e agência (com informações parcialmente ocultas, para segurança), Valor do depósito, Data e hora da transação.
 */

fun main(){

    var scannerInput = Scanner(System.`in`)
    var usuarios : MutableList<Usuario> = mutableListOf()
    var contas : MutableList<ContaBancaria> = mutableListOf()
    var contContas: Int = 0

    println("*****BEM-VINDO*****\nSelecione a opção que deseja ou digite 'sair' para sair")
    println("1. Criar nova conta\n2. Fazer um deposito\n3. consultar extrato\n Consultar saldo")

    do {
        print("Digite sua opção:")
        val entrada = scannerInput.nextLine()

        if (entrada == "sair") break

        val verificaInt = entrada.toIntOrNull()

        if (verificaInt == null) {
            println("Insira um valor válido")

        } else if(verificaInt == 1) {
            contContas ++

            val novaConta = ContaBancaria(numero = contContas.toString().padStart(4,'0'))

            println("Insira seu nome:")
            val nome = scannerInput.nextLine()

            println("Insira seu cpf:")
            val cpf = scannerInput.nextLine()

//            val cpfValidado = cpf.toIntOrNull()
//            if ()

            val novoUsuario = Usuario(
                nome = nome,
                cpf = cpf,
                contaBancaria = novaConta
            )
            usuarios.add(novoUsuario)
            contas.add(novaConta)

            println(novoUsuario)

            println("Você será direcionado ao menu principal, digite uma opção ou digite 'sair' para sair")
            continue
        } else if(verificaInt == 2){

        } else if(verificaInt == 3){

        } else if(verificaInt == 4){

        } else {
            println("Insira um número válido")
        }
    } while (true)

    for (i in usuarios){ //teste para ver lista de usuários
        println(i)
    }
}

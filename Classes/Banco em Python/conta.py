class Conta:
    titular = ""
    numero = ""
    saldo = 0.0

    def depositar(self, valor):
        self.saldo += valor
        print(f"Valor depositado de {valor} na conta de {self.titular}")
        print(f"Novo saldo {self.saldo}")

    def sacar(self, valor):
        if valor <= self.saldo:
            self.saldo -= valor
            print(f"Valor retirado de {valor} na conta de {self.titular}")
            print(f"Novo saldo {self.saldo}")

        else:
            print("Não foi possível efetuar o saque.")
            print(f"Saldo disponível: {self.saldo}")

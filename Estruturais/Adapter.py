class Alvo:
    def requisicao(self) -> str:
        return "Alvo: O comportamento padrão do alvo."


class Adaptado:
    """
    O Adaptado contém um comportamento útil, mas sua interface é incompatível
    com o código cliente existente. O Adaptado precisa de alguma adaptação antes
    que o código cliente possa usá-lo.
    """

    def requisicao_especifica(self) -> str:
        return ".eetpadA eht fo roivaheb laicepS"


class Adaptador(Alvo, Adaptado):
    """
    O Adaptador torna a interface do Adaptado compatível com a interface do Alvo
    através da herança múltipla.
    """

    def requisicao(self) -> str:
        return f"Adaptador: (TRADUZIDO) {self.requisicao_especifica()[::-1]}"


def codigo_cliente(alvo: "Alvo") -> None:
    """
    O código cliente suporta todas as classes que seguem a interface do Alvo.
    """

    print(alvo.requisicao(), end="")


if __name__ == "__main__":
    print("Cliente: Eu posso trabalhar bem com objetos do Alvo:")
    alvo = Alvo()
    codigo_cliente(alvo)
    print("\n")

    adaptado = Adaptado()
    print("Cliente: A classe Adaptado tem uma interface estranha. "
          "Veja, eu não entendo isso:")
    print(f"Adaptado: {adaptado.requisicao_especifica()}", end="\n\n")

    print("Cliente: Mas eu posso trabalhar com isso através do Adaptador:")
    adaptador = Adaptador()
    codigo_cliente(adaptador)

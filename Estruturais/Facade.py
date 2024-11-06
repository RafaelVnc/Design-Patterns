# Subsistemas complexos
class Amplifier:
    def on(self):
        print("Amplificador ligado.")
    
    def set_volume(self, volume):
        print(f"Volume ajustado para {volume}.")

class DvdPlayer:
    def on(self):
        print("DVD Player ligado.")
    
    def play_movie(self, movie):
        print(f"Reproduzindo o filme '{movie}'.")

class Projector:
    def on(self):
        print("Projetor ligado.")
    
    def set_input(self, source):
        print(f"Fonte de entrada do projetor definida como {source}.")

# Fachada
class HomeTheaterFacade:
    def __init__(self):
        self.amplifier = Amplifier()
        self.dvd_player = DvdPlayer()
        self.projector = Projector()

    def watch_movie(self, movie):
        print("Iniciando o sistema de home theater...")
        self.amplifier.on()
        self.amplifier.set_volume(10)
        self.dvd_player.on()
        self.dvd_player.play_movie(movie)
        self.projector.on()
        self.projector.set_input("DVD")
        print("Aproveite o filme!\n")

# Uso da Fachada
home_theater = HomeTheaterFacade()
home_theater.watch_movie("Inception")

# Classe de comando
class Command:
    def execute(self):
        pass

class LightOnCommand(Command):
    def execute(self):
        print("A luz foi acesa!")

class LightOffCommand(Command):
    def execute(self):
        print("A luz foi apagada!")

class RemoteControl:
    def submit(self, command):
        command.execute()

# Utilização do comando
control = RemoteControl()
control.submit(LightOnCommand())
control.submit(LightOffCommand())

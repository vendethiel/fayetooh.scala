package bot.irc.fayetooh

import net.mtgto.irc.{Bot => BaseBot, Client}
import net.mtgto.irc.event._

class Bot extends BaseBot {
  val commandSymbol = "."

  val commands = Seq(
    new Command.SayHello
  )

  override def onMessage(client: Client, message: Message) {
    val level = 0

    if (!message.text.startsWith(commandSymbol)) return
    val cmd = message.text.split(" ")(0).substring(commandSymbol.length)
    val Array(name, params @ _*) = cmd.split(" ", 2)
    for (
      command <- commands
      if command.name == name
      if level >= command.minLevel
      if command.args contains params.length
    ) {
      command(client, message, params)
    }
  }
}
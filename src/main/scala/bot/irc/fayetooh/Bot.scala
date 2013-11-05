package bot.irc.fayetooh

import net.mtgto.irc.{Bot => BaseBot, Client}
import net.mtgto.irc.event._

class Bot extends BaseBot {
  val commandSymbol = "."

  override def onMessage(client: Client, message: Message) {
    if (!message.text.startsWith(commandSymbol)) return
    val cmd = message.text.split(" ")(0).substring(commandSymbol.length)
    client.sendNotice(message.channel, s"You issued command $cmd.")
  }
}

package bot.irc.fayetooh.Command

import net.mtgto.irc.{Bot => BaseBot, Client}
import net.mtgto.irc.event._

private[Command] trait BaseCommand {
	val name : String
	val minLevel : Int
  val args : Seq[Int]

  def apply(client: Client, message: Message, params: Seq[String]) : Unit
}

class SayHello extends BaseCommand {
	val name = "hello"
	val minLevel = 0
  val args = Seq(0, 1)

  def apply(client: Client, message: Message, params: Seq[String]) = {
    client.sendMessage(message.channel, "Hey ${params(0)} !")
  }
}
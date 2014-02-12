package bot.irc.fayetooh

import net.mtgto.irc.Config
import net.mtgto.irc.config.BotConfig

object Fayetooh {
  def main(args:Array[String]) {
    initBot
  }

  def initBot() { // @TODO move outside here
    println("Starting the bot.")
    val config = new Config {
      val hostname = "irc.freenode.net"
      val port = 6667
      val password = None
      val encoding = "utf-8"
      val messageDelay = 2000
      val timerDelay = 60000
      val nickname = "scala-irc-bot"
      val username = "scala-irc-bot"
      val realname = "scala@irc.bot"
      // channels
      val channels = Array("#faytest")
      // bots
      val bots = Array[(String, Option[BotConfig])](
        ("bot.irc.fayetooh.Bot", None)
      )
    }
  }
}

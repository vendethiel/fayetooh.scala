package bot.irc.fayetooh

import net.mtgto.irc.Config
import net.mtgto.irc.config.BotConfig

object Fayetooh {
  def main(args:Array[String]) {
    initBot
  }

  def initBot() {
    println("Starting the bot.")
    new Config {
      val hostname = "irc.example.com"
      val port = 6667
      val password = None
      val encoding = "utf-8"
      val messageDelay = 2000
      val timerDelay = 60000
      val nickname = "scala-irc-bot"
      val username = "scala-irc-bot"
      val realname = "sd@example.com"
      // channels
      val channels = Array("#livescript")
      // bots
      val bots = Array[(String, Option[BotConfig])](
        ("bot.irc.fayetooh.Bot", None)
      )
    }
  }
}

import java.io.Serializable

import configuration.SparkSessionAsLocalConfiguration
import service.{WinemagService, WinemagServiceImpl}

/**
 * @author d.gabidullin
 */
object JsonReader extends App {

  val usage =
    """
    Usage: set first arg {path/to/winemag.json}
  """

  override def main(args: Array[String]): Unit = {
    if (args.length == 0) println(usage)
    new WinemagServiceImpl(SparkSessionAsLocalConfiguration.sc).mapper(args.toList.head)
  }
}

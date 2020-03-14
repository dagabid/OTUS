package service

import dto.Winemag
import org.apache.spark.sql.SparkSession
import org.json4s.jackson.JsonMethods.parse
import org.json4s.jackson.Serialization
import org.json4s.{DefaultFormats, Formats, FullTypeHints, ShortTypeHints}

/**
 * Сервисный класс, читает спарком json file по переданному пути и десериализует в объектную модель.
 *
 * @param sc
 */
class WinemagServiceImpl(sc: SparkSession) extends WinemagService {

  override def mapper(jsonPath: String): Unit = {
    sc.sparkContext.textFile(jsonPath)
      .map(row => {
        implicit val formats: DefaultFormats.type = DefaultFormats;
        parse(row).extract[Winemag]
        })
      .collect().foreach {
      println
    }
  }
}

package service

trait WinemagService extends Serializable {
  def mapper(jsonPath: String): Unit
}

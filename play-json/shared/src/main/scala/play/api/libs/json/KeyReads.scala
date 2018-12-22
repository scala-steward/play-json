package play.api.libs.json

/**
 * Used to read object key for types other than `String`.
 *
 * @see [[Reads.mapReads]]
 */
trait KeyReads[T] {
  def readKey(key: String): JsResult[T]
}

object KeyReads extends EnvKeyReads

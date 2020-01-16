package praticespark_scala.src.main.scala.data_frame
import praticespark_scala.src.main.scala.Context

object data_frame extends App with Context {
  val dfTags = sparkSession
    .read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv("/home/payalkabra/Downloads/scala pratice/questions_tags.xlsx - Sheet1.csv")
    .toDF("id", "tag")

  dfTags.show(2)
  //dfTags.printSchema()
  //dfTags.count()
  //sparkSession.stop()
  //Thread.sleep(200)
}

package praticespark_scala.src.main.scala
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


trait Context {

  lazy val sparkConf = new SparkConf()
    .setAppName("pratice_spark_scala")
    .setMaster("local")
  //spark.eventLog.enabled=false
  //Thread.sleep(60)
    .set("spark.cores.max", "2")

  lazy val sparkSession = SparkSession
    .builder()
    .config(sparkConf)
    .getOrCreate()
}
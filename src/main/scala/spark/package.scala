import org.apache.spark.sql.SparkSession

package object spark {

  def getSparkSession(name:String):SparkSession={
    SparkSession.builder()
      .appName(name)
      .master("local")
      .getOrCreate()
  }

  def closeSpark(spark:SparkSession):Unit={
    spark.stop()
    spark.close()
  }

}

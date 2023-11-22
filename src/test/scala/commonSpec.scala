import org.apache.spark.sql.SparkSession
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class commonSpec extends AnyFunSuite with Matchers{

  test("Spark Session"){
    val sparkSession:SparkSession=spark.getSparkSession("test")
    sparkSession.sql("select current_timestamp").show()
  }


}

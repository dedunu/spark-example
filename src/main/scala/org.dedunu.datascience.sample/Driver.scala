package org.dedunu.datascience.sample

import org.apache.spark.{SparkContext, SparkConf}

object Driver {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("Sample Job Name")
    val sparkContext = new SparkContext(sparkConf)
    val textFile = sparkContext.textFile("file://" + args(0) + "/*")
    val counts = textFile.flatMap(line => line.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)
    counts.saveAsTextFile("file://" + args(1))
  }
}
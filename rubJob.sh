#!/usr/bin/env bash

/home/dedunu/bin/spark-1.6.1/bin/spark-submit \
    --class org.dedunu.datascience.sample.Driver \
    target/sample-Spark-Job-jar-with-dependencies.jar \
    /home/dedunu/input \
    /home/dedunu/output

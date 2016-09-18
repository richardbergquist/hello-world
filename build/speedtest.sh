#!/bin/sh

# Perform a speed test between java and python3
# Calculate prime numbers starting from 1000000 up to a delta of 10000, first in
# a python script and  then in compiled java.
# The mathematics of the the prime number calculation is the same.

START=1000000
DELTA=10000
echo "Python prime speed test"
echo "Start for Python at: `date` "
python3 ../src/python/primeftn.py $START $DELTA
echo "Completed for Python at: `date` "


JAVA_HOME=/usr/lib/jvm/java-8-openjdk-i386
JAVA=$JAVA_HOME/bin/java
echo "Java prime speed test"
echo "Start for Java at: `date` "
$JAVA -classpath /home/richard/Development/hello-world/build/java richardbergquist.helloworld.prime.Prime $START $DELTA
echo "Completed for Java at: `date` "

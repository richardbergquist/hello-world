

#javac -d build/java/  -sourcepath /home/richard/Development/hello-world/src/java richardbergquist/helloworld/prime/Prime.java

rm -rf /home/richard/Development/hello-world/build/java/richardbergquist
#javac -d /home/richard/Development/hello-world/build/java  -sourcepath /home/richard/Development/hello-world/src/java richardbergquist/helloworld/prime/Prime.java
javac -d /home/richard/Development/hello-world/build/java  -classpath /home/richard/Development/hello-world/src/java /home/richard/Development/hello-world/src/java/richardbergquist/helloworld/prime/Prime.java

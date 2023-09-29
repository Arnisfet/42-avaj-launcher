javac -d objs src/*.java
jar -cmf manifest.mf avaj-launcher.jar  -C objs/ .
java -jar avaj-launcher.jar
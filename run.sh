javac -d objs src/*.java
java -jar -cmf manifest.mf avaj-launcher.jar  -C objs/src .
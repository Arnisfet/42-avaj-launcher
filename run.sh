javac -d objs src/com/github/arnisfet/avajlauncher/*.java
jar -cmf manifest.mf avaj-launcher.jar  -C objs/ .
java -jar avaj-launcher.jar scenario.txt
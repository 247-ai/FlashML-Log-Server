# FlashMLLogServer

Objective of the module is to start a server which will receive the logs which are pushed by the FlashML Log4j Socket Appender. The server will in turn write the logs to disk in rolling fashion

##### Build the artifact using:

`mvn clean package`

##### To deploy the socket server

1. Create the folder `/var/log/flashml` and `/var/log/flashmlSocketServer` with ownership of the user running the server. If not followed, this error will show: 'log4j:ERROR setFile(null,true) call failed.'

2. Move `target/FlashMLLogServer.jar` and `log4j-server.properties` to one folder. 

2. Run `java -cp FlashMLLogServer.jar org.apache.log4j.net.SimpleSocketServer 4712 log4j-server.properties`
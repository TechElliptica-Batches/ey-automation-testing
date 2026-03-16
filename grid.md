What is selenium grid ? 

Master - Hub
slave 1 - node (chrome1  , Window)
slave 2 - node  (mozilla , Mac)
slave 3 - node (edge , unix) 
slave 4 - node (chrome - 5 , )


Setup the hub
node to hub

How to setup the hub
java -jar selenium-server-4.41.0.jar hub


How to setup node
java -jar selenium-server-4.41.0.jar node --hub http://192.168.1.23:4444









cmd /C start/MIN java -jar selenium-server-standalone-2.53.0.jar -role hub -port 4445 -timeout 30000000 -browserTimeout 36000000
cmd /C start/MIN java -jar selenium-server-standalone-2.53.0.jar -role node -hub http://localhost:4445/grid/register -port 5571 -Dwebdriver.chrome.driver=chromedriver.exe


@echo off
@title Novak's Development - v155.1 - SAO
Color 0A
set CLASSPATH=.;dist\*
java -client -Dwzpath=wz server.Start
pause
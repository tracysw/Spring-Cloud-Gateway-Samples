@echo off
echo [INFO] Install jar to local repository.

cd /d %~dp0
call mvn clean install -Dmaven.test.skip=true -Dmaven.javadoc.skip=true
pause
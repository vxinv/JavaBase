#!/bin/bash
#应用存放地址
APP_HOME=/home/test
LOGDIR=${APP_HOME}/logs

# 应用名称
APP_NAME=$2
if [ -z ${APP_NAME} ];then
    APP_NAME=`ls -t |grep .jar|head -n1`
fi

isExits(){
  PID=$(ps -ef |grep java | grep ${APP_NAME} | grep -v grep | awk '{ print $2 }')
  if [ -z "${PID}" ]; then
    return 1
  else
    return 0
  fi
}

start(){
  isExits
  if [ $? -eq "0" ]; then
      echo "${APP_NAME} is already running pid = ${PID}"
  else
      nohup java -jar ${APP_HOME}/${APP_NAME} >/dev/null 2>&1 &
      PID=$(echo  $!)
      echo  "${APP_NAME} start success ,pid = $!"
  fi
}

stop(){
  isExits
  if [ $? -eq "0" ]; then
      kill -9 ${PID}
      echo "${APP_NAME} process stop ,PID = ${PID}"
  else
      echo  "There is not the process of ${APP_NAME}"
  fi
}



restart(){
  stop
  start
}

usage() {
    echo "Usage: sh boot [APP_NAME] [start|stop|restart|status]"
    exit 1
}



status(){
  isExits
  if [ $? -eq "0" ]; then
      echo "${APP_NAME} is running ,pid = ${PID}"
  else
      echo  "There is not the process of ${APP_NAME}"
  fi
}

case $1 in
 "start")
     start
     ;;
 "stop")
      stop
      ;;
 "restart")
      restart
      ;;
 "status")
      status
      ;;
 *)
	usage
	;;
esac
exit 0











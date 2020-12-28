#!/bin/bash

param='lixin'
testFor(){
 for name in $(ls / )
 do
   echo $name
 done
 echo $1
}

a=0
testUntil(){
until [ ! $a -lt 10 ]
do
   echo $a
   a=`expr $a + 1`
done
}


testCase(){
echo '输入1到4之间的数字'
echo '输入的数字是：'
read aNum
case $aNum in
1)
echo '你选择了 1'
  ;;
2)
echo '你选择了 2'
  ;;
3)
echo '你选择了 3'
  ;;
4)
echo '你选择了 4'
  ;;
esac

}


#testFor $param
#testUntil
testCase
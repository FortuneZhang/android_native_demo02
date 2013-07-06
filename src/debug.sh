#!/usr/bin
echo 'auto'

adb uninstall com.learn.demo02

ant debug

adb install -r /home/fortunezhang/learn/demo01/src/bin/demo02-debug.apk

adb shell am start -n com.learn.demo01/com.learn.demo01.MainActivity

echo 'activtiy running'

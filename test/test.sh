#!/usr/bin

cd ../src
ant debug
adb install -r demo02-debug.apk

cd ../test
ant debug
adb install -r demo02_test-debug.apk

adb shell am instrument -w com.learn.demo02.tests/android.test.InstrumentationTestRunner


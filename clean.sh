#!/bin/sh
find . -name "*.class" -or -name "*.class~" | xargs rm


echo "CLEAN"

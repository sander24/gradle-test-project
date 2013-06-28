#!/bin/sh
gradle clean build
cp -t /opt/autodeploy ./build/libs/*.war 

#!/usr/bin/env bash

profiles="";

java -jar -Dspring.profiles.active=$profiles compiler.jar


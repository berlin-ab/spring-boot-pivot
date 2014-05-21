#!/bin/bash

curl -G https://raw.githubusercontent.com/berlin-ab/spring-boot-pivot/master/create > /usr/local/bin/create-spring

rm -rf /usr/local/etc/spring-boot-pivot;

git clone git@github.com:berlin-ab/spring-boot-pivot.git /usr/local/etc/spring-boot-pivot

chmod 700 /usr/local/bin/create-spring


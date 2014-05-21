#!/bin/bash

curl -G http://localhost:9292/create > /usr/local/bin/create-spring

rm -rf /usr/local/etc/spring-boot-pivot;

git clone git@github.com:pivotal/spring-boot-pivot.git /usr/local/etc/spring-boot-pivot

chmod 700 /usr/local/bin/create-spring


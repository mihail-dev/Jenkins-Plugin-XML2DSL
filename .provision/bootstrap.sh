#!/usr/bin/env bash

# setting up jenkins deb
wget -q -O - http://pkg.jenkins-ci.org/debian/jenkins-ci.org.key | sudo apt-key add -
sudo sh -c 'echo deb http://pkg.jenkins-ci.org/debian binary/ > /etc/apt/sources.list.d/jenkins.list'

# update packages
sudo apt-get update

# install Java 7
sudo apt-get install openjdk-7-jre-headless -y

# install jenkins
sudo apt-get install jenkins -y

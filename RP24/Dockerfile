FROM centos:latest

MAINTAINER JitenderJoshi84

RUN yum update -y

RUN yum -y install unzip java-1.8.0-openjdk wget vim telnet httpd

COPY RP24/index.html /var/www/html/

CMD ["/usr/sbin/httpd", "-D", "FOREGROUND"]

EXPOSE 80

# 基础镜像说明
# openjdk:11.0.3-jre 》》 涉及图形界面UI相关API操作时使用（如：验证码生成），镜像大小 ≈ 200M
# openjdk:11.0.3-jre-slim 》》 极简化的jar包运行环境，镜像大小 ≈ 100M
FROM openjdk:11.0.3-jre-slim

MAINTAINER ylyue yl-yue@qq.com

# 添加时区环境变量，亚洲，上海
ENV TimeZone=Asia/Shanghai

# 使用软连接，并且将时区配置覆盖/etc/timezone
RUN ln -snf /usr/share/zoneinfo/$TimeZone /etc/localtime && echo $TimeZone > /etc/timezone

ADD target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
# Demo Jwt
# add dependencies auth0
		<dependency>
			<groupId>com.auth0</groupId>
			<artifactId>java-jwt</artifactId>
			<version>3.3.0</version>
		</dependency>

# properties -> yml
 server:
    port: 8080
  spring:
    datasource:
      url: jdbc:postgresql://localhost:8080/cookbook
      username: postgres
      password: ****
      driver-class-name: org.postgresql.Driver
    jpa:
      show-sql: true
      hibernate:
        ddl-auto: create
        format_sql: true
  application:
    jwt:
      expiresAt: 846000
      headerPrefix: "Bearer "
      secret: "pass"
      headerKey: "Authorization"

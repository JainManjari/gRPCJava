package com.protoc.proto_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*

 cd src/main/resources
 protoc --java_out=../java --proto_path=./proto ./proto/user.proto

 */

@SpringBootApplication
public class ProtoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProtoJavaApplication.class, args);
	}

}

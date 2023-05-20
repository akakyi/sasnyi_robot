import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.13-SNAPSHOT"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
	kotlin("plugin.jpa") version "1.6.10"
}

group = "notifier.telega"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
	maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-amqp")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	// https://mvnrepository.com/artifact/org.springframework.data/spring-data-jpa
	implementation("org.springframework.data:spring-data-jpa:2.5.9")
	// https://mvnrepository.com/artifact/org.hibernate/hibernate-core
	implementation("org.hibernate:hibernate-core:5.6.15.Final")
	// https://mvnrepository.com/artifact/org.telegram/telegrambots
	implementation("org.telegram:telegrambots:6.5.0")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.amqp:spring-rabbit-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

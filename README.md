<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">

	<modelVersion>4.0.0</modelVersion>
	<groupId>com.pwc.mule.advance.training</groupId>
	<artifactId>maven-porject</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <packaging>mule</packaging>
	<name>Mule maven-porject Application</name>

    <properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>

		<mule.version>3.7.3</mule.version>
    	<mule.tools.version>1.1</mule.tools.version>
	</properties>

	<build>
		<plugins>
			<plugin>
				<groupId>org.mule.tools.maven</groupId>
				<artifactId>mule-app-maven-plugin</artifactId>
				<version>${mule.tools.version}</version>
				<extensions>true</extensions>
				<configuration>
                    <copyToAppsDirectory>true</copyToAppsDirectory>
				</configuration>
			</plugin>
			<plugin>
				<artifactId>maven-assembly-plugin</artifactId>
				<version>2.2.1</version>
				<configuration>
					<descriptorRefs>
						<descriptorRef>project</descriptorRef>
					</descriptorRefs>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.codehaus.mojo</groupId>
				<artifactId>build-helper-maven-plugin</artifactId>
				<version>1.7</version>
				<executions>
					<execution>
						<id>add-resource</id>
						<phase>generate-resources</phase>
						<goals>
							<goal>add-resource</goal>
						</goals>
						<configuration>
							<resources>
								<resource>
									<directory>src/main/app/</directory>
								</resource>
								<resource>
									<directory>mappings/</directory>
								</resource>
							<resource>
                                    <directory>src/main/api/</directory>
                                </resource>
                            </resources>
						</configuration>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>

	<!-- Mule Dependencies -->
	<dependencies>
		<!-- Xml configuration -->
		<dependency>
        	<groupId>com.mulesoft.muleesb</groupId>
			<artifactId>mule-core-ee</artifactId>
			<version>${mule.version}</version>
			<scope>provided</scope>
		</dependency>
		<!-- Xml configuration -->
		<dependency>
			<groupId>com.mulesoft.muleesb.modules</groupId>
			<artifactId>mule-module-spring-config-ee</artifactId>
			<version>${mule.version}</version>
			<scope>provided</scope>
		</dependency>
		<!-- Mule Transports -->
		<dependency>
			<groupId>org.mule.transports</groupId>
			<artifactId>mule-transport-file</artifactId>
			<version>${mule.version}</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>org.mule.transports</groupId>
			<artifactId>mule-transport-http</artifactId>
			<version>${mule.version}</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
        	<groupId>com.mulesoft.muleesb.transports</groupId>
			<artifactId>mule-transport-jdbc-ee</artifactId>
			<version>${mule.version}</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
        	<groupId>com.mulesoft.muleesb.transports</groupId>
			<artifactId>mule-transport-jms-ee</artifactId>
			<version>${mule.version}</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>org.mule.transports</groupId>
			<artifactId>mule-transport-vm</artifactId>
			<version>${mule.version}</version>
			<scope>provided</scope>
		</dependency>
		<!-- Mule Modules -->
		<dependency>
			<groupId>org.mule.modules</groupId>
			<artifactId>mule-module-scripting</artifactId>
			<version>${mule.version}</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>org.mule.modules</groupId>
			<artifactId>mule-module-xml</artifactId>
			<version>${mule.version}</version>
			<scope>provided</scope>
		</dependency>
		<!-- for testing -->
		<dependency>
			<groupId>org.mule.tests</groupId>
			<artifactId>mule-tests-functional</artifactId>
			<version>${mule.version}</version>
			<scope>test</scope>
		</dependency>
	<dependency>
            <groupId>org.mule.modules</groupId>
            <artifactId>mule-module-http</artifactId>
            <version>${mule.version}</version>
            <scope>provided</scope>
        </dependency>
    <dependency>
            <groupId>org.mule.modules</groupId>
            <artifactId>mule-module-spring-config</artifactId>
            <version>${mule.version}</version>
            <scope>provided</scope>
        </dependency>
    <dependency>
            <groupId>org.mule.modules</groupId>
            <artifactId>mule-module-db</artifactId>
            <version>${mule.version}</version>
            <scope>provided</scope>
        </dependency>
         <!--  Active MQ -->
         <dependency>
		  <groupId>org.apache.activemq</groupId>
		  <artifactId>activemq-all</artifactId>
		  <version>5.10.0</version>
		</dependency>
    </dependencies>

	<repositories>
          <repository>
            <id>Central</id>
            <name>Central</name>
            <url>http://repo1.maven.org/maven2/</url>
            <layout>default</layout>
        </repository>
        <repository>
            <id>mulesoft-releases</id>
            <name>MuleSoft Releases Repository</name>
            <url>http://repository.mulesoft.org/releases/</url>
            <layout>default</layout>
        </repository>
    </repositories>
    <pluginRepositories>
        <pluginRepository>
            <id>mulesoft-release</id>
            <name>mulesoft release repository</name>
            <layout>default</layout>
            <url>http://repository.mulesoft.org/releases/</url>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </pluginRepository>
    </pluginRepositories>

</project>

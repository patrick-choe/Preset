plugins {
    java
}

group = "com.github.patrick-mc"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://repo.maven.apache.org/maven2/") // Maven Central
    maven("https://jcenter.bintray.com/") // JCenter
}

dependencies {
    // Dependencies here
}


tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
    
    withType<Javadoc> {
        options.encoding = "UTF-8"
    }
}
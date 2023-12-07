plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    implementation("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    implementation("org.junit.jupiter:junit-jupiter-params:5.9.2")
    implementation("org.mockito:mockito-core:5.0.0")
    implementation("commons-codec:commons-codec:1.15")
    implementation("commons-net:commons-net:3.9.0")
    implementation("com.google.zxing:core:3.4.0")
    implementation("com.google.zxing:javase:3.5.1")
}

tasks.test {
    useJUnitPlatform()
}
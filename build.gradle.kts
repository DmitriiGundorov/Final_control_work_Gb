plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("in.yajnesh.util:java-util:1.0.0")
    implementation("in.yajnesh.util:java-util:1.0.0")
    implementation("in.yajnesh.util:java-util:1.0.0")
    implementation("in.yajnesh.util:java-util:1.0.0")
    implementation("in.yajnesh.util:java-util:1.0.0")
    implementation("in.yajnesh.util:java-util:1.0.0")
    implementation("com.github.nbbrd.java-desktop-util:java-desktop-util-favicon:2.3.0")
    implementation("com.github.nbbrd.java-desktop-util:java-desktop-util-demo:2.3.0")
    implementation("com.github.nbbrd.java-desktop-util:java-desktop-util-demo:2.3.0")
    implementation("com.github.nbbrd.java-desktop-util:java-desktop-util-swing:2.3.0")
    implementation("com.github.nbbrd.java-desktop-util:java-desktop-util-swing:2.3.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
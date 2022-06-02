plugins {
    id("org.springframework.boot")
}

dependencies {
    implementation(Config.Libs.SPRING_BOOT_WEB_STARTER)
}

springBoot {
    mainClassName = "com.airwallex.corebanking.gamifyprs.AppKt"
}

tasks {
    bootJar {
        archiveClassifier.set("boot")
    }
}

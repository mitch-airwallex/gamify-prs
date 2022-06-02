plugins {
    id("org.springframework.boot")
}

dependencies {
    implementation(Config.Libs.SPRING_BOOT_WEB_STARTER)
}

springBoot {
    mainClassName = "com.airwallex.financial.transaction.FinancialTransactionApplicationKt"
}

tasks {
    bootJar {
        archiveClassifier.set("boot")
    }
}

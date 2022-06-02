/**
 * build config object
 * @author bin.guo
 * On 2019-07-11
 */
object Config {

    object Versions {

        const val KOTLIN = "1.6.21"

        const val SPRING_BOOT = "2.3.12.RELEASE"

        const val DEPENDENCY_MANAGEMENT = "1.0.7.RELEASE"


        const val AWX_SPRING_BOOT_STARTER = "3.0.6"

        const val JACKSON_VERSION = "2.10.2"

        const val CLIENT_WALLET_VERSION = "1.87"

        const val CORE_BANKING_API_VERSION = "1.139"

        const val ISSUING_COMMONS_MODEL_VERSION = "1.3.67"

        const val PA_COMMONS_VERSION = "0.115.0-jdk8"

        const val PA_COMMON_LANG_VERSION = "0.240.0"

        const val ACCOUNT_SERVICE_JSON_RPC_API_VERSION = "6.74.0"

        const val MERCHANT_RPC_VERSION = "2.40.0"

        const val PROTOBUF_VERSION = "3.21.1"

        const val PROTOBUF_GRADLE_PLUGIN_VERSION = "0.8.18"

        const val SPRING_BOOT_STARTER_GRPC = "2.13.1.RELEASE"

        const val KTLINT_VERSION = "10.0.0"

        const val ARROW_VERSION = "0.13.1"

        const val NV_I18N_VERSION = "1.28"

        const val EASY_RANDOM_VERSION = "4.3.0"

        const val PROTOC_GENERATE_GRPC_VERSION = "1.36.0"

        const val GRPC_KOTLIN_VERSION = "1.0.0"

        const val JAVAX_VERSION = "1.3.2"

        const val CORE_BANKING_COMMONS_VERSION = "1.6"

        const val LOG4J_VERSION = "2.17.0"

        const val FUNDING_SOURCE_SERVICE_VERSION = "1.18"

        const val COMMONS_VERSION = "2.42"

        const val GRPC_SERVICES_VERSION = "1.35.0"

        const val REPORT_CONCIERGE_API_VERSION = "1.15"
    }

    object Libs {
        const val SPRING_BOOT_WEB_STARTER = "org.springframework.boot:spring-boot-starter-web"
        const val JACKSON_DATABIND = "com.fasterxml.jackson.core:jackson-databind:${Versions.JACKSON_VERSION}"
        const val JACKSON_CORE = "com.fasterxml.jackson.core:jackson-core:${Versions.JACKSON_VERSION}"
        const val JACKSON_ANNOTATIONS = "com.fasterxml.jackson.core:jackson-annotations:${Versions.JACKSON_VERSION}"
        const val JACKSON_KOTLIN = "com.fasterxml.jackson.module:jackson-module-kotlin:${Versions.JACKSON_VERSION}"
    }

    object TestLibs {

        const val ASSERTJ = "org.assertj:assertj-core:3.17.2"
        const val JUNIT_API = "org.junit.jupiter:junit-jupiter-api"
        const val JUNIT_PARAMS = "org.junit.jupiter:junit-jupiter-params"
        const val JUNIT_ENGINE = "org.junit.jupiter:junit-jupiter-engine"
        const val MOCKK = "io.mockk:mockk:1.8.13.kotlin13"
        const val MOCKITO_ALL = "org.mockito:mockito-core:2.23.4"
        const val MOCKITO_ALL_JUNIT_JUPITER = "org.mockito:mockito-junit-jupiter:2.23.4"
        const val SPRING_BOOT_TEST_STARTER = "org.springframework.boot:spring-boot-starter-test"
        const val JUNIT_JUPITER = "org.junit.jupiter:junit-jupiter:5.5.0"
        const val MOCKITO_KOTLIN = "com.nhaarman.mockitokotlin2:mockito-kotlin:2.0.0"
    }
}

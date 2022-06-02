/**
 * build config object
 * @author bin.guo
 * On 2019-07-11
 */
object Config {

    object Versions {
        const val LEGACY_COMMONS_VERSION = "3.0.97"

        const val JAVA_11 = "11"

        const val JAVA_8 = "1.8"

        const val KOTLIN = "1.4.21"

        const val SPRING_BOOT = "2.3.12.RELEASE"

        const val DEPENDENCY_MANAGEMENT = "1.0.7.RELEASE"

        const val MYBATIS_GENERATOR = "1.4"

        const val SPRING_CLOUD_VERSION = "Hoxton.SR11"

        const val AWX_SPRING_BOOT_STARTER = "3.0.6"

        const val SPRING_CLOUD_STREAM_VERSION = "3.0.12.RELEASE"

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
        const val AWX_DATA_KAFKA_SDK = "com.airwallex.data:data-kafka-sdk:0.5.0"
        const val AWX_COMMON_LANG = "com.airwallex.common:common-lang:2.2"
        const val AWX_COMMON_TOMCAT = "com.airwallex.common:common-tomcat:2.2"
        const val AWX_DOMAIN_MODEL =
            "com.airwallex.legacycommons:domain-model:${Versions.LEGACY_COMMONS_VERSION}"
        const val AWX_COMMON_REST =
            "com.airwallex.legacycommons:common-rest:${Versions.LEGACY_COMMONS_VERSION}"
        const val AWX_OAS_API =
            "com.airwallex.corebanking:order-aggregation-api:${Versions.CORE_BANKING_API_VERSION}"
        const val AWX_ACCOUNT_SERVICE_JSON_RPC_API =
            "com.airwallex:account-service-json-rpc-api:${Versions.ACCOUNT_SERVICE_JSON_RPC_API_VERSION}"
        const val MERCHANT_RPC =
            "com.airwallex.pa:merchant-center-client:${Versions.MERCHANT_RPC_VERSION}"
        const val PA_COMMON_LANG =
            "com.airwallex.pmtacpt.common:common-lang:${Versions.PA_COMMON_LANG_VERSION}"
        const val ISSUING_COMMONS_MODEL_WALLET =
            "com.airwallex.issuing:issuing-commons-model-wallet:${Versions.ISSUING_COMMONS_MODEL_VERSION}"
        const val ISSUING_COMMONS_MODEL_AUTH =
            ("com.airwallex.issuing:issuing-commons-model-auth:${Versions.ISSUING_COMMONS_MODEL_VERSION}")
        const val FLYWAYDB = "org.flywaydb:flyway-core:7.9.1"
        const val JSONRPC4J = "com.github.briandilley.jsonrpc4j:jsonrpc4j:1.5.3"
        const val KOTLINX_COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3"
        const val MYBATIS_STARTER = "org.mybatis.spring.boot:mybatis-spring-boot-starter:1.3.2"
        const val POSTGRESQL = "org.postgresql:postgresql"
        const val SPRING_BOOT_WEB_STARTER = "org.springframework.boot:spring-boot-starter-web"
        const val AIRWALLEX_SPRING_BOOT_CORRELATION =
            "com.airwallex:airwallex-spring-boot-correlation:${Versions.AWX_SPRING_BOOT_STARTER}"
        const val AIRWALLEX_SPRING_BOOT_RPC_MICROMETER =
            "com.airwallex:airwallex-spring-boot-rpc-micrometer:${Versions.AWX_SPRING_BOOT_STARTER}"
        const val REDISSON = "org.redisson:redisson:3.4.3"
        const val PAGEHELPER = "com.github.pagehelper:pagehelper-spring-boot-starter:1.2.10"
        const val OK_HTTP = "com.squareup.okhttp3:okhttp:3.14.2"
        const val SPRING_CLOUD_SLEUTH = "org.springframework.cloud:spring-cloud-starter-sleuth"
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

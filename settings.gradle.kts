pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PerfX"
include(":prefx-api")
include(":prefx-impl")
include(":prefx-noop")

include(":prefx-anr")
include(":prefx-block")
include(":prefx-crash")
include(":prefx-memory")
include(":prefx-network")
include(":prefx-startup")
include(":prefx-ui")

include(":prefx-sample")



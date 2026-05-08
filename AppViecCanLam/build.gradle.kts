// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    // Sửa dòng này theo chuẩn Kotlin DSL để đồng bộ với Version Catalog
    id("com.google.gms.google-services") version "4.4.4" apply false
}
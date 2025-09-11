
dependencies {
    implementation("space.arim.libertybans:bans-bootstrap:${project.version}")
    // TODO: Bundle this API so that LibertyBans will work out-of-the-box
    modImplementation(libs.permissions)
}

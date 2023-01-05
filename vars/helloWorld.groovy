def call(Map config = [:]) {
    //creating an empty map
    sh "echo Hello ${config.name} day of the week is ${config.dayofweek}"
}

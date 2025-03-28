val host: String by env

GET("$host/web/users/{name}") {
    header("Accept", "application/json")
    pathParams("name", "test")

}


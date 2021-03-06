package test.jaxrs.produces.noannotation

import javax.ws.rs.GET
import javax.ws.rs.Path

data class Todo(val description: String = "")

@Path("/todos")
class NoAnnotation {

    @GET
    fun todo() = Todo()
}
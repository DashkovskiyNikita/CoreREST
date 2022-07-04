package controller.handlers

import controller.models.UserResponse
import database.mappers.Mapper
import interactor.handlers.Handler
import interactor.services.Service
import interactor.models.UserModel
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

class GetUserHandler(
    private val routing: Routing,
    private val service: Service<Int, UserModel>,
    private val mapper: Mapper<UserModel, UserResponse>
) : Handler {
    override fun invoke() {
        routing.get("/user") {
            val response = mapper(service(1))
            call.respond(HttpStatusCode.OK, response)
        }
    }
}
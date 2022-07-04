package controller.handlers

import interactor.handlers.Handler
import interactor.services.Service
import controller.models.UserResponse
import database.mappers.Mapper
import interactor.models.UserModel
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

class AddUserHandler(
    private val routing: Routing,
    private val service: Service<UserModel, Unit>,
    private val mapper: Mapper<UserResponse, UserModel>
) : Handler {
    override fun invoke() {
        routing.put("/user") {
            mapper(call.receive()).also {
                service(it)
            }
        }
    }
}
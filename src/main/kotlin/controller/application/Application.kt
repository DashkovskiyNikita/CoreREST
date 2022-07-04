package controller.application

import interactor.handlers.Handler
import di.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.routing.*
import org.koin.dsl.module
import org.koin.ktor.ext.getKoin
import org.koin.ktor.plugin.Koin

fun main() {
    embeddedServer(
        factory = Netty,
        port = 8081,
        host = "192.168.0.69"
    ) {
        install(Routing)
        install(ContentNegotiation) { json() }
        install(Koin) {
            modules(
                routingModule(routing { }), handlersModule,
                servicesModule, mappersModule, storagesModule
            )
        }
        getKoin().getAll<Handler>().forEach(Handler::invoke)
    }.start(wait = true)
}

fun routingModule(routing: Routing) = module { single { routing } }



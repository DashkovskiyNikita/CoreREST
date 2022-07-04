package di

import controller.handlers.GetUserHandler
import controller.handlers.AddUserHandler
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module
import interactor.handlers.Handler

val handlersModule = module {
    singleOf(::GetUserHandler).bind<Handler>()
    singleOf(::AddUserHandler).bind<Handler>()
}
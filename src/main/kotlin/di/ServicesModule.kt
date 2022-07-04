package di

import interactor.models.UserModel
import interactor.services.Service
import interactor.services.GetUserService
import interactor.services.AddUserService
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val servicesModule = module {
    singleOf(::GetUserService).bind<Service<Int, UserModel>>()
    singleOf(::AddUserService).bind<Service<UserModel, Unit>>()
}

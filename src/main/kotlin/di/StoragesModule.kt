package di

import database.storages.UserStorage
import interactor.storages.IUserStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val storagesModule = module {
    singleOf(::UserStorage).bind<IUserStorage>()
}
package di

import controller.mappers.UserModelMapper
import controller.mappers.UserResponseMapper
import controller.models.UserResponse
import database.mappers.Mapper
import interactor.models.UserModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val mappersModule = module {
    singleOf(::UserModelMapper).bind<Mapper<UserModel, UserResponse>>()
    singleOf(::UserResponseMapper).bind<Mapper<UserResponse, UserModel>>()
}
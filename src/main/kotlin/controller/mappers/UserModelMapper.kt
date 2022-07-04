package controller.mappers

import controller.models.UserResponse
import database.mappers.Mapper
import interactor.models.UserModel

class UserModelMapper : Mapper<UserModel, UserResponse> {
    override fun invoke(source: UserModel) =
        UserResponse(
            name = source.name,
            surname = source.surname
        )
}

class UserResponseMapper : Mapper<UserResponse, UserModel> {
    override fun invoke(source: UserResponse) =
        UserModel(
            name = source.name,
            surname = source.surname
        )
}
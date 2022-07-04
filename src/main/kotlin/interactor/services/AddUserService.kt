package interactor.services

import interactor.models.UserModel
import interactor.storages.IUserStorage

class AddUserService(
    private val storage: IUserStorage
) : Service<UserModel, Unit> {
    override suspend fun invoke(param: UserModel) = storage.addUser(param)
}
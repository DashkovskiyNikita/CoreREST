package interactor.services

import interactor.models.UserModel
import interactor.storages.IUserStorage

class GetUserService(
    private val storage: IUserStorage
) : Service<Int, UserModel> {
    override suspend fun invoke(param: Int) = storage.getUser(param)
}
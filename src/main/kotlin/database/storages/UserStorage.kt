package database.storages

import interactor.models.UserModel
import interactor.storages.IUserStorage

class UserStorage : IUserStorage {
    override fun getUser(id: Int) =
        UserModel(name = "Nikita", surname = "Dashkovskiy")

    override fun addUser(user: UserModel) = println(user)
}
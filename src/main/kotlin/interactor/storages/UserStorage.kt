package interactor.storages

import interactor.models.UserModel

interface IUserStorage {
    fun getUser(id: Int): UserModel
    fun addUser(user : UserModel)
}
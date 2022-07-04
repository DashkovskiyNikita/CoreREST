package interactor.services

interface Service<in Param, out Data> {
    suspend operator fun invoke(param: Param): Data
}

package database.mappers

interface Mapper<in Source,out Target> {
    operator fun invoke(source : Source) : Target
}
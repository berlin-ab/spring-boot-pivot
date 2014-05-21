package project.support

import org.springframework.data.repository.CrudRepository

interface TestRepository extends CrudRepository<User, Long> {
}